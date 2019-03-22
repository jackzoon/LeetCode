package com.halen.step01;

/**
 * 爬楼梯
 * @author halen
 * @date 2019年3月22日
 * @Description: LeetCode第050题，爬楼梯
 */
public class P_070 {
		
	public int climbStairs(int n) {
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        int[] arr = new int[n];
        int i=0;
        arr[0] = 1;
        arr[1] = 2;
        for(i=2;i<arr.length;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[i-1];
    }
		
	public static void main(String[] args) {
		P_070 p = new P_070();
		System.out.println(p.climbStairs(5));
	}
}
