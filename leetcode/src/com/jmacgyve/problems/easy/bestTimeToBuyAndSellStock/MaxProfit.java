package com.jmacgyve.problems.easy.bestTimeToBuyAndSellStock;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int result = 0;
        int min = prices[0];

        for (int i = 1; i < prices.length; i++) {
            int diff = prices[i]-min;
            result = (result >= diff) ? result : diff; //Integer.max(result, prices[i]-min)
            min = (min <= prices[i]) ? min : prices[i]; //Integer.min(min, prices[i])
        }
        return result;
    }
}
