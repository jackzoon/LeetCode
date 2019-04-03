package com.halen.step01;

import java.util.Stack;

/**
 * 比较含退格的字符串
 * @author halen
 * @date 2019年4月3日
 * @Description: LeetCode第844题
 */
public class P_844 {

	public boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1 = new Stack<Character>();
        Stack<Character> stack2 = new Stack<Character>();
        for(int i=0;i<S.length();i++){
        	char c = S.charAt(i);
        	if(c=='#' &&!stack1.isEmpty())
        		stack1.pop();
        	else if(c!='#')
        		stack1.push(c);
        }
        for(int i=0;i<T.length();i++){
        	char c = T.charAt(i);
        	if(c=='#' && !stack2.isEmpty())
        		stack2.pop();
        	else if(c!='#')
        		stack2.push(c);
        }
        
        if(stack1.size()!=stack2.size())
        	return false;
        while(!stack1.isEmpty()){
        	if(stack1.pop()!=stack2.pop())
        		return false;
        }
        return true;		
    }
	
	public static void main(String[] args) {
		P_844 p = new P_844();
		String S = "y#fo##f";
		String T = "y#f#o##f";
		
		System.out.println(p.backspaceCompare(S, T));
				
	}
	
}
