/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectprakk;

/**
 *
 * @author USER
 */
public class inf_pemasukan extends Keuanganelektronik {
int pemasukan, penjualan;
private String kodebrg;
String bulan;
  void pemasukan (int pemasukan){
      this.pemasukan = pemasukan;
}
  void penjualan (int penjualan){
      this.penjualan = penjualan;
  }
  void bulan (String bulan){
      this.bulan = bulan;
  }
  int pemasukan (){
      return pemasukan;
  }
  int penjualan (){
      return penjualan;
  }
   String bulan (){
      return bulan;
  }

    public void setKodebrg(String kodebrg) {
        this.kodebrg = kodebrg;
    }

    public String getKodebrg() {
        return kodebrg;
    }
   }
