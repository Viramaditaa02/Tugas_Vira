/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectprakk;

import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class Keuanganelektronik {
    public String namabarang;
    int total, jumlahbeli;
    String totalpayment;
    int harga;
  
    public int totalpayment(){
       total = harga*jumlahbeli;
        return totalpayment();
    }       
    public String namabarang(){
        return namabarang;
    }
    void namabarang(String namabarang){
        this.namabarang = namabarang;
    }
       
    void datatotalpayment(String totalpayment){
         this.totalpayment = totalpayment;
    }
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setNamabarang(String namabarang) {
        this.namabarang = namabarang;
    }

    public String getNamabarang() {
        return namabarang;
    }
    

}

