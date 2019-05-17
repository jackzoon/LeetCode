package com.halen.step01;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;

/**
 * 前K个高频元素，LeetCode第347题
 * @author halen
 *
 */
public class P_347 {

	public List<Integer> topKFrequent(int[] nums, int k) {
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for(int num:nums) {
        	if(map.containsKey(num))
        		map.put(num, map.get(num)+1);
        	else
        		map.put(num,1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return map.get(o1) - map.get(o2);
			}
		});
        for(int key:map.keySet()) {
        	if(pq.size() < k)
        		pq.add(key);
        	else if(map.get(key) > map.get(pq.peek())){
        		pq.remove();
        		pq.add(key);
        	}
        }
        LinkedList<Integer> res = new LinkedList<Integer>();
        while(!pq.isEmpty()) {
        	res.add(pq.remove());
        }
        return res;
    }
}
