package com.codebrat.leetcode.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class FirstBadVersionTest {

    FirstBadVersion firstBadVersion = new FirstBadVersion();

    @BeforeEach
    void setUp() {

    }

    private static Stream<Arguments> testArgs() {
        return Stream.of(
                Arguments.of(8, 4),
                Arguments.of(12, 12),
                Arguments.of(120, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("testArgs")
    public void testFirstBadVersion(int currentVersion, int firstBad) {
        int calculated = firstBadVersion.firstBadVersion(currentVersion, firstBad);
        Assertions.assertEquals(firstBad, calculated);
    }

}