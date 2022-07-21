package Array_part2;



public class LeadersInAnArray {

	static void Leaders(int[] arr) {
		
		int n =  arr.length;
		int curr;
		int j;
	
		for(int i=0; i<n; i++) {
			curr = arr[i];
			boolean check = true;
			for(j=i+1; j<n; j++) {
				if(arr[j]>curr)
					check = false; break;
			}
			if(check)
				System.out.print(" "+arr[i]);
		}
	}
	
	static void LeadersOtimize(int[] arr) {
		
		int n = arr.length;
		int largest = Integer.MIN_VALUE;
		int[] container = new int[n];
		int j=0;
		for(int i=n-1; i>=0; i--) {
			
			if(arr[i]>largest) {
				largest = arr[i];
				System.out.print(" "+largest);
				container[j++] = arr[i];
			}
		}
		
		for(j=j-1; j>=0; j--) {
			System.out.print(" "+container[j]);
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {2,7,6,1,4,3};
 		
		//Leaders(arr);
		
		LeadersOtimize(arr);
	}

}
