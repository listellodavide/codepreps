package org.example.algo;

import java.util.Stack;

public class SimplifyPath {

    // This is a correct implementation
    public String simplifyPathV3(String path) {
        String[] paths = path.split("/");
        Stack<String> stack = new Stack<>();

        for(String dir : paths) {
            if(dir.equals(".") || dir.isEmpty()) {
                continue;
            }
            else if(dir.equals("..")) {
                // If the current component is a "..", then
                // we pop an entry from the stack if it is non-empty
                // Important! This code is not the same as 1 IF => if(dir.equals("..") && !stack.isEmpty()) { .. }
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
            else stack.push(dir);
        }

        StringBuilder sb = new StringBuilder();
        for(String elem : stack) {
            sb.append("/");
            sb.append(elem);
        }

        if(sb.length()==0)
            return "/";

        return sb.toString();
    }

    // <!> this is wrong implementation !! It covers just the most simple cases
    public String simplifyPathV2(String path) {
        String[] result = path.split("/");
        Stack<String> stack = new Stack<String>();
        for(int i = result.length-1; i >0; i--) {
            if(result[i].equals("")) {} /* do nothing */
            else stack.push("/"+result[i]);
        }
        for(int i = result.length-1; i >0; i--) {
            if(result[i].equals(".") && result[i-1].equals("")) {
                i=i-2;
                stack.push(result[i]);
            }
            else if(result[i].equals(".") && !stack.isEmpty()) {
                stack.pop();
            }
            else if(result[i].equals("..")) {
                int counter = 0;
                while(!stack.isEmpty() && counter <2) {
                    stack.pop();
                    counter++;
                }

            }
        }
        StringBuilder sb = new StringBuilder();
        if(stack.isEmpty()) stack.push("/");
        while(!stack.isEmpty()) {
            if(stack.peek().equals("./") || stack.peek().equals("/.")) {
                stack.pop();
            }
            else sb.append(stack.pop());
        }
        return sb.toString();
    }

    // <!> this is wrong implementation !! It covers just the most simple cases
    public String simplifyPathV1(String path) {
        char[] array = path.toCharArray();
        int i, j;
        Stack<Character> stack = new Stack<>();

        for(i = array.length - 1, j = array.length - 2; j >= 0 && i >= 1; i--, j--) {
            Character end = array[i];
            Character before = array[j];

            if(end == '/' && i == array.length-1) {
                // do nothing
                stack.size();
            }
            else if(end == before && end == '/') {
                // do nothing
                stack.size();
            }
            else if(end == before && end == '.') {
                int count = 0;
                while(count < 2 && j >= 0) {
                    end = array[i];
                    if(end == '/' || j == 0) count++;
                    i--;
                    j--;
                }
            }
            else if(end == '.' && before == '/') {
                i--;
                j--;
            }
            else stack.push(end);

            if(j == 0 && before != '/') stack.push('/');
            else if(j == 0 && before == '/') stack.push(before);
        }
        StringBuilder sb = new StringBuilder();
        if(stack.isEmpty()) stack.push('/');
        while(!stack.isEmpty()) {
            if(stack.peek().equals("./")) stack.pop();
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static final void main(String[] args) {
        SimplifyPath sp = new SimplifyPath();
        String inputPath = "/home//foo/";
        String inputPath2 = "/home/../foo/";
        String inputPath3 = "/../";
        String inputPath4 = "/a/./b/../../c/";
        String inputPath5 = "/a/../../b/../c//.//";
        String inputPath6 = "/a//b////c/d//././/..";
        System.out.println("Given input path:"+inputPath+" can be reduced with simplifyPath to:"+sp.simplifyPathV3(inputPath));
        System.out.println("Given input path:"+inputPath2+" can be reduced with simplifyPath to:"+sp.simplifyPathV3(inputPath2));
        System.out.println("Given input path:"+inputPath3+" can be reduced with simplifyPath to:"+sp.simplifyPathV3(inputPath3));
        System.out.println("Given input path:"+inputPath4+" can be reduced with simplifyPath to:"+sp.simplifyPathV3(inputPath4));
        System.out.println("Given input path:"+inputPath5+" can be reduced with simplifyPath to:"+sp.simplifyPathV3(inputPath5));
        System.out.println("Given input path:"+inputPath6+" can be reduced with simplifyPath to:"+sp.simplifyPathV3(inputPath6));
    }
}
