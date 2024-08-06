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
public class MVCPatternPanjang {

      public static void main(String[] args) {
        
        Panjang model = retrievePanjangFromDatabase();
        
        PanjangView view = new PanjangView();
        
        PanjangController controller = new PanjangController(model, view);
        
        controller.updateView();
        
        controller.setPanjangMeter("3 m");
        controller.updateView();
    }
    
    private static Panjang retrievePanjangFromDatabase() {
        return new Panjang("3 m","300 cm","3000 mm");
    }   
}
