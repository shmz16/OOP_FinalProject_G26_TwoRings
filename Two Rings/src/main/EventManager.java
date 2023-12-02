/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.time.LocalDate;

/**
 *
 * @author Lenovo
 */
public class EventManager extends Employee {

    private String location;
    private int serviceCharge;

//    public EventManager() {
//
//    }
//
//    
//
//    public EventManager(String location) {
//        this.location = location;
//    }

    public EventManager(String location, int employeeID, LocalDate joinDate, int salary, String designation, String name, String gender, String email, String phoneNo, String password, LocalDate dateOfBirth) {
        super(employeeID, joinDate, salary, designation, name, gender, email, phoneNo, password, dateOfBirth);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EventManager{");
        sb.append("location=").append(location);
        sb.append('}');
        return sb.toString();
    }

}
