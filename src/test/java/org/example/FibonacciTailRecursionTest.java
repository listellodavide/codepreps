package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTailRecursionTest {

    @Test
    void testFibonacciNormalOf80() {
        assertEquals(23416728348467685L, FibonacciTCO.fib(80L));
    }
}

