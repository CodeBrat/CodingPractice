package com.codebrat.leetcode.InterviewQuestions;

import java.util.TreeSet;

public class ThirdMaximum {

    public int solution(int[] nums){
        TreeSet<Integer> resultSet = new TreeSet<Integer>();
        for(int num:nums){
            resultSet.add(num);
            if(resultSet.size() > 3){
                resultSet.remove(resultSet.first());
            }
        }
        return resultSet.last();
    }

}
