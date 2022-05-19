package com.jmacgyve.problems.easy.mergeSortedArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = {3, 6, 8, 0, 0, 0};
        int m = 3;
        int[] nums2 = {1, 2, 9};
        int n = 3;

        mergeSortedArray.merge(nums1, m, nums2, n);
        Arrays.stream(nums1).forEach(System.out::print);
    }
}
