package com.halen.step01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 找到所有数组中消失的数字
 * @author halen
 * @date 2019年4月18日
 * @Description: LeetCode第448题
 */
public class P_448 {
	public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
        	set.add(nums[i]);
        }
        for(int i=1;i<nums.length+1;i++){
        	if(set.add(i))
        		list.add(i);
        }
        return list;
    }
	
	public List<Integer> findDisappearedNumbers_2(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for(int num:nums){
        	nums[Math.abs(num) - 1] = -Math.abs(nums[Math.abs(num) - 1]);
        }
        for(int i=0;i<nums.length;i++){
        	if(nums[i]>0)
        		list.add(i+1);
        }
        return list;
    }
	
	public static void main(String[] args) {
		P_448 p = new P_448();
		int[] nums = {4,3,2,7,8,2,3,1};
		List<Integer> list = p.findDisappearedNumbers_2(nums);
		for(int tmp:list){
			System.out.println(tmp);
		}
				
	}
}
