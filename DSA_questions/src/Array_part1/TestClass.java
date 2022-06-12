package Array_part1;

public class TestClass {

	public static void main(String[] args) {
		
		int[] a = {2,2,2,6,5,8};
		
		int n = a.length;
		
		int j = 0;
		
		for(int i = 0; i < n-1; i++) {
			
			if(a[i] != a[i+1]) {
				System.out.println("");
				System.out.println(i);
				System.out.println("");
				System.out.println(a[i]);
				System.out.println("");
				
				break;
			}else 
				System.out.println(i+" not found ");
			//j++;
		}
		

	}

}
