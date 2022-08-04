
public class Main {

	public static void main(String[] args) {
		int[] hej = makeArr(500000);
		
		Tester.testAlg((int[] arr) -> SelectionSort.sort(arr), hej);
		Tester.testAlg((int[] arr) -> InsertionSort.sort(arr), hej);
		Tester.testAlg((int[] arr) -> BubbleSort.sort(arr), hej);
		
		
		}
	
	
	
	static int[] makeArr(int l) {
		int[] result = new int[l];
		
		for(int i = 0; i < l; i++) {
			result[i] = (int)(Math.random()*100000);
			
		}
			
		return result;
		
		
	}
	

}
