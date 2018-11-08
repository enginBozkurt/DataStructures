package com.camp;

public class StackLinkedListDemo {
	
	public static void main(String[] args) {
		StackLinkedList<String> st= new StackLinkedList<String>();
		
		st.pop(); //warning shoould be that stack is empty
		st.push("Engin");
		st.push("Rebecca");
		
		System.out.println(st.pop());
		System.out.println(st.pop());
	}
}