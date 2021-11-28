/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab3.nomor3;

/**
 *
 * @author MAM
 */
public class MakYam {
    private String menu;
    private int harga, diskon, ongkir, potongan;

    void setMenu(String Menu){
        this.menu = Menu;
    }
    public String getMenu(){
        return menu;
    }
    void setHarga(int Harga){
        this.harga = Harga;
    }
    public int getHarga(){
        return harga;
    }
    void setDisc(int Disc){
        diskon = harga - Disc;
        System.out.println("-Diskon             : " + diskon);
    }
    public int getDisc (){
        return diskon;
    }
    void setOngkir (int potongan){
        this.ongkir = potongan;
    }
    public int getOngkir(){
        return ongkir;
    }
    void setPotongan(int Potongan){
        potongan = ongkir - Potongan;
        System.out.println("Diskon Ongkir sd 7k : " + potongan);
    }
}
