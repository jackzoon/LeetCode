package com.halen.step01;

/**
 *       找不同，LeetCode第389题
 * @author halen
 *
 */
public class P_389 {
    public char findTheDifference(String s, String t) {
        char result = 0;
        int i=0;
    	for(;i<s.length();i++) {
    		result += t.charAt(i) - s.charAt(i);
    	}
    	result += t.charAt(i);
    	return result;
    }
    
    public char findTheDifference_2(String s, String t) {
        char result = 0;
        int i=0;
    	for(;i<s.length();i++) {
    		result ^= s.charAt(i);
    		result ^= t.charAt(i);
    	}
    	result ^= t.charAt(i);
    	return result;
    }
}
