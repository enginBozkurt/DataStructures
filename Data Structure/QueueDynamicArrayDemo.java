package com.camp;

public class QueueDynamicArrayDemo {

	public static void main(String[] args) {
		 QueueDynamicArray <Integer> q = new  QueueDynamicArray<Integer>(2);
		 
		 q.enqueueItem(11);
		 q.enqueueItem(12);
		 
		 System.out.println("Size: " + q.getSize());
		 
		 q.enqueueItem(13);
		 System.out.println("Size: " + q.getSize());
	}
}