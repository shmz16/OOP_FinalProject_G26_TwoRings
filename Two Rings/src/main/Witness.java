/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author acer
 */
public class Witness {
    
    String firstName;
    String lastName;
    LocalDate dateOfBirth;
    String gender;
    String nidNo;
    String maritalStatus;
    String witnessFor;
    String cName;
    String cId;
    String password;
    String country;
    
    
    String address;
    
    String contactNumber;
    String email;

    public Witness(String firstName, String lastName, LocalDate dateOfBirth, String gender, String nidNo, String witnessFor, String cName, String cId, String password, String country, String address, String contactNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.nidNo = nidNo;
        this.witnessFor = witnessFor;
        this.cName = cName;
        this.cId = cId;
        this.password = password;
        this.country = country;
        this.address = address;
        this.contactNumber = contactNumber;
        this.email = email;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNidNo() {
        return nidNo;
    }

    public void setNidNo(String nidNo) {
        this.nidNo = nidNo;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getWitnessFor() {
        return witnessFor;
    }

    public void setWitnessFor(String witnessFor) {
        this.witnessFor = witnessFor;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Witness{" + "firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", nidNo=" + nidNo + ", maritalStatus=" + maritalStatus + ", witnessFor=" + witnessFor + ", cName=" + cName + ", cId=" + cId + ", password=" + password + ", country=" + country + ", address=" + address + ", contactNumber=" + contactNumber + ", email=" + email + '}';
    }


    
    
    
    
    
    
    
    
}
