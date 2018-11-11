package com.camp;

// We increment rear on every insertion, and we increment front
// on every removal.

public class QueueArray<T> {
Object[] ArrayQueue;
int Rear;  // the index of the item at the rear of the queue
int Front; // the index of the item at the front of the queue
int size;

	public QueueArray(int size) {		
		this.size =size;
		ArrayQueue = new Object[this.size];
		Front = -1;
		Rear= -1;	
	}
	
	public Boolean isFull() {
		return(Rear == size-1);
	}
	
	// after many removals Front will br greater than rear index
	public Boolean isEmpty() {
		return(Front == -1 || Front>Rear);
	}
	
	
	//
	public void enqueueItem(Object newItem) {
		if( isFull()) {
			System.out.println("queue is full");
			return;
		}
		
		Rear = Rear +1;
		ArrayQueue[Rear] = newItem;
		// for the first time to add the item to the queue
		if(Front==-1)
			Front=0;	
	}
	
	public T DeQueue() {
		if( isEmpty()) {
			System.out.println("queue is empty");
			return null;
		}
		
		T ObjectOut = (T) ArrayQueue[Front];
		Front = Front + 1;
		return ObjectOut;
	}
}
