package com.sample.datastructure.nonlinear.tree.bst;

public class BinSrchTreeApp {
	
	
	public static void main(String[] args) {
		
		BinSrchTree bst = new BinSrchTree();
		
		BinSrchTreeService bstServ = new BinSrchTreeService();
		
		//insert node in BST.
		bstServ.insertNode(53);
		bstServ.insertNode(28);
		bstServ.insertNode(62);
		bstServ.insertNode(10);
		bstServ.insertNode(57);
		bstServ.insertNode(29);
		bstServ.insertNode(15);
		bstServ.insertNode(5);
	 	/*bst.insertNode(10, "");
		bst.insertNode(05, "");*/

		//find min and max in BST.
		bstServ.findMinimum();
		bstServ.findMaximum();
		
		bstServ.displayBSTNode();
		
		//Display the BST.
		
		
	/*	//search for the node in BST.
		System.out.println("search value is : "+bst.findNode(05));
		System.out.println("search value is : "+bst.findNode(80));
		System.out.println("search value is : "+bst.findNode(800));
		
		//delete the node in BST.
		bst.deleteNode(18);
		bst.deleteNode(10);
		bst.deleteNode(30);*/
	}

}
