package com.halen.step01;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 用队列实现栈
 * @author halen
 * @date 2019年3月30日
 * @Description: LeetCode第225题，用队列实现栈
 */
public class P_225 {

	public static void main(String[] args) {
		
	}
	
}

class MyStack {

	private Deque<Integer> data;
	private int size;
	
    /** Initialize your data structure here. */
    public MyStack() {
        data = new ArrayDeque<Integer>();
        size = 0;
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        data.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return data.pollLast();
    }
    
    /** Get the top element. */
    public int top() {
        return data.peekLast();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return data.isEmpty();
    }
}