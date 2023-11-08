package collections.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example_map_filter_sort {
	
	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<>();
		l.add(43);
		l.add(67);
		l.add(56);
		l.add(75);
		l.add(21);
		
		
		List<Integer> EveNumbers = l.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
		System.out.println(EveNumbers);
		
		int num=l.stream().filter(n->n==56).findFirst().get();
		System.out.println(num);
		
		List<Integer> square=l.stream().map(n->n*n).collect(Collectors.toList());
		System.out.println(square);
		
		List<Integer> Double=l.stream().map(n->n*2).collect(Collectors.toList());
		System.out.println(Double);
		
		
		List<String> l2=new ArrayList<>();
		l2.add("Pratyush");
		l2.add("virat");
		l2.add("Tripathi");
		l2.add("ARanjan");
		
		List<String> sortedName=l2.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedName);
		
		

	}

}
