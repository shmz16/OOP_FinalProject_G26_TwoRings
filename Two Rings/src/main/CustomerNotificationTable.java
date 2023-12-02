/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.Serializable;

/**
 *
 * @author LENOVO ThinkPad
 */
public class CustomerNotificationTable implements Serializable{

    static void add(CustomerNotificationTable p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String notification;
    
    /**
     *
     * @param notification
     */
    

    public CustomerNotificationTable(String notification) {
        this.notification = notification;
    }

    public CustomerNotificationTable() {
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notificationCol) {
        this.notification = notification;
    }
    
}

    

