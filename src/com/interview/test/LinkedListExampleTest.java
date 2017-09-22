package com.interview.test;

import org.junit.*;

import com.interview.LinkedListExample;
import com.interview.LinkedListExample.Node;

public class LinkedListExampleTest {

	/*
	 * Testing reversing a list with NULL values
	 */
	@Test
	public void testReverseNullList() {
	    LinkedListExample list = new LinkedListExample();
	    System.out.println("Before reversing: ");
	    list.display();
	    Node newHead = list.reverseList(list.head);
	    System.out.println("After reversing: ");
	    list.display();
	    assert (newHead == null);
	  }
	
	/*
	 * Testing reversing a list with single node
	 */
	@Test
	public void testReverseListSingleNode(){
		LinkedListExample list = new LinkedListExample();
		list.addNode(1);
		System.out.println("Before reversing: ");
	    list.display();
	    Node newHead = list.reverseList(list.head);
	    System.out.println("After reversing: ");
	    list.display();
	    assert (list.head == newHead);
	    assert (newHead != null);
	    assert (newHead.value == 1);
	    assert (newHead.next == null);
	}
	
	/*
	 * Testing reversing a list with multiple nodes (in this case 2)
	 */
	@Test
	public void testReverseListMultipleNodes(){
		LinkedListExample list = new LinkedListExample();
		list.addNode(1);
		list.addNode(2);
		System.out.println("Before reversing: ");
	    list.display();
	    Node newHead = list.reverseList(list.head);
	    System.out.println("After reversing: ");
	    list.display();
	    assert (newHead != null);
	    assert (newHead.value == 2);
	    assert (list.head != null);
	    assert (newHead.next != null);
	    assert (newHead.next.value == 1);
	    assert (newHead.next.next == null);
	}
}
