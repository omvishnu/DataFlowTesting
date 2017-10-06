import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void testRacecar() {
		Palindrome p = new Palindrome();
		assertEquals(true,p.isPalindrome("racecar"));
	}

	@Test
	public void testTacocat() {
		Palindrome p = new Palindrome();
		assertEquals(true,p.isPalindrome("tacocat"));
	}
	
	@Test
	public void testDog() {
		Palindrome p = new Palindrome();
		assertEquals(false,p.isPalindrome("dog"));
	}
	
	@Test
	public void testAbba() {
		Palindrome p = new Palindrome();
		assertEquals(true,p.isPalindrome("abba"));
	}
	
	@Test
	public void testFalse() {
		Palindrome p = new Palindrome();
		assertEquals(false, p.isPalindrome("false"));
	}
}
