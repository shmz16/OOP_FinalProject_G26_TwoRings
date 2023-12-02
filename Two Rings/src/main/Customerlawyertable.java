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
public class Customerlawyertable implements Serializable{
    private String username;
    private String emailadd;
    private LocalDate eventdate;
    private Venue location;

    public Customerlawyertable(String username, String emailadd, LocalDate eventdate, Venue location) {
        this.username = username;
        this.emailadd = emailadd;
        this.eventdate = eventdate;
        this.location = location;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailadd() {
        return emailadd;
    }

    public void setEmailadd(String emailadd) {
        this.emailadd = emailadd;
    }

    public LocalDate getEventdate() {
        return eventdate;
    }

    public void setEventdate(LocalDate eventdate) {
        this.eventdate = eventdate;
    }

    public Venue getLocation() {
        return location;
    }

    public void setLocation(Venue location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Customerlawyertable{" + "username=" + username + ", emailadd=" + emailadd + ", eventdate=" + eventdate + ", location=" + location + '}';
    }
    
    
    
}
