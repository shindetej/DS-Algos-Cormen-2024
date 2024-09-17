package tejas.practice.other;

public class reverseStringImpl {

	public static void main(String[] args) {
		String s = "TRUBuy";
		System.out.println("STRING TO REVERSE :" + s);
		System.out.println("-------------  ------------" );
		reverseString(s);
	}

	public static void reverseString(String s) {
		char[] charArray = s.toCharArray();
		int i = 0;
		int j = charArray.length - 1;
		while (i < j) {
			char temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
			// move towards center
			i++;
			j--;
		}
		s = new String(charArray);
		System.out.println("REVERSED STRING : " + s);
	}

}
