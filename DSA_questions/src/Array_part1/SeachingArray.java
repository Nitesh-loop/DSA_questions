package Array_part1;

public class SeachingArray {
	
	public static int searchKey(int[] a, int key) {
		int i = 0;
		int n = a.length;
		for(; i<n; i++) {
			if(a[i] == key) {
				break;
			}
		}
		
		if(i == n) {
			System.out.println("Not Found!");
			return -1;
		} else {
			System.out.println("key is present at : "+(i+1));
			return 0;
		}
		
	}
		
	public static void main(String[] args) {
		
		int[] a = {2,4,5,6,7,8,9,10};
		int key = 7;
		searchKey(a, key);
	}
}
