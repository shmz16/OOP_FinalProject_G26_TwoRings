/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class AccountantServiceChargesTableClass implements Serializable{
    
    private int employeeID;
    private String empName;
    private String designation;
    private int serviceCharge;

    public AccountantServiceChargesTableClass(int employeeID, String empName, String designation, int serviceCharge) {
        this.employeeID = employeeID;
        this.empName = empName;
        this.designation = designation;
        this.serviceCharge = serviceCharge;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(int serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    @Override
    public String toString() {
        return "AccountantServiceChargesTableClass{" + "employeeID=" + employeeID + ", empName=" + empName + ", designation=" + designation + ", serviceCharge=" + serviceCharge + '}';
    }
    
}
