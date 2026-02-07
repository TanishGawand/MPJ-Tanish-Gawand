package Employee;
class Employee {
    protected double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public void displaySalary() {
        System.out.println("Salary: " + salary);
    }
}

class FullTimeEmployee extends Employee {

    public FullTimeEmployee(double salary) {
        super(salary);
    }

    public void calculateSalary() {
        double newSalary = salary + (salary * 0.50);
        System.out.println("\nFull Time Employee");
        System.out.println("Before Hike: " + salary);
        System.out.println("After 50% Hike: " + newSalary);
    }
}

class InternEmployee extends Employee {

    public InternEmployee(double salary) {
        super(salary);
    }

    public void calculateSalary() {
        double newSalary = salary + (salary * 0.25);
        System.out.println("\nIntern Employee");
        System.out.println("Before Hike: " + salary);
        System.out.println("After 25% Hike: " + newSalary);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {

        FullTimeEmployee f = new FullTimeEmployee(50000);
        InternEmployee i = new InternEmployee(20000);

        f.calculateSalary();
        i.calculateSalary();
    }
}
