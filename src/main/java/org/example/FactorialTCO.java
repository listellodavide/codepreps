package org.example;

import org.example.tailrec.TailCall;

import java.math.BigInteger;

import static org.example.tailrec.TailCalls.done;

public class FactorialTCO {

    public static BigInteger factorial(final Long n) {
        return factorialTailRec(n, BigInteger.ONE).invoke();
    }

    private static TailCall<BigInteger> factorialTailRec(final Long index, final BigInteger acc) {
        if(index == 1) return done(acc);
        return () -> {
            return factorialTailRec(index - 1, BigInteger.valueOf(index).multiply(acc));
        };
    }
}
