package com.halen.step01;

import java.util.HashMap;
import java.util.Map;

/**
 * 求众数
 * @author halen
 * @date 2019年3月28日
 * @Description: LeetCode弟169题，求众数
 */
public class P_169 {

	public int majorityElement(int[] nums) {
      int res = 0;
      int max = 0;
      Map<Integer, Integer> map = new HashMap<Integer, Integer>();
      for(int i=0;i<nums.length;i++){
    	  if(!map.containsKey(nums[i]))
    		  map.put(nums[i], 1);
    	  else
    	  map.put(nums[i],map.get(nums[i])+1);
      }      
      for(Integer key:map.keySet()){
    	  if(map.get(key)>max){
    		  max = map.get(key);
    		  res = key;
    	  }
      }
		
      return res;
    }
	
	
}
