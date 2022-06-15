package com.jmacgyve.problems.easy.reshapeTheMatrix;

public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int columns = mat[0].length;
        if (rows*columns != r*c) return mat;

        int[][] result = new int[r][c];
        int res_rows = 0;
        int res_columns = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[res_rows][res_columns] = mat[i][j];
                res_columns++;
                if (res_columns == c) {
                    res_columns = 0;
                    res_rows++;
                }
            }
        }
        return result;
    }
}
