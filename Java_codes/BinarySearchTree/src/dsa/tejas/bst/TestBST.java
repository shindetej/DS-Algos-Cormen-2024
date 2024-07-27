package dsa.tejas.bst;

public class TestBST {

	public static void main(String[] args) {
		BSTInterface bst =  new BSTImpl();
		
		int[] sample = new int[] {100,200,10,70,120,102};
		
		for(int x : sample) {
			bst.insert(x);
		}
		System.out.println("\n\nIN ORDER TRAVERSAL : ");
		bst.inOrderTraverse();
		System.out.println("\n\nPRE ORDER TRAVERSAL : ");
		bst.preOrderTraverse();
		System.out.println("\n\nPOST ORDER TRAVERSAL : ");
		bst.postOrderTraverse();
	}
	
	
	
}
