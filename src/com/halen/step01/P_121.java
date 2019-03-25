package com.halen.step01;

/**
 * 买卖股票的最佳时期
 * @author halen
 * @date 2019年3月24日
 * @Description: LeetCode第121题，买卖股票的最佳时期
 */
public class P_121 {

	public int maxProfit(int[] prices) {
        int result = 0;
        int max = 0;
        for(int i=0;i<prices.length-1;i++){
        	for(int j=i+1;j<prices.length;j++){
        		result = prices[j]-prices[i];
        		if(result>max){
        			max = result;
        		}
        	}
        }		
		
		return max;
    }
	
	public int maxProfit_2(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i=0;i<prices.length;i++){
        	if(prices[i]<min){
        		min = prices[i];
        	}else if(prices[i]-min > max){
        		max = prices[i]-min;
        	}
        }       	
		
		return max;
    }
	
	public static void main(String[] args) {
		P_121 p = new P_121();
		int[] prices = {7,6,4,3,1};
		System.out.println(p.maxProfit_2(prices));
	}
	
}
