package com.halen.step01;

/**
 *        删除链表中的节点，LeetCode第237题
 * @author halen
 *
 */
public class P_237 {
	public void deleteNode(MyListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

class MyListNode{
	int val;
	MyListNode next;
	MyListNode(int x){val = x;}
}