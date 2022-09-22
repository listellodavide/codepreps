package org.example;

import org.example.tailrec.TailCall;

import static org.example.tailrec.TailCalls.done;

/***
 * Fibonacci implementation using Tail Call Optimizations (reduce the size of the stack trace and avoid stack overflow)
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
