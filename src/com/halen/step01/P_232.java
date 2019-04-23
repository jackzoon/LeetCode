package com.halen.step01;

import java.util.Stack;

/**
 *       用栈实现队列，LeetCode第232题
 * @author halen
 *
 */
public class P_232 {
	
	
	
}

class MyQueue {

	private Stack<Integer> stackPush = null;
	private Stack<Integer> stackPop = null;
    /** Initialize your data structure here. */
    public MyQueue() {
        stackPush = new Stack<Integer>();
        stackPop = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        stackPush.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(stackPush.empty() && stackPop.empty()) {
        	throw new RuntimeException();
        }else if(stackPop.empty()) {
        	while(!stackPush.empty()) {
        		stackPop.push(stackPush.pop());
        	}
        }
        return stackPop.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        if(stackPop.empty() && stackPush.empty()) {
        	throw new RuntimeException();
        }else if(stackPop.empty()) {
        	while(!stackPush.empty()) {
        		stackPop.push(stackPush.pop());
        	}
        }
        return stackPop.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stackPop.size() + stackPush.size() == 0;
    }
}
