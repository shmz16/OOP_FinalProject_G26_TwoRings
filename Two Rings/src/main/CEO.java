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
public class CEO implements Serializable{
    
    final String Name = "Md. Tamim";
    final String ceoPass = "12345";
    final int id = 55555;
    
    String massage;
    Meeting date;

    public CEO() {
    }
    
    public String getName() {
        return Name;
    }

    public String getCeoPass() {
        return ceoPass;
    }

    public int getId() {
        return id;
    }
    
    public CEO(String massage, Meeting date) {
        this.massage = massage;
        this.date = date;
    }

    public CEO(String massage) {
        this.massage = massage;
    }
    
    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public Meeting getDate() {
        return date;
    }

    public void setDate(Meeting date) {
        this.date = date;
    }
    
    public String givePass(){
        
        return ceoPass;
        
    }
    public String toMassage(){
        
        return massage;
        
    }

    @Override
    public String toString() {
        return "CEO{" + "Name=" + Name + ", ceoPass=" + ceoPass + ", massage=" + massage + ", date=" + date + '}';
    }
    
    
    
}
