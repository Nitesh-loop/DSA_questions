package Array_part1;

public class LargestElement {
	
	public static int largestElement(int[] a) {
		int max = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i] > a[max]) {
				max = i;
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		int[] a = {2,4,5,6,7,8,21,10};
		
		int index=largestElement(a);
		System.out.println(a[index]);

	}

}
