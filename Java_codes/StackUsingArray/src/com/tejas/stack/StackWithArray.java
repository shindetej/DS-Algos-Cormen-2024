package com.tejas.stack;

import com.tejas.stack.exceptions.StackEmptyException;
import com.tejas.stack.exceptions.StackFullException;

public class StackWithArray {
	private int maxSize;
	private int[] stack;
	private int top; // points at top element

	public StackWithArray(int maxSize) {
		super();
		this.maxSize = maxSize;
		this.stack = new int[maxSize];
		this.top = -1;
	}

	private boolean isFull() {
		return this.top == this.maxSize - 1;
	}

	private boolean isEmpty() {
		return this.top == -1;
	}

	// push
	public void push(int number) {
		try {
			if (isFull())
				throw new StackFullException("Stack with Array Full");
			stack[++top] = number;
		} catch (StackFullException s) {
			s.printStackTrace();
		}
	}

	// pop
	public int pop() {
		try {
			if (isEmpty())
				throw new StackEmptyException("Stack with Array Empty");
			System.out.println("Popped " + stack[top] + " from the stack.");
			return stack[top--];
		} catch (StackEmptyException s) {
			s.printStackTrace();
			return -1;
		}

	}

	// Method to peek at the top element without removing it
	public int peek() {
		try {
			if (isEmpty()) {
				throw new StackEmptyException("Stack with Array Empty");
			}
		} catch (StackEmptyException s) {
			s.printStackTrace();
		}
		return stack[top];
	}

	public void show() {
		try {
			if (isEmpty()) {
				throw new StackEmptyException("Stack with Array Empty");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.print("Stack elements: ");
		for (int i = 0; i <= top; i++) {
			System.out.print(stack[i] + " ");
		}
		System.out.println();
	}
}
