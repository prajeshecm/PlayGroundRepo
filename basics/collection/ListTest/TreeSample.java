package com.sample.collection.ListTest;

import java.util.TreeSet;

public class TreeSample {
	
	/**
	 * Customer sorting with default sorting and customized sorting.
	 * @param args
	 */
	public static void main(String[] args) {
		
		TreeSet tree = new TreeSet();//default sorting and by default String/wrapper implements comparable.
		tree.add("B");
		tree.add("Z");
		tree.add("A");
		tree.add("L");
		tree.add("D");
		System.out.println("Tree Contains :"+tree.toString());
		
		
		TreeSet integerTree = new TreeSet();//default sorting and by default Integer/wrapper implements comparable.
		integerTree.add(new Integer(20));
		integerTree.add(new Integer(100));
		integerTree.add(new Integer(200));
		integerTree.add(new Integer(2));
		integerTree.add(new Integer(90));
		System.out.println("Integer Tree Contains :"+integerTree.toString());
		
		//sort Customer by customer-id using default sorting
		TreeSet defaultTree = new TreeSet(); //default sorting so customer has to use comparable.
		defaultTree.add(new Customer("Balaji", 100));
		defaultTree.add(new Customer("Shiva", 10));
		defaultTree.add(new Customer("joy", 200));
		defaultTree.add(new Customer("venkat", 50));
		System.out.println("defaultTree :"+defaultTree);
		
		TreeSet treeBuffer = new TreeSet(new CustomizedStringBufferCustomer());//customized sorting so "CustomizedStringBufferCustomer" has to implement comparator<StringBuffer>
		treeBuffer.add(new StringBuffer("B"));
		treeBuffer.add(new StringBuffer("Z"));
		treeBuffer.add(new StringBuffer("A"));
		treeBuffer.add(new StringBuffer("L"));
		treeBuffer.add(new StringBuffer("D"));
		System.out.println("treeBuffer Contains :"+treeBuffer.toString());
		
		//sort Customer by customer-name using customized sorting.
		TreeSet customizedTree = new TreeSet(new CustomizedCustomer());//customized sorting so CustomizedCustomer has to implement comparator<CustomizedCustomer>.
		customizedTree.add(new CustomizedCustomer("Balaji", 100));
		customizedTree.add(new CustomizedCustomer("Shiva", 10));
		customizedTree.add(new CustomizedCustomer("Joy", 200));
		customizedTree.add(new CustomizedCustomer("Venkat", 50));
		System.out.println("customizedTree :"+customizedTree);
	}

}
