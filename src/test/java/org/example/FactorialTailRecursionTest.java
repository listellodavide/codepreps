package org.example;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTailRecursionTest {

    @Test
    void testFactorialNormalOf20() {
        assertEquals(BigInteger.valueOf(2432902008176640000L), FactorialTCO.factorial(20L));
    }

    @Test
    void testFactorialNormalOf80() {
        assertEquals(new BigInteger("71569457046263802294811533723186532165584657342365752577109445058227039255480148842668944867280814080000000000000000000"), // must use string to represent such big number otherwise parsing from integer / long will fail
                FactorialTCO.factorial(80L));
    }
}
