package com.halen.step01;

/**
 * 宝石与石头
 * @author halen
 * @date 2019年3月26日
 * @Description: LeetCode第771题
 */
public class P_771 {

	public int numJewelsInStones(String J, String S) {
        int count = 0;
		char[] j = J.toCharArray();
		char[] s = S.toCharArray();
		for(int i=0;i<j.length;i++){
			for(int k=0;k<s.length;k++){
				if(j[i]==s[k])
					count++;
			}
		}
        
        return count;
    }
	
	public static void main(String[] args) {
		P_771 p = new P_771();
		String J = "z";
		String S = "ZZ";
		System.out.println(p.numJewelsInStones(J, S));
	}
	
}
