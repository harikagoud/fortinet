package com.interview;

public class LinkedListExample {
	public Node head;
	
	public class Node{
		public int value;
		public Node next;
		public Node(int value){
			this.value = value;
			this.next = null;
		}
	}

	// Constructor which will initiate a null/empty list
	public LinkedListExample(){
		head=null;
	}

	// Assuming any new Node will be added at the end ONLY
	public void addNode(int value){
		Node n = new Node(value);
		if (head == null){
			head = n;
		} else{
			Node currentNode = head;
			while (currentNode.next!=null) 
			currentNode = currentNode.next;
			currentNode.next = n;
		}
	}

	public Node reverseList(Node head){
		Node currentNode = head;
		Node nextNode = null;
		Node previousNode = null;

		while(currentNode!=null){ // loop until node is null
			nextNode = currentNode.next; // store the next Node pointer
			currentNode.next = previousNode; // reverse the link
			previousNode = currentNode; // Now, the current Node becomes previous node
			currentNode = nextNode; // bump the current Node to next one to reverse it (if exists)
		}
		// The execution will come here directly when the head is null (empty list). 
		// Or set previous node to head - after the loop previous Node will be pointing to the last one
		this.head = previousNode;
		// As the return type is mentioned as Node, I am just returning head even though it is not necessary.
		return this.head;
	}

	public void display(){
		if (head != null){
			System.out.print(head.value);
			Node currentNode = head.next;
			while(currentNode!=null){
				System.out.print(" -> " + currentNode.value);
				currentNode=currentNode.next;
			}
			System.out.println();
		} else{
			System.out.println("Empty List");
		}
	}
	
}