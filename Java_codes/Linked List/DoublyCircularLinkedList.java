package com.tms.dsa.linkedlist;

public class DoublyCircularLinkedList implements LinkedList {
	
	private class Node{
		int data;
		Node next ;
		Node prev ;
		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	
	private Node headNode ;
	
	public DoublyCircularLinkedList() {
		this.headNode = new Node(-1);
		this.headNode.next =  this.headNode;
		this.headNode.prev = this.headNode;
	}
	
	public static void genericInsert(Node startNode ,Node midNode,Node endNode) {
		midNode.next = endNode;
		midNode.prev = startNode;
		startNode.next = midNode;
		endNode.prev = midNode;
	}

	@Override
	public void insertAtStart(int data) {
		DoublyCircularLinkedList.genericInsert(this.headNode, new Node(data), this.headNode.next);

	}

	@Override
	public void insertAtEnd(int data) {
		DoublyCircularLinkedList.genericInsert(this.headNode.prev, new Node(data), this.headNode);

	}

	public  Node searchNode(int existing) {
		Node trav = this.headNode.next;
		while (trav != this.headNode) {
			if (trav.data == existing) {
				return trav;
			}
			trav = trav.next;
		}
		
		return null;
		
	}
	@Override
	public void insertAfter(int existing, int data) {
		Node existingNode = searchNode(existing); 
		if(existingNode == null) {
			throw new DataNotFoundException(existing+" not found ");	
		}
		
		genericInsert(existingNode, new Node(data), existingNode.next);
	}

	
	@Override
	public void insertBefore(int existing, int data) {
		Node existingNode =  searchNode(existing);
		if(existingNode == null) {
			throw new DataNotFoundException(existing+ " not found");	
		}
		genericInsert(existingNode.prev, new Node(data), existingNode);
	}
	
	public boolean isEmpty() {
		return this.headNode.next ==  this.headNode && this.headNode.prev == this.headNode ;
	}
	
	@Override
	public int getStart() {
		if(isEmpty()) {
			throw new EmptyListException("List is empty");
		}
		return this.headNode.next.data;
	}

	@Override
	public int getEnd() {
		if(isEmpty()) {
			throw new EmptyListException("List is empty");
		}
		return this.headNode.prev.data;
	}

	public void genericDelete(Node deleteNode) {
		deleteNode.prev.next= deleteNode.next;
		deleteNode.next.prev = deleteNode.prev;
	}
	
	@Override
	public int popStart() {
		if(isEmpty()) {
			throw new EmptyListException("List is empty");
		}
		int data= this.headNode.next.data;
		genericDelete(this.headNode.next);
		return data;
	}

	@Override
	public int popEnd() {
		if(isEmpty()) {
			throw new EmptyListException("List is empty");
		}
		int data = this.headNode.prev.data;
		genericDelete(this.headNode.prev);
		return data;
	}

	@Override
	public void removeStart() {
		if(isEmpty()) {
			throw new EmptyListException("List is empty");
		}
		genericDelete(this.headNode.next);

	}

	@Override
	public void removeEnd() {
		if(isEmpty()) {
			throw new EmptyListException("List is empty");
		}
		genericDelete(this.headNode.prev);

	}

	@Override
	public void removeData(int data) {
		if(isEmpty()) {
			throw new EmptyListException("List is empty");
		}
		Node node = this.searchNode(data);
		if(node == null) {
			throw new DataNotFoundException("No Such Node");
		}
		genericDelete(node);
	}

	@Override
	public boolean find(int data) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public LinkedList concat(LinkedList other) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void append(LinkedList other) {
		// TODO Auto-generated method stub

	}

	@Override
	public LinkedList getReversedList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reverseList() {
		// TODO Auto-generated method stub

	}

	@Override
	public LinkedList merge(LinkedList other) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		String s = null;
		s = "[Start] -> ";
		Node run = this.headNode.next;
		while (run != this.headNode) {
			s += "(" + run.data + ")->";
			run = run.next;
		}
		s += " [END]";

		return s;
		
	}
}
