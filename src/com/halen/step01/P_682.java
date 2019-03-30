package com.halen.step01;

import java.util.Stack;

/**
 * 棒球比赛
 * @author halen
 * @date 2019年3月30日
 * @Description: LeetCode第682题，棒球比赛
 */
public class P_682 {
	
	public int calPoints(String[] ops) {
		int score = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for(String tmp:ops){
			if(tmp.equals("+")){
				int top = stack.pop();
				int newTop = top+stack.peek();
				stack.push(top);
				stack.push(newTop);
			}else if(tmp.equals("D")){
				stack.push(stack.peek()*2);
			}else if(tmp.equals("C")){
				stack.pop();
			}else{
				stack.push(Integer.valueOf(tmp));
			}
		}
		while(!stack.isEmpty()){
			score += stack.pop();
		}
		return score;
    }
	
	public static void main(String[] args) {
		P_682 p = new P_682();
		String[] ops = {"5","2","C","D","+"};
		System.out.println(p.calPoints(ops));
	}
}
