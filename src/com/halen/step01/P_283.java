package com.halen.step01;

import java.util.Arrays;

/**
 * 移动零
 * @author halen
 * @date 2019年4月13日
 * @Description: LeetCode第283题
 */
public class P_283 {
	
	public void moveZeroes(int[] nums) {
        int i=0,j=0;
		for(i=0;i<nums.length;i++){
			if(nums[i]!=0){
				nums[j++]=nums[i];
			}
		}
		while(j<nums.length){
			nums[j++]=0;
		}
    }
	
	
	
	public static void main(String[] args) {
		P_283 p = new P_283();
		int[] nums = {0,1,0,3,12};
		p.moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
	}
}
