package dsa.tejas.bst;

public class BSTImpl implements BSTInterface {
	BSTNode rootNode;
	int numberOfElements;

	public BSTImpl() {
		rootNode = null;
		numberOfElements = 0;
	}

	public void insert(int newData) {
		System.out.println("Adding " + newData);
		BSTNode newNode = new BSTNode(newData);
		if (this.rootNode == null) {
			rootNode = newNode;
			numberOfElements += 1;
			System.out.println("added at root Node");
			return;
		}

		BSTNode run = rootNode;
		while (true) {
			if (newData <= run.data) {
				if (run.left == null) {
					run.left = newNode;
					run.left.parent = run;
					System.out.println("added at left subtree of " + run.data);
					break;
				} else {
					run = run.left;
				}
			} else {
				// new data > run.data
				if (run.right == null) {
					run.right = newNode;
					run.right.parent = run;
					System.out.println("added at right subtree of " + run.data);
					break;
				} else {
					run = run.right;
				}
			}
		}
		this.numberOfElements += 1;

	}

	private void inOrder(BSTNode node) {
		if (node != null) {
			this.inOrder(node.left);
			System.out.print(node.data + " ->");
			this.inOrder(node.right);
		}
	}

	private void preOrder(BSTNode node) {
		if (node != null) {
			System.out.print(node.data + " ->");
			this.preOrder(node.left);
			this.preOrder(node.right);
		}

	}

	private void postOrder(BSTNode node) {
		if (node != null) {
			this.postOrder(node.left);
			this.postOrder(node.right);
			System.out.print(node.data + " ->");
		}
	}

	@Override
	public void inOrderTraverse() {
		System.out.print("[START] ->");
		this.inOrder(this.rootNode);
		System.out.print("[END]");
	}

	@Override
	public void preOrderTraverse() {
		System.out.print("[START] ->");
		this.preOrder(this.rootNode);
		System.out.print("[END]");

	}

	@Override
	public void postOrderTraverse() {

		System.out.print("[START] ->");
		this.postOrder(this.rootNode);
		System.out.print("[END]");
	}

}
