package collections.lambdaExpression;

import java.util.Arrays;
import java.util.List;

public class StringConversion {
	
	public static void main(String[] args) {
		
		List<String> str1=Arrays.asList("pratyush","ranjan","tripathi");
		
		System.out.println("Before in lower");
		for(String i:str1)
			System.out.println(i);
		
		str1.replaceAll(str->str.toUpperCase());
		
		System.out.println("After in upper");
		for(String i:str1)
			System.out.println(i);
		
		List<String> str2=Arrays.asList("VIRAT","PRATYUSH","Kohli");
		
		System.out.println("Before in upper");
		for(String i:str2)
			System.out.println(i);
		
		str2.replaceAll(str->str.toLowerCase());
		
		System.out.println("After in lowr");
		for(String i:str2)
			System.out.println(i);
		
	}

}
