package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class FactorialNormalTest {

    @Test
    void testFactorialNormalOf20() {
        FactorialNormal f = new FactorialNormal();
        assumeTrue(5 > 1);
        assertEquals(2432902008176640000L, f.factorial(20L));
    }

}
