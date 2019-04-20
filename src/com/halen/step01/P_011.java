package com.halen.step01;

/**
 * 盛最多水的容器
 * @author halen
 * @date 2019年4月20日
 * @Description: LeetCode第011题
 */
public class P_011 {
	public int maxArea(int[] height) {
        int area = 0;
        for(int i=0;i<height.length;i++){
        	for(int j=i+1;j<height.length;j++){
        		int temp = (j-i) * (Math.min(height[i], height[j]));
        		area = Math.max(area, temp);
        	}
        }
        return area;
    }
	
	public int maxArea_2(int[] height) {
        int area = 0;
        int left=0,right=height.length-1;
        while(left<right){
        	int currArea = Math.min(height[left], height[right]) * (right-left);
        	area = Math.max(area, currArea);
        	if(height[left]<height[right])
        		left++;
        	else 
        		right--;
        }
        return area;
    }
	
	public static void main(String[] args) {
		P_011 p = new P_011();
		int[] height = {1,8,6,2,5,4,8,3,7};
		System.out.println(p.maxArea(height));
	}
}
