package com.halen.step01;

import java.util.HashMap;
import java.util.Map;

/**
 * 存在重复的元素Ⅱ
 * @author halen
 * @date 2019年4月11日
 * @Description: LeetCode第219题
 */
public class P_219 {

	public boolean containsNearbyDuplicate(int[] nums, int k) {
		for(int i=0;i<nums.length-1;i++){
        	for(int j=i+1;j<nums.length;j++){
        		if(nums[i]==nums[j]){
        			if(j-i<=k)
        				return true;
        		}
        	}
        }
		return false;
    }
	
	public boolean containsNearbyDuplicate_2(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(nums[i])){
				if((i-map.get(nums[i]))<=k)
					return true;
			}
			map.put(nums[i], i);
		}
		return false;
    }
	
	public static void main(String[] args) {
		P_219 p = new P_219();
		int[] nums = {1,2,3,1};
		System.out.println(p.containsNearbyDuplicate(nums, 3));
		
	}
	
}
