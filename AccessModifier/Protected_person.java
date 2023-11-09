package AccessModifier;

public class Protected_person {
	
	   
	    protected String name;
	    protected int age;

	   
	    public Protected_person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    
	    protected void displayDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	}




