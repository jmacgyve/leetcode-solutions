package com.jmacgyve.problems.easy.mergeSortedArray;

import java.util.stream.IntStream;

public class MergeSortedArray {
    /**
     You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
     Merge nums1 and nums2 into a single array sorted in non-decreasing order.
     The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
     To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

     Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
     Output: [1,2,2,3,5,6]
     Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
     The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1
     */


    //решение через два указателя
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int buf;
        int c = 1;
        if (m == 0) {
            IntStream.range(0, nums2.length).boxed()
                    .forEach(idx -> nums1[idx] = nums2[idx]);
            j = -1;
        }

        if (n == 0) {
            j = -1;
        }

        while (j >= 0) {
            if (nums2[j] > nums1[i]) {
                nums1[n+m-c] = nums2[j];
                c++;
            } else {
                nums1[n+m-c] = nums1[i];
                nums1[i] = nums2[j];
                c++;
                while (i > 0 && nums1[i] < nums1[i-1]) {
                    buf = nums1[i-1];
                    nums1[i-1] = nums1[i];
                    nums1[n+m-c] = buf;
                    c++;
                    i--;
                }
            }
            j--;
        }
    }
}
