/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programbarang;

/**
 *
 * @author ASUS
 */
public class Barang {
   String kode;
    String namaBarang;
    int hargaDasar;
    float diskon;
    
    int hitungHargaJual() {
        int hargaDiskon = hargaDasar;
        diskon /= 100;
        hargaDiskon *= diskon;
        return hargaDasar - hargaDiskon;
    }
    
    void tampilData() {
        System.out.println("Data Barang");
        System.out.println("--------------------------------------");
        System.out.println("Kode Barang \t: " + kode);
        System.out.println("Nama Barang \t: " + namaBarang);
        System.out.println("Harga Dasar \t: Rp " + hargaDasar);
        System.out.println("Diskon \t\t: " + diskon + "%");
        System.out.println("Harga Jual \t: Rp " + hitungHargaJual());
        System.out.println("--------------------------------------");
    }
}  

