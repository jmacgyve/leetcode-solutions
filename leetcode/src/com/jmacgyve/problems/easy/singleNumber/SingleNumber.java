package com.jmacgyve.problems.easy.singleNumber;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int a = 0;
        for(int num : nums)
            // XOR
            // A ^ A = 0
            // A ^ 0 = A
            a = a ^ num;
        return a;
    }
}
