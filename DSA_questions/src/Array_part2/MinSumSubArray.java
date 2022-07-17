package Array_part2;

public class MinSumSubArray {

	static int minSum(int[] arr) {
		
		int currSum = 0;
		int minSum = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			currSum+=arr[i];
			if(currSum<minSum)
				minSum = currSum;
		}
		
		return minSum;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {6, -7, -4, -2, 1, 5, -4};
		
		System.out.println(minSum(arr));
	}

}
