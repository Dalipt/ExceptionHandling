package com.java.Collections;

import java.util.*;

/*from Java 1.2 Collection Added
 * 1.Total 7 classes 
 * 2.Total 3 Interfaces
 * If you want to add large data do operation
 *Iterable(Interface)->Collection(Inteface)>>>List Set Queue(Interface)
 *1.ArrayList
 *2.Linked List
 *3.ArrayDeques
 *4.PriorityQueues
 *5.TreeSet
 *6.HashSet
 *7.LinkedHashSet
 *===== Total 7 classes
 *Every class follow a specific data structure
 *  */

//ArrayList---->List(Interface)

public class LaunchCollection1 {

	public static void main(String[] args) 
	{
		ArrayList al= new ArrayList();
		al.add(100);
		al.add(44.3);
		al.add("Ramu");
		al.add(true);
		System.out.println(al);
		

	}

}
