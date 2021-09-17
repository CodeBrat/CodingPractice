package com.codebrat.geeksforgeeks.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountTheTriplets {

    public int countTripletBruteForce(int[] arr, int n) {
        int result = 0;
        List<Integer> refrenceList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for(int i = 0; i < n; i++){
            int numOne = arr[i];
            for(int j = i+1; j < n; j++){
                int numTwo = arr[j];
                if(refrenceList.contains(numOne+numTwo)){
                    result++;
                }
            }
        }
        return result;
    }

    public int countTripletOptimized(int a[], int n) {
        // code here
        int cnt = 0;
        Arrays.sort(a);
        for(int i = 0; i < n; i++) {
            cnt += decompose(a, a[i], 0, i-1);
        }
        return cnt;
    }

    private int decompose(int[] a, int source, int from, int to) {
        if(to >= a.length || from < 0 || from >= to) return 0;
        int cnt = 0;
        while(from < to) {
            int testSum = a[from] + a[to];
            if(testSum > source) {
                to--;
            } else if(testSum < source) {
                from++;
            } else {
                cnt++; // inc. count
                to--;    // shrink window
                from++;  // as every elemet is distinct.
            }
        }
        return cnt;
    }
}
