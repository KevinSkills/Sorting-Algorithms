
public class BubbleSort {
	
	
	public static int[] sort(int[] arr) {
		int n = arr.length;
		int temp;
		for(int i = 0; i < n-1; i++) {
			for(int j = 1; j < n-i; j++) {
				if(arr[j-1] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		return arr;
	}
	
}
