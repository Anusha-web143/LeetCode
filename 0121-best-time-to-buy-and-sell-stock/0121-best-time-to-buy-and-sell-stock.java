class Solution {
    public int maxProfit(int[] prices) {
        int minprice=prices[0];
        int max=0;
        for(int i=1;i<prices.length; i++){
            int profit=prices[i]-minprice;
           max= Math.max(max,profit);
           minprice=Math.min(minprice,prices[i]);
        }
        return max;
    }
}