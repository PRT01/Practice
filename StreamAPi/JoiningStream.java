package collections.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningStream {
	
	public static void main(String[] args) {
		
	
	List<String> words = Arrays.asList("Hello", "Pratyush", "Ranjan", "Tripathi");
	String concatenated = words.stream()
	    .collect(Collectors.joining(" "));
	System.out.println("Concatenated: " + concatenated); 
	}
}
