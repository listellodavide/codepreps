package org.example.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortedSquaredArray {

    public int[] sortedSquaredArray(int[] array) {
        List<Integer> output = new ArrayList<>();
        for(int i = 0; i < array.length; i++) {
            output.add(array[i] * array[i]);
        }
        Collections.sort(output);
        return output.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] input = new int[]{-2, -1};
        SortedSquaredArray ssa = new SortedSquaredArray();
        System.out.println("output = " + Arrays.toString(ssa.sortedSquaredArray(input)));
    }
}
