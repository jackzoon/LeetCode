package com.halen.step01;

/**
 * 链表的中间结点，LeetCode第876题
 * @author halen
 *
 */
public class P_876 {
	//使用快慢指针
	public ListNode middleNode(ListNode head) {
        if(head.next==null)
        	return head;
        ListNode fastNode = head;
        ListNode lowNode = head;
        while(fastNode!=null && fastNode.next!=null) {
        	fastNode=fastNode.next.next;
        	lowNode = lowNode.next;
        }
        return lowNode;
    }
	
	//按顺序将每个节点放入数组，中间结点就是A[A.length/2]
	public ListNode middleNode_2(ListNode head) {
        ListNode[] A = new ListNode[100];
        int t = 0;
        while(head!=null) {
        	A[t++] = head;
        	head = head.next;
        }
        return A[t/2];
    }
	
	
}
