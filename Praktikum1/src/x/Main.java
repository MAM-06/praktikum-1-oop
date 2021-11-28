package x;

public class Main {
    public static void main(String[] args) {
        Kendaraan K = new Kendaraan();
        //Bus
        Bus B = new Bus();
        B.setJenis("Bus");
        B.setJumlah_penumpang(15);
        B.setBiaya_kendaraan(10000);
        B.setBiaya_penumpang(5000);
        System.out.println("Jenis kendaraan: " + B.getJenis());
        System.out.println("Jumlah penumpang: " + B.getJumlah_penumpang());
        System.out.println("Biaya kendaraan: " + B.getBiaya_kendaraan());
        System.out.println("Biaya penumpang: " + B.getBiaya_penumpang());
        B.hitungTotal();
        System.out.println("Total: " + (B.getTotal()*100/200+B.getTotal()));
        //Minibus
        Minibus MB = new Minibus();
        MB.setJenis("Minibus");
        MB.setJumlah_penumpang(20);
        MB.setBiaya_kendaraan(20000);
        MB.setBiaya_penumpang(7000);
        System.out.println("Jenis kendaraan: " + MB.getJenis());
        System.out.println("Jumlah penumpang: " + MB.getJumlah_penumpang());
        System.out.println("Biaya kendaraan: " + MB.getBiaya_kendaraan());
        System.out.println("Biaya penumpang: " + MB.getBiaya_penumpang());
        MB.hitungTotal();
        System.out.println("Total: " + (MB.getTotal()*100/500+MB.getTotal()));
        //Mobil
        Mobil M = new Mobil();
        M.setJenis("Mobil");
        M.setJumlah_penumpang(8);
        M.setBiaya_kendaraan(15000);
        M.setBiaya_penumpang(5000);
        System.out.println("Jenis kendaraan: " + M.getJenis());
        System.out.println("Jumlah penumpang: " + M.getJumlah_penumpang());
        System.out.println("Biaya kendaraan: " + M.getBiaya_kendaraan());
        System.out.println("Biaya penumpang: " + M.getBiaya_penumpang());
        M.hitungTotal();
        System.out.println("Total: " + M.getTotal());
        //Motor
        //Minibus
        Motor MT = new Motor();
        MT.setJenis("Motor");
        MT.setJumlah_penumpang(5);
        MT.setBiaya_kendaraan(4000);
        MT.setBiaya_penumpang(2000);
        System.out.println("Jenis kendaraan: " + MT.getJenis());
        System.out.println("Jumlah penumpang: " + MT.getJumlah_penumpang());
        System.out.println("Biaya kendaraan: " + MT.getBiaya_kendaraan());
        System.out.println("Biaya penumpang: " + MT.getBiaya_penumpang());
        MT.hitungTotal();
        System.out.println("Total: " + MT.getTotal());
    }
}

