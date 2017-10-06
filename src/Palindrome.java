public class Palindrome {
	
	public boolean isPalindrome(String s) {
		int tail = s.length()-1;		
		for (int head = 0; head < (s.length()-1)/2; head++) {
			char front = s.charAt(head);
			char back = s.charAt(tail--);
			if(front != back) {
				return false;
			}
		}
		return true;
	}

}
