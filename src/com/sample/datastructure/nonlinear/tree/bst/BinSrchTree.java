package com.sample.datastructure.nonlinear.tree.bst;

public class BinSrchTree {
	
	
	private int key = 0;
	private BinSrchTree leftChildTree = null;
	private BinSrchTree RightChildTree = null;
	private BinSrchTree parentNode = null;
	
	public BinSrchTree( ) { }
	
	
	public BinSrchTree(int key, BinSrchTree leftChildTree,
			BinSrchTree rightChildTree) {
		super();
		this.key = key;
		this.leftChildTree = leftChildTree;
		this.RightChildTree = rightChildTree;
		this.parentNode= parentNode;  
	}


	public BinSrchTree getParentNode() {
		return parentNode;
	}


	public void setParentNode(BinSrchTree parentNode) {
		this.parentNode = parentNode;
	}


	public int getKey() {
		return key;
	}


	public void setKey(int key) {
		this.key = key;
	}


	public BinSrchTree getLeftChildTree() {
		return leftChildTree;
	}


	public void setLeftChildTree(BinSrchTree leftChildTree) {
		this.leftChildTree = leftChildTree;
	}


	public BinSrchTree getRightChildTree() {
		return RightChildTree;
	}


	public void setRightChildTree(BinSrchTree rightChildTree) {
		RightChildTree = rightChildTree;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((RightChildTree == null) ? 0 : RightChildTree.hashCode());
		result = prime * result + key;
		result = prime * result
				+ ((leftChildTree == null) ? 0 : leftChildTree.hashCode());
		result = prime * result
				+ ((parentNode == null) ? 0 : parentNode.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BinSrchTree other = (BinSrchTree) obj;
		if (RightChildTree == null) {
			if (other.RightChildTree != null)
				return false;
		} else if (!RightChildTree.equals(other.RightChildTree))
			return false;
		if (key != other.key)
			return false;
		if (leftChildTree == null) {
			if (other.leftChildTree != null)
				return false;
		} else if (!leftChildTree.equals(other.leftChildTree))
			return false;
		if (parentNode == null) {
			if (other.parentNode != null)
				return false;
		} else if (!parentNode.equals(other.parentNode))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "BinSrchTree [key=" + key + ", leftChildTree=" + leftChildTree
				+ ", RightChildTree=" + RightChildTree + ", parentNode="
				+ parentNode + "]";
	}


	 
	
	
	

}
