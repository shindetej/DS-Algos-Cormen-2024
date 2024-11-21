package com.tejas.stack;

public class TestMain {
	
	public static void main(String[] args) {
		StackWithArray myStack =  new StackWithArray(1000);
		
		
//		myStack.pop();
		myStack.push(10);
		
		myStack.push(20);

		myStack.push(30);

		myStack.push(12);
		
		myStack.push(42);
		
		myStack.push(23);
		System.out.println("Before popped out two elements");
		myStack.show();
		myStack.pop();
		myStack.pop();
		System.out.println(myStack.peek());
		
		myStack.show();
	}
}
