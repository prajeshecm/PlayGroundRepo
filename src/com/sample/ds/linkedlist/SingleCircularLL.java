package com.sample.ds.linkedlist;

import java.util.NoSuchElementException;


//https://www.geeksforgeeks.org/circular-singly-linked-list-insertion/
public class SingleCircularLL {
	  
	static class Node 
	{ 
	    int data; 
	    Node next; 
	}; 
	  
	static Node addToEmpty(Node last, int data) 
	{ 
	    // This function is only for empty list 
	    if (last != null) 
	    return last; 
	  
	    // Creating a node dynamically. 
	    Node temp = new Node(); 
	  
	    // Assigning the data. 
	    temp.data = data; 
	    last = temp; 
	  
	    // Creating the link. 
	    last.next = last; 
	  
	    return last; 
	} 
	  
	static Node addBegin(Node last, int data) 
	{ 
	    if (last == null) 
	        return addToEmpty(last, data);
	    
	  
	    Node temp = new Node(); 
	  
	    temp.data = data; 
	    temp.next = last.next; 
	    last.next = temp; 
	  
	    return last; 
	} 
	  
	static Node addEnd(Node last, int data) 
	{ 
	    if (last == null) 
	        return addToEmpty(last, data); 
	      
	    Node temp = new Node(); 
	    temp.data = data; 
	    
	    temp.next = last.next; 
	    last.next = temp; 
	    last = temp; 
	  
	    return last; 
	} 
	  
	static Node addAfter(Node last, int data, int item) 
	{ 
	    if (last == null) 
	        return null; 
	  
	    Node temp, p; 
	    p = last.next; 
	    do
	    { 
	        if (p.data == item) 
	        { 
	            temp = new Node(); 
	            temp.data = data; 
	            temp.next = p.next; 
	            p.next = temp; 
	  
	            if (p == last) 
	                last = temp; 
	            return last; 
	        } 
	        p = p.next; 
	    } while(p != last.next); 
	  
	    System.out.println(item + " not present in the list."); 
	    return last; 
	  
	} 
	  
	static void traverse(Node last) 
	{ 
	    Node p; 
	  
	    // If list is empty, return. 
	    if (last == null) 
	    { 
	        System.out.println("List is empty."); 
	        return; 
	    } 
	  
	    // Pointing to first Node of the list. 
	    p = last.next; 
	  
	    // Traversing the list. 
	    do
	    { 
	        System.out.print(p.data + " "); 
	        p = p.next; 
	  
	    } 
	    while(p != last.next); 
	  
	} 
	
	public static Node deleteFirstNode(Node last){
		
		//when LL is empty.
		if(last.next == null){
			throw new NoSuchElementException("LL is Empty");
		}
			//when LL is not empty.
		Node headNode = last.next;
		last.next = headNode.next;
		
		return headNode;
	}
	
	
	public static Node deleteLastNode(Node last){
		
		//when LL is empty.
		 
		//when LL is not empty.
		Node tempNode = null;
		Node headNode = last.next;
		Node headMark = last.next;
		System.out.println("\n headNode data :"+headNode.data+ ", last :"+last.data);
		//Node currentNode = headNode;
		while(headNode!= last){
			  tempNode = headNode;
			headNode = headNode.next;
			System.out.println("headNode data :"+headNode.data);
		}
		tempNode.next=headMark;
		last=tempNode;
		return tempNode;
	}
	  
	// Driven code 
	public static void main(String[] args) 
	{ 
	    Node last = null; 
	   // Node deletedNode = deleteFirstNode(last);
	    last = addToEmpty(last, 6); 
	    last = addBegin(last, 4); 
	    last = addBegin(last, 2); 
	    last = addEnd(last, 8); 
	    last = addEnd(last, 12); 
	    last = addAfter(last, 10, 8); 
	  
	    traverse(last); 
	    
	    
	    Node deletedNode = deleteFirstNode(last);
	   System.out.println("\n deletedNode :"+deletedNode.data);
	   traverse(last); 
	   
	   Node newlastNode = deleteLastNode(last);
	  System.out.println("\n newlastNode :"+newlastNode.data);
	   
	   traverse(newlastNode); 
	   newlastNode = addBegin(newlastNode, 1); 
	   traverse(newlastNode) ; 
	    
	} 
	} 

 