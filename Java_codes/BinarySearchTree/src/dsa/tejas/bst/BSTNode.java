package dsa.tejas.bst;

public class BSTNode {
	int data;
	BSTNode right;
	BSTNode left;
	BSTNode parent;

	public BSTNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
		this.parent = null;
	}
}
