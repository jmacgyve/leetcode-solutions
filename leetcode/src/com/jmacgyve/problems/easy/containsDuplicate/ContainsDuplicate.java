package com.jmacgyve.problems.easy.containsDuplicate;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class ContainsDuplicate {
    /**
     * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> resultSet = new HashSet<>();
        IntStream.range(0, nums.length).boxed()
                .forEach(idx -> resultSet.add(nums[idx]));

        return resultSet.size() < nums.length;
    }
}
