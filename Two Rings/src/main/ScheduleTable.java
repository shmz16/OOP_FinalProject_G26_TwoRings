/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Kazi Faiad
 */
public class ScheduleTable {
    private SimpleStringProperty Customertable;
    
    private SimpleStringProperty Eventdatecolumn;
    private SimpleStringProperty Eventnamecolumn;
    
    public ScheduleTable(NewSchedule newScheduleInstance)
    {
        this.Customertable = new SimpleStringProperty(this, "Customertable");
        this.Eventdatecolumn = new SimpleStringProperty(this, "Eventdatecolumn");
        this.Eventnamecolumn = new SimpleStringProperty(this, "Eventnamecolumn");
    
        this.Customertable.setValue(newScheduleInstance.getCustomerusername());
        this.Eventdatecolumn.setValue(newScheduleInstance.getDatepicker().toString());
        this.Eventnamecolumn.setValue(newScheduleInstance.getEventnametextfield());
    }

    public String getCustomertable() {
        return Customertable.getValue();
    }

    public void setCustomertable(String Customertable) {
        this.Customertable.setValue(Customertable);
    }

    public String getEventdatecolumn() {
        return Eventdatecolumn.getValue();
    }

    public void setEventdatecolumn(String Eventdatecolumn) {
        this.Eventdatecolumn.setValue(Eventdatecolumn);
    }

    public String getEventnamecolumn() {
        return Eventnamecolumn.getValue();
    }

    public void setEventnamecolumn(String Eventnamecolumn) {
        this.Eventnamecolumn.setValue(Eventnamecolumn);
    }

}
