
public class SelectionSort {
	
	
	
	public static int[] sort(int[] arr) {
		int length = arr.length;
		int smallest;
		int temp;
		for(int i = 0; i < length; i++) {
			smallest = i;
			for (int j = i+1; j < length; j++) {
				if(arr[j] < arr[smallest]) smallest = j;
			}
			temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
		}
		
		return arr;
	}
}
