package com.halen.step01;

import java.util.Arrays;

/**
 * 
 * @author halen
 * @date 2019年3月12日
 * @Description: 加一LeetCode第66题
 */
public class P_066 {
	
	public int[] plusOne(int[] digits) {
        int[] result = digits;
        int temp,one=1;
        boolean isTen = false;
        for(int i=digits.length-1;i>=0;i--){
        	temp = digits[i] + one;
        	if(temp>9){
        		isTen = true;
        		one = 1;
        	}
        	if(isTen){
        		isTen = false;
        		digits[i] = 0;
        	}else{
        		digits[i] = temp;
        		one=0;
        		break;
        	}
        }
        if(one==1){
        	for(int i=1;i<digits.length+1;i++){
        		result[i] = digits[i-1];
        	}
        	result[0] = 1;
            return result;
        }
        return digits;
    }
	
	public static void main(String[] args) {
		P_066 p = new P_066();
		int[] a = {1,2,9};
		int[] res = p.plusOne(a);
		System.out.println(Arrays.toString(res));
	}
}
