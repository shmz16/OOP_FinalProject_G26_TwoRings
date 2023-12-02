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
public class Customertable implements Serializable{
    private String EventNameColumn;
    private String usernameColumn;
    private Venue locationTable;
    private LocalDate EventdateColumn;
    

    public Customertable(String EventNameColumn, String usernameColumn, Venue locationTable, LocalDate EventdateColumn) {
        this.EventNameColumn = EventNameColumn;
        this.usernameColumn = usernameColumn;
        this.locationTable = locationTable;
        this.EventdateColumn = EventdateColumn;
        
    }

    public String getEventNameColumn() {
        return EventNameColumn;
    }

    public void setEventNameColumn(String EventNameColumn) {
        this.EventNameColumn = EventNameColumn;
    }

    public String getUsernameColumn() {
        return usernameColumn;
    }

    public void setUsernameColumn(String usernameColumn) {
        this.usernameColumn = usernameColumn;
    }

    public Venue getLocationTable() {
        return locationTable;
    }

    public void setLocationTable(Venue locationTable) {
        this.locationTable = locationTable;
    }

    public LocalDate getEventdateColumn() {
        return EventdateColumn;
    }

    public void setEventdateColumn(LocalDate EventdateColumn) {
        this.EventdateColumn = EventdateColumn;
    }

    @Override
    public String toString() {
        return "Customertable{" + "EventNameColumn=" + EventNameColumn + ", usernameColumn=" + usernameColumn + ", locationTable=" + locationTable + ", EventdateColumn=" + EventdateColumn + '}';
    }

    

    

  
    
    
    
}
