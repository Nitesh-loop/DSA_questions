package maths;

public class Mathematic {

	static void palindrome(int n) {
		
		int rev = 0;
		int check = n;
		while(n > 0) {
			int id = n % 10;
			rev = rev*10 + id;
			n = n/10;
		}
		if(rev == check) {
			System.out.println("yes it is");
		}else 
			System.out.println("noooooooo...");
		
//		System.out.println(rev);
	}
	
	static void gcd(int a, int b) {
		
	}
	
	public static void main(String[] args) {
		
		palindrome(1441);
	}

}
