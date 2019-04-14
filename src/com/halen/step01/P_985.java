package com.halen.step01;

import java.util.Arrays;

/**
 * 查询后的偶数和
 * @author halen
 * @date 2019年4月14日
 * @Description: LeetCode第985题
 */
public class P_985 {

	public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] answer = new int[A.length];
        int sum = 0;
        for(int x:A)
        	if(x%2==0)
        		sum+=x;
        for(int i=0;i<A.length;i++){
        	int val = queries[i][0],index = queries[i][1];
        	if(A[index]%2==0) sum-=A[index];
        	A[index]+=val;
        	if(A[index]%2==0) sum+=A[index];
        	answer[i] = sum;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		P_985 p = new P_985();
		int[] A = {1,2,3,4};
		int[][] queries = {{1,0},{-3,1},{-4,0},{2,3}};
		int[] answer = p.sumEvenAfterQueries(A, queries);
		System.out.println(Arrays.toString(answer));
	}
}
