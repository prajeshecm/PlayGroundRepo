package com.sample.ds.domain;

import java.util.Arrays;

public class Queue {

	/**
	 * Queue using Array needs the queueArraySize , enqueue & dequeue ( for
	 * indexes) , length.
	 */

	int enqueue;
	int dequeue;
	int length;
	int size;
	int queueArray[] ;
	
	public Queue() {
		size = 5;
		queueArray = new int[size];
		enqueue = -1;
		dequeue = -1;
		length = 0;
	}

	public int getEnqueue() {
		return enqueue;
	}

	public void setEnqueue(int enqueue) {
		this.enqueue = enqueue;
	}

	public int getDequeue() {
		return dequeue;
	}

	public void setDequeue(int dequeue) {
		this.dequeue = dequeue;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int[] getQueueArray() {
		return queueArray;
	}

	public void setQueueArray(int[] queueArray) {
		this.queueArray = queueArray;
	}

	@Override
	public String toString() {
		return "Queue [enqueue=" + enqueue + ", dequeue=" + dequeue
				+ ", length=" + length + ", size=" + size + ", queueArray="
				+ Arrays.toString(queueArray) + "]";
	}

	 

}
