package org.example;

/***
 *  Time complexity of O(2^N). This is because every call to fibonacci creates 2 more calls to fibonacci.
 *  Classic implementation of Fibonacci using Java standard normal recursion
 *
 *  Math definition of Fibonacci F(n) is:
 *
 *          [{
 *          |    0                 if n == 0
 *  F(n) =  |    1                 if n == 1
 *          |    F(n-1) = f(n-1)   if n > 1
 *          [}
 *
 * Tested against Wolframalpha at https://www.wolframalpha.com/input?i=fibonacci+of+80 -> 23416728348467685
 */
public class FibonacciNormal {
    Long fib(final int n) {
        if(n == 0) return 0L;
        if(n == 1) return 1L;
        return fib(n - 1) + fib(n - 2);
    }


    public static void main(String args[]) {
        FibonacciNormal f = new FibonacciNormal();
        System.out.println(f.fib(20));
        System.out.println(f.fib(40));
        System.out.println(f.fib(80));
    }
}
