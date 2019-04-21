package com.halen.step01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *       组合总和，LeetCode第039题
 * @author halen
 *
 */
public class P_039 {

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> listAll = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(candidates);
        find(listAll, list, candidates, target, 0);
       
        return listAll;
    }
	
	public void find(List<List<Integer>> listAll,List<Integer> tmp,int[] candidates,int target,int num) {
		if(target==0) {
			listAll.add(tmp);
			return ;
		}
		if(target<candidates[0]) return;
		for(int i=num;i<candidates.length&&candidates[i]<=target;i++) {
			List<Integer> list = new ArrayList<Integer>(tmp);
			list.add(candidates[i]);
			find(listAll, list, candidates, target-candidates[i], i);
		}
	}
	
	public static void main(String[] args) {
		int[] candidates = {2,3,6,7};
		int target = 7;
		P_039 p = new P_039();
		List<List<Integer>> result = p.combinationSum(candidates, target);
		for(List<Integer> list:result) {
			System.out.println(Arrays.toString(list.toArray()));
		}
	}
	
}
