package sortingAlgo;

public class SortingPart1 {

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static void bubbleSort(int[] arr) {
		
		int n = arr.length-1;
		
		for(int i = 0; i<n; i++) {
			boolean isSwapped = false;
			for(int j = 0; j<n-i; j++) {
				if(arr[j] > arr[j+1]) {
					isSwapped = true;
					swap(arr, j, j+1);
				}
			}
			
			if(!isSwapped) break;
		}
		
	}
	
	static void instertionSort(int[] arr) {
		
		for(int i = 1; i<arr.length; i++) {
			int j = i-1;
			int temp = arr[i];
			for(; j>=0; j--) {
				if(temp < arr[j]) {
					arr[j+1] = arr[j];
				} else {
					break;
				}
			}
			arr[j+1] = temp;
			printArray(arr);
		}
		
	}
	
	static void selectionSort(int[] arr) {
		for(int i = 0; i<arr.length-1; i++) {
			int min = i;
			for(int j = i+1; j<arr.length; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			swap(arr, min, i);
		}
	}
	
	static void printArray(int[] arr) {
		
		System.out.println();
		
		for(int e : arr) {
			System.out.print(e+" ");
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int[] arr = {9, 5, 2, 6, 3, 1, 3};
		
		printArray(arr);
		
		System.out.println();
		
//		bubbleSort(arr);
//		instertionSort(arr);
		selectionSort(arr);
		
		printArray(arr);

	}

}
