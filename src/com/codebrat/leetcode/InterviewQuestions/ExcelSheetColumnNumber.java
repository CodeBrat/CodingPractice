package com.codebrat.leetcode.InterviewQuestions;

public class ExcelSheetColumnNumber {

    public static int titleToNumber(String s){
        long startTime = System.currentTimeMillis();
        int result = 0;
        int power = s.length() - 1;
        for(char c : s.toCharArray()){
            result+=((c-'A'+1)*Math.pow(26, power));
            power--;
        }
        System.out.println("runtime = "+(System.currentTimeMillis() - startTime));
        return result;
    }

    public static int betterTitleToNumber(String s){
        long startTime = System.currentTimeMillis();
        int result = 0;
        if(s.length() > 0) {
            for (char c : s.toCharArray()) {
                result = result * 26 + c - 'A' + 1;
            }
        }
        System.out.println("runtime = "+(System.currentTimeMillis() - startTime));
        return result;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("AAAAAAAAAAAAAB"));
        System.out.println(betterTitleToNumber("AABASSAAAAA"));
    }
}
