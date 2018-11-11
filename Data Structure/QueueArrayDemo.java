package com.camp;

public class QueueArrayDemo {

	public static void main(String[] args) {
		
		 QueueArray<Integer> q= new QueueArray<Integer>(5);
		 
		 q.enqueueItem(5);
		 q.enqueueItem(2);
		 q.enqueueItem(3);
		 q.enqueueItem(6);
		 q.enqueueItem(8);
		 
		 System.out.println("Dequeue: " + q.DeQueue());
		 System.out.println("Dequeue: " + q.DeQueue());
		 
		 q.enqueueItem(10);
	}
}
