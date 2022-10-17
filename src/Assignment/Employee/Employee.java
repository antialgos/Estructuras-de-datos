package Assignment.Employee;

public class Employee implements Comparable<Employee> {
    public int employeeNumber,emailId;
    public String firstName,lastName;
    
    public Employee(int employeeNumber, int emailId, String firstName, String lastName) {
        this.employeeNumber = employeeNumber;
        this.emailId = emailId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Employee o) {
        if (this.employeeNumber > o.employeeNumber) return 1;
        if (this.employeeNumber == o.employeeNumber) return 0;
        return -1;
    }

    @Override
    public String toString() {
        return  this.employeeNumber + " " + this.firstName + " " + this.lastName + " " + this.emailId;
    }

}
