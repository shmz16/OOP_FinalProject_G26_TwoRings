/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author acer
 */
public class MyEmployee implements Serializable{
    String name;
    int id,salary;
    LocalDate dateOfBirth,dateOfjoining;
    String phoneNo;
    String email,password,gender,designation;
    float ratings;

    public MyEmployee(String name, int id, int salary, LocalDate dateOfBirth, LocalDate dateOfjoining, String phoneNo, String email, String password, String gender, String designation) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
        this.dateOfjoining = dateOfjoining;
        this.phoneNo = phoneNo;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.designation = designation;
    }

    public MyEmployee(String name, int id, int salary, LocalDate dateOfBirth, LocalDate dateOfjoining, String phoneNo, String email, String password, String gender, String designation, float ratings) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
        this.dateOfjoining = dateOfjoining;
        this.phoneNo = phoneNo;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.designation = designation;
        this.ratings = ratings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfjoining() {
        return dateOfjoining;
    }

    public void setDateOfjoining(LocalDate dateOfjoining) {
        this.dateOfjoining = dateOfjoining;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getRatings() {
        return ratings;
    }

    public void setRatings(float ratings) {
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "MyEmployee{" + "name=" + name + ", id=" + id + ", salary=" + salary + ", dateOfBirth=" + dateOfBirth + ", dateOfjoining=" + dateOfjoining + ", phoneNo=" + phoneNo + ", email=" + email + ", password=" + password + ", gender=" + gender + ", designation=" + designation + ", ratings=" + ratings + '}';
    }
    
    
    
    
    
    
    
    
    
}
