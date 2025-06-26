class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;

        int buy = prices[0];
        int maxprofit = 0;
        int sum = 0;

        for(int i=1; i<n; i++)
        {

            if(prices[i] < buy)
            {
                buy = prices[i];
            }

            if(maxprofit < prices[i] - buy)
            {
                maxprofit = prices[i] - buy;
            }
        }
        return maxprofit;
    }
}