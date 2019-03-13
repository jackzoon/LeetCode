package com.halen.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author halen
 * @date 2019年3月12日
 * @Description: 杨辉三角，LeetCode第118题
 */
public class P_118 {

public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        
        
        for(int i=1;i<=numRows;i++){
        	if(i==1){
        		res.add(new ArrayList<Integer>(1));
        		continue;
        	}
        	if(i==2){
        		
        	}
        	List<Integer> temp = new ArrayList<Integer>();
        	for(int j=1;j<=i;j++){
        		temp.add(1);
        	}
        }
	
		return null;
    }
	
}
