package hackerrank_excersices;

import java.util.Collections;
import java.util.Vector;

public class LexicographicalOrder {
	
	
	public static void main(String[] args) {
		String s= "welcometojava";
		int k = 3; //length lexicographical substring
		
		Vector<String> lexiStrings = new Vector<String>(); 
		for (int i = 0; i <= s.length()-k; i++) {
			lexiStrings.add(s.substring(i,k+i)) ;
		}
	
		Collections.sort(lexiStrings);
		System.out.println(lexiStrings.get(0));
		System.out.println(lexiStrings.get(lexiStrings.size()-1));
		
		
		
		
	}
}
