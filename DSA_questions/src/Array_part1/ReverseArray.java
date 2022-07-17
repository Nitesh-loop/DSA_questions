package Array_part1;

public class ReverseArray {
	
	public static int[] reverseArray (int[] a) {
		
		int n=a.length;
		int temp=0;
		int last = n-1;
		
		for(int i=0; i<n; i++) {
			temp = a[last];
			a[last] = a[i];
			a[i] = temp;
			last--;
		}
		
		for(int i=0; i<n; i++){
			System.out.print(a[i]+" ");
		}
		
		return a;
	}
	
	public static void main(String[] args) {
		int[] a = {2,8,9,10,11};
		
		reverseArray(a);
		System.out.println("");
		for(int ele : a) {
			System.out.print(ele+" ");
		}
	}

}
