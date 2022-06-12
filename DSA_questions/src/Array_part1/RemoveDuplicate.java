package Array_part1;

public class RemoveDuplicate {
	
	public static int removeDuplicate (int[] a) {
		//{0,(1),2,(3),(4),5,6}
		//{2,(2),4,(4),(5),8,8};
		int n=a.length;
		int j=0;
		int i;
		for( i=0; i<n-1; i++) {
			if(a[i] != a[i+1]) {
				a[j++] = a[i];
				
			}
		}
		a[j++] = a[n-1];
		return j;
	}
	
	public static void main(String[] args) {
		int[] a = {2,2,4,4,5,8,8};
		//int[] a = {2,2,3,4,4};
		int index = removeDuplicate(a);
		System.out.println(index);
		for(int i=0; i<index; i++) {
			
			System.out.print(a[i]+" ");
		}
		
	}

}
