/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpatterndemopanjang;

/**
 *
 * @author TAUFIK
 */
public class ObserverPatternDemoPanjang {

    public static void main(String[] args) {
      Subject subject = new Subject();
        
        new MeterObserver(subject);
        new CentimeterObserver(subject);
        new MilimeterObserver(subject);
        
        System.out.println("State Pertama berubah menjadi 10");
        subject.setState(10);
        
        System.out.println("State Kedua berubah menjadi 20");
        subject.setState(20);
    }
    
}
