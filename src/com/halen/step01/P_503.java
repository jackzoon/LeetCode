package com.halen.step01;

import java.util.Arrays;

/**
 * 下一个更大的元素Ⅱ
 * @author halen
 * @date 2019年4月9日
 * @Description: LeetCode第503题
 */
public class P_503 {
	
	public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        for(int i=0;i<res.length;i++){
        	int j= (i+1 == nums.length ? 0:i+1);
        	while(j!=i){
        		if(nums[j]>nums[i]){
        			res[i] = nums[j];
        			break;
        		}
        		j = (j+1 == nums.length ? 0 : j+1);
        	}
        	if(j==i)
        		res[i] = -1;
        }
        return res;
    }
		
	
	public static void main(String[] args) {
		P_503 p = new P_503();
		int[] nums = {1,2,1};
		int[] res = p.nextGreaterElements(nums);
		System.out.println(Arrays.toString(res));
	}
	
}
