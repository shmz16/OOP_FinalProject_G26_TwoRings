/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author LENOVO ThinkPad
 */
public class MarriagePackage {
    
    private int packageCode;
    private int LawyerID;
    private int RegistrarID;
    private int eventManagerID;
    private String location;

    public MarriagePackage(int packageCode, int LawyerID, int RegistrarID, int eventManagerID, String location) {
        this.packageCode = packageCode;
        this.LawyerID = LawyerID;
        this.RegistrarID = RegistrarID;
        this.eventManagerID = eventManagerID;
        this.location = location;
    }

    public int getPackageCode() {
        return packageCode;
    }

    public void setPackageCode(int packageCode) {
        this.packageCode = packageCode;
    }

    public int getLawyerID() {
        return LawyerID;
    }

    public void setLawyerID(int LawyerID) {
        this.LawyerID = LawyerID;
    }

    public int getRegistrarID() {
        return RegistrarID;
    }

    public void setRegistrarID(int RegistrarID) {
        this.RegistrarID = RegistrarID;
    }

    public int getEventManagerID() {
        return eventManagerID;
    }

    public void setEventManagerID(int eventManagerID) {
        this.eventManagerID = eventManagerID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "MarriagePackage{" + "packageCode=" + packageCode + ", LawyerID=" + LawyerID + ", RegistrarID=" + RegistrarID + ", eventManagerID=" + eventManagerID + ", location=" + location + '}';
    }
    
}
