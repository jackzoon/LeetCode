package com.halen.step01;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 最近的请求次数
 * @author halen
 * @date 2019年4月1日
 * @Description: LeetCode第933题
 */
public class P_933 {
	public static void main(String[] args) {
		RecentCounter counter = new RecentCounter();
		System.out.println(counter.ping(1));
		System.out.println(counter.ping(100));
		System.out.println(counter.ping(3001));
		System.out.println(counter.ping(3002));
	}
}

class RecentCounter {
    private Queue<Integer> queue;
    public RecentCounter() {
        queue = new LinkedList<Integer>();
    }
    
    public int ping(int t) {
        queue.offer(t);
        while(!queue.isEmpty() && queue.peek() < t - 3000){
            queue.poll();
        }
        return queue.size();
    }
}