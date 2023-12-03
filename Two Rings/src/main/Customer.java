/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author LENOVO ThinkPad
 */
public class Customer extends User implements Serializable {
    protected String username;
    protected String religion;
    protected Event myevent;
    protected MarriagePackage chosenMarriagePackage;

    public Customer(String username, String religion, Event myevent, MarriagePackage chosenMarriagePackage, String name, String gender, String email, String phoneNo, String password, LocalDate dateOfBirth) {
        super(name, gender, email, phoneNo, password, dateOfBirth);
        this.username = username;
        this.religion = religion;
        this.myevent = myevent;
        this.chosenMarriagePackage = chosenMarriagePackage;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public Event getMyevent() {
        return myevent;
    }

    public void setMyevent(Event myevent) {
        this.myevent = myevent;
    }

    public MarriagePackage getChosenMarriagePackage() {
        return chosenMarriagePackage;
    }

    public void setChosenMarriagePackage(MarriagePackage chosenMarriagePackage) {
        this.chosenMarriagePackage = chosenMarriagePackage;
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
        return "Customer{" + "username=" + username + ", religion=" + religion + ", myevent=" + myevent + ", chosenMarriagePackage=" + chosenMarriagePackage + '}';
    }
   
}
