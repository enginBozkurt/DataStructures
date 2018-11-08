package com.camp;

public class StackArray<T> {

Object[] ArrayStack;
int size;
int top;

	public StackArray(int size) {
		this.size = size;
		ArrayStack = new Object[this.size];
		top = -1; // there is no element in the stack
	}
	
	// add element tot the top of the stack
	public void push(Object newItem) {
		if(isFull()) {
			System.out.println("stack is full");
			return;
		}
		// increase the top indicator index by 1
		top = top +1;  
		// add the element to the new place of the top.
		ArrayStack[top] = newItem; 
	}
	
	// check whether the stack is full
	public Boolean isFull() {
		return(top==size-1);
	}
	
	// remove the top element from the stack and  
	// return the removed element
	public T pop() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return null;
		}
		// retrieve the top element in the stack
		T item = (T) ArrayStack[top];
		// decrease the top indicator index by 1
		top = top-1;
		// return the removed element
		return item;
	}
		
	// check whether the stack is empty
	public Boolean isEmpty() {
		return(top==-1);
	}

}