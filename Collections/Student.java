package com.camp;

// Comparable interface imposes a total ordering on the objects of each class thatimplements it. 
// This ordering is referred to as the class's naturalordering, and the class's compareTo method is referred 
// to as its natural comparison method.

public class Student implements Comparable<Student> {
	String name;
	int age;

	public Student(String name, int age) {
		this.name=name;
		this.age=age;		
	}

	@Override
	public int compareTo(Student o) {
		if(this.age == o.age)
			return 0;
		else if(this.age > o.age)
			return 1;
		else
			return -1;
	}
}