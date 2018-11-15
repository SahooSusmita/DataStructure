package com.practice.linkedlist;

import java.util.List;

public class Runner {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(5);
		list.insert(12);
		list.insert(6);
		list.insert(9);
		list.insert(8);
		list.insert(20);
				
		list.show();
		list.size();
		list.remove(7);
		list.show();
		
		
		
		List l1 =new java.util.LinkedList();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		
		System.out.println(l1);
	
		l1.size();
		l1.remove(7);
		System.out.println(l1);
		
	}

}
