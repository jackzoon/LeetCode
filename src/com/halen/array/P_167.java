package com.halen.array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 
 * @author halen
 * @date 2019年3月12日
 * @Description: 两数之和LeetCode167题
 */

public class P_167 {

	public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<numbers.length;i++){
        	int complete = target - numbers[i];
        	if(map.containsKey(complete)){
        		return new int[]{map.get(complete)+1,i+1};
        	}
        	map.put(numbers[i], i);
        }
		
		return null;
    }
	
	public int[] twoSum_2(int[] numbers,int target){
		int low = 0,high = numbers.length - 1;
		int sum;
		while(low<high){
			sum = numbers[low] + numbers[high];
			if(sum==target){
				return new int[]{low+1,target+1};
			}else if (sum<target) {
				low++;
			}else{
				high--;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		P_167 p = new P_167();
		int[] nums = {2,7,11,15};
		int[] result = p.twoSum(nums, 9);
		System.out.println(Arrays.toString(result));
	}
	
}
