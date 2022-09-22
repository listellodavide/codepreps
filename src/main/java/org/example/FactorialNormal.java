package org.example;

/**
 *
 *  Mathematically N ! = n * (n - 1) * (n - 2) * ... 5 * 4 * 3 * 2 * 1
 *
 * Tested against Wolframalpha at https://www.wolframalpha.com/input?i=factorial+of+20
 **/
public class FactorialNormal {

    long fact(final Long index, final Long acc) {
        if(index == 1) return acc;
        return fact(index - 1, index * acc);
    }

    long factorial(final Long n) {
        return fact(n, 1L);
    }

    public static void main(String args[]) {
        FactorialNormal f = new FactorialNormal();
        System.out.println(f.factorial(20L));
    }

}
