package com.halen.step01;

/**
 * 两数相加
 * @author halen
 * @date 2019年3月16日
 * @Description: 两数相加LeetCode第002题
 */
public class P_002 {
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	       ListNode cur = new ListNode(0);
	       ListNode head = cur;
	       int carry = 0;
	       while(l1!=null||l2!=null||carry!=0){
	    	   if(l1!=null){
	    		   carry += l1.val;
	    		   l1 = l1.next;
	    	   }
	    	   if(l2!=null){
	    		   carry+= l2.val;
	    		   l2 = l2.next;
	    	   }
	    	   cur.next = new ListNode(carry % 10);
	    	   cur = cur.next;
	    	   carry = carry / 10;
	       }		
			
	       return head.next;		
	    }
	
	
}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
 }
