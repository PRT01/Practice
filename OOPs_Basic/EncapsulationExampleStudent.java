package OOPs_Basic;

class Student {
    private String name;
    private int studentId;
    private int age;

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setAge(int age) {
            this.age = age;
    }

    void attendClass() {
        System.out.println("The student is attending class.");
    }

    void study() {
        System.out.println("The student is studying.");
    }
}

public class EncapsulationExampleStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Pratyush Ranjan Tripathi");
        student.setStudentId(123456);
        student.setAge(20);

        System.out.println("Name: " + student.getName());
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Age: " + student.getAge());
        student.attendClass();
        student.study();

       
    }
}

