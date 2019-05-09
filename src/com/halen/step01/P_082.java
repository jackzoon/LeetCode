package com.halen.step01;

/**
 * 删除排序链表中的重复元素Ⅱ
 * @author halen
 *
 */
public class P_082 {
	public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyNode = new ListNode(-1);//创建一个虚拟头节点
        dummyNode.next = head;
        ListNode cur = head;
        ListNode tmp = dummyNode;
        while(cur!=null) {
        	int size = 0;
        	//循环判断是否有连续相同的元素
    		while (cur.next!=null && cur.val == cur.next.val) {
				cur = cur.next;
				size++;
			}
    		//如果size==0，说明当前节点是唯一的
    		if(size == 0) {
    			tmp.next = cur;
        		tmp = tmp.next;
    		}
        	cur = cur.next;
        }
        //将尾节点指向的下一个置为null，防止原链表最后几个元素相同
        tmp.next = null;
		return dummyNode.next;
    }
}
