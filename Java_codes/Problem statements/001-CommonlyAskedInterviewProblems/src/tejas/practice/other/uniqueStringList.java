package tejas.practice.other;

import java.util.ArrayList;

public class uniqueStringList {
	public static void main(String[] args) {
		String a[] = {"IN","USA","AUS","IN","ISR","GBR","USA"};  // 3,1,4,5,2,7,9,8
		
		ArrayList<String> list = new ArrayList<>();
		
		int i = 0; // initialization while outer
		
		while(i < a.length) // condition
		{	
//			int j = 0 ; // inner while
			int flag = 0;
			if(list.contains(a[i])) {
				flag =1;
			}
			
			if(flag != 1) {
				list.add(a[i]);
			}
			
			i+=1; // iteration 
		}
		System.out.print("UNIQUE CONTENT : ");
		
		for(String u : list ) {
			System.out.print(u+" ");
		}
		
		System.out.println("\nSIZE : "+list.size());
	}
}
