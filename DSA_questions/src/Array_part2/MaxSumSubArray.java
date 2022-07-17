package Array_part2;

public class MaxSumSubArray {
	
	static int maxSum(int[] arr) {
		
		int n = arr.length;
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		
		for(int i=0; i<n-1; i++) {
			currSum+=arr[i];
			if(currSum>maxSum) {
				maxSum = currSum;
			}
			if(currSum<0) {
				currSum=0;
			}
				
		}
		
		return maxSum;
	}

	public static void main(String[] args) {
	
		int[] arr = {6, -7, 4, -2, 1, 5, -4};
		
		System.out.println(maxSum(arr));
	}

}
