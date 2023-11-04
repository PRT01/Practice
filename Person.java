package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person   {
	 
	private String PName;
	private int pAge;
	
	public Person(String string, int i) {
		this.PName=string;
		this.pAge=i;
	}
	public String getPName() {
		return PName;
	}
	public void setPName(String pName) {
		PName = pName;
	}
	public int getpAge() {
		return pAge;
	}
	public void setpAge(int pAge) {
		this.pAge = pAge;
	}
	
	
	
	@Override
	public String toString() {
		return "Person [PName=" + PName + ", pAge=" + pAge + "]";
	}
	
	public static void main(String []args) {
		List<Person> person=new ArrayList<>();
		person.add(new Person("Pratyush",27));
		person.add(new Person("Virat",35));
		person.add(new Person("Pratyush",24));
		person.add(new Person("Virat",31));
		
		System.out.println("Before:" + person);
		
		Collections.sort(person, Comparator.comparing(Person::getPName).thenComparing(Person::getpAge));

		System.out.println("After:"+person);
	}
	
	 

}
