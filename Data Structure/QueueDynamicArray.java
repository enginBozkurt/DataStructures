package com.camp;

import java.util.Arrays;

public class QueueDynamicArray<T> {
	Object[] ArrayQueue;
	int Rear;  // the index of the item at the rear of the queue
	int Front; // the index of the item at the front of the queue
	int size;

		public QueueDynamicArray(int size) {		
			this.size =size;
			ArrayQueue = new Object[this.size];
			Front = -1;
			Rear= -1;	
		}
		
		
		// after many removals Front will br greater than rear index
		public Boolean isEmpty() {
			return(Front == -1 || Front>Rear);
		}
		
		
		//
		public void enqueueItem(Object newItem) {
			ensureCapacity(Rear+2);
			Rear = Rear +1;
			ArrayQueue[Rear] = newItem;
			// for the first time to add the item to the queue
			if(Front==-1)
				Front=0;	
		}
		
		public void ensureCapacity(int minCapacity) {
			int oldCapacity = getSize();  //retrive the old capacity
			if(minCapacity > oldCapacity) {    
				int newCapacity = oldCapacity *2; // double the current size 
				// minCapacity is usually close to size, so this is a win
				if(newCapacity < minCapacity) // this case happens if an element is deleted by user
					newCapacity = minCapacity;
				// copy the elements of the orginal array to the new doubled sized array (copy of the orginal)
				ArrayQueue = Arrays.copyOf(ArrayQueue, newCapacity);			
			}
		}
			
		public int getSize() {
			return ArrayQueue.length;
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
