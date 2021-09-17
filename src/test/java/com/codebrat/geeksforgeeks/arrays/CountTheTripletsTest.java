package com.codebrat.geeksforgeeks.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.util.stream.Stream;

class CountTheTripletsTest {

    @InjectMocks
    CountTheTriplets countTheTriplets;

    @BeforeEach
    public void init(){
        MockitoAnnotations.openMocks(this);
    }

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new int[]{1,5,3,2}, 4, 2),
                Arguments.of(new int[]{4,3,2}, 3, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    public void testBruteForce(int[] arr, int n, int expected) {
        int actual = countTheTriplets.countTripletBruteForce(arr, n);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    public void testOptimizedSolution(int[] arr, int n, int expected) {
        int actual = countTheTriplets.countTripletOptimized(arr, n);
        Assertions.assertEquals(expected, actual);
    }

}