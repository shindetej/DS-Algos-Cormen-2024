
public class InsertAtSortedList {
	public static void main(String[] args) {
		System.out.println("Start demo");

		int[] L = { 10, 20, 30, 40, 50, 25 };

		System.out.print("BEFORE List :");
		for(int element : L) {
			System.out.print(element +" ");
		}
		
		Integer key = L[L.length - 1];
		System.out.println("\n----");
		System.out.println("Key : "+ key);
		int i = L.length - 2;
		System.out.println("i : "+ i);
		System.out.println("----");

		
		while(i > -1 && L[i] > key)
		{
			L[i+1] = L[i];
			i = i-1;
		}
		L[i+1] = key;
		System.out.print("After List : ");
		for(int element : L) {
			System.out.print(element + " ");
		}

	}
}
