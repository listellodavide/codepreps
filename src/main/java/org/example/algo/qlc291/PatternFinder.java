package org.example.algo.qlc291;

public class PatternFinder {

    public boolean patternFinder(String pattern, String text) {
        int i = 0;
        while(i < text.length() ) {
            if( i + pattern.length() < text.length()) {
                String sub = text.substring(i, i + pattern.length());
                if(sub.equals(pattern)) return true;
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        PatternFinder pf = new PatternFinder();
        String text = "abcbcgex";
        String pattern = "bcge";
        System.out.println("given input text="+text+" and pattern="+pattern+" patternFinder return: "+pf.patternFinder(pattern, text));

    }
}
