package Array_part3;

import java.util.HashSet;
import java.util.Set;

public class PrefixSum {

	static boolean subArrayWithZeroSum(int[] arr) {
		
		Set<Integer> set = new HashSet<>();
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
			if(set.contains(sum)) {
				return true;
			}
			set.add(sum);
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {2, 3, 1, -4, 3, -2};
		System.out.println(subArrayWithZeroSum(arr));

	}

}
