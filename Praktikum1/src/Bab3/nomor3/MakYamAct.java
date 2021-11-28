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
public class MakYamAct {
    public static void main(String[] args) {
        MakYam nota = new MakYam();
        nota.setMenu("Bakso" + " Es Teh " + "Lolipop ");
        System.out.println("======================================");
        System.out.println("Diskon 35% sd 50% + potongan ongkir 7k");
        System.out.println("======================================");
        System.out.println("Menu yang Diambil   : "+ nota.getMenu());
        nota.setHarga(15000);
        System.out.println("Total               : " + nota.getHarga());
        nota.setDisc(5500);
        nota.setOngkir(12000);
        System.out.println("Ongkir              : "+ nota.getOngkir());
        nota.setPotongan(7000);
        System.out.println("Total semua         : " + nota.getDisc());
    }
}
