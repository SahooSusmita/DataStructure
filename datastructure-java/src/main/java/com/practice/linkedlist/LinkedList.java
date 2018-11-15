package com.practice.linkedlist;

public class LinkedList {
	Node head;

	public void insert(int data) {
		Node nn = new Node();
		nn.data = data;
		nn.next = null;
		if (head == null) {
			head = nn;
		} else {
			Node n1 = head;
			while (n1.next != null) {
				n1 = n1.next;
			}
			n1.next = nn;
		}

	}

	public void show() {
		Node n = head;
		System.out.print("LinkedList : [");
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println("]");
	}

	public int size() {
		Node n = head;
		int count = 0;
		while (n.next != null) {
			count++;
			n = n.next;
		}
		count++; // For the last Node
		System.out.println("Size : " + count);
		return count;
	}

	public void remove(int index) {
		try {
			if (index <= this.size()) {
				Node n = head;
				Node npre = null;
				int count = 1;
				while (n.next != null) {
					if (count == index - 1) {      //Storing the previous Node
						npre = n;
					} else if (count == index && npre == null) {    // Removing 1st Element
						head = n.next;
						break;
					} else if (count == index && npre != null) {     // Removing middle element
						npre.next = n.next;
						break;
					}
					count++;
					n = n.next;
				}
				if (npre != null && this.size() == index) {         //Removing last element
					npre.next = null;
				}
				if (this.size() == 1) {								// If linked list has only one element
					head = null;
				}
				n = null;
			} else {
				throw new ArrayIndexOutOfBoundsException("Please send a valid index value !!!");        //Throwing exception if size is greater than the linkedlist size
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

	}
}
