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
public class Milimeter implements PanjangShop{
    
    @Override
    public void konversi(int i) {
        System.out.println("Milimeter : " + i * 1000 + " mm");
    }   
}
