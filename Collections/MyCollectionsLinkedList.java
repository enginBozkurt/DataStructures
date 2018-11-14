package com.camp;

import java.util.LinkedList;
import java.util.Iterator;

public class MyCollectionsLinkedList {
	public static void main(String[] args) {
		LinkedList<String> ls = new LinkedList<String>();
		
		ls.add("Engin");
		ls.add("rebecca");
		ls.add("miguel");
		
		Iterator<String> itr= ls.iterator();
		
		while(itr.hasNext())         //Returns true if the iteration has more elements
			System.out.println(itr.next()); //Returns the next element in the iteration
	
	}
}