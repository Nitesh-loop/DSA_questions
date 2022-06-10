package Array_part1;

public class RemoveDuplicate {
	
	public static int removeDuplicate (int[] a) {
		
		int n=a.length;
		int j=0;
		for(int i=0; i<n-1; i++) {
			if(a[i] != a[i+1]) {
				a[j++] = a[i];
			}
		}
		a[j++] = a[n-1];
		return j;
	}
	
	public static void main(String[] args) {
		int[] a = {2,2,2,3,4,4,7};
		
		int index = removeDuplicate(a);

		for(int i=0; i<index; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
