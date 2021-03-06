/*
 * Copyright 2010-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.debugger.sequence.exec;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/debugger/tinyApp/src/streams/sequence")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class SequenceTraceTestCaseGenerated extends AbstractSequenceTraceTestCase {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
    }

    public void testAllFilesPresentInSequence() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/debugger/tinyApp/src/streams/sequence"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true, "terminal");
    }

    @TestMetadata("idea/testData/debugger/tinyApp/src/streams/sequence/append")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Append extends AbstractSequenceTraceTestCase {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInAppend() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/debugger/tinyApp/src/streams/sequence/append"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("PlusArray.kt")
        public void testPlusArray() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/append/PlusArray.kt");
        }

        @TestMetadata("PlusElement.kt")
        public void testPlusElement() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/append/PlusElement.kt");
        }

        @TestMetadata("PlusSequence.kt")
        public void testPlusSequence() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/append/PlusSequence.kt");
        }

        @TestMetadata("PlusSingle.kt")
        public void testPlusSingle() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/append/PlusSingle.kt");
        }
    }

    @TestMetadata("idea/testData/debugger/tinyApp/src/streams/sequence/distinct")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Distinct extends AbstractSequenceTraceTestCase {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInDistinct() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/debugger/tinyApp/src/streams/sequence/distinct"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("Distinct.kt")
        public void testDistinct() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/distinct/Distinct.kt");
        }

        @TestMetadata("DistinctBy.kt")
        public void testDistinctBy() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/distinct/DistinctBy.kt");
        }

        @TestMetadata("DistinctByBigPrimitives.kt")
        public void testDistinctByBigPrimitives() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/distinct/DistinctByBigPrimitives.kt");
        }

        @TestMetadata("DistinctByNullableElement.kt")
        public void testDistinctByNullableElement() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/distinct/DistinctByNullableElement.kt");
        }

        @TestMetadata("DistinctByNullableKey.kt")
        public void testDistinctByNullableKey() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/distinct/DistinctByNullableKey.kt");
        }

        @TestMetadata("DistinctByNullableKeyAndElement.kt")
        public void testDistinctByNullableKeyAndElement() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/distinct/DistinctByNullableKeyAndElement.kt");
        }

        @TestMetadata("DistinctObjects.kt")
        public void testDistinctObjects() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/distinct/DistinctObjects.kt");
        }
    }

    @TestMetadata("idea/testData/debugger/tinyApp/src/streams/sequence/filter")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Filter extends AbstractSequenceTraceTestCase {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInFilter() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/debugger/tinyApp/src/streams/sequence/filter"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("Drop.kt")
        public void testDrop() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/filter/Drop.kt");
        }

        @TestMetadata("DropWhile.kt")
        public void testDropWhile() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/filter/DropWhile.kt");
        }

        @TestMetadata("Filter.kt")
        public void testFilter() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/filter/Filter.kt");
        }

        @TestMetadata("FilterIndexed.kt")
        public void testFilterIndexed() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/filter/FilterIndexed.kt");
        }

        @TestMetadata("FilterIsInstance.kt")
        public void testFilterIsInstance() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/filter/FilterIsInstance.kt");
        }

        @TestMetadata("FilterNot.kt")
        public void testFilterNot() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/filter/FilterNot.kt");
        }

        @TestMetadata("Minus.kt")
        public void testMinus() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/filter/Minus.kt");
        }

        @TestMetadata("MinusElement.kt")
        public void testMinusElement() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/filter/MinusElement.kt");
        }

        @TestMetadata("Take.kt")
        public void testTake() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/filter/Take.kt");
        }

        @TestMetadata("TakeWhile.kt")
        public void testTakeWhile() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/filter/TakeWhile.kt");
        }
    }

    @TestMetadata("idea/testData/debugger/tinyApp/src/streams/sequence/flatMap")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class FlatMap extends AbstractSequenceTraceTestCase {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInFlatMap() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/debugger/tinyApp/src/streams/sequence/flatMap"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("FlatMap.kt")
        public void testFlatMap() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/flatMap/FlatMap.kt");
        }

        @TestMetadata("Flatten.kt")
        public void testFlatten() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/flatMap/Flatten.kt");
        }
    }

    @TestMetadata("idea/testData/debugger/tinyApp/src/streams/sequence/map")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Map extends AbstractSequenceTraceTestCase {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInMap() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/debugger/tinyApp/src/streams/sequence/map"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("Map.kt")
        public void testMap() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/map/Map.kt");
        }

        @TestMetadata("MapIndexed.kt")
        public void testMapIndexed() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/map/MapIndexed.kt");
        }

        @TestMetadata("MapNotNull.kt")
        public void testMapNotNull() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/map/MapNotNull.kt");
        }

        @TestMetadata("WithIndex.kt")
        public void testWithIndex() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/map/WithIndex.kt");
        }
    }

    @TestMetadata("idea/testData/debugger/tinyApp/src/streams/sequence/misc")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Misc extends AbstractSequenceTraceTestCase {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInMisc() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/debugger/tinyApp/src/streams/sequence/misc"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("AsSequence.kt")
        public void testAsSequence() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/misc/AsSequence.kt");
        }

        @TestMetadata("Chunked.kt")
        public void testChunked() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/misc/Chunked.kt");
        }

        @TestMetadata("ChunkedWithTransform.kt")
        public void testChunkedWithTransform() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/misc/ChunkedWithTransform.kt");
        }

        @TestMetadata("ConstrainOnce.kt")
        public void testConstrainOnce() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/misc/ConstrainOnce.kt");
        }

        @TestMetadata("OnEach.kt")
        public void testOnEach() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/misc/OnEach.kt");
        }

        @TestMetadata("RequireNoNulls.kt")
        public void testRequireNoNulls() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/misc/RequireNoNulls.kt");
        }

        @TestMetadata("Windowed.kt")
        public void testWindowed() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/misc/Windowed.kt");
        }

        @TestMetadata("WindowedWithBigStep.kt")
        public void testWindowedWithBigStep() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/misc/WindowedWithBigStep.kt");
        }

        @TestMetadata("WindowedWithPartial.kt")
        public void testWindowedWithPartial() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/misc/WindowedWithPartial.kt");
        }

        @TestMetadata("WindowedWithStep.kt")
        public void testWindowedWithStep() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/misc/WindowedWithStep.kt");
        }

        @TestMetadata("ZipWithGreater.kt")
        public void testZipWithGreater() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/misc/ZipWithGreater.kt");
        }

        @TestMetadata("ZipWithLesser.kt")
        public void testZipWithLesser() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/misc/ZipWithLesser.kt");
        }

        @TestMetadata("ZipWithNextMany.kt")
        public void testZipWithNextMany() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/misc/ZipWithNextMany.kt");
        }

        @TestMetadata("ZipWithNextSingle.kt")
        public void testZipWithNextSingle() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/misc/ZipWithNextSingle.kt");
        }

        @TestMetadata("ZipWithSame.kt")
        public void testZipWithSame() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/misc/ZipWithSame.kt");
        }
    }

    @TestMetadata("idea/testData/debugger/tinyApp/src/streams/sequence/sort")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Sort extends AbstractSequenceTraceTestCase {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInSort() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/debugger/tinyApp/src/streams/sequence/sort"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("Sorted.kt")
        public void testSorted() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/sort/Sorted.kt");
        }

        @TestMetadata("SortedBy.kt")
        public void testSortedBy() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/sort/SortedBy.kt");
        }

        @TestMetadata("SortedByDescending.kt")
        public void testSortedByDescending() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/sort/SortedByDescending.kt");
        }

        @TestMetadata("SortedDescending.kt")
        public void testSortedDescending() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/sort/SortedDescending.kt");
        }

        @TestMetadata("SortedWith.kt")
        public void testSortedWith() throws Exception {
            runTest("idea/testData/debugger/tinyApp/src/streams/sequence/sort/SortedWith.kt");
        }
    }
}
