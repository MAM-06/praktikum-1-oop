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
class Animal{
    public void MakananHewan(){
        System.out.println("Klarifikasi Hewan berdasarkan jenis makanan \n");
    }
}
class herbivora extends Animal{
    @Override
    public void MakananHewan(){
        System.out.println("Hewan Herbivora atau hewan pemakan Tumbuhan");
    }
}
class rabbit extends herbivora{
    @Override
    public void MakananHewan(){
        System.out.println("Makanan rabit : wortel, sawi, rumput \n");
    }
}
class carnivora extends Animal{
    @Override
    public void MakananHewan(){
        System.out.println("Hewan Carnivora atau hewan pemakan Daging");
    }
}
class lion extends carnivora{
    @Override
    public void MakananHewan(){
        System.out.println("Makanan lion : daging ");
    }
}
class hyena extends carnivora{
    @Override
    public void MakananHewan(){
        System.out.println("Makanan hyena : daging \n");
    }
}
class omnivora extends Animal{
    @Override
    public void MakananHewan(){
        System.out.println("Hewan Omnivora atau hewan pemakan segala");
    }
}
class man extends omnivora{
    @Override
    public void MakananHewan(){
        System.out.println("Makanan manusia : semua masuk sih \n");
    }
}

