package com.codebrat.codility;

public class DigitalGold {

    private int returnPartitions(int loopCount, int[] inputArray){
        int result = 0;

        for(int i = 0; i < loopCount; i++){
            int count = 0;
            for(int num: inputArray){
                if(num <= i)
                    count++;
            }
            if(count > (inputArray.length - count))
                break;
            if(count == (inputArray.length - count))
                result++;
        }

        return result;
    }

    public int solution(int N, int M, int[] X, int[] Y){
        int result = 0;

        result+=returnPartitions(N, X);
        result+=returnPartitions(M, Y);

        return result;
    }

    public static void main(String[] args) {
        int[] X = {2,3,2,3};
        int[] Y = {1,1,2,2};
        DigitalGold dg = new DigitalGold();
        int result = dg.solution(5, 5, X, Y);
        System.out.println(result);
    }

}
