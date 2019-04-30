package com.halen.step01;

/**
 * 删除链表元素，LeetCode第203题
 * @author halen
 *
 */
public class P_203 {
	public ListNode removeElements(ListNode head, int val) {
        
		while(head!=null && head.val==val) {
			ListNode delNode = head;
			head = head.next;
			delNode.next = null;
		}		
		if(head == null)
			return null;
		ListNode prev = head;
		while(prev.next!=null) {
			if(prev.next.val==val) {
				ListNode delNode = prev.next;
				prev.next = delNode.next;
				delNode.next = null;
			}else {
				prev = prev.next;
			}
		}		
		return head;
    }
	
public ListNode removeElements_3(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
		ListNode prev = dummyHead;
		while(prev.next!=null) {
			if(prev.next.val==val) {
				prev.next = prev.next.next;
			}else {
				prev = prev.next;
			}
		}		
		return dummyHead.next;
    }
}
