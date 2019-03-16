package com.halen.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角Ⅱ
 * @author halen
 * @date 2019年3月14日
 * @Description: 杨辉三角ⅡLeetCode第119题
 */
public class P_119 {
	public List<Integer> getRow(int rowIndex) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(rowIndex==0){
        	ArrayList<Integer> row = new ArrayList<Integer>();
        	row.add(1);
        	return row;
        }
        res.add(new ArrayList<Integer>());
        res.get(0).add(1);
        for(int i=1;i<=rowIndex;i++){
        	ArrayList<Integer> row = new ArrayList<Integer>();
        	ArrayList<Integer> preRow = res.get(i-1);
        	row.add(1);
        	for(int j=1;j<i;j++){
        		row.add(preRow.get(j-1)+preRow.get(j));
        	}
        	row.add(1);
        	res.add(row);
        }
		
		return res.get(rowIndex);
    }
	
	public List<Integer> getRow_2(int rowIndex) {
       rowIndex++;
       List<Integer> res = new ArrayList<Integer>();
       res.add(1);
       int temp = 1;
       for(int i=1;i<rowIndex;i++){
    	   temp = temp * (rowIndex - i) /i;
    	   res.add(temp);
       }        
		return res;
    }
	
	public static void main(String[] args) {
		P_119 p = new P_119();
		ArrayList<Integer> row = (ArrayList<Integer>) p.getRow(3);
		for (Integer integer : row) {
			System.out.print(integer+",");
		}
	}
	
}
