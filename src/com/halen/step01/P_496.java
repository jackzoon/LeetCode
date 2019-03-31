package com.halen.step01;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 下一个更大元素Ⅰ
 * @author halen
 * @date 2019年3月31日
 * @Description: LeetCode第496题，下一个更大元素Ⅰ
 */
public class P_496 {

	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
		Stack<Integer> stack = new Stack<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int num : nums2){
			if(!stack.isEmpty() && stack.peek()<num){
				map.put(stack.pop(), num);
			}
			stack.push(num);
		}
		for(int i=0;i<nums1.length;i++){
			result[i] = map.getOrDefault(nums1[i], -1);
		}
        
        return result;
    }
	
}
