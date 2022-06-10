package Array_part1;

public class DeletingInArray {
	
	public static int deletingKey (int[] a, int key) {
		
		int i = 0;
		int n = a.length;
		for(; i<n; i++) {
			if(a[i] == key) {
				break;
			}
		}
		if(i == n) return n;
		
		for(int j=i; j<n-1; j++) {
			
			a[j] = a[j+1];
			
		}
		return n-1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,4,5,6,7,8,9,10};
		int key = 7;
		
		deletingKey(a, key);
		
		for(int ele : a) {
			System.out.print(ele+" ");
		}
		
		System.out.println(" ");
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		
	}

}
