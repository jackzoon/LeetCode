package com.halen.step01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 无重复字符的最长字符串
 * @author halen
 * @date 2019年3月18日
 * @Description: LeetCode第003题
 */
public class P_003 {

	public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
		int count = 1;
        int max = count;         
        char[] arrs = s.toCharArray();
        if(arrs.length==0)
            return 0;
        map.put(arrs[0],0); 
        for(int i=1;i<arrs.length;i++){
        	if(!map.containsKey(arrs[i])){
        		map.put(arrs[i],i);
        		count++;
        	}else {                
        		i = map.get(arrs[i]);
        		count = 0;
        		map.clear();        		
				continue;
			}
            if(count>max)
                max=count;
        }
		
		return max;
    }
	
	public int lengthOfLongestSubstring_2(String s) {
        Set<Character> set = new HashSet<Character>();
        int ans=0,i=0,j=0;
        char[] arr = s.toCharArray();
        int n = arr.length;
        while(i<n&&j<n){
        	if(!set.contains(arr[j])){
        		set.add(arr[j++]);
        		ans = Math.max(ans, j-i);
        	}else{
        		set.remove(arr[i++]);
        	}
        }
		
		return ans;
    }
	
}
