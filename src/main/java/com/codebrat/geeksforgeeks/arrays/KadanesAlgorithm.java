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

    public long maxSubarraySumWithNegatives(int[] arr, int n) {
        if(n==0) return 0;
        long maxSum = arr[0];
        long runningMax = arr[0];
        for(int i = 1; i<n; i++){
            runningMax = Math.max(arr[i], runningMax+arr[i]);
            maxSum = Math.max(maxSum, runningMax);
        }
        return maxSum;
    }

}
