/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectprakk;



/**
 *
 * @author USER
 */
public class inf_stokbrg extends inf_pemasukan {
   private  String deskripsi;
           String stok;
     void stok (String stok){
         this.stok = stok;
     }
     void deskripsi (String deskripsi){
         this.deskripsi = deskripsi;
     }
      String stok (){
      return stok;
  }
      String deskkripsi (){
      return deskripsi;
  }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
      

    }
