package com.halen.step01;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author halen
 * @date 2019年3月12日
 * @Description: 杨辉三角LeetCode第118题
 */
public class P_118 {

public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(numRows == 0)
        	return res;
        res.add(new ArrayList<Integer>());
        res.get(0).add(1);
        
        for(int i=1;i<numRows;i++){
        	List<Integer> row = new ArrayList<Integer>();
        	row.add(1);
        	List<Integer> preList = res.get(i-1);
        	for(int j=1;j<i;j++){
        		row.add(preList.get(j-1)+preList.get(j));
        	}
        	row.add(1);
        	res.add(row);
        }	
		return res;
    }

	public static void main(String[] args) {
		int numRows = 5;
		P_118 p = new P_118();
		List<List<Integer>> res = p.generate(numRows);
		
		for (List<Integer> list : res) {
			for (Integer integer : list) {
				System.out.print(integer+" ");
			}
			System.out.println();
		}
		
	}
	
}
