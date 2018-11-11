package com.camp;

public class QueueLinkedListDemo {

	public static void main(String[] args) {
		QueueLinkedList<String> q= new
				QueueLinkedList<String>();
		
		q.enqueue("Engin");
		q.enqueue("Rebecca");
		q.enqueue("Miguel");
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}

}