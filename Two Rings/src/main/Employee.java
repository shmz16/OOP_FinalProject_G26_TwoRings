/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author User
 */
public class Employee extends User implements Serializable {

    int employeeID;
    LocalDate joinDate;
    int salary;
    String designation;
    float ratings;

//    Turjo added ratings

    public Employee(int employeeID, LocalDate joinDate, int salary, String designation, float ratings, String name, String gender, String email, String phoneNo, String password, LocalDate dateOfBirth) {
        super(name, gender, email, phoneNo, password, dateOfBirth);
        this.employeeID = employeeID;
        this.joinDate = joinDate;
        this.salary = salary;
        this.designation = designation;
        this.ratings = ratings;
    }

    public float getRatings() {
        return ratings;
    }

    public void setRatings(float ratings) {
        this.ratings = ratings;
    }
    

    public Employee(int employeeID, LocalDate joinDate, int salary, String designation, String name, String gender, String email, String phoneNo, String password, LocalDate dateOfBirth) {
        super(name, gender, email, phoneNo, password, dateOfBirth);
        this.employeeID = employeeID;
        this.joinDate = joinDate;
        this.salary = salary;
        this.designation = designation;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeID=" + employeeID + ", joinDate=" + joinDate + ", salary=" + salary + ", designation=" + designation + ", ratings=" + ratings + '}';
    }

    

}
