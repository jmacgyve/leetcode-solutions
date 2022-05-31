package com.jmacgyve.problems.easy.intersectionOfTwoArraysII;

import java.util.HashMap;

public class Intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        //count entries
        for (int val : nums1) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        int newSize = 0;

        //check is nums1 contains smth from nums2 and put if true (also reducing map Value)
        for (int val : nums2) {
            if (map.getOrDefault(val, 0) > 0) {
                nums1[newSize] = val;
                map.put(val, map.get(val) - 1);
                newSize = newSize + 1;
            }
        }

        int result[] = new int[newSize];
        for (int i = 0; i < newSize; i++) {
            result[i] = nums1[i];
        }
        return result;
    }
}
