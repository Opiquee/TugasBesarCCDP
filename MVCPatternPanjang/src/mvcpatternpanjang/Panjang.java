/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcpatternpanjang;

/**
 *
 * @author TAUFIK
 */
public class Panjang {
    private String meter;
    private String centimeter;
    private String milimeter;
    
    public Panjang(String meter, String centimeter, String milimeter) {
        this.meter = meter;
        this.centimeter = centimeter;
        this.milimeter = milimeter;  
    }

    public String getMeter() {
        return meter;
    }

    public void setMeter(String meter) {
        this.meter = meter;
    }

    public String getCentimeter() {
        return centimeter;
    }

    public void setCentimeter(String centimeter) {
        this.centimeter = centimeter;
    }

    public String getMilimeter() {
        return milimeter;
    }

    public void setMilimeter(String milimeter) {
        this.milimeter = milimeter;
    }
}
