/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonpanjang;

/**
 *
 * @author TAUFIK
 */
public class SingleTonPanjang {

    public static void main(String[] args) {
        // TODO code application logic here
        Panjang panjang = Panjang.getPanjang();
        
        Panjang panjang2 = Panjang.getPanjang();
        
        panjang.doSomething();
        panjang2.doSomething();
    }
    
}
