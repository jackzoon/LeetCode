package com.halen.step01;

/**
 * 回文链表，LeetCode第234题
 * @author halen
 *
 */
public class P_234 {
	public boolean isPalindrome(ListNode head) {
		if(head == null || head.next == null)
        	return true;
		//使用快慢指针找到该链表的中间结点
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null) {
        	fast = fast.next.next;
        	slow = slow.next;
        }
        //将找到的中间结点进行链表反转
        ListNode midNode = reverList(slow);
        //将反转后的链表与原链表的值一一对比，如果遇到不相等则返回false
        while(midNode!=null) {
        	if(head.val!=midNode.val)
        		return false;
        	head = head.next;
        	midNode = midNode.next;
        }
        return true;        
    }
	
	private ListNode reverList(ListNode head) {
		ListNode prev = null;
		ListNode cur = head;
		while(cur!=null) {
			ListNode nextTemp = cur.next;
			cur.next = prev;
			prev = cur;
			cur = nextTemp;
		}
		return prev;
	}
	
	
}
