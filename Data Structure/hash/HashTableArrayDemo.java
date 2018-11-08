package com.camp.hash;

public class HashTableArrayDemo {
	
	public static void main(String args[]) {
		HashTableArray<String> hm = new HashTableArray<String>(10);
		
		hm.put(11, "Engin");
		hm.put(12, "Rebecca");
		hm.put(13, "Miguel");
		hm.put(14, "Jena");
		
		System.out.println(hm.get(13));
	}
}