package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person1 {
    private String name;
    private int age;

    public Person1(String name, int age) {
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
    public String toString() {
        return "Person1 [name=" + name + ", age=" + age + "]";
    }



    public static void main(String[] args) {
        List<Person1> people = new ArrayList<>();
        people.add(new Person1("me", 30));
        people.add(new Person1("pratyush", 25));
        people.add(new Person1("vashu", 35));
        people.add(new Person1("Pratyush", 28));

        System.out.println("Before sorting:");
        for (Person1 person : people) {
            System.out.println(person);
        }

        
        Comparator<Person1> ageComparator = new Comparator<Person1>() {
            @Override
            public int compare(Person1 person1, Person1 person2) {
                return Integer.compare(person2.getAge(), person1.getAge());
            }
        };

       
        Collections.sort(people, ageComparator);

        System.out.println("Decending");
        for (Person1 person : people) {
            System.out.println(person);
        }
    }
    }
