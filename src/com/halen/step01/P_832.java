package com.halen.step01;

import java.util.Stack;

/**
 *      翻转图像，LeetCode第832题
 * @author halen
 *
 */
public class P_832 {
	
	public int[][] flipAndInvertImage(int[][] A) {
        Stack<Integer> stack = new Stack<Integer>();
        int[][] res = new int[A.length][A[0].length];
        int k = 0;
        for(int i=0;i<A.length;i++) {
        	for(int j=0;j<A[i].length;j++) {
        		stack.push(A[i][j]);
        	}
        	k=0;
        	while(!stack.isEmpty())
        		res[i][k++] = stack.pop() ^ 1;
        }
        return res;
    }
	
	public int[][] flipAndInvertImage_2(int[][] A) {
        for(int i=0;i<A.length;i++) {
        	int len = A[i].length;
        	int[] tmp = new int[len];
        	for(int j=0;j<A[i].length;j++) {
        		tmp[j] = A[i][--len]^1;        		
        	}
        	A[i] = tmp;
        }
        return A;
    }
}
