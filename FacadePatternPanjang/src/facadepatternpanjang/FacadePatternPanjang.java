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
public class FacadePatternPanjang {

    public static void main(String[] args) {
        ShopKeeper sk = new ShopKeeper();
        
        sk.meterKv();
        sk.centimeterKv();
        sk.milimeterKv();
    }
    
}
