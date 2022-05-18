// Sliding Window

class Solution {
    public int maxProfit(int[] prices) {
        // Initializing min_price as max value to receive the minimum price for each itteration (every time we can buy the lowest price)
        int min_price = Integer.MAX_VALUE; 
      
        //Initializing as max_profit as 0 to receive the  largest posible profit
        int max_profit = 0; 
        
        for(int i = 0; i < prices.length; i++) {
            if (prices[i] < min_price) {
              
                // Buying stock if price is lower
                min_price = prices[i];
              
            }else if (prices[i] - min_price > max_profit){
              
                // Selling Stock if there is bigger profit
                max_profit = prices[i] - min_price;
            }
        }
        return max_profit;
    }
}
