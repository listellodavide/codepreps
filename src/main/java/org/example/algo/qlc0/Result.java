package org.example.algo.qlc0;
import java.math.*;
import java.util.*;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean minEqualMax = false;
        BigInteger maxSum = BigInteger.ZERO;
        BigInteger minSum = BigInteger.ZERO;
        //if(arr.size() == 0) System.out.println(minSum + "" + maxSum);

        for(int i = 0; i< arr.size(); i++) {
            if(arr.get(i) < min) min = arr.get(i);
            if(arr.get(i) > max) max = arr.get(i);
        }

        if(min == max) minEqualMax = true; // for a special case like [5 5 5 5] min = 5 and max = 5 also
        int n = arr.size();
        if(minEqualMax) n = n - 1; // skip last
        for(int j = 0; j < n; j++) {
            if(arr.get(j) != max || minEqualMax) minSum = minSum.add(BigInteger.valueOf(arr.get(j)));
            if(arr.get(j) != min || minEqualMax) maxSum = maxSum.add(BigInteger.valueOf(arr.get(j)));
        }
        System.out.println(minSum + " " + maxSum);

    }

}

