package tejas.practice.other;

import java.util.ArrayList;

public class uniqueNumberList2 {
	public static void main(String[] args) {
		int a[] = {68, 12, 32, 84, 91, 69, 39, 34, 29, 96, 87, 33, 96, 45, 76, 9, 60, 12, 87, 68};  // 3,1,4,5,2,7,9,8
		
		ArrayList<Integer> list = new ArrayList<>();
		
		int i = 0; // initialization while outer
		
		while(i < a.length) // condition
		{	
			int j = 0 ; // inner while
			int flag = 0;
//			while(j< list.size()) {
//				if(a[i] == list.get(j))
//				{
//					flag = 1;
//					break;
//				}
//				j+=1; // iterate
//			}
			if(list.contains(a[i])) {
				flag =1;
			}
			
			if(flag != 1) {
				list.add(a[i]);
			}
			
			i+=1; // iteration 
		}
		System.out.print("UNIQUE CONTENT : ");
		
		for(int u : list ) {
			System.out.print(u+" ");
		}
		
		System.out.println("\nSIZE : "+list.size());
	}
}
