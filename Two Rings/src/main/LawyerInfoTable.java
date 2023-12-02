/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.Serializable;
import java.time.LocalDate;
import javafx.collections.ObservableList;

/**
 *
 * @author LENOVO ThinkPad
 */
public class LawyerInfoTable implements Serializable{

    static void setItems(ObservableList<LawyerInfoTable> lawyerinfoarr) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    protected String userNamecol;
    protected String lawyerIDcol;
    protected String eventdatecol;

    /**
     *
     */
    protected LocalDate locationcol;

    public LawyerInfoTable(String userNamecol, String lawyerIDcol, String eventdatecol, LocalDate locationcol) {
        this.userNamecol = userNamecol;
        this.lawyerIDcol = lawyerIDcol;
        this.eventdatecol = eventdatecol;
        this.locationcol = locationcol;
    }

    public String getUserNamecol() {
        return userNamecol;
    }

    public void setUserNamecol(String userNamecol) {
        this.userNamecol = userNamecol;
    }

    public String getLawyerIDcol() {
        return lawyerIDcol;
    }

    public void setLawyerIDcol(String lawyerIDcol) {
        this.lawyerIDcol = lawyerIDcol;
    }

    public String getEventdatecol() {
        return eventdatecol;
    }

    public void setEventdatecol(String eventdatecol) {
        this.eventdatecol = eventdatecol;
    }

    public LocalDate getLocationcol() {
        return locationcol;
    }

    public void setLocationcol(LocalDate locationcol) {
        this.locationcol = locationcol;
    }

    @Override
    public String toString() {
        return "LawyerInfoTable{" + "userNamecol=" + userNamecol + ", lawyerIDcol=" + lawyerIDcol + ", eventdatecol=" + eventdatecol + ", locationcol=" + locationcol + '}';
    }

   
}
