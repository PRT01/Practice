package OOPs_Basic;


class Employee {
    private String name;
    private int employeeId;

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    void startWork() {
        System.out.println("The employee is starting work.");
    }

    void stopWork() {
        System.out.println("The employee is stopping work.");
    }
}

class Manager extends Employee {
    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    void conductMeeting() {
        System.out.println("Conducting a meeting.");
    }
}

public class EmployeeInheritanceExample {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setName("Pratyush Ranjan Tripathi");
        manager.setEmployeeId(12345);
        manager.setDepartment("HR");

        System.out.println("Name: " + manager.getName());
        System.out.println("Employee ID: " + manager.getEmployeeId());
        manager.startWork();
        manager.stopWork();

        System.out.println("Department: " + manager.getDepartment());
        manager.conductMeeting();
    }
}

