package com.camp;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

// In Java Queue is implemented by using Linkedlist

public class MyQueue {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(15);
		q.add(11);
		q.add(10);
		q.add(14);
		
		// Retrieves and removes the head of this queue,or returns null if this queue is empty.
		System.out.println(q.poll());
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.add(15);
		pq.add(11);
		pq.add(10);
		pq.add(14);
		
		// Retrieves and removes the head of this queue,or returns null if this queue is empty.
		System.out.println(pq.poll());
		
		
		PriorityQueue<Student> pStudents = new PriorityQueue<Student>();
		pStudents.add(new Student("Engin", 35));
		pStudents.add(new Student("Rebecca", 42));
		pStudents.add(new Student("Miguel", 25));
		
		// Retrieves and removes the head of this queue,or returns null if this queue is empty.
		System.out.println(pStudents.poll().name);		
	}
}