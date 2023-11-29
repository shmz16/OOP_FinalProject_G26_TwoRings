/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.time.LocalDate;

/**
 *
 * @author User
 */
public class AccountantSalariesTableClass {
    
    private int employeeID;
    private String employeeName;
    private String designation;
    private String salary;
    private LocalDate joinDate;

    public AccountantSalariesTableClass(int employeeID, String employeeName, String designation, String salary, LocalDate joinDate) {
        this.employeeName = employeeName;
        this.designation = designation;
        this.salary = salary;
        this.joinDate = joinDate;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    @Override
    public String toString() {
        return "AccountantSalariesTableClass{" + "employeeID=" + employeeID + ", employeeName=" + employeeName + ", designation=" + designation + ", salary=" + salary + ", joinDate=" + joinDate + '}';
    }
    
}
