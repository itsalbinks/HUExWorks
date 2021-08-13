package programs;

public class LCMofTwoNumbers {

	public static void findLCM(int a, int b) {
		
		//using the formula, LCM= a*b/GCD
		//GCD= Greatest common divisor
		if(a ==0 || b ==0) {
			System.out.println("LCM is 0");
		}else {
		
		int gcd=0;
		for(int i=1; i<=a; i++) {
			if(a%i==0 && b%i==0) {
				gcd=i;
			}
		}
		
		int LCM= a*b/gcd;
		System.out.println("LCM of the given numbers :" +LCM);
	
	}
	
	}
		
	public static void main(String[] args) {
		findLCM(50, 60);
		
	}

}
