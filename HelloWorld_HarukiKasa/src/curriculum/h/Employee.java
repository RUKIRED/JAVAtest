package curriculum.h;

public abstract class Employee {
    protected String employeeId;
    protected String name;

    // Constructor
    public Employee(String id, String name) {
        this.employeeId = id;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    // Abstract method to be implemented by subclasses
    public abstract int calculateDailyWage(int hoursWorked);
}