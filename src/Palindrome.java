
public class Palindrome {
	
	public boolean isPalindrome(String s) {
		StringBuilder reverseString = new StringBuilder();
		for(int tail = s.length()-1; tail >= 0; tail-- ) {
			reverseString.append(s.charAt(tail));
		}
		String reverse = reverseString.toString();
		if(s.equals(reverse)) {
			return true;
		}
		return false;
	}
	
	

}
