package com.codebrat.hackerrank.warmup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SalesByMatchTest {

    SalesByMatch salesByMatch = new SalesByMatch();

    public static Stream<Arguments> testArgs() {
        return Stream.of(
            Arguments.arguments(7, List.of(1,2,1,2,1,3,2), 2)
        );
    }

    @ParameterizedTest
    @MethodSource("testArgs")
    public void testSockMerchant(int n, List<Integer> ar, int expected){
        int result = salesByMatch.sockMerchant(n, ar);
        Assertions.assertEquals(expected, result);
    }

}