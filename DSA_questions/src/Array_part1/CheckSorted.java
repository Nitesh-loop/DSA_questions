package Array_part1;

public class CheckSorted {

	public static void checkSorted(int[] a) {
		
		int temp = 0;
		int check = 1;
		for(int i=1; i<a.length; i++) {
			if(a[i] > a[temp]) {
				check++;
				temp++;
			}
		}
		
		if(check == a.length) {
			System.out.println("sorted");
		}else
			System.out.println("unsorted");
		
	}
	
	public static void main(String[] args) {
		//int[] a = {2,8,9,10,4,5};
		int[] a = {2,4,5,8,9,10};
		checkSorted(a);
	}

}
