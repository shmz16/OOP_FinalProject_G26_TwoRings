/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.time.LocalDate;

/**
 *
 * @author LENOVO ThinkPad
 */
public class CustomerLawyerModel {
    protected String username;
    protected String email;
    protected LocalDate eventdate;
    protected Venue venue;

    public CustomerLawyerModel(String username, String email, LocalDate eventdate, Venue venue) {
        this.username = username;
        this.email = email;
        this.eventdate = eventdate;
        this.venue = venue;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getEventdate() {
        return eventdate;
    }

    public void setEventdate(LocalDate eventdate) {
        this.eventdate = eventdate;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    @Override
    public String toString() {
        return "CustomerLawyerModel{" + "username=" + username + ", email=" + email + ", eventdate=" + eventdate + ", venue=" + venue + '}';
    }

    
    
}
