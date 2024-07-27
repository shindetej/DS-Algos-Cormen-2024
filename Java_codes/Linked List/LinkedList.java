package com.tms.dsa.linkedlist;

public interface LinkedList {
	public void insertAtStart(int data);

	public void insertAtEnd(int data);

	void insertAfter(int exising, int data);

	void insertBefore(int existing, int data);

	public int getStart();

	public int getEnd();

	public int popStart();

	public int popEnd();

	public void removeStart();

	public void removeEnd();

	public void removeData(int data);

	public boolean find(int data);

	public int length();

	public LinkedList concat(LinkedList other);

	public void append(LinkedList other);

	public LinkedList getReversedList();

	public void reverseList();

	public LinkedList merge(LinkedList other);

	public void show();

}
