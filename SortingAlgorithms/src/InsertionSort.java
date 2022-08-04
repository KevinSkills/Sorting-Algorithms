
public class InsertionSort {

	
	
	public static int[] sort(int[] arr) {
		int n = arr.length;
		int pos;
		int temp;
		
		for(int i = 1; i < n; i++) {
			pos = i;
			while(arr[pos] < arr[pos-1] && pos>0) {
				temp = arr[pos];
				arr[pos] = arr[pos-1];
				arr[pos-1] = temp;
				pos--;
			}
		}
		return arr;
	}
}
