package com.camp;

// if we want to implement the Queue by LinkedList 
// we should use Doubly LinkedList to iterate through
// in forward and backward

public class QueueLinkedList<T> {
NodeDoubly Rear;
NodeDoubly Front; 
	
	public QueueLinkedList() {
		Front = null; // empty queue
		Rear = null;  // empty queue
	}
	
	// creating a new node
	public void enqueue(Object value) {
		NodeDoubly newNode= new NodeDoubly(value, null, null);
		// if I have not any existing node, add the new node
		if(Rear == null || Front == null) {
			Rear= newNode; 
			Front= newNode; 
		}
		else {
			// there is no element after the newNode 
			newNode.next= null;
			// make the new node referring to the Rear
			newNode.previous = Rear;
			// Rear refers the newNode
			Rear.next = newNode;
			// make the new node Rear
			Rear= newNode;
		}
	}	
	
	// deleting the first element
	public T dequeue() {
		if(Rear == null || Front == null) {
			System.out.println("queue is empty");
			return null;
		}
		
		T value = (T) Front.value;
		
		Front = Front.next;
		// check if there is any element in the queue
		if(Front != null) 
			Front.previous = null;
		
		return value;	
	}		
}