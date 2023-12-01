/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.Serializable;

/**
 *
 * @author Lenovo
 */
public class Customertable implements Serializable{
    private String EventNameColumn;
    private String usernameColumn;
    private String locationTable;
    private String EventdateColumn;
    private String commentcolumn;

    public Customertable(String EventNameColumn, String usernameColumn, String locationTable, String EventdateColumn, String commentcolumn) {
        this.EventNameColumn = EventNameColumn;
        this.usernameColumn = usernameColumn;
        this.locationTable = locationTable;
        this.EventdateColumn = EventdateColumn;
        this.commentcolumn = commentcolumn;
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

    public String getLocationTable() {
        return locationTable;
    }

    public void setLocationTable(String locationTable) {
        this.locationTable = locationTable;
    }

    public String getEventdateColumn() {
        return EventdateColumn;
    }

    public void setEventdateColumn(String EventdateColumn) {
        this.EventdateColumn = EventdateColumn;
    }

    public String getCommentcolumn() {
        return commentcolumn;
    }

    public void setCommentcolumn(String commentcolumn) {
        this.commentcolumn = commentcolumn;
    }

    @Override
    public String toString() {
        return "Customertable{" + "EventNameColumn=" + EventNameColumn + ", usernameColumn=" + usernameColumn + ", locationTable=" + locationTable + ", EventdateColumn=" + EventdateColumn + ", commentcolumn=" + commentcolumn + '}';
    }
    
    
    
    
}
