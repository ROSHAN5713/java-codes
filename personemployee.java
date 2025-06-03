class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Employee extends Person {
    private String employeeId;
    private String jobTitle;

    public Employee(String firstName, String lastName, String employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    //Override
    public String getLastName() {
        return super.getLastName() + ", " + jobTitle;
    }
}

public class personemployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Dhruv", "Chhatriwala", "3510D", "CyberSecurity Engineer");
        System.out.print(emp.getFirstName());
        System.out.print(" " + emp.getLastName());
        System.out.print(", " + emp.getEmployeeId());
    }
}