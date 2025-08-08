class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;  // update min price so far
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);  // calculate profit if sold today
            }
        }
        return maxProfit;     
    }
}