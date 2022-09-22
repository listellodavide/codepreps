package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

/***
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
 * Tested against Wolframalpha at https://www.wolframalpha.com/input?i=fibonacci+of+20
 */
public class FibonacciNormalTest {

    @Test
    void testFibonacciNormalOf20() {
        FibonacciNormal f = new FibonacciNormal();
        assertEquals(6765, f.fib(20));
    }

}
