public class BestTimeToBuyAndSellStock {
    /*
    You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.



Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

     */

    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        int[] prices2 = new int[]{7,6,4,3,1};
        System.out.println(maxProfit(prices));
        System.out.println(maxProfit2(prices));
        System.out.println(maxProfit(prices2));
        System.out.println(maxProfit2(prices2));
    }

    //The bruttest of all forces. TLE like a boss for bigger arrays.
    public static int maxProfit(int[] prices){
        int maxProfit = 0;
        for(int i = 0; i < prices.length - 1; i++){
            for(int j = i+1; j < prices.length; j++){
                int profit = prices[j] - prices[i];
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }

    //Smooth solution
    public static int maxProfit2(int[] prices){
        int maxProfit = 0;
        int price = prices[0];
        for(int i = 1; i < prices.length; i++){
            if(price > prices[i]){
                price = prices[i];
            }
            maxProfit = Math.max(maxProfit, prices[i] - price);
        }
        return maxProfit;
    }
}
