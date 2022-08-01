package Array_part3;

public class Rotate90Degree {

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
	
	static void rotate90degree(int[][] arr) {
		int n = arr.length;
		transposeOfMatrix(arr);
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n/2; j++) {
				int swap = arr[i][j];
				arr[i][j] = arr[i][n-j-1];
				arr[i][n-j-1] = swap;
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
	
	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3,8}, {4,5,6,5}, {7,8,9,6}, {4,6,7,8}};
		
		printMatrix(arr);
		System.out.println();
		rotate90degree(arr);
		printMatrix(arr);
	}

}
