package com.green.javaextra.day02;

class SolutionTest {
    public static void main(String[] args) {
        Solution s = new Solution();
        String result = s.solution("abcdef");
        System.out.println(result);
    }
}

public class Solution {
    public String solution(String str) {
        char[] chars = str.toCharArray();
        char[] temp = new char[chars.length];
        int subIdx = chars.length - 1;
        for(int i=0; i<temp.length; i++) {
            temp[i] = chars[subIdx--];
        }
        return String.valueOf(temp);
    }
}
