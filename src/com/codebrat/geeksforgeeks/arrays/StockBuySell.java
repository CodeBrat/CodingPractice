package com.codebrat.geeksforgeeks.arrays;

public class StockBuySell {

    public int solution(int[] a){
        int runningMin = Integer.MAX_VALUE;
        int maxDiff = Integer.MIN_VALUE;

        for(int num : a){
            if(num<runningMin)
                runningMin = num;
            int diff = (num - runningMin);
            if(diff > maxDiff)
                maxDiff = diff;
        }
        return maxDiff;
    }

}
