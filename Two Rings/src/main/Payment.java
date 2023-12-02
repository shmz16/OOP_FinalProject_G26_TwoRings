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
public class Payment implements Serializable{
    
    private int transactionID;
    private int amount;
    private LocalDate paymentDate;

    public Payment(int transactionID, int amount) {
        this.transactionID = transactionID;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    @Override
    public String toString() {
        return "Payment{" + "transactionID=" + transactionID + ", amount=" + amount + ", paymentDate=" + paymentDate + '}';
    }
    
}
