package demoAccessModifier;
import AccessModifier.*;

class protected_child extends Protected_Practice{
	//protected ko outside pacakge access krr sakte hai but in sub class
	public void print()
	{
		System.out.println("Name:"+ name + "Age:" +age);
	}
	
}

public class protect  {
	 
	public static void main(String[] args) {
		
		protected_child p=new protected_child ();
		
		
		p.print();
		
	}

}
