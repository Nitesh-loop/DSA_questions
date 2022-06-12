package Array_part1;

public class SmallestEle {

	public static int smallestEle(int[] a) {
		int min=0;
		
		for(int i=1; i<a.length; i++) {
			if(a[i] < a[min]) {
				min = a[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		int[] a = {4,7,10,2,3};
		
		int index = smallestEle(a);
		System.out.print(a[index]);
	}

}
