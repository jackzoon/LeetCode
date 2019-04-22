package com.halen.step01;

/**
 * 只出现一次的数字，LeetCode第136题
 * @author halen
 *
 */
public class P_136 {
	
	public int singleNumber(int[] nums) {
        int res = nums[0];
        for(int i=1;i<nums.length;i++) {
        	res = res ^ nums[i];
        }
        return res;
    }
	
	public static void main(String[] args) {
		P_136 p = new P_136();
		int[] nums = {4,1,2,1,2};
		System.out.println(p.singleNumber(nums));
	}
    
}
