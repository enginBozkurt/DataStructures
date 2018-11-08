package com.camp;

import java.util.Arrays;

public class DynamicArray<T> {
	int size;
	Object[] data;
	
	public DynamicArray() {
		size = 0;		
		data = new Object[1]; //allocate a space in the memory for one element		
	}
	// return the allocated size of the array
	public int getSize() {
		return data.length;
	}
	
	// return the element at the specified index
	public T get(int index) {
		return (T) data[index];
	}
	
	public void put(T element) {
		ensureCapacity(size+1); // create a new larger array
		data[size++] = element; //insert the element and increase size by 1
	}
	
	public void ensureCapacity(int minCapacity) {
		int oldCapacity = getSize();  //retrive the old capacity
		if(minCapacity > oldCapacity) {    
			int newCapacity = oldCapacity *2; // double the current size 
			// minCapacity is usually close to size, so this is a win
			if(newCapacity < minCapacity) // this case happens if an element is deleted by user
				newCapacity = minCapacity;
			// copy the elements of the orginal array to the new doubled sized array (copy of the orginal)
			data = Arrays.copyOf(data, newCapacity);			
		}
	}
}
