package programs;

public class PalindromeOrNot {

	public static void checkWhetherPalindorme(String givenString) {
		
		int len= givenString.length();
		String reverse= "";
		int swapCounter=0;
		
		for(int i= len-1; i>=0; i--) {
			reverse= reverse+givenString.charAt(i);
			swapCounter++;
		}
		
		if(reverse.equals(givenString)) {
			System.out.println("it's palindrome");
			System.out.println("Required swaps: " +swapCounter);		
		}else {
			System.out.println("it's not palindrome");
		}
		
	}
	

	public static void main(String[] args) {
		
		checkWhetherPalindorme("malayalam");
	}

}
