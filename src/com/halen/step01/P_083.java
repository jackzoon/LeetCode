package com.halen.step01;

/**
 *      删除排序链表中的重复元素，LeetCode第083题
 * @author halen
 *
 */
public class P_083 {

	public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while(cur!=null && cur.next!=null){
            if(cur.val==cur.next.val)
                cur.next = cur.next.next;
            else
                cur = cur.next;
        }
        return head;
    }
}
