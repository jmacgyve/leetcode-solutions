package com.jmacgyve.problems.easy.twoSum;

import java.util.HashMap;
import java.util.stream.IntStream;

public class TwoSum {
    /**
     * Given an array of integers 'nums' and an integer 'target', return indices of the two numbers such that they add up to 'target'.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * You can return the answer in any order.
     */

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> buffer = new HashMap<>();
        int[] res = new int[2];

        IntStream.range(0, nums.length)
                .forEach(idx -> {
                    int complement = target - nums[idx];
                    if (buffer.containsKey(complement)) {
                        res[0] = buffer.get(complement);
                        res[1] = idx;
                    }
                    buffer.put(nums[idx], idx);
                });

        return res;
    }
}
