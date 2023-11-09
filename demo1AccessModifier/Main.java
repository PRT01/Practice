package demo1AccessModifier;

import demoAccessModifier.Protected_Person1;

public class Main {
	
	public static void main(String[] args) {
		
		Protected_Person1 pp=new Protected_Person1("Pratyush",23);
		pp.accessDetails();
	}

}
