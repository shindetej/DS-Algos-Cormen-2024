package com.tms.dsa.linkedlist;

public class TestMain {

	public static void main(String[] args) {
		LinkedList list = new DoublyCircularLinkedList();
//		SinglyLinkedList list = new SinglyLinkedList();
		
		list.insertAtStart(10);
		list.insertAtStart(9);
		list.insertAtEnd(12);
		list.insertAtEnd(20);
		list.insertAfter(12,15);
		list.insertBefore(15,13);
		list.insertBefore(20,11);
		System.out.println("LIST  with insert start,end ,after ,before:\n "+list);
		
//		System.out.println("GET END "+ list.getEnd());
//		System.out.println("GET START	"+ list.getStart());
//		System.out.println("POP END	"+list.popEnd() );
//		System.out.println("POP START	"+list.popStart());
//		// 9 10 12 13 15 20
//		System.out.println("LIST  (After Two POP Operations): "+list);
//
//		SinglyLinkedList list1 = new SinglyLinkedList();
//		list1.insertAtEnd(100);
//		list1.insertAtEnd(200);
//		list1.insertAtEnd(67);
//		list1.insertAtEnd(44);
//		list1.insertAtEnd(7);
//		System.out.println("\n------\nLIST1 : "+list1);
//		list1.removeData(67);
//		list1.removeEnd();
//		list1.removeStart();
//		
//		System.out.println("LIST1 (REMOVE Operations ) : " + list1);
//		
//		System.out.println("CONCAT TWO LIST  : "+ list.concat(list1));
//		
//		System.out.println(list.find(44)?"FIND() : 44 present in list":"FIND() : 44 absent in list");
//		list.append(list1);
//		System.out.println("After appending ::: " + list);
//		System.out.println("Length() ::: " + list.length());
//
//		System.out.println(list.find(44)?"FIND() : 44 present in list":"FIND() : 44 absent in list");
//		System.out.println("GET REVERSED LIST :"+ list.getReversedList());
//		list.reverseList();
//		System.out.println("REVERSE THE ACTUAL LIST :"+list );


	}

}
