
public class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
        int valley=prices[0];
        int peak=prices[0];
        int maxprofit=0;
        while(i<prices.length-1){
            while(i < prices.length-1 && prices[i]>=prices[i+1]){
                i+=1;
            }
            valley=prices[i];
            while(i<prices.length-1 && prices[i] <=prices[i+1]){
                i+=1;
            }
            peak=prices[i];
            peak=prices[i];
            maxprofit += peak-valley;
        }
        return maxprofit;
    }
}
// https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/solution/mai-mai-gu-piao-de-zui-jia-shi-ji-ii-by-leetcode/
//方法二：峰谷法
