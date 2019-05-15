package com.halen.step01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 键盘行，LeetCode第500题
 * @author halen
 *
 */
public class P_500 {
	public String[] findWords(String[] words) {
		String[] ss = new String[]{"qwertyuiop","asdfghjkl","zxcvbnm"};
		String[] res = null;
		List<Set<Character>> list = new ArrayList<Set<Character>>();
		//将每一行字符添加到对应的Set中
		for(int i=0;i<ss.length;i++) {
			Set<Character> set = new HashSet<Character>();
			String s = ss[i];
			for(char c:s.toCharArray()) {
				set.add(c);
			}
			list.add(set);
		}
		List<String> list2 = new ArrayList<String>();
		//遍历每个单词
		for(String word:words) {
			if (isLine(word, list)) {
				list2.add(word);
			}
		}
		res = new String[list2.size()];
		for(int i=0;i<res.length;i++) {
			res[i] = list2.get(i);
		}
		return res;
    }
	
	//判断所给的单词是否在同一行
	private boolean isLine(String word,List<Set<Character>> list) {
		char[] c = word.toLowerCase().toCharArray();
		boolean flag = true;
		for(Set set:list) {
			flag = true;
			for(int i=0;i<c.length;i++) {
				if(!set.contains(c[i])) {
					flag = false; //有字符不在一行，置为false
					break;
				}					
			}
			if(flag)
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		P_500 p = new P_500();
		String[] words = {"Hello", "Alaska", "Dad", "Peace"};
		System.out.println(Arrays.toString(p.findWords(words)));
	}
}
