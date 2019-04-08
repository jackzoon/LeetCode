package com.halen.step01;

import java.util.Arrays;

/**
 * 反转字符串
 * @author halen
 * @date 2019年4月8日
 * @Description: LeetCode第344题
 */
public class P_344 {

	public void reverseString(char[] s) {
        int len = s.length;
		for(int i=0;i<len/2;i++){
			char tmp = s[i];
			s[i] = s[len-1-i];
			s[len-1-i] = tmp;
		}
		
    }
	
	public static void main(String[] args) {
		P_344 p = new P_344();
		char[] s = {'h','e','l','l','o'};
		p.reverseString(s);
		System.out.println(Arrays.toString(s));
	}
	
}
