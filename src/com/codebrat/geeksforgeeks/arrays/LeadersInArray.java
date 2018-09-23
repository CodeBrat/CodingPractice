package com.codebrat.geeksforgeeks.arrays;

public class LeadersInArray {

    public void solution(int[] a){
        int runningMax = Integer.MIN_VALUE;
        for(int i = a.length -1; i >= 0; i--){
            if(a[i] >= runningMax){
                runningMax = a[i];
                System.out.println(runningMax);
            }
        }
    }
}
