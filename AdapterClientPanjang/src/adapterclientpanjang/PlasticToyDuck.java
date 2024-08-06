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
    public class PlasticToyDuck implements Panjang{

        @Override
        public void konversi(int i) {
             System.out.println(i * 100 + " cm");
        }



    }
