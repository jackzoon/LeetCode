package com.halen.step01;

import java.util.HashSet;
import java.util.Set;

/**
 * 环形链表，LeetCode第141题
 * @author halen
 *
 */
public class P_141 {

	public boolean hasCycle(ListNode head) {
        Set<ListNode> nodeSeen = new HashSet<ListNode>();
        while(head!=null) {
        	if(nodeSeen.contains(head)) {
        		return true;
        	}else {
        		nodeSeen.add(head);
        	}
        	head = head.next;
        }
        return false;
    }
	
	public boolean hasCycle_2(ListNode head) {
        if(head==null || head.next==null) 
        	return false;
        ListNode fast = head.next;
        ListNode slow = head;
        while(slow!=fast) {
        	if(fast == null || fast.next == null)
        		return false;
        	slow = slow.next;
        	fast = fast.next.next;
        }
        return true;
    }
	
}
