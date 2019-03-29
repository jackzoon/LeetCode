package com.halen.step01;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 最小栈
 * @author halen
 * @date 2019年3月29日
 * @Description: LeetCode第155题，最小栈
 */
public class P_155 {
	public static void main(String[] args) {
		MinStack_2 stack = new MinStack_2();
		stack.push(-2);
		stack.push(0);
		stack.push(-3);
		stack.getMin();
		stack.pop();
		stack.top();
		stack.getMin();
	}
}

class MinStack_2{
	
	private Deque<Integer> mainStack;
	private Deque<Integer> minStack;
	
    public MinStack_2() {
        mainStack = new ArrayDeque<Integer>();
        minStack = new ArrayDeque<Integer>();
    }
    
    public void push(int x) {
        mainStack.push(x);
        Integer min = minStack.peek();
        if(min==null || x <= min){
        	minStack.push(x);
        }
    }
    
    public void pop() {
        int cur = mainStack.pop();
        if(cur==minStack.peek()){
        	minStack.pop();
        }
        
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}


class MinStack {

	private int top = -1;
	private int[] minIndex = new int[9999];
	private int[] stack = new int[9999];
	
    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
        stack[++top] = x;
        if(top>0)
        	minIndex[top] = x <stack[minIndex[top-1]]?top:minIndex[top-1];
    }
    
    public void pop() {
        if(top == -1)
        	return;
        top--;
    }
    
    public int top() {
        return stack[top];
    }
    
    public int getMin() {
        return stack[minIndex[top]];
    }
}