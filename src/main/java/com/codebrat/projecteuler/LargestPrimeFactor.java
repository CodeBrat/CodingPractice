package com.codebrat.projecteuler;

import java.util.LinkedList;
import java.util.List;

public class LargestPrimeFactor {

    public static boolean isPrime(int n) {
        if(n == 1)
            return true;
        for(int i = 2; i<=Math.sqrt(n); i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }

    public static List<Integer> getFactors(long n) {
        List<Integer> factors = new LinkedList<>();
        factors.add(1);
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0)
                factors.add(i);
        }
        return factors;
    }


    public static void main(String[] args) {
        System.out.println(Math.sqrt(26));
        List<Integer> factors = getFactors(26);
        factors.forEach(System.out::println);
        System.out.println();
        int maxPrime = 1;
        for(int factor: factors){
            if(isPrime(factor))
                maxPrime = Math.max(maxPrime, factor);
        }
        System.out.println(maxPrime);
    }
}
