package com.tms.dsa.linkedlist;

public class DoublyLinkedList {

	class Node {
		public int data;
		public Node next;
		public Node prev;

		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	Node headNode;

	public DoublyLinkedList() {
		this.headNode = new Node(-1);
	}

	public void insertAtStart(int newData) {
		// create node
		Node newNode = new Node(newData);
		// assign node's next as headnode next
		newNode.next = this.headNode.next;
		newNode.prev = this.headNode;
		// Important to check if headnode's next has prev
		if (this.headNode.next != null)
			this.headNode.next.prev = newNode;
		this.headNode.next = newNode;
	}

	public void insertAtEnd(int newData) {
		Node run = this.headNode;
		while (run.next != null) {
			run = run.next;
		}

		Node newNode = new Node(newData);
		newNode.next = run.next;
		newNode.prev = run;
		run.next = newNode;
	}

	public void insertAfter(int afterData, int newData) {
		Node run = this.headNode.next;
		while (run != null && run.data != afterData) {
			run = run.next;
		}

		if (run != null) {
			System.out.println(afterData + " data present in list");
			Node newNode = new Node(newData);
			newNode.next = run.next;
			newNode.prev = run;
			// Before assigning newNode to run.next handle run.next.prev
			if (run.next != null) {
				run.next.prev = newNode; // IMPORTANT Step
			}
			run.next = newNode;
		} else {
			throw new DataNotFoundException(afterData + " not found in list");
		}
	}

	public void insertBefore(int beforeData, int newData) {
		Node run = this.headNode;
		while (run.next != null && run.next.data != beforeData) {
			run = run.next;
		}

		if (run.next == null) {
			throw new DataNotFoundException(beforeData + "Not Found !!");
		} else {
			Node newNode = new Node(newData);
			newNode.next = run.next;
			newNode.prev = run;
			run.next.prev = newNode;
			run.next = newNode;
		}
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

	public int popStart() {
		return 0;
	}

	public int popEnd() {
		return 0;
	}

	public int removeStart() {
		return 0;
	}

	public int removeData(int data) {
		return 0;
	}

	public int removeEnd() {
		return 0;
	}
}
