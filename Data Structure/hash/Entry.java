package com.camp.hash;

public class Entry {
int key;
Object value;
Entry next;

	public Entry(int key, Object value) {
		this.key = key;
		this.value = value;
		next = null;		
	}
	
	public Entry() {
		next = null;  // at first the array is empty(HashTable)
	}
	
	public int getKey() {
		return key;
	}
	
	public Object getValue() {
		return value;
	}
	
}
