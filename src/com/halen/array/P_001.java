package com.halen.array;

import java.util.Arrays;
import java.util.HashMap;


/**
 * 
 * @author halen
 * @date 2019年3月12日
 * @Description: 两树之和，LeetCode第001题
 */
class Solution{
	public int[] twoSum(int[] nums,int target){
		int i=0,j=0;
		for(;i<nums.length;i++){
			for(j=i+1;j<nums.length;j++){
				if(nums[i] + nums[j]==target){
					return new int[]{i,j};
				}
			}
		}
		
		return null;
	}
	
	public int[] twoSum_2(int[] nums,int target){
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++){
			map.put(nums[i], i);
		}
		for(int i=0;i<nums.length;i++){
			int complete = target - nums[i];
			if(map.containsKey(complete) && i!=map.get(complete)){
				return new int[]{i,map.get(complete)};
			}
		}
		
		return null;
	}
	
	public int[] twoSum_3(int[] nums,int target){
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int size = nums.length;
		for(int i=0;i<size;i++){
			int complete = target - nums[i];
			if(map.containsKey(complete)){
				return new int[]{map.get(complete),i};
			}
			map.put(nums[i], i);
		}
		return null;
	}
}

public class P_001 {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = {2,7,11,15};
		int[] result = solution.twoSum_3(nums, 9);
		
		System.out.println(Arrays.toString(result));
	}

}


