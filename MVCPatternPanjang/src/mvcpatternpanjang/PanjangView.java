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
public class PanjangView {
    public void printPanjangDetails(String panjangMeter, String panjangCentimeter, String panjangMilimeter){
        System.out.println("Satuan Panjang");
        System.out.println("Meter : "+panjangMeter);
        System.out.println("Centimeter : "+panjangCentimeter);
        System.out.println("Milimeter : "+panjangMilimeter);
    }
}
