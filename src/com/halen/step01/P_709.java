package com.halen.step01;

/**
 *       转换成小写字母
 * @author halen
 *
 */
public class P_709 {

	public String toLowerCase(String str) {
        String result = "";
        str.toLowerCase();
        char[] s = str.toCharArray();
        for(int i=0;i<s.length;i++) {
        	if(s[i]>='A' && s[i]<='Z') {
        		result+=(char)(s[i]+32);
        	}else {
        		result+=s[i];
        	}
        }
        return result;
    }
	
	public static void main(String[] args) {
		P_709 p = new P_709();
		String str = "Hello";
		System.out.println(p.toLowerCase(str));
	}
	
}
