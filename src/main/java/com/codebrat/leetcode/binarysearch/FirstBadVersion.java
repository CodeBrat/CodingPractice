package com.codebrat.leetcode.binarysearch;

public class FirstBadVersion {

    /* badVersion <= n */
    public int firstBadVersion(int n, int firstBad) {
        int start = 1;
        int end = n;
        while(start < end) {
            int mid = start + (end-start)/2;
            if(mid >= firstBad) {
                end = mid;
            } else {
                start = mid+1;
            }
        }
        return end;
    }
}
