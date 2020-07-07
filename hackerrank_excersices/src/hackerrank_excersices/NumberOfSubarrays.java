package hackerrank_excersices;

public class NumberOfSubarrays {

	public static void main(String[] args) {
		
		int [] array = {1,2,3,4};
	
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				for (int k = i; k <= j; k++) {
					System.out.println(array[k] + " ");
				}
			}
		}
	}
	
}
