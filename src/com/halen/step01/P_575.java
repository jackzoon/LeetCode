package com.halen.step01;

import java.util.HashSet;
import java.util.Set;

public class P_575 {
	public int distributeCandies(int[] candies) {
        
		Set<Integer> set = new HashSet<Integer>();
		for(int t:candies) {
			set.add(t);
		}
		
		return Math.min(set.size(), candies.length/2);	
    }
}
