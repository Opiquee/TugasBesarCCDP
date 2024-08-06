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
public class Panjang {
    
  private static Panjang panjang;
    
    //method
    //konstruktor
    private Panjang(){
        System.out.println("Hai, saya satuan panjang");
    }
    
    //ini hook
    public static synchronized Panjang getPanjang(){
        if(panjang==null){
            panjang=new Panjang();
        }
        
        return panjang;
    }
    
    public void doSomething(){
        System.out.println("Satuan panjang sangat beragam. Beberapa diantaranya ada meter, centimeter dan milimeter");
    }
    
}