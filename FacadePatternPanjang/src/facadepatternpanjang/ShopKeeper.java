/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadepatternpanjang;

/**
 *
 * @author TAUFIK
 */
public class ShopKeeper {
    private PanjangShop meter;
    private PanjangShop milimeter;
    private PanjangShop centimeter;
    
        public ShopKeeper(){
        meter = new Meter();
        milimeter = new Milimeter();
        centimeter = new Centimeter();
    }
    
    public void meterKv(){
        meter.konversi(23);
    }
    
    public void milimeterKv(){
        milimeter.konversi(23);
    }
    
    public void centimeterKv(){
        centimeter.konversi(23);
    }

}
