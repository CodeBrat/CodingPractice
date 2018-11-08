package com.codebrat.leetcode.InterviewQuestions;

public class FirstUniqueCharacter {

    public static int betterFirstUniq(String s){

        int result = s.length();
        for(char c = 'a'; c <='z'; c++){
            int temp = s.indexOf(c);
            if(temp != -1 && temp == s.lastIndexOf(c))
                result = Math.min(temp, result);
        }

        return result == s.length()?-1:result;
    }

    public static int firstUniqChar(String s){
        int result = -1;
        int[] stringToCharArr = new int[26];

        for(int i = 0; i < s.length(); i++){
            stringToCharArr[s.charAt(i)-'a'] += 1;
        }
        for(char c: s.toCharArray()){
            if(stringToCharArr[c-'a'] == 1) {
                result = s.indexOf(c);
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int result = betterFirstUniq("leetcode");
        System.out.println(result);
    }

}
