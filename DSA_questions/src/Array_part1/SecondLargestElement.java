package Array_part1;

public class SecondLargestElement {
	
	public static int secondLargestEle (int[] a) {
		
		int largest = 0;
		int secondLargest = -1;
		
		if(a.length < 2) return -1;
		
		for(int i=1; i<a.length; i++) {
			if(a[i]>a[largest]) {
				secondLargest = largest;
				largest = i;
			} else if(a[i]<a[largest]) {
				if(secondLargest == -1 || a[i]>a[secondLargest]) {
					secondLargest = i;
				}
				
			}
		}
		
		return secondLargest;
	}
	
	public static void main(String[] args) {
		
		int[] a = {9,4,5,6,7,15};
		int index = secondLargestEle(a);
		System.out.println(a[index]);
	}

}
