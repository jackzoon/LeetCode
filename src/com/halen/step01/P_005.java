package com.halen.step01;

import java.util.ArrayDeque;
import java.util.Queue;


public class P_005 {

	public String longestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int i=0,j=1;
        int n = arr.length;
        Queue<Character> queue = new ArrayDeque<Character>();
        queue.add(arr[0]);
        while(i<n&&j<n){
        	if(arr[j]==queue.peek()){
        		
        	}
        	queue.add(arr[j++]);
        }
		
		
		return "";
    }
	
	public static void main(String[] args) {
		String s = "babad";
		Queue<Character> queue = new ArrayDeque<Character>();
		char[] arr = s.toCharArray();
		int n = arr.length;
		queue.add(arr[0]);
		int i = 1;
		while(i<n){
			queue.add(arr[i++]);
		}
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue.poll());
	}
	
}
