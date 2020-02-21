package com.sample.ds.domain;

import java.util.NoSuchElementException;

public class QueueDs {
	
	
	int front;
	int rear;
	int length;
	int size;
	int[] queueArray ;
	
	public QueueDs(int size){
		front =-1;
		rear =-1;
		length =0;
		this.size =size;
		queueArray = new int[size];
		System.out.println("QueueDs Constructor :");
	}
	
	public Boolean isQueueFull(){
		//Check the queue is full w.r.t to rear == size;
		System.out.println("Check Queue Size : "+rear  +size);
		if(rear == size)
			return true;
		else
			return false;
	}
	
	
	public Boolean isQueueEmpty(){
		//when both the front && rear =-1
		if(front==-1 && rear==-1){
			return true;
		}
		return false;
	}

	
	public void insertElement(int element){
		//when queue is overflow.
		if(isQueueFull()){
			System.out.println("Befor insert  Q is full");
			throw new IndexOutOfBoundsException("Queue Overflow");
		}
		//when queue is empty.
		if(front==-1 && rear==-1){
			System.out.println("Befor insert  Q is empty :"+front+rear+length);
			front = 0;
			rear = 0;
			queueArray[rear] = element;
			length++;
			System.out.println("After insert  Q is empty :"+front+rear+length);
		}else{
			System.out.println("Befor insert  Q is not empty :"+front+rear+length);
			rear++;
			queueArray[rear] = element;
			length++;
			System.out.println("After insert  Q is not empty :"+front+rear+length);
		}
	}
	
	
	//when we delete the element then the index/length will get reduced so the obj reference will get changed
	public int softDeleteElement(){
		System.out.println("SoftDeleteElement");
		int elementVal = 0;
		//when Q is empty;
		if(isQueueEmpty()){
			//System.out.println("NoSuchElementException");
			throw new NoSuchElementException("Queue is empty");
		
		}
			
		//when Q is 0 in length , ;
		if(front==0 && rear==0){
			System.out.println("Befor delete  Q is 0 :"+front+rear+length);
			 elementVal = queueArray[front]; 
			 front=-1; rear=-1;length--;
			 System.out.println("NoSuchElementException");
			 System.out.println("After delete Q is 0  :"+front+rear+length);
			 return elementVal;
		}
		//when Q is >0
		System.out.println("Befor delete  Q > 0 :"+front+rear+length+elementVal);
		front++;
		elementVal = queueArray[front]; 
		length--;
		System.out.println("After delete  Q > 0 :"+front+rear+length+elementVal);
		return elementVal;
	}
	
	
	public void displayQueue(){
		System.out.println("displayQueue");
		if(isQueueEmpty())
			System.out.println("Queue is empty");
		for(int i=front ; i<=rear ; i++){
			System.out.println("Queue Elements are  : "+queueArray[i]);
		}
		
	}
}
