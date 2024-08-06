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
public class Centimeter implements PanjangShop{

    @Override
    public void konversi(int i) {
         System.out.println("Centimeter : " + i * 100 + " cm");
    } 
}
