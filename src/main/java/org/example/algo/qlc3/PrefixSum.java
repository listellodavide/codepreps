package org.example.algo.qlc3;

public class PrefixSum {

    public int[] prefixSum(int[] input) {
        int sum = 0;
        int[] output = new int[input.length];
        for(int i = 0; i < input.length; i++) {
            sum = sum + input[i];
            output[i] = sum;
        }
        return output;
    }

    public void printArray(int[] array) {
        System.out.print("[");
        for(int i = 0; i < array.length; i++) {
            System.out.print("\""+array[i]+"\"");
            if(i != array.length - 1) System.out.print(",");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        PrefixSum ps = new PrefixSum();
        int[] input = {5, 2, 1, 6, 3, 8};
        ps.printArray(ps.prefixSum(input));
    }
}
