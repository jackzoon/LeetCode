package com.halen.step01;

import java.util.HashSet;
import java.util.Set;

/**
 * 唯一的摩尔斯密码词 LeetCode第804题
 * @author halen
 *
 */
public class P_804 {

	public int uniqueMorseRepresentations(String[] words) {
        String[] map = {".-","-...","-.-.","-..",
        		".","..-.","--.","....",
        		"..",".---","-.-",".-..",
        		"--","-.","---",".--.",
        		"--.-",".-.","...","-",
        		"..-","...-",".--","-..-",
        		"-.--","--.."};
        if(words==null)
            return 0;
        Set<String> result = new HashSet<String>();
        for(int i=0;i<words.length;i++) {
        	String word = words[i];
        	StringBuilder sb = new StringBuilder();
        	for(char c:word.toCharArray()) {
        		sb.append(map[c-'a']);
        	}
        	result.add(sb.toString());
        }
        return result.size();
    }
	
	public static void main(String[] args) {
		P_804 p = new P_804();
		String[] words = {"gin","zen","gig","msg"};
		System.out.println(p.uniqueMorseRepresentations(words));
	}
	
}
