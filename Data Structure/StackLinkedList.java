package com.camp;

public class StackLinkedList<T> {
Node top; // first node
	
	public StackLinkedList() {
		top = null;  // empty stack
	}
	
	// creating a new node
	public void push(Object value) {
		Node newNode= new Node(value, null);
		// if I have not any existing node, add the new node
		if(top == null) {
			top= newNode;  //new node is the head
		}
		else {
			// make new node referring to the head
			// link the new node with the head
			newNode.next= top;
			// make the new node head
			// head points to the new node
			top= newNode;
		}
	}	
	
	// deleting the first element
	public T pop() {
		if(top == null) {
			System.out.println("stack is empty");
			return null;
		}
		T value =(T) top.value;
		top= top.next;
		return value;
	}
	
	// displaying nodes
	public void display() { 
		Node n= top; // first node is head
		
		while(n != null) {
			System.out.println((T) n.value);
			n= n.next;
		}
				
	}	

}
