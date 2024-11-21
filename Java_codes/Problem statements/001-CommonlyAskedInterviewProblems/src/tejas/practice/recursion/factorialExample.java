package tejas.practice.recursion;

public class factorialExample {

	public static void main(String[] args) {
		System.out.println("START : ");
		
		System.out.println("factorial : "+factorial(4));  // 4! = 4 *3*2*1
		System.out.println("END : ");
	}
	
	public static int factorial(int data) {
		if(data == 0 || data == 1)
			return 1;
		return data * factorial(data-1);
	}
}
