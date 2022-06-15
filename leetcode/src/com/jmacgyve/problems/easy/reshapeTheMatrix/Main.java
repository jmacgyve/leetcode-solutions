package com.jmacgyve.problems.easy.reshapeTheMatrix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ReshapeTheMatrix reshapeTheMatrix = new ReshapeTheMatrix();

        int[][] arr = {{1,2},{3,4}};
        int row = 1;
        int col = 4;
        System.out.println(Arrays.deepToString(reshapeTheMatrix.matrixReshape(arr, row, col)));
    }
}
