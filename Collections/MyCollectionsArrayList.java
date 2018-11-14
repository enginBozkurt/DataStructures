package com.camp;

import java.util.ArrayList;

public class MyCollectionsArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> ar = new ArrayList<String>();
		
		ar.add("Engin");
		ar.add("Vanessa");
		ar.add("Rebecca");
		
		System.out.println(ar.get(1));
		
		ar.remove(1);
		
		for(String st: ar)
			System.out.println(st);
		
		
		// arraylist usage with a class
		ArrayList<employee> emp = new ArrayList<employee>();
		emp.add(new employee("Engin", 27));
		emp.add(new employee("Vanessa", 33));
		emp.add(new employee("Rebecca", 30));
		
		for(employee st: emp)
			System.out.println(st.name + "\t" + st.age);
	
	}
	
	static class employee {
		String name;
		int age;
		public employee(String name, int age) {
			this.name = name;
			this.age = age;
		}		
	}

}
