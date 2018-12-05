package com.practice.stacks;

public class StackUsingArray {
	public static void main(String[] args) {
		FixedStack stack = new FixedStack(10);
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		stack.push("5");
		stack.push("6");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		stack.push("5");
		stack.push("6");
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		stack.push("5");
		stack.push("6");
		
	}
	

}
class FixedStack{
	int size;
	int top=-1;
	String[] arry;
	
	FixedStack(int size){
		this.size = size;
		this.arry= new String[size];
	}

	public void push(String data) {
		if(top < size-1) {
			top++;
			System.out.println(top);
			arry[top]=data;	
		
		}else
			System.out.println("My stack is full");		
	}
	public String pop() {
		String result = null;
		if(top!=-1) {
			result= arry[top];
			top--;
		}
		else {
			result ="stack is empty";
		}
		
		return result;	
	}
}