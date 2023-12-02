/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class Lawyer extends Employee{
    private int serviceCharge;
    private List<Object> customers;

    public Lawyer(int serviceCharge, List<Object> customers) {
        this.serviceCharge = serviceCharge;
        this.customers = customers;
    }

    public Lawyer(int serviceCharge, List<Object> customers, int employeeID, LocalDate joinDate, int salary, String designation, String name, String gender, String email, String phoneNo, String password, LocalDate dateOfBirth) {
        super(employeeID, joinDate, salary, designation, name, gender, email, phoneNo, password, dateOfBirth);
        this.serviceCharge = serviceCharge;
        this.customers = customers;
    }

    public int getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(int serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public List<Object> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Object> customers) {
        this.customers = customers;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Lawyer{" + "serviceCharge=" + serviceCharge + ", customers=" + customers + '}';
    }
    
    
    
    
    
}
