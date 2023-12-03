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
public class NewSchedule implements Serializable{
    private String customerusername;
    private LocalDate datepicker;
    private String eventnametextfield;

    public NewSchedule(String customerusername, LocalDate datepicker, String eventnametextfield) {
        this.customerusername = customerusername;
        this.datepicker = datepicker;
        this.eventnametextfield = eventnametextfield;
    }

    public String getCustomerusername() {
        return customerusername;
    }

    public void setCustomerusername(String customerusername) {
        this.customerusername = customerusername;
    }

    public LocalDate getDatepicker() {
        return datepicker;
    }

    public void setDatepicker(LocalDate datepicker) {
        this.datepicker = datepicker;
    }

    public String getEventnametextfield() {
        return eventnametextfield;
    }

    public void setEventnametextfield(String eventnametextfield) {
        this.eventnametextfield = eventnametextfield;
    }

    @Override
    public String toString() {
        return "NewSchedule{" + "customerusername=" + customerusername + ", datepicker=" + datepicker + ", eventnametextfield=" + eventnametextfield + '}';
    }
    
    
    
}
