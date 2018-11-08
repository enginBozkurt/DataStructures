package com.camp;

import java.util.Arrays;

public class StackDynamicArray<T> {
Object[] ArrayStack;
int size;
int top;

		public  StackDynamicArray(int size) {
			this.size = size;
			ArrayStack = new Object[this.size];
			top = -1; // there is no element in the stack
		}
		
		// add element tot the top of the stack
		public void push(Object newItem) {
			ensureCapacity(top+2);
			// increase the top indicator index by 1
			top = top +1;  
			// add the element to the new place of the top.
			ArrayStack[top] = newItem; 
		}
		
		public void ensureCapacity(int minCapacity) {
			int oldCapacity = getSize(); //retrive the old capacity
			if(minCapacity > oldCapacity) {    
				int newCapacity = oldCapacity *2; // double the current size 
				// minCapacity is usually close to size, so this is a win
				if(newCapacity < minCapacity) // this case happens if an element is deleted by user
					newCapacity = minCapacity;
				// copy the elements of the orginal array to the new doubled sized array (copy of the orginal)
				ArrayStack = Arrays.copyOf(ArrayStack, newCapacity);			
			}
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
		
		public int getSize() {
			return ArrayStack.length;
		}
			
		// check whether the stack is empty
		public Boolean isEmpty() {
			return(top==-1);
		}
}
