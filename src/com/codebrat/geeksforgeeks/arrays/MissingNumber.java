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
}
