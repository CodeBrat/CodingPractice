package com.codebrat.geeksforgeeks.arrays;

public class KadanesAlgorithm {

    public int Solution(int[] a){
        int runningMax = 0, maxSum = 0;

        for(int num:a){
            runningMax+=num;
            if(runningMax < 0){
                runningMax = 0;
                continue;
            }
            if(runningMax>maxSum){
                maxSum = runningMax;
            }
        }

        return maxSum;

    }

}
