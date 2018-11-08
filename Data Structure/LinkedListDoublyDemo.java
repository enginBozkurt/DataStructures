package com.camp;

public class LinkedListDoublyDemo {
	
	public static void main(String[] args) {
		LinkedListCustomDoubly<String> ls = new LinkedListCustomDoubly<String>();
		ls.add("Engin");	
		ls.add("Rebecca");
		ls.add("Miguel");
		ls.add("Audal");
		
		System.out.println("before delete");
		ls.display();
		
		System.out.println("after delete");
		ls.delete();
		ls.display();	
	}
}
