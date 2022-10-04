package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoodArrayTest {

    @Test
    void testArraysCharacteristicsOne() {
        List<Character> a = List.of('a', 'b', 'C', 'd', 'E', 'F', 'G');
        List<Character> b = List.of('a', 'X', 'C', 'd', 'E', 'F', 'g');
        int count = 0;
        for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
            Character characterA = a.get(i);
            Character characterB = b.get(i);
            if ((characterA-characterB==0) || Math.abs(characterA-characterB)==('a'-'A') ) {
                count++;
            }
        }
        assertEquals(6, count);
    }

    @Test
    void testArraysCharacteristicsTwo() {
        List<Character> a = List.of('a', 'b', 'c', 'd', 'E', 'F', 'G');
        List<Character> b = List.of('a', 'X', 'C', 'd', 'E', 'F', 'g');
        int count = 0;
        for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
            Character characterA = a.get(i);
            Character characterB = b.get(i);
            if ((characterA-characterB!=0) && Math.abs(characterA-characterB)==('a'-'A') ) {
                count++;
            }
        }
        assertEquals(2, count);
    }
}
