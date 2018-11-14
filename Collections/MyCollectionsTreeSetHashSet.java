package com.camp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class MyCollectionsTreeSetHashSet {

	public static void main(String[] args) {
		
		// the difference from Linkedlist is not allowing duplicate elements
		HashSet<String> ls = new HashSet<String>();
		
		ls.add("Rebecca");
		ls.add("Miguel");
		ls.add("Engin");
		ls.add("Engin");
		
		Iterator<String> itr = ls.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
				
		// for sorting use Treeset
		TreeSet<String> lsTree = new TreeSet<String>();
		
		lsTree.add("Rebecca");
		lsTree.add("Miguel");
		lsTree.add("Engin");
		lsTree.add("Engin");
		
		Iterator<String> itrTree = lsTree.iterator();
		
		while(itrTree.hasNext())
			System.out.println(itrTree.next());
		
	}
}