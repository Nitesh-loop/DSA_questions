package recursion;

public class part1 {
	
	static int power(int a, int b) {
		if(b==0)
			return 1;
		
		int m = power(a, b-1) * a;
		return m;
	}
	
	public static void main(String[] args) {
		System.out.println(power(5,3));
	}
}
