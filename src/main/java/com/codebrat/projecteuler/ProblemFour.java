package com.codebrat.projecteuler;

public class ProblemFour {

    public static boolean checkIfPalindrome(int n) {
        int reversed = 0;
        int original = n;
        while (n > 0) {
            reversed=reversed*10;
            int tenths = n%10;
            reversed+=tenths;
            n = n/10;
        }
        return original==reversed;
    }

    public static void main(String[] args) {
        int max = 999;
        int maxProduct = -1;
        for(int i = max; i>99;i--){
            for(int j=max; j>99; j--){
                int product = i*j;
                if(checkIfPalindrome(product)){
                    maxProduct = Math.max(product, maxProduct);
                }
            }
        }
        System.out.println(maxProduct);
    }
}
