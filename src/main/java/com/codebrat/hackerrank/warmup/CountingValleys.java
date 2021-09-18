package com.codebrat.hackerrank.warmup;

public class CountingValleys {

    public int countingValleys(int steps, String path) {
        int result = 0;
        int level = 0;
        for(int i=0; i<steps; i++) {
            if(path.charAt(i) == 'U'){
                level++;
                if(level==0)
                    result++;
            } else {
                level--;
            }
        }
        return result;
    }
}
