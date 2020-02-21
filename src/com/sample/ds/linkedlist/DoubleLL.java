package com.sample.ds.linkedlist;

public class DoubleLL {
	
	
	static class Node {
		Node prev;
		int data;
		Node next;
	};
	
	/**
	 * 
	 * @param last
	 * @param data
	 * @return
	 */
	public static Node insertFirst(Node last,int data){
		Node newNode = new Node();
		newNode.data = data;
		
		//when the DLL is empty.
		if(last == null){
			newNode.next=newNode;
			newNode.prev=newNode;
			last= newNode;
			return newNode;
		}
		
		//when the DLL is not empty.
		newNode.next = last.next;
		 newNode.prev = last;
			
		 last.next.prev=newNode;
		 last.next = newNode;
		 
		 System.out.println("After Inserting first :"+last.data +" , newNode :"+newNode.data);
		return last;
	}
	
	
	/**
	 * 
	 * @param last
	 * @param data
	 * @return
	 */
	public static Node insertLast(Node last , int data){
		Node newNode = new Node();
		newNode.data = data;
		
		//when the DLL is empty.
		if(last == null){
			newNode.next=newNode;
			newNode.prev=newNode;
			last= newNode;
			return newNode;
		}
		
		//when the DLL is not empty.
		//Populate the new node with data.
		newNode.next =last.next;
		newNode.prev = last;
			
		//Connect the newNode with the Last and first Node.
		last.next = newNode;
		last.next.prev = newNode;
		
		last = newNode;
		
		System.out.println("After Inserting last :"+last.data +" , newNode :"+newNode.data);
		return last;
	}
	
	
	/**
	 * 
	 * @param key
	 * @param data
	 */
	public static Node insertAfter(Node last,int key ,int data){
		Node newNode = new Node();
		newNode.data = data;
		
		Node currentNode = last ;
		while ((currentNode != null ) && (currentNode.data != key)){
			currentNode = currentNode.next;
		}
		newNode.next=currentNode.next;
		newNode.prev= currentNode;
		
		currentNode.next.prev=newNode;
		currentNode.next=newNode;
		
		System.out.println("After Inserting After :"+last.data +" , newNode :"+newNode.data);
	return last;
	}
	
	
	public static void traverse(Node currentNode ){
		int dataAlreadyPrinted = 0 ;
		
		while((currentNode.data > 0) && (currentNode.data != dataAlreadyPrinted)){
			System.out.println(" traverse data :"+currentNode.data);
			if(dataAlreadyPrinted == 0){
				dataAlreadyPrinted = currentNode.data;
			}
			currentNode = currentNode.next;
		}
	}
	
	public static void main(String[] args) {
		
		Node last = null;
		int data =30;
		last = insertFirst(last ,data);
		traverse(last);
		
		data =20;
		last = insertFirst(last ,data);
		traverse(last);
		
		data =10;
		last = insertFirst(last ,data);
		traverse(last);
		
		data =40;
		last = insertLast(last ,data);
		traverse(last);
		
		data =50;
		last = insertLast(last ,data);
		traverse(last);
		
		data = 35;
		last = insertAfter(last ,30,data);
		traverse(last);
		
		last = dropNode(last ,35);
		traverse(last);
		
	}


	private static Node dropNode(Node last, int dropNodeKey) {
		
		Node currentNode = last ;
		while ((currentNode != null ) && (currentNode.data != dropNodeKey)){
			currentNode = currentNode.next;
		}
		Node prevNode =currentNode.prev;
		Node nextNode =currentNode.next;
		nextNode.prev = prevNode;
		prevNode.next = nextNode;
		
		System.out.println("After Inserting After :"+last.data +" , dropNodeKey :"+dropNodeKey);
		return last;
	}
}
