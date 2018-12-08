package com.codebrat.leetcode.InterviewQuestions;

import java.util.LinkedList;
import java.util.List;

public class GenerateParenthesis {

    public List<String> generateParenthesis(int n){
        List<String> resultList = new LinkedList<>();
        generateParenthesis(resultList, "",0, 0, n);
        return resultList;
    }

    private void generateParenthesis(List<String> resultList, String paren, int open, int close, int n) {
        if(paren.length() == n * 2){
            resultList.add(paren);
            return;
        }

        if(open < n){
            generateParenthesis(resultList, paren+"(", open+1, close, n);
        }
        if(close < open){
            generateParenthesis(resultList, paren+")", open, close+1, n);
        }

    }

}
