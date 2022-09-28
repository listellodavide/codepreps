package org.example.algo.qlc290;

/*
*
* 290. Word Pattern
* Given a pattern and a string s, find if s follows the same pattern.
*
* Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
*
* Example 1:
*
* Input: pattern = "abba", s = "dog cat cat dog"
* Output: true
*
* Example 2:
*
* Input: pattern = "abba", s = "dog cat cat fish"
* Output: false
*
* Example 3:
*
* Input: pattern = "aaaa", s = "dog cat cat dog"
* Output: false
*
**/

import java.util.HashMap;
import java.util.StringTokenizer;

public class SolutionWordPattern {

    public boolean validatePattern(String pattern, String s) {
        char[] elements = pattern.toCharArray();
        HashMap<Character, String> hashMap = new HashMap<>();
        StringTokenizer st = new StringTokenizer(s, " ");
        int i = 0;
        if(st.countTokens() != elements.length) return false;
        while(st.hasMoreTokens()) {
            if( i >= elements.length) return false;
            String token = st.nextToken();
            if(hashMap.get(elements[i]) == null && hashMap.containsValue(token)) {
                return false;
            }
            else if(hashMap.get(elements[i]) == null && !hashMap.containsValue(token)) {
                hashMap.put(elements[i], token);
            }
            else if(hashMap.get(elements[i]) != null && !hashMap.get(elements[i]).equals(token)) {
                return false;
            }
            i++;
        }
        if(i < elements.length - 1) return false;
        return true;
    }


    public static void main(String[] args) {
        SolutionWordPattern swp = new SolutionWordPattern();
        String pattern = "abba";
        String inputOne = "dog cat cat dog";
        String inputTwo = "dog cat cat fish";
        String inputThree = "dog dog dog dog";
        String patternFour = "aaaa";
        String inputFour = "dog cat cat dog";
        String patternFive = "he";
        String inputFive = "hello";

        System.out.println("Given pattern:"+ pattern+" and input: "+inputOne+ " >> Result is: "+  swp.validatePattern(pattern, inputOne));
        System.out.println("Given pattern:"+ pattern+" and input: "+inputTwo+ " >> Result is: "+  swp.validatePattern(pattern, inputTwo));
        System.out.println("Given pattern:"+ pattern+" and input: "+inputThree+ " >> Result is: "+  swp.validatePattern(pattern, inputThree));
        System.out.println("Given pattern:"+ patternFour+" and input: "+inputFour+ " >> Result is: "+  swp.validatePattern(patternFour, inputFour));
        System.out.println("Given pattern:"+ patternFive+" and input: "+inputFive+ " >> Result is: "+  swp.validatePattern(patternFive, inputFive));
    }

}
