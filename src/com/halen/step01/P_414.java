package com.halen.step01;

import java.util.HashSet;
import java.util.Set;

/**
 * 第三大的数
 * @author halen
 * @date 2019年4月16日
 * @Description: LeetCode第414题
 */
public class P_414 {
	public int thirdMax(int[] nums) {
        int one,two,three;
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
        	set.add(nums[i]);
        }
        one=two=three=Integer.MIN_VALUE;
        for(int tmp:set){   
        	if(tmp>one){
        		three=two;
        		two=one;
        		one=tmp;
        	}else if(tmp>two){
        		three=two;
        		two=tmp;
        	}else if(tmp>three){
        		three=tmp;
        	}
        }
        if(set.size()<3)
        	return one;
        return three;
    }
	
	public int thirdMax_2(int[] nums) {
        int one,two,three;
        boolean flag = true;
        int count = 0;
        one=two=three=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
        	int tmp = nums[i];
        	if(tmp==Integer.MIN_VALUE && flag){
        		count++;
        		flag = false;
        	}
        	if(tmp>one){
        		count++;
        		three=two;
        		two=one;
        		one=tmp;
        	}else if(tmp>two && tmp<one){
        		count++;
        		three=two;
        		two=tmp;
        	}else if(tmp>three&&tmp<two){
        		count++;
        		three=tmp;
        	}
        }
        
        return count>=3?three:one;
    }
	
	public static void main(String[] args) {
		P_414 p = new P_414();
		int[] nums = {2,2,3,1};
		System.out.println(p.thirdMax(nums));
	}
}
