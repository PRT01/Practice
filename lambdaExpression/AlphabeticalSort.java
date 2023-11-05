package collections.lambdaExpression;

import java.util.Arrays;
import java.util.List;

public class AlphabeticalSort {
	public static void main(String[] args) {
		
	
	List<String> colors = Arrays.asList("red", "green", "blue", "black", "pink");

    
    System.out.println("String before sorting:");
    for (String str : colors) {
        System.out.print(str + ' ');
    }

    
    colors.sort((str1, str2) -> str1.compareToIgnoreCase(str2));

    System.out.println();
    System.out.println("String After sorting:");
    for (String str : colors) {
        System.out.print(str + ' ');
    }
}

}
