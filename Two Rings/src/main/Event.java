/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.time.LocalDate;

/**
 *
 * @author Lenovo
 */
public class Event {
    protected String username;
    protected LocalDate eventdate;
    protected String eventname;
    protected Venue venue;
    
    public Event(){
    
    

    
};

    public Event(String username, LocalDate eventdate, String eventname, Venue venue) {
        this.username = username;
        this.eventdate = eventdate;
        this.eventname = eventname;
        this.venue = venue;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDate getEventdate() {
        return eventdate;
    }

    public void setEventdate(LocalDate eventdate) {
        this.eventdate = eventdate;
    }

    public String getEventname() {
        return eventname;
    }

    public void setEventname(String eventname) {
        this.eventname = eventname;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    @Override
    public String toString() {
        return "Event{" + "username=" + username + ", eventdate=" + eventdate + ", eventname=" + eventname + ", venue=" + venue + '}';
    }
    
}
