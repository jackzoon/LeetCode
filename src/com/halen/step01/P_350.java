package com.halen.step01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *       两个数组的交集Ⅱ，LeetCode第350题
 * @author halen
 *
 */
public class P_350 {
	public int[] intersect(int[] nums1, int[] nums2) {
		int[] res = null;
		List<Integer> list = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int tmp : nums1) {
			if(map.containsKey(tmp))
				map.put(tmp, map.get(tmp)+1);
			else
				map.put(tmp, 1);
		}
		for(int tmp:nums2) {
			if(map.containsKey(tmp)) {
				list.add(tmp);
				if(map.get(tmp)==1)
					map.remove(tmp);
				else
					map.put(tmp, map.get(tmp)-1);
			}
		}
		res = new int[list.size()];
		for(int i=0;i<list.size();i++) {
			res[i] = list.get(i);
		}
		
		return res;
    }
}
