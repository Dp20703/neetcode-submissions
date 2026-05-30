class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int n = prices.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (prices[j] > prices[i]) {
                    int local_profit = prices[j] - prices[i];
                    if (local_profit > maxProfit) {
                        maxProfit = local_profit;
                    }
                }
            }
        }
        return maxProfit;
    }
}
