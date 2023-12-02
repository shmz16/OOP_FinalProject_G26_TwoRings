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
public class User implements Serializable {
    
    protected String name;
    protected String gender;
    protected String email;
    protected String phoneNo;
    protected String password;
    protected LocalDate dateOfBirth;
    
    public User(){
    
    }

    public User(String name, String gender, String email, String phoneNo, String password, LocalDate dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.phoneNo = phoneNo;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
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
        return "User{" + "name=" + name + ", gender=" + gender + ", email=" + email + ", phoneNo=" + phoneNo + ", password=" + password + ", dateOfBirth=" + dateOfBirth + '}';
    }

}
