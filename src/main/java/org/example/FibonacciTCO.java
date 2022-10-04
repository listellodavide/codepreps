package org.example;

import org.example.tailrec.TailCall;

import static org.example.tailrec.TailCalls.done;

/***
 * Time complexity of O(2^N). This is because every call to fibonacci creates 2 more calls to fibonacci.
 * Fibonacci's implementation using Tail Call Optimizations (reduce the size of the stack trace and avoid stack overflow)
 */
public class FibonacciTCO {

    public static Long fib(Long n) {
        return fibonacciTailRec(n, 1L, 0L).invoke();
    }

     private static TailCall<Long> fibonacciTailRec(final Long index, final Long prev, final Long current) {
        // printStackTrace();
        if (index <= 0) {
            return done(current);
        }
        else {
            return () -> {
                return fibonacciTailRec(index - 1, (prev + current), prev);
            };
        }
    }
}
