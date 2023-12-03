/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author acer
 */
public class Meeting implements Serializable{
    
    LocalDate meetingdate;
    String meetingWith,meetingTime;

    public Meeting(LocalDate meetingdate, String meetingWith, String meetingTime) {
        this.meetingdate = meetingdate;
        this.meetingWith = meetingWith;
        this.meetingTime = meetingTime;
    }

    public LocalDate getMeetingdate() {
        return meetingdate;
    }

    public void setMeetingdate(LocalDate meetingdate) {
        this.meetingdate = meetingdate;
    }

    public String getMeetingWith() {
        return meetingWith;
    }

    public void setMeetingWith(String meetingWith) {
        this.meetingWith = meetingWith;
    }

    public String getMeetingTime() {
        return meetingTime;
    }

    public void setMeetingTime(String meetingTime) {
        this.meetingTime = meetingTime;
    }

    @Override
    public String toString() {
        return "Meeting{" + "meetingdate=" + meetingdate + ", meetingWith=" + meetingWith + ", meetingTime=" + meetingTime + '}';
    }
    
    
    
}
