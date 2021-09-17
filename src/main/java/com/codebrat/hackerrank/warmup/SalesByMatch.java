package com.codebrat.hackerrank.warmup;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SalesByMatch {

    public int sockMerchant(int n, List<Integer> ar) {
        List<Integer> sortedArray = ar.stream().sorted().collect(Collectors.toList());
        Collections.sort(ar);
        int result=0;
        for(int i = 1; i< n; i++){
            if(Objects.equals(ar.get(i - 1), ar.get(i))){
                result++;
                i++;
            }
        }
        return result;
    }
}
