/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab4.nomor2;

/**
 *
 * @author MAM
 */
public class AnimalAct {
    public static void main(String[] args) {
        Animal hewanku = new Animal();
        Animal pemakanTumbuhan = new herbivora();
        Animal kelinciku = new rabbit();
        Animal pemakanDaging = new carnivora();
        Animal singaku = new lion();
        Animal hyenaku = new hyena();
        Animal pemakanSegala = new omnivora();
        Animal Manusiaku =  new man();
        hewanku.MakananHewan();
        pemakanTumbuhan.MakananHewan();
        kelinciku.MakananHewan();
        pemakanDaging.MakananHewan();
        singaku.MakananHewan();
        hyenaku.MakananHewan();
        pemakanSegala.MakananHewan();
        Manusiaku.MakananHewan();
    }
    
}

