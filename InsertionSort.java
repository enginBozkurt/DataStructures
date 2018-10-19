package structs;

public class InsertionSort {
	
	public static void insertionSort(int[] list) {
		
		for(int i=1; i < list.length; i++) {
			/**Insert list[i] into a sorted sublist list[0..i-1] so that
			list[0..i] is sorted. */
			
			int currentElement = list[i];
			int k;
			
			for(k=i-1; k>=0 && list[k] > currentElement ; k--) {
				list[k+1] = list[k];
			}
			// Insert the current element into list[k + 1]
			list[k+1] = currentElement;
			
		}

	}
	
	public static void main(String args[]) { 
		
		int[] testList = new int[]{6 , 5, 1, 7, 4, 3, 36, 25};
		
		insertionSort(testList);
		
		for (int i = 0; i < testList.length; i++) {
			System.out.print(testList[i] + " ");
		}
		
	}
		
}
