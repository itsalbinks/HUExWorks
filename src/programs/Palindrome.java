package programs;

public abstract class Palindrome {

	
	public abstract void checkWhetherPalindorme(String givenString);
	
	
	public static void main(String[] args) {

		PalindromeOrNot obj= new PalindromeOrNot();
		obj.checkWhetherPalindorme("malayaddlam");
		
	}

}
