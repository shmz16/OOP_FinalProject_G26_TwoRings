/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Lenovo
 */
public class Venue {
    private String venueName;
    private String venueType;
    private String venueLocation;
    private int rentingcost;
    
    public Venue(){
    
    
};

    public Venue(String venueName, String venueType, String venueLocation, int rentingcost) {
        this.venueName = venueName;
        this.venueType = venueType;
        this.venueLocation = venueLocation;
        this.rentingcost = rentingcost;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getVenueType() {
        return venueType;
    }

    public void setVenueType(String venueType) {
        this.venueType = venueType;
    }

    public String getVenueLocation() {
        return venueLocation;
    }

    public void setVenueLocation(String venueLocation) {
        this.venueLocation = venueLocation;
    }

    public int getRentingcost() {
        return rentingcost;
    }

    public void setRentingcost(int rentingcost) {
        this.rentingcost = rentingcost;
    }

    @Override
    public String toString() {
        return "Venue{" + "venueName=" + venueName + ", venueType=" + venueType + ", venueLocation=" + venueLocation + ", rentingcost=" + rentingcost + '}';
    }
    
}
