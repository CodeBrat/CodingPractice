package com.codebrat.geeksforgeeks.arrays;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum {
    public void solution(int a[], int length, int sum){

        boolean resultFound = false;
        int runningSum = 0;
        Map sumMap = new HashMap<Integer, Integer>();

        for(int i = 0; i < length; i++){
            runningSum += a[i];
            if(runningSum == sum){
                System.out.println("The sum found between 0 and " + i);
                resultFound = true;
                break;
            }
            if(sumMap.containsKey(runningSum - sum)){
                System.out.println("The sum found between "+ sumMap.get(runningSum-sum)+ " and " + i);
                resultFound = true;
                break;
            }
            sumMap.put(runningSum, i);
        }

        if(!resultFound)
            System.out.println(-1);

    }
}
