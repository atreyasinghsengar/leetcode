class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int buyprice=Integer.MAX_VALUE;
        
            for (int i = 1; i < prices.length; i++) 
            {
            if (prices[i] > prices[i - 1]) 
            {
                maxprofit += prices[i] - prices[i - 1];
            }
        }
        return maxprofit;
    }
}