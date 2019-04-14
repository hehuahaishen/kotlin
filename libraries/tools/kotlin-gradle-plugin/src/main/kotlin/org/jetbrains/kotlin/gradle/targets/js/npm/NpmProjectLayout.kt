/*
 * Copyright 2010-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.gradle.targets.js.npm

import com.google.gson.Gson
import com.google.gson.JsonObject
import groovy.transform.TailRecursive
import org.gradle.api.Project
import org.gradle.process.ExecSpec
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsPlugin
import org.jetbrains.kotlin.gradle.targets.js.nodejs.nodeJs
import java.io.File

class NpmProjectLayout(
    val project: Project,
    val nodeWorkDir: File,
    val managed: Boolean
) {
    val nodeModulesDir
        get() = nodeWorkDir.resolve(NODE_MODULES)

    val packageJsonFile: File
        get() {
            return nodeWorkDir.resolve(PACKAGE_JSON)
        }

    fun useTool(exec: ExecSpec, tool: String, vararg args: String) {
        NpmResolver.resolve(project)

        exec.workingDir = nodeWorkDir
        exec.executable = project.nodeJs.root.environment.nodeExecutable
        exec.args = listOf(findModule(tool)) + args
    }

    @TailRecursive
    fun findModule(name: String, src: NpmProjectLayout = this): String {
        val file = nodeModulesDir.resolve(name)
        if (file.isFile) return file.canonicalPath
        if (file.isDirectory) {
            val packageJsonFile = file.resolve("package.json")
            val main: String = (if (packageJsonFile.isFile) {
                val packageJson = packageJsonFile.reader().use {
                    Gson().fromJson(it, JsonObject::class.java)
                }

                packageJson["main"] as? String? ?: packageJson["module"] as? String? ?: packageJson["browser"] as? String?
            } else null) ?: "index.js"

            val mainFile = file.resolve(main)
            if (mainFile.isFile) return mainFile.canonicalPath
        }

        val parent = project.parent
        return if (!managed || parent == null) error("Cannot find node module $name in $src")
        else NpmProjectLayout[parent].findModule(name, src)
    }

    companion object {
        const val PACKAGE_JSON = "package.json"
        const val NODE_MODULES = "node_modules"

        operator fun get(project: Project): NpmProjectLayout {
            val nodeJsRootExtension = NodeJsPlugin.apply(project)

            val manageNodeModules = nodeJsRootExtension.root.manageNodeModules

            val nodeWorkDir =
                if (manageNodeModules) project.projectDir
                else project.buildDir

            return NpmProjectLayout(project, nodeWorkDir, manageNodeModules)
        }
    }
}

val Project.npmProject
    get() = NpmProjectLayout[this]