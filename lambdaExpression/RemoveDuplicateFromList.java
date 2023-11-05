package collections.lambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateFromList {
	
	public static void main(String[] args) {
		
		List<Integer> l=Arrays.asList(1,2,3,4,1,5,7);
		
		System.out.println("Old List:" + l);
		
		List <Integer> Distinct=new ArrayList<>();
		l.stream()
		.distinct()
		.forEach(Distinct::add);
		
		System.out.println("Distinct:"+ Distinct);
	}

}
