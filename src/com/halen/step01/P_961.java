package com.halen.step01;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 重复N次的元素，LeetCode第961题
 */
public class P_961 {
    public int repeatedNTimes(int[] A) {
        int res = 0;
        int len = A.length;
        System.out.println(len);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<len;i++) {
        	if(map.containsKey(A[i])) {
        		map.put(A[i], map.get(A[i])+1);
        	}else {
				map.put(A[i], 1);
			}
        }
        for(Integer key:map.keySet()) {
        	System.out.println(map.get(key));
        	if(map.get(key)>=len/2) {
        		res = key;
        		break;
        	}        		
        }
        return res;
    }
    
    public int repeatedNTimes_2(int[] A) {
    	Random random = new Random();
    	while(true) {
    		int index1 = random.nextInt(A.length);
    		int index2 = random.nextInt(A.length);
    		if (index1!=index2 && A[index1] == A[index2]) {
				return A[index1];
			}
    	}
    }
    
    public static void main(String[] args) {
    	P_961 p = new P_961();
		int[] A = {1,2,3,3};
		System.out.println(p.repeatedNTimes(A));
	}
}
