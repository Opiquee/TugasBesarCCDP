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
public class SatuanAdapter implements Panjang{
    Satuan satuan;
    
    public SatuanAdapter(Satuan satuan) {
        this.satuan = satuan;  
    }

    @Override
    public void konversi(int i) {
         satuan.konversi3(3); 
    }
}
