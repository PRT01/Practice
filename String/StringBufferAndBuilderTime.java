package String;

public class StringBufferAndBuilderTime {
	
	//StringBuilder is more effiecient as it takes less time to perform the same task also
	//StringBuilder is Non-synchronised in nature.
	
	    public static void main(String[] args){  
	        long startTime = System.currentTimeMillis();  
	        StringBuffer sb = new StringBuffer("Pratyush");  
	        for (int i=0; i<100000; i++){  
	            sb.append("Ranjan");  
	        }  
	        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
	        startTime = System.currentTimeMillis();  
	        StringBuilder sb2 = new StringBuilder("Pratyush");  
	        for (int i=0; i<100000; i++){  
	            sb2.append("Tripathi");  
	        }  
	        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
	    }  
	}  


