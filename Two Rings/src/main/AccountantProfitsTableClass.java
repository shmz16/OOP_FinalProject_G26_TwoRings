/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Lenovo
 */
public class AccountantProfitsTableClass implements Serializable{
    
    private String customerName;
    private int chosenPackageID;
    private LocalDate paymentDate;
    private int paymentAmount;

    public AccountantProfitsTableClass(String customerName, int chosenPackageID, LocalDate paymentDate, int paymentAmount) {
        this.customerName = customerName;
        this.chosenPackageID = chosenPackageID;
        this.paymentDate = paymentDate;
        this.paymentAmount = paymentAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getChosenPackageID() {
        return chosenPackageID;
    }

    public void setChosenPackageID(int chosenPackageID) {
        this.chosenPackageID = chosenPackageID;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public int getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(int paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    @Override
    public String toString() {
        return "AccountantProfitsTableClass{" + "customerName=" + customerName + ", chosenPackageID=" + chosenPackageID + ", paymentDate=" + paymentDate + ", paymentAmount=" + paymentAmount + '}';
    }
    
}
