package com.codebrat.geeksforgeeks.arrays;

import java.util.ArrayList;

public class SubArraySumSlidingWindow {

    public ArrayList<Integer> solution(int arr[], int n, int s){

        ArrayList<Integer> resultList = new ArrayList<>();
        int startIndex = 0;
        int runningSum = arr[startIndex];

        for(int endIndex = 1; endIndex<n; endIndex++) {
            runningSum += arr[endIndex];
            while(runningSum > s) {
                runningSum -= arr[startIndex];
                startIndex++;
            }
            if(runningSum == s){
                resultList.add(startIndex+1);
                resultList.add(endIndex+1);
                return resultList;
            }
        }
        resultList.add(-1);
        return resultList;
    }
}
