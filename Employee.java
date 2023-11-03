package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



class Employee implements Comparable<Employee> {
	
	 private String name;
	    private int age;

	    public Employee(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    @Override
	    public int compareTo(Employee other) {
	       
	        return Integer.compare(this.age, other.age);
	    }

	    @Override
	    public String toString() {
	        return name + " (Age: " + age + ")";
	    }
	

	
	    public static void main(String[] args) {
	        List<Employee> employees = new ArrayList<>();
	        employees.add(new Employee("Alice", 25));
	        employees.add(new Employee("Bob", 30));
	        employees.add(new Employee("Charlie", 22));
	        employees.add(new Employee("David", 30));

	        System.out.println("Original List:");
	        for (Employee employee : employees) {
	            System.out.println(employee);
	        }

	        Collections.sort(employees);

	        System.out.println("\nSorted List by Age:");
	        for (Employee employee : employees) {
	            System.out.println(employee);
	        }
	    }
}

