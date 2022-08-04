
public class Tester {
	
	
	
	
	public static void testAlg(Sorter sorter, int[] arr) {
		double nano = System.nanoTime();
		//printArray(arr);
		sorter.sort(arr);
		//printArray(arr);
		System.out.println(System.nanoTime() - nano);
		
	}
	
	static void printArray(int[] arr) {
		System.out.print("Array: {");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i != arr.length-1) System.out.print(", ");
			else System.out.print("}");
		}
		System.out.println("");
	}

}

@FunctionalInterface
interface Sorter {
	int[] sort(int[] arr);
}
