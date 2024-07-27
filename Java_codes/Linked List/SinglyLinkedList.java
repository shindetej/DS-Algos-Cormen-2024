package com.tms.dsa.linkedlist;

class Node {
	public Integer data;
	public Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
//
//	public int getData() {
//		return data;
//	}
//
//	public void setData(int data) {
//		this.data = data;
//	}
//
//	public Node getNext() {
//		return next;
//	}
//
//	public void setNext(Node node) {
//		this.next = node;
//	}
//	
//
//	public String toString() {
//		return data + " <-> ";
//	}
}

public class SinglyLinkedList {
	Node headNode;

	public SinglyLinkedList() {
		this.headNode = new Node(-1);
	}

	public boolean insertAtStart(int data) {
		Node newNode = new Node(data);
		newNode.next = this.headNode.next;
		this.headNode.next = newNode;
		return true;
	}

	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		Node traversingNode = this.headNode;
		while (traversingNode.next != null) {
			traversingNode = traversingNode.next;
		}
		newNode.next = traversingNode.next;
		traversingNode.next = newNode;

	}

	public void insertAfter(int existingData, int data) {
		Node run = this.headNode.next;
		while (run != null) {
			if (run.data == existingData)
				break;
			run = run.next;
		}
		if (run == null)
			throw new DataNotFoundException("existing data not found!");
		Node newNode = new Node(data);
		newNode.next = run.next;
		run.next = newNode;

	}

	public void insertBefore(int existingData, int data) {
		Node run = this.headNode;
		while (run.next != null) {
			if (run.next.data == existingData) {
				break;
			}
			run = run.next;
		}
		if (run == null)
			throw new DataNotFoundException("existing data not found!");
		Node newNode = new Node(data);
		newNode.next = run.next;
		run.next = newNode;

	}

	public String toString() {
		String s = "";
		Node run = this.headNode.next;
		s = "START ->";
		while (run != null) {
			s += "(" + run.data + ")->";
			run = run.next;
		}
		s += "END";

		return s;
	}

	public int getStart() {
		if (this.headNode.next == null) {
			throw new EmptyListException("Can not get start of empty list");
		}
		return this.headNode.next.data;
	}

	public int getEnd() {
		if (this.headNode.next == null) {
			throw new EmptyListException("Can not get end of empty list");
		}
		Node run = this.headNode;
		while (run.next != null) {
			run = run.next;
		}
		return run.data;

	}

	public int popStart() {
		if (this.headNode.next == null) {
			throw new EmptyListException("Can not pop start of empty list");
		}
		int data = this.headNode.next.data;
		this.headNode.next = this.headNode.next.next;
		return data;
	}

	public int popEnd() {
		if (this.headNode.next == null) {
			throw new EmptyListException("Can not pop end of empty list");
		}
		Node run = this.headNode;
		while (run.next.next != null) {
			run = run.next;
		}
		int data = run.next.data;
		run.next = run.next.next;
		return data;
	}

	public void removeStart() {
		if (this.headNode.next == null) {
			throw new EmptyListException("Can not remove from empty list");
		}
		this.headNode.next = this.headNode.next.next;
	}

	public void removeEnd() {
		if (this.headNode.next == null) {
			throw new EmptyListException("Can not remove from end for empty list");
		}
		Node r = this.headNode;
		while (r.next.next != null) {
			r = r.next;
		}
		r.next = r.next.next;
	}

	public void removeData(int dataToRemove) {
		if (this.headNode.next == null) {
			throw new EmptyListException("Can not remove data from empty list");
		}
		Node run = this.headNode;
		while (run.next != null && run.next.data != dataToRemove)
			run = run.next;

		if (run.next != null) {
			run.next = run.next.next;
		}
	}

	public boolean find(int data) {
		Node run = this.headNode.next;
		while (run != null && run.data != data) {
			run = run.next;
		}
		return run != null ? true : false;
	}

	public int length() {
		int cnt = 0;
		Node run = this.headNode.next;
		while (run != null) {
			cnt++;
			run = run.next;
		}
		return cnt;
	}

	public SinglyLinkedList concat(SinglyLinkedList other) {
		/*
		 * 1) add this list to new list 2) then add other list to new list using insert
		 * at end for both 1 n 2
		 * 
		 */
		SinglyLinkedList newList = new SinglyLinkedList();
		Node run = this.headNode.next;
		while (run != null) {
			newList.insertAtEnd(run.data);
			run = run.next;
		}
		run = other.headNode.next;
		while (run != null) {
			newList.insertAtEnd(run.data);
			run = run.next;
		}
		return newList;
	}

	public void append(SinglyLinkedList other) {

		if (other.headNode.next == null)
			throw new EmptyListException("Other list is empty");

		Node run = this.headNode;
		while (run.next != null) {
			run = run.next;
		}
		run.next = other.headNode.next;
		other.headNode = null;

	}

	public SinglyLinkedList getReversedList() {
		if (this.headNode.next == null)
			throw new EmptyListException("Other list is empty");
		SinglyLinkedList list = new SinglyLinkedList();
		Node run = this.headNode.next;
		while (run != null) {
			list.insertAtStart(run.data);
			run= run.next;
		}
		return list;

	}

	public void reverseList() {
		if(this.headNode.next == null && this.headNode.next.next ==null) {
			throw new EmptyListException("EMPTY OR ONE ELEMENT LIST CAN NOT BE REVERSED");		
		}
		Node originalFirst =  this.headNode.next;
		Node run =  this.headNode.next.next;
		while(run != null) {
			Node r_next = run.next;
			run.next = this.headNode.next;
			this.headNode.next=run;
			run = r_next;
		}
		originalFirst.next = null;
		
	}

}
