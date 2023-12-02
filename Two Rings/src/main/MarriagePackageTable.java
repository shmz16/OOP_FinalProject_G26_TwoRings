
package main;

import java.io.Serializable;
import java.time.LocalDate;
import javafx.collections.ObservableList;

/**
 *
 * @author LENOVO ThinkPad
 */
public class MarriagePackageTable  implements Serializable{

    static void setItems(ObservableList<MarriagePackageTable> venueschedules) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String code;
    private String pkg;
    private String Price;
    private LocalDate eventdatepik;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPkg() {
        return pkg;
    }

    public void setPkg(String pkg) {
        this.pkg = pkg;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public LocalDate getEventdatepik() {
        return eventdatepik;
    }

    public void setEventdatepik(LocalDate eventdatepik) {
        this.eventdatepik = eventdatepik;
    }

    public MarriagePackageTable(LocalDate eventdatepik, String value1) {
        this.code = code;
        this.pkg = pkg;
        this.Price = Price;
        this.eventdatepik = eventdatepik;
    }

    @Override
    public String toString() {
        return "MarriagePackageTable{" + "code=" + code + ", pkg=" + pkg + ", Price=" + Price + ", eventdatepik=" + eventdatepik + '}';
    }

    
    
    
}