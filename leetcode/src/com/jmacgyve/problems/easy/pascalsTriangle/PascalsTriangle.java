package com.jmacgyve.problems.easy.pascalsTriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 1) return List.of(List.of(1));
        if (numRows == 2) return List.of(List.of(1), List.of(1, 1));

        List<List<Integer>> resultList = new ArrayList<>();
        resultList.add(List.of(1));
        resultList.add(List.of(1, 1));

        for (int i = 3; i <= numRows; i++) {
            resultList.add(sumElementsAndGetList(resultList));
        }
        return resultList;
    }

    private List<Integer> sumElementsAndGetList(List<List<Integer>> resultList) {
        List<Integer> bufferList = resultList.get(resultList.size() - 1);
        List<Integer> returnedList = new ArrayList<>();
        returnedList.add(1);
        for (int i = 0; i < resultList.size() - 1; i++) {
            int el = bufferList.get(i) + bufferList.get(i + 1);
            returnedList.add(el);
        }
        returnedList.add(1);
        return returnedList;
    }
}
