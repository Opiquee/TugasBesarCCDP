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
public class Sparrow implements Satuan{

    @Override
    public void konversi2(int i) {
        System.out.println(i + " m");
    }

    @Override
    public void konversi3(int i) {
     System.out.println(i * 1000 + " mm");    
    }
    
}
