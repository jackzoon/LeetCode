package com.halen.step01;


/**
 * 反转链表，LeetCode第206题
 * @author halen
 *
 */
public class P_206 {
	public ListNode reverseList(ListNode head) {
        ListNode prev = null; //前指针节点
        ListNode cur = head; //当前指针节点
        //每次循环，都将当前节点指向它前面的节点，然后当前节点和前节点后移一个
        while(cur!=null) {
        	ListNode nextTemp = cur.next;//得到当前节点的下一个节点
        	cur.next = prev; //将当前节点指向它前面的节点
        	prev=cur;	//前指针后移一个
        	cur=nextTemp; //当前指针后移一个
        }
        return prev;
    }
	
	//使用递归解决
	public ListNode reverseList_2(ListNode head) {
		if(head==null||head.next==null) return head;
		ListNode p = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return p;		
	}
}
