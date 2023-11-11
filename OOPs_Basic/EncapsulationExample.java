package OOPs_Basic;

class Employee1 {
    private String name;
    private int employeeId;
    private double salary;

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setSalary(double salary) {
       
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    void startWork() {
        System.out.println("The employee is starting work.");
    }

    void stopWork() {
        System.out.println("The employee is stopping work.");
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Employee1 employee = new Employee1();
        employee.setName("Pratyush Ranjan Tripathi");
        employee.setEmployeeId(12345);
        employee.setSalary(50000);

        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: $" + employee.getSalary());
        employee.startWork();
        employee.stopWork();

       
        employee.setSalary(-1000);
    }
}
