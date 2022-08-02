package Array_part3;

public class SearchAnElementInSortedMatrix {

	static void bruteForceSearch(int[][] arr, int key) {
		int n = arr.length;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				if(key == arr[i][j]) {
					System.out.println("found");
				}
			}
		}
	}
	
	static boolean searchInMatrix(int[][] arr, int key) {
		int row = 0;
		int col = arr.length-1;
		while(row < arr.length && col >= 0) {
			if(key == arr[row][col]) {
				return true;
			} else if(key > arr[row][col]) {
				row++;
			} else {
				col--;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {

		int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		//bruteForceSearch(arr, 1);
		System.out.println(searchInMatrix(arr, 9));

	}

}
