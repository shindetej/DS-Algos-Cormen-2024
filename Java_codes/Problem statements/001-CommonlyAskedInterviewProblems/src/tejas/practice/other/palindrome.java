package tejas.practice.other;

public class palindrome {
	
	public static void main(String[] args) {
		String s = "RAdar";
		System.out.println("STRING TO CHECK PALINDROME :" + s);
		System.out.println("-------------  ------------" );
		System.out.println(isPalindrome(s)?"String "+s+" is palindrome":"String "+s+" is not a palindrome") ;
	}
	
	public static boolean isPalindrome(String s) {
		s= s.toLowerCase();
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if(s.charAt(i) != s.charAt(j))
				return false;
			// move towards center
			i++;
			j--;
		}
		return true;
	}
//	public static boolean isPalindrome(String s) {
//		char[] charArray = s.toCharArray();
//		int i = 0;
//		int j = charArray.length - 1;
//		while (i < j) {
//			if(charArray[i] != charArray[j])
//				return false;
//			// move towards center
//			i++;
//			j--;
//		}
//		return true;
//	}
}