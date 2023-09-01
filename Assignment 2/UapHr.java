class Employee {
    private String name;
    private String id;
    private String designation;
    private double salary;

    public Employee(String name, String id, String designation, double salary) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
    }

    public void updateSalary(double newSal) {
        salary = newSal;
    }

    public double getSalary() {
        return salary;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}

class UapHr {
    public static void main(String[] args) {
        // Create an object of the Employee class
        Employee employee = new Employee("Afsana", "AS1235", "Manager", 5000.0);

        // Assign values to attributes
        employee.display();

        // Display the salary
        double initialSalary = employee.getSalary();
        System.out.println("Initial Salary: " + initialSalary);

        // Update the salary
        employee.updateSalary(5500.0);

        // Display employee information after salary update
        System.out.println("Employee information after salary update:");
        employee.display();
    }
}
