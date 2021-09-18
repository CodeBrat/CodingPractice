package com.codebrat.hackerrank.warmup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CountingValleysTest {

    CountingValleys countValleys = new CountingValleys();

    private static Stream<Arguments> testArgs() {
        return Stream.of(
                Arguments.of(8, "UDDDUDUU", 1),
                Arguments.of(12, "DDUUDDUUUUDD", 2)
        );
    }

    @ParameterizedTest
    @MethodSource("testArgs")
    public void countingValleys(int steps, String path, int expected) {
        int actual = countValleys.countingValleys(steps, path);
        Assertions.assertEquals(expected, actual);
    }
}