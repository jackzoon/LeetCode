package com.halen.step01;

import java.util.ArrayList;
import java.util.List;

/**
 *      查找常用字符，LeetCode第1002题
 * @author halen
 *
 */
public class P_1002 {
	public List<String> commonChars(String[] A) {
        List<String> res = new ArrayList<String>();
        char[][] cs = new char[A.length][26];
        //将每个字符串中的每个字符与数组下标对应，每个字符出现的次数为该字符对应下标的值
        for(int i=0;i<A.length;i++) {
        	for(int j=0;j<A[i].length();j++) {
        		cs[i][A[i].charAt(j)-'a'] += 1;
        	}
        }
        //遍历每个字符出现的次数，将它们进行比较，将出现最少的次数赋值给min
        for(int i=0;i<26;i++) {
        	int min = Integer.MAX_VALUE;
        	for(int j=0;j<A.length;j++) {
        		if(cs[j][i]<min)
        			min = cs[j][i];
        	}
        	for(int t=0;t<min;t++)
        		res.add(String.valueOf((char)('a'+i)));
        }
        return res;
    }
}
