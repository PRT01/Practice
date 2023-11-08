package collections.StreamApi;

import java.util.Arrays;
import java.util.List;

public class CountStartWIth {
	
	public static void main(String[] args) {
		
	
	
	List<String> st=Arrays.asList("Pratyush","Ranjan","Tripathi","Pappu","Pradeep");
	
	long count=st.stream().filter(s->s.startsWith("P")).count();
	
	System.out.print(count);
	
	}
}
