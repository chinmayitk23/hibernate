package entity;

/**
 * The Employee class represents an employee entity with details
 * such as ID, first name, last name, and salary.
 */
public class Employee {
    
    // Unique identifier for the employee
    private int id;
    
    // First name of the employee
    private String firstName;
    
    // Last name of the employee
    private String lastName;
    
    // Salary of the employee
    private int salary;

    /**
     * Default constructor for Employee.
     * It initializes an empty Employee object.
     */
    public Employee() {}

    /**
     * Parameterized constructor to initialize an employee with first name, last name, and salary.
     * @param firstName The first name of the employee.
     * @param lastName The last name of the employee.
     * @param salary The salary of the employee.
     */
    public Employee(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    /**
     * Gets the employee ID.
     * @return The employee ID.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the employee ID.
     * @param id The unique ID to be assigned to the employee.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the first name of the employee.
     * @return The first name of the employee.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the employee.
     * @param firstName The first name to be assigned.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name of the employee.
     * @return The last name of the employee.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the employee.
     * @param lastName The last name to be assigned.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the salary of the employee.
     * @return The salary of the employee.
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Sets the salary of the employee.
     * @param salary The salary amount to be assigned.
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }
}