package com.halen.step01;

import java.util.HashSet;
import java.util.Set;

/**
 * 验证回文串
 * @author halen
 * @date 2019年3月23日
 * @Description: LeetCode第125题，验证回文串
 */
public class P_125 {

	public boolean isPalindrome(String s) {
       if(s.equals(""))
    	   return true;
		char[] arrs = s.toCharArray();
       int left = 0;
       int right = arrs.length-1;
       Set<Character> set = new HashSet<Character>();
       for(int i=0;i<26;i++){
    	   set.add((char) ('a'+i));
    	   set.add((char)('A'+i));
       }
       for(int i=0;i<10;i++){
    	   set.add((char)('0'+i));
       }
       
       while(left<right){
    	   if(!set.contains(arrs[left])){
    		   left++;
    		   continue;
    	   }    	   
    	   if(!set.contains(arrs[right])){
    		   right--;
    		   continue;
    	   }
    	   if(Character.toLowerCase(arrs[left])!=Character.toLowerCase(arrs[right])){
    		   return false;
    	   }
    	   left++;
    	   right--;
       }				
		return true;
    }
	
	public static void main(String[] args) {
		
       String s = "A man, a plan, a canal: Panama";
       P_125 p = new P_125();
       System.out.println(p.isPalindrome(s));
	       
	}
	
}
