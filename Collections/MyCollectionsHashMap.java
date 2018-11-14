package com.camp;

import java.util.HashMap;
import java.util.Map;

public class MyCollectionsHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		// you have to have unique keys
		map.put(1, "Engin");
		map.put(4, "Rebecca");
		map.put(555, "Wanessa");
		
		// retrive the element value with key=4
		System.out.println(map.get(4));
		
		//print all elements
		
		//Returns a Set view of the mappings contained in this map
		for(Map.Entry m: map.entrySet())
			System.out.println("key: " + m.getKey() + " , value: " + m.getValue());
		
		// update the value in the related key
		map.put(1, "Engin Bozkurt");
		
		//Returns a Set view of the mappings contained in this map
		for(Map.Entry m: map.entrySet())
			System.out.println("key: " + m.getKey() + " , value: " + m.getValue());
				
	   //remove the value in the related key
		map.remove(555);
	   
	   //Returns a Set view of the mappings contained in this map
		for(Map.Entry m: map.entrySet())
			System.out.println("key: " + m.getKey() + " , value: " + m.getValue());
	}
}
