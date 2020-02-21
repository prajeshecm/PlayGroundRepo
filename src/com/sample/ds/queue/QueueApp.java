package com.sample.ds.queue;

import com.sample.ds.domain.Queue;
import com.sample.ds.domain.QueueDs;

public class QueueApp {
	
	public static void main(String[] args) {
		/*QueueService queueService = new QueueService();
        Queue queue = new Queue();
		
		int data =10;
		queueService.addElement(data,queue);
	    data =20;
		queueService.addElement(data,queue);
		data =30;
		queueService.addElement(data,queue);
		queueService.displayQueue(queue);
		
		queueService.deQueue(queue);
		queueService.displayQueue(queue);
	
	    data =50;
		queueService.addElement(data,queue);
		queueService.displayQueue(queue);
		
		queueService.deQueue(queue);
		queueService.deQueue(queue);
		
		queueService.displayQueue(queue);
		queueService.deQueue(queue);
		queueService.displayQueue(queue);
		queueService.deQueue(queue); */
		
		
		QueueDs queueDs = new QueueDs(5);
		
		queueDs.insertElement(10);
		queueDs.displayQueue();
		queueDs.insertElement(20);
		queueDs.displayQueue();
		queueDs.insertElement(30);
		queueDs.displayQueue();
		queueDs.insertElement(40);
		queueDs.displayQueue();
		queueDs.insertElement(50);
		queueDs.displayQueue();
		//queueDs.insertElement(60);
		//queueDs.displayQueue();
		
		queueDs.softDeleteElement();
		queueDs.displayQueue();
		
		queueDs.softDeleteElement();
		queueDs.displayQueue();
		queueDs.softDeleteElement();
		queueDs.displayQueue();
		queueDs.softDeleteElement();
		queueDs.displayQueue();
		queueDs.softDeleteElement();
		queueDs.displayQueue();
	}

	private static void testMethod() {
		
		String[] testArray = new String[10];
		testArray[0]="hi";
		testArray[1]="how are";
		testArray[2]="you";
		
		for(int i=0;i<testArray.length;i++){
			System.out.println("test array value :"+testArray[i]);
		}
		
		int[] testIntArray = new int[10];
		testIntArray[0]=10;
		testIntArray[1]=20;
		testIntArray[2]=30;
		
		for(int i=0;i<testIntArray.length;i++){
			System.out.println("test array value for int :"+testIntArray[i]);
		}
		System.out.println("remove the aray");
		
		for(int i=0;i<testIntArray.length;i++){
			 testIntArray[i]--;
		}
			// testIntArray[5]--;
		System.out.println("remove the aray length : "+testIntArray.length);
		for(int i=0;i<testIntArray.length;i++){
			System.out.println("test array value for int :"+testIntArray[i]);
		}
		
	}

}
