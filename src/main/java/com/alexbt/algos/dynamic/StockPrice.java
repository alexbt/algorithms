package com.alexbt.algos.dynamic;

//

//(3) If current - MIN is the Best profit => keep
public class StockPrice {

    public static void findBestBuySell(int[] prices) {

        // (1) Start with Best match at position 0: buy, sell, min...
        int indexBuy = 0;
        int indexSell = 0;
        int mostProfit = 0;
        int indexMin = 0;

        int current = 1;
        while (current < prices.length) {

            // (2) Keep track of minimum value
            if (prices[current] < prices[indexMin]) {
                indexMin = current;
            }

            // (3) Check current with MIN => current profit
            int currentProfit = prices[current] - prices[indexMin];

            // (4) Keep buy & sell if currentProfit the best profit so far
            if (currentProfit > mostProfit) {
                mostProfit = currentProfit;
                indexBuy = indexMin;
                indexSell = current;
            }
            current++;
        }

        System.out.print("buy: prices[" + indexBuy + "] = " + prices[indexBuy]);
        System.out.println(", sell: prices[" + indexSell + "] = " + prices[indexSell]);
    }

    public static void main(String[] args) {
        findBestBuySell(new int[] { 100, 180, 260, 310, 40, 305, 300 });
        findBestBuySell(new int[] { 100, 180, 260, 310, 40, 250, 300 });
        findBestBuySell(new int[] { 100, 180, 260, 310, 40, 250, 240 });
        findBestBuySell(new int[] { 100, 180, 260, 310, 40, 251, 240 });
    }
}
