class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int lastBoughtPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (lastBoughtPrice < prices[i]) {
                maxProfit += prices[i] - lastBoughtPrice;
            }
            lastBoughtPrice = prices[i];
        }

        return maxProfit;
    }
}