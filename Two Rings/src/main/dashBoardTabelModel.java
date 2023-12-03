/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.Serializable;
import javafx.collections.ObservableList;

/**
 *
 * @author LENOVO ThinkPad
 */
public class dashBoardTabelModel implements Serializable{

    static void setItems(ObservableList<dashBoardTabelModel> notificationarr) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    protected String username;
    protected String lawyerid;
    protected String registarid;
    protected String eventManegmentid;

    public dashBoardTabelModel(String username, String lawyerid, String registarid, String eventManegmentid) {
        this.username = username;
        this.lawyerid = lawyerid;
        this.registarid = registarid;
        this.eventManegmentid = eventManegmentid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLawyerid() {
        return lawyerid;
    }

    public void setLawyerid(String lawyerid) {
        this.lawyerid = lawyerid;
    }

    public String getRegistarid() {
        return registarid;
    }

    public void setRegistarid(String registarid) {
        this.registarid = registarid;
    }

    public String getEventManegmentid() {
        return eventManegmentid;
    }

    public void setEventManegmentid(String eventManegmentid) {
        this.eventManegmentid = eventManegmentid;
    }

    @Override
    public String toString() {
        return "dashBoardTabelModel{" + "username=" + username + ", lawyerid=" + lawyerid + ", registarid=" + registarid + ", eventManegmentid=" + eventManegmentid + '}';
    }
    
    
}
