package org.example.LeetCode;

class SolutionLeetCode_BestTimeToBuyAndSellStock_121 {
    public int maxProfit(int[] prices) {

        int max=0;
        int bp=Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]>bp)
            {
                int prof=prices[i]-bp;
                max=Math.max(prof,max);
            }
            else
            {
                bp=prices[i];
            }
        }
        return max;
    }
}

//class Solution {
//    public int maxProfit(int[] prices) {
//        if (prices.length == 0) {
//            return 0;
//        }
//
//        int minPrice = prices[0];
//        int minIndex = 0;
//
//        for (int i = 1; i < prices.length; i++) {
//            if (prices[i] < minPrice) {
//                minPrice = prices[i];
//                minIndex = i;
//            }
//        }
//
//
//        int maxPrice = prices[minIndex];
//
//        for (int i = minIndex + 1; i < prices.length; i++) {
//            if (prices[minIndex] < prices[i]) {
//                prices[minIndex] = prices[i];
//                maxPrice = prices[minIndex];
//            }
//        }
//
//        System.out.println(maxPrice);
//        System.out.println(minPrice);
//
//
//        return maxPrice - minPrice;
//    }
//}