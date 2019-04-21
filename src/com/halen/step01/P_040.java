package com.halen.step01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *      组合总和Ⅱ，LeetCode第040题
 * @author halen
 *
 */
public class P_040 {

	Set<List<Integer>> set = new HashSet<List<Integer>>();
	
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> listAll = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		Arrays.sort(candidates);
		find(listAll, list, candidates, target, 0);
		return listAll;
    }
	
	public void find(List<List<Integer>> listAll,List<Integer> list,int[] candidates,int target,int num) {
		if(target==0) {
			if(set.add(list)) {
				listAll.add(list);
			}
			return ;
		}
		if(candidates[0]>target) return;
		for(int i=num;i<candidates.length&&candidates[i]<=target;i++) {
			List<Integer> list2 = new ArrayList<Integer>(list);
			list2.add(candidates[i]);
			find(listAll, list2, candidates, target-candidates[i], i+1);
		}
	}
	
	public static void main(String[] args) {
		P_040 p = new P_040();
		int[] candidates = {10,1,2,7,6,1,5};
		int target = 8;
		List<List<Integer>> result = p.combinationSum2(candidates, target);
		for(List<Integer> list:result) {
			System.out.println(Arrays.toString(list.toArray()));
		}
	}
	
}
