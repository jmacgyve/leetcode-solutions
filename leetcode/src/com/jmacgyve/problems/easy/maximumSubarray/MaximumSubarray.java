package com.jmacgyve.problems.easy.maximumSubarray;

public class MaximumSubarray {
    /**
     Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
     A subarray is a contiguous part of an array.
     */
    public int maxSubArray(int[] nums) {
       if  (nums.length == 1) return nums[0];

        int maxSum = Integer.MIN_VALUE;
        int buff = 0;

        for (int i = 0; i < nums.length; i++) {
            if (buff < 0) {
                buff = 0;
            }

            buff = buff + nums[i];
            maxSum = Integer.max(maxSum, buff);
        }
        return maxSum;
    }
}
