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
public class PanjangController {
  private Panjang model;
    private PanjangView view;

    public PanjangController(Panjang model, PanjangView view) {
        this.model = model;
        this.view = view;
    }
    
    public void setPanjangMeter( String meter){
        model.setMeter(meter);
    }
    
    public void setPanjangCentimeter( String centimeter){
        model.setCentimeter(centimeter);
    }
     
    public void setPanjangMilimeter( String milimeter){
        model.setMilimeter(milimeter);
    }
 
    
    public String getPanjangMeter(){
        return model.getMeter();
    }
    
    public String getPanjangCentimeter(){
        return model.getCentimeter();
    }
    
    public String getPanjangMilimeter(){
        return model.getMilimeter();
    }
    
    public void updateView(){
        view.printPanjangDetails(model.getMeter(), model.getCentimeter(), model.getMilimeter());
    }
}
