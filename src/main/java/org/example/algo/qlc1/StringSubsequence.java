package org.example.algo.qlc1;

public class StringSubsequence {

    private boolean isSubSeq(String s, String t) {
        char[] subSeq = s.toCharArray();
        char[] original = t.toCharArray();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < subSeq.length && j < original.length) {
            if (subSeq[i] == original[j]) {
                sb.append(subSeq[i]);
                i++;
            }
            j++;
        }
        return sb.toString().equals(s);
    }


    public void swap(char[] s, int i, int j) {
        char tmp = s[i];
        s[i] = s[j];
        s[j] = tmp;
    }


    /*  Time Complexity O(N)
     *  Space complexity O(1)
     */
    public void reverseString(char[] s) {
        int i = s.length-1;
        int j = 0;
        while(j < i) {
            swap(s, i, j);
            i--;
            j++;
        }
    }


    public static void main(String[] args) {
        StringSubsequence ss = new StringSubsequence();

        String t = "abcde";
        String sub1 = "ace";
        String sub2 = "aec";
        System.out.println("call isSubSeq return: " + ss.isSubSeq(sub1, t) + " that is expected to be True");
        System.out.println("call isSubSeq return: " + ss.isSubSeq(sub2, t) + " that is expected to be False");

        char[] input1 = {'h','e','l','l','o'};
        char[] input2 = {'H','a','n','n','a','h'};
        ss.reverseString(input1);
        System.out.println(input1);
        ss.reverseString(input2);
        System.out.println(input2);
    }
}
