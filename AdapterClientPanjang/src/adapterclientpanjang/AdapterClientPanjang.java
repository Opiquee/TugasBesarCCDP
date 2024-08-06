/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterclientpanjang;

/**
 *
 * @author TAUFIK
 */
public class AdapterClientPanjang {

    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        PlasticToyDuck Panjang = new PlasticToyDuck();
        
        Panjang SatuanAdapter = new SatuanAdapter(sparrow);
        
        System.out.println("Meter :");
        sparrow.konversi2(3);
     
        
        System.out.println("Centimeter :");
        Panjang.konversi(3);
        
        System.out.println("Milimeter :");
        SatuanAdapter.konversi(3);
    }
    
}
