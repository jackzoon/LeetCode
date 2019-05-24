package com.halen.step01;

import java.util.TreeMap;

/**
 *       实现Trie(前缀树)，LeetCode第208题
 * @author halen
 *
 */
public class P_208 {
	
	private class Node{
		public boolean isWord;
		public TreeMap<Character, Node> next;
		
		public Node(boolean isWord) {
			this.isWord = isWord;
			next = new TreeMap();
		}
		public Node() {
			this(false);
		}		
	}
	
	private Node root;
	
	/** Initialize your data structure here. */
    public P_208() {
        root = new Node();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        Node cur = root;
        for(int i=0;i<word.length();i++) {
        	char c = word.charAt(i);
        	if (cur.next.get(c)==null) 
        		cur.next.put(c, new Node());
        	cur = cur.next.get(c);
        }
        cur.isWord = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Node cur = root;
        for(int i=0;i<word.length();i++) {
        	char c = word.charAt(i);
        	if(cur.next.get(c)==null)
        		return false;
        	cur = cur.next.get(c);
        }
        return cur.isWord;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Node cur = root;
        for(int i=0;i<prefix.length();i++) {
        	char c = prefix.charAt(i);
        	if(cur.next.get(c)==null)
        		return false;
        	cur = cur.next.get(c);
        }
        return true;
    }
}
