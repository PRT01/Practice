package String;

public class StringBufferAndBuilder {
	
	public static void main(String[] args) {
		
	
	StringBuffer sb=new StringBuffer();
	sb.append("Pratyush ");
	sb.append("Ranjan");
	
	System.out.println(sb);
	sb.deleteCharAt(13);
	sb.insert(9, "Tripathi ");
	
	
	
	System.out.println(sb);
	
	

	StringBuilder sbl=new StringBuilder();
	sbl.append("Virat");
	sbl.append("kohli");
	
	sbl.insert(7,"Prem");
	
	System.out.println(sbl);
	
	}
}
