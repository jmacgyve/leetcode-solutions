package com.jmacgyve.problems.easy.bestTimeToBuyAndSellStock;

public class Main {
    public static void main(String[] args) {
        int[] array = {7,10,1,0,100};
        MaxProfit maxProfit = new MaxProfit();

        System.out.println(maxProfit.maxProfit(array));
    }
}
