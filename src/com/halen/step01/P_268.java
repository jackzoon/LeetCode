package com.halen.step01;

import java.util.HashSet;
import java.util.Set;

/**
 * 缺失数字
 * @author halen
 * @date 2019年4月12日
 * @Description: LeetCode第268题
 */
public class P_268 {
	
	public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
        	set.add(nums[i]);
        }
        for(int i=0;i<nums.length+1;i++){
        	if(set.add(i))
        		return i;
        }
        return -1;
    }
	
	public int missingNumber_2(int[] nums) {
        double sum = 0;
        int len = nums.length;
        sum = (1+len)*len/2.0;
        for(int i=0;i<len;i++){
        	sum = sum-nums[i];
        }
        return (int)sum;
    }
	
	public int missingNumber_3(int[] nums) {
        int num = nums.length;
        for(int i=0;i<nums.length;i++){
        	num = num^i;
        	num = num^nums[i];
        }
        return num;
    }
}
