package com.halen.step01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 存在重复元素
 * @author halen
 * @date 2019年4月2日
 * @Description: LeetCode第217题
 */
public class P_217 {

	public boolean containsDuplicate(int[] nums) {		
		for(int i=0;i<nums.length-1;i++){
			for(int j=1;j<nums.length;j++){
				if(nums[i] == nums[j])
					return true;
			}
		}		
		return false;
    }
	
	public boolean containsDuplicate_2(int[] nums) {		
		Arrays.sort(nums);
		for(int i=0;i<nums.length-1;i++){
			if(nums[i] == nums[i+1])
				return true;
		}		
		return false;
    }
	
	public boolean containsDuplicate_3(int[] nums) {		
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<nums.length;i++){
			if(!set.add(nums[i]))
				return true;
		}
		return false;
    }
	
	public static void main(String[] args) {
		P_217 p = new P_217();
		int[] nums = {1,1,1,3,3,4,3,2,4,2};
		System.out.println(p.containsDuplicate(nums));
		
	}
	
}
