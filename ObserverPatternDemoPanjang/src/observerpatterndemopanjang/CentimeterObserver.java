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
public class CentimeterObserver extends Observer{

    public CentimeterObserver(Subject subject) {
        super(subject);
        this.subject.attach(this);
    }
     
    @Override
    public void update() {
         System.out.println("Centimeter String : "+ subject.getState() * 100 + " centimeter.");  
    }
    
}
