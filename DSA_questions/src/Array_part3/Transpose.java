package Array_part3;

public class Transpose {
	
	static void transposeOfMatrix(int[][] arr) {
		int n = arr.length;
		for(int i = 0; i<n; i++) {
			for(int j = i; j<n; j++) {
				int swap = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = swap;
			}
		}
	}
	
	static void printMatrix(int[][] arr) {
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] arg) {
		int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		printMatrix(arr);
		
		transposeOfMatrix(arr);
		System.out.println();
		printMatrix(arr);
	}
}
