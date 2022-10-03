package org.example;

import org.example.algo.TwoNumberSum;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoNumberSumTest {

    @Test
    void testCase1() {
        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;
        assertEquals("[11, -1]", Arrays.toString(TwoNumberSum.twoNumberSum(array, targetSum)));
    }


    @Test
    void testCase2() {
        int[] array = {4, 6};
        int targetSum = 10;
        assertEquals("[4, 6]", Arrays.toString(TwoNumberSum.twoNumberSum(array, targetSum)));
    }


    @Test
    void testCase3() {
        int[] array = {4, 6, 1};
        int targetSum = 5;
        assertEquals("[4, 1]", Arrays.toString(TwoNumberSum.twoNumberSum(array, targetSum)));
    }


    @Test
    void testCase4() {
        int[] array = {4, 6, 1, -3};
        int targetSum = 3;
        assertEquals("[6, -3]", Arrays.toString(TwoNumberSum.twoNumberSum(array, targetSum)));
    }


    @Test
    void testCase5() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int targetSum = 17;
        assertEquals("[8, 9]", Arrays.toString(TwoNumberSum.twoNumberSum(array, targetSum)));
    }


    @Test
    void testCase6() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 15};
        int targetSum = 18;
        assertEquals("[3, 15]", Arrays.toString(TwoNumberSum.twoNumberSum(array, targetSum)));
    }


    @Test
    void testCase7() {
        int[] array = {-7, -5, -3, -1, 0, 1, 3, 5, 7};
        int targetSum = -5;
        assertEquals("[-5, 0]", Arrays.toString(TwoNumberSum.twoNumberSum(array, targetSum)));
    }


    @Test
    void testCase8() {
        int[] array = {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47};
        int targetSum = 163;
        assertEquals("[210, -47]", Arrays.toString(TwoNumberSum.twoNumberSum(array, targetSum)));
    }


    @Test
    void testCase9() {
        int[] array = {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47};
        int targetSum = 164;
        assertEquals("[]", Arrays.toString(TwoNumberSum.twoNumberSum(array, targetSum)));
    }

    @Test
    void testCase10() {
        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 15;
        assertEquals("[]", Arrays.toString(TwoNumberSum.twoNumberSum(array, targetSum)));
    }

    @Test
    void testCase11() {
        int[] array = {14};
        int targetSum = 15;
        assertEquals("[]", Arrays.toString(TwoNumberSum.twoNumberSum(array, targetSum)));
    }

    @Test
    void testCase12() {
        int[] array = {15};
        int targetSum = 15;
        assertEquals("[]", Arrays.toString(TwoNumberSum.twoNumberSum(array, targetSum)));
    }
}
