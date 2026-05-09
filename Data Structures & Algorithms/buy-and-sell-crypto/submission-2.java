class Solution {
    public int maxProfit(int[] prices) {
        

        int profit = 0;
        int buy = prices[0];

        for (int item : prices){
            if (item < buy){
                buy = item;
            }
            else{
                profit = Math.max(profit, item - buy);
            }
        }
        return profit;

    }
}
