package com.sample.datastructure.nonlinear.tree.bst;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class BinSrchTreeService {
	
	static BinSrchTree rootNode; 
	
	static BinSrchTree leftChildNode; 
	
	static BinSrchTree rightChildNode; 
	
	static BinSrchTree currNode; 
	
	static BinSrchTree parentNode;
	
	static BinSrchTree markNode;
	
	static Boolean tempRootEnbled = Boolean.FALSE;
	
	
	public static void insertNode(int currkey){
		System.out.println("insertNode");
		//When the root is null , insert the node as root.
		if(rootNode == null){
			rootNode = new BinSrchTree();
			rootNode.setKey(currkey);
			return;
		}
		
		//populate the first child node.
		if(currkey <= rootNode.getKey()){
			leftChildNode = rootNode.getLeftChildTree();
			if(leftChildNode == null){
				leftChildNode = new BinSrchTree();
				leftChildNode.setKey(currkey);
				rootNode.setLeftChildTree(leftChildNode);
				return;
			}
		}else if(currkey > rootNode.getKey()){
				rightChildNode = rootNode.getRightChildTree();
				if(rightChildNode == null){
					rightChildNode = new BinSrchTree();
					rightChildNode.setKey(currkey);
					rootNode.setRightChildTree(rightChildNode);
					return;
				}
			}
		
		//when root is not null , get the key and check with the input_value. if small traverse to left else right.
		currNode = rootNode;
		while (currNode != null){
			if(currkey <= currNode.getKey()){
				parentNode = currNode;
				currNode = currNode.getLeftChildTree();
			}else if (currkey > currNode.getKey()){
				parentNode = currNode;
				currNode = currNode.getRightChildTree();
			}
		}
		
		if(currNode == null){
			//Populate the new BST node for the curreKey.
			BinSrchTree newNode = new BinSrchTree();
			newNode.setKey(currkey);
			
			//Assign to the parent , based on the value size.
			if(currkey <= parentNode.getKey() ){
				parentNode.setLeftChildTree(newNode);
			}else if(currkey > parentNode.getKey() ){
				parentNode.setRightChildTree(newNode);
			}
		}
		
		//if root has a child , iterate for child else add to the root.
		System.out.println("done");
		
	}
	
	
public Integer findMinimum(){
		
		if(rootNode==null) return 0;
		currNode = rootNode;
		while(currNode.getLeftChildTree() != null){
			BinSrchTree childNode = currNode.getLeftChildTree();
			currNode = childNode;
		}
		System.out.println("Miniumum Value : "+currNode.getKey());
		return currNode.getKey();
	}
	
	
	public static Integer   findMaximum(){
		if(rootNode==null) return 0;
		currNode = rootNode;
		while(currNode.getRightChildTree() != null){
			BinSrchTree childNode = currNode.getRightChildTree();
			currNode = childNode;
		}
		System.out.println("Maximum Value : "+currNode.getKey());
		return currNode.getKey();
		
	}

	
	public static void displayBSTNode(){
		 //List<Integer> parentNodeKeyList = new ArrayList<Integer>();
		//LinkedHashSet<BinSrchTree> parentNodeKeySet = new LinkedHashSet<BinSrchTree>();
		
		if(rootNode == null){return ;}
		
		//Get the minimum value
		currNode = rootNode ;
		
		
		while(currNode != null){
			while(currNode != null){
		
		//	parentNodeKeySet.add(currNode);
		//	System.out.println("parentNodeKeySet :"+parentNodeKeySet.toString());
			//markNode = getParentNodeMark( currNode); 
			markNode = currNode ;
		//	System.out.println("currNode :"+currNode.toString());
			currNode = currNode.getLeftChildTree();
			if(currNode != null){
				currNode.setParentNode(markNode);
			}
			
		}
		//display it.
		if(currNode == null){
			currNode = markNode;
			if(currNode != null){
				while(currNode!=null && currNode.getKey() != rootNode.getKey()){
					System.out.println("currNode : "+currNode.getKey());
				if(currNode.getRightChildTree()!= null){
					 int Rightkey = currNode.getRightChildTree().getKey();
					 System.out.println("Rightkey : "+Rightkey);
				}
					currNode = currNode.getParentNode();
				}
			}
			
		}
		
		if(tempRootEnbled  == Boolean.FALSE){
			currNode = rootNode.getRightChildTree();
			tempRootEnbled = Boolean.TRUE;
		}
		
		}
		
	}


	private static BinSrchTree getParentNodeMark(BinSrchTree currNode2) {
		
		
		return null;
	}
}
