package com.jmacgyve.problems.easy.maximumSubarray;

public class Main {
    public static void main(String[] args) {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        int[] array = {-10, 13, 9, -14, 6, 15, -8, 12, -8, 12, 4};

        System.out.println(maximumSubarray.maxSubArray(array));
    }
}
