package com.sample.ds.queue;

import com.sample.ds.domain.Queue;
import org.apache.commons.lang.ArrayUtils;

/**
 * QueueService will support the queue base function like adding/deleting/diaplaying items to the queue. 
 * @author Prajesh kunimal
 *
 */
public class QueueService {
	
	
	
	
	QueueService(){
		
	}
	
	
	public Queue addElement(int data,Queue queue){
		System.out.println("Before Add : Queue : "+  queue+" , addElement"+data);
		
		if(!isQueueFull(queue)){
			//when queue is empty
			if((queue.getEnqueue()==-1 && queue.getDequeue() == -1)){
				queue.setEnqueue(0);
				queue.setDequeue(0);
				queue.getQueueArray()[queue.getEnqueue()]=data;
				queue.setLength(queue.getLength()+1);
				System.out.println("Afer Add : Queue when empty: "+  queue);
				return queue;
			}
			
			//when queue is not empty.
			if(!(queue.getEnqueue()==-1 && queue.getDequeue() == -1)){
				queue.setEnqueue(queue.getEnqueue()+1);
				queue.getQueueArray()[queue.getLength()]=data;
			}
		}
		queue.setLength(queue.getLength()+1);
		System.out.println("Afer Add : Queue when not empty: "+  queue);
		return queue;
	}
	
	public Queue deQueue(Queue queue){
		System.out.println("before deQueue : "+  queue);
		  int k = 0;
		  int data = 7 ;
		  
		// if queue is empty return message
		if((queue.getEnqueue()==-1 && queue.getDequeue() == -1)){
			return null;
		}
		//when just 1 item in the queue.
		if((queue.getEnqueue()== queue.getDequeue()) ){
			queue.setEnqueue(-1);
			queue.setDequeue(-1);
			queue.setLength(0);
			System.out.println("After deQueue when 1 item : "+  queue);
			queue.setQueueArray(ArrayUtils.remove(queue.getQueueArray(), 0));
			return queue;
		}
		//when more than 1 item in the queue.
		queue.setDequeue(queue.getDequeue()+1);
		
		//queue.getQueueArray()[queue.getLength()]--;
		queue.setQueueArray(ArrayUtils.remove(queue.getQueueArray(), 0));
		queue.setLength(queue.getLength()-1);
		
		System.out.println("After deQueue when >1 item : "+  queue);
		return queue;
	}

	public void displayQueue(Queue queue){
		System.out.println("Queue : "+  queue+" , displayQueue");
		
		for(int i=0;i<queue.getLength();i++){
			System.out.println("Queue : "+  queue );
			
		}
		
	}
	
	//as we are implementing queue using array we need to make sure the queue size is under/overflow.
	public boolean isQueueEmpty(Queue queue ){
		System.out.println("Queue : "+  queue+" , isQueueEmpty");
		if((queue.getEnqueue()==-1 && queue.getDequeue() == -1)){
			return true;
		}
		return false;
	}
	
	
	public boolean isQueueFull(Queue queue ){
		System.out.println("isQueueFull");
		if(queue.getEnqueue()==queue.getSize()){
			return true;
		}
		return false;
	}
}
