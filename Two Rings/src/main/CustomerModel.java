/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author LENOVO ThinkPad
 */
public class CustomerModel {
    protected String username;
    protected String phonenumber;
    protected String religion;
    protected Event myevent;

    public CustomerModel(String username, String phonenumber, String religion, Event myevent) {
        this.username = username;
        this.phonenumber = phonenumber;
        this.religion = religion;
        this.myevent = myevent;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public Event getMyevent() {
        return myevent;
    }

    public void setMyevent(Event myevent) {
        this.myevent = myevent;
    }

    @Override
    public String toString() {
        return "CustomerModel{" + "username=" + username + ", phonenumber=" + phonenumber + ", religion=" + religion + ", myevent=" + myevent + '}';
    }
    
    
}
