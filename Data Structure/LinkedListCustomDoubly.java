package com.camp;


public class LinkedListCustomDoubly<T> {
	NodeDoubly head; // first node
	
	public LinkedListCustomDoubly() {
		head = null;  // empty list
	}
	
	// creating a new node
	public void add(Object value) {
		NodeDoubly newNode= new NodeDoubly(value, null, null);
		// if I have not any existing node, add the new node
		if(head == null) {
			head= newNode;  //new node is the head
		}
		else {
			// make new node referring to the head
			// link the new node with the head
			newNode.next= head;
			// previous node of the old head is our new node
			head.previous = newNode;
			// make the new node head
			// head points to the new node
			head= newNode;
		}
	}	
	
	// deleting the first element
	public void delete() {
		head= head.next;
		head.previous = null;
	}
	
	// displaying nodes
	public void display() { 
		NodeDoubly n= head; // first node is head
		
		while(n != null) {
			System.out.println((T) n.value);
			n= n.next;
		}
				
	}	
}