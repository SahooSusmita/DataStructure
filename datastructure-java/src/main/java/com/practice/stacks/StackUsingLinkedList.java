package com.practice.stacks;

import java.util.LinkedList;

public class StackUsingLinkedList {
	public static void main(String[] args) {
	VariableStack stack = new VariableStack();
	stack.push(1);
	stack.push(2);
	stack.push(3);
	stack.push(4);
	stack.push(5);
	stack.push(6);
	System.out.println(stack.pop().data);
	System.out.println(stack.pop().data);
	System.out.println(stack.pop().data);
	System.out.println(stack.pop().data);
	System.out.println(stack.pop().data);
	System.out.println(stack.pop().data);
	System.out.println(stack.pop().data);

}
}
class Node{
	int data;
	Node next;
}
class VariableStack{
	Node head;
	LinkedList<Integer> list = new LinkedList<Integer>();	
	public void push(int data) {
		Node n = new Node();
		n.data=data;
		if(head==null) {
			head=n;
		}else {
			n.next=head;
			head= n;
		}
		list.add(data);
	}
	public Node pop() {
		Node temp = null;
		if(head==null) {
			System.out.println("Stack is Empty");
		}else {
			temp = head;
			head=head.next;
		}
		return temp;
	}
}

