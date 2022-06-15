package com.jmacgyve.problems.medium.searchA2DMatrix;

public class Main {
    public static void main(String[] args) {
        Search2dMatrix search2dMatrix = new Search2dMatrix();
        int[][] arr = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        System.out.println(search2dMatrix.searchMatrix(arr, 30));
    }
}
