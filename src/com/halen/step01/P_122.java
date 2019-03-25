package com.halen.step01;

/**
 *  买卖股票的最佳时期Ⅱ
 * @author halen
 * @date 2019年3月25日
 * @Description: TODO
 */
public class P_122 {

	 public int maxProfit(int[] prices) {
		 int profit = 0;
		 int differ = 0;
		 int len = prices.length-1;
		 for(int i=0;i<len;i++){
			 differ = prices[i+1] - prices[i];
			 if(differ>0)
				 profit += differ;
		 }	 		 
		 return profit;
	 }
	
	
	public static void main(String[] args) {
		P_122 p = new P_122();
		int[] prices = {7,1,5,3,6,4};
		System.out.println(p.maxProfit(prices));
	}
	
}
