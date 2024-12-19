package com.Day10;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		System.out.println(queue);
		queue.poll();

		System.out.println(queue);

		Deque<Integer> queue1 = new LinkedList<Integer>();
		queue1.offerFirst(50);
		queue1.offerLast(60);
		System.out.println(queue1);
		queue1.pollFirst();
		queue1.pollLast();
		System.out.println(queue1);
		
		

	}

}
