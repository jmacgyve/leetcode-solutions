package com.jmacgyve.problems.easy.twoSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] ex = {3, 2, 4};
        int target = 6;
        int[] a = twoSum.twoSum(ex, target);

        Arrays.stream(a).forEach(System.out::println);
    }
}
