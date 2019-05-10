package com.halen.step01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *        两个数组的交集，LeetCode第349
 * @author halen
 *
 */
public class P_349 {
	public int[] intersection(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        int[] newRes = null;
        int j = 0;
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		for(int tmp:nums1)
			set1.add(tmp);
		for(int tmp:nums2)
			set2.add(tmp);
		for(int tmp:set1) {
			if (set2.contains(tmp)) {
				res[j++] = tmp;
			}
		}
		newRes = new int[j];
		for(int i=0;i<res.length;i++) {
			newRes[i] = res[i];
		}
		return newRes;
    }
	
	public int[] intersection_2(int[] nums1, int[] nums2) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		for(int num:nums1)
			set.add(num);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int num: nums2) {
			if(set.contains(num)) {
				list.add(num);
				set.remove(num);
			}
		}
		int[] res = new int[list.size()];
		for(int i=0;i<list.size();i++)
			res[i] = list.get(i);
		return res;
	}
	
}
