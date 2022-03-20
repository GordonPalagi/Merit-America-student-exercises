package com.techelevator;

public class Employee {

    private final int employeeId;
    private final String firstName;
    private String lastName;
    private double annualSalary;
    private String department;



    public Employee(int employeeId, String firstName, String lastName, double salary) {
        this.annualSalary = salary;
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void raiseSalary(double percent) {
        percent = (percent/100) * annualSalary;
        annualSalary += percent;
    }

    public String getFullName() {
        return lastName + ", " + firstName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
