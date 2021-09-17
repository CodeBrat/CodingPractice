package com.codebrat.geeksforgeeks.arrays;

public class MissingNumber {
    public int solution(int a[]){
        int n = a.length;
        int sum = 0;

        sum = (n+2)*(n+1)/2;

        for(int num: a){
            sum-=num;
        }

        return sum;
    }

    public int missingNumber(int[] arr, int n) {
        int sumToN = 0;
        int runningSum = 0;
        for(int i = 0; i < arr.length; i++){
            sumToN+=i+1;
            runningSum+=arr[i];
        }
        return sumToN+n-runningSum;
    }
}
