/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.Serializable;

/**
 *
 * @author acer
 */
public class Tax implements Serializable{
    float income,taxPercentage;

    public Tax(float income, float taxPercentage) {
        this.income = income;
        this.taxPercentage = taxPercentage;
    }

    public float getIncome() {
        return income;
    }

    public void setIncome(float income) {
        this.income = income;
    }

    public float getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(float taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    @Override
    public String toString() {
        return "Tax{" + "income=" + income + ", taxPercentage=" + taxPercentage + '}';
    }
    
    
//    public float calCulateTax(float income,float taxPerCentage){
//        float tax = income*(taxPerCentageax/100);
//        return;
//    }
    
    
}
