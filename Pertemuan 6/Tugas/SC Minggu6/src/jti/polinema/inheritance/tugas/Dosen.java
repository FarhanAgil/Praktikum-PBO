/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.inheritance.tugas;

/**
 *
 * @author ASUS
 */
public class Dosen extends Pegawai {
   protected int jumlahSKS;
    protected int tarif_SKS;
    
    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }
    
    public void setSKS(int sks) {
        this.jumlahSKS = sks;
    }
    
    public int getGaji() {
        super.getGaji();
        return jumlahSKS * tarif_SKS;
    }
}
  

