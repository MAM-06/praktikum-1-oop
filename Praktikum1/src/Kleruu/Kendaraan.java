package Kleruu;

public class Kendaraan {
    protected String jenis;
    int jumlah_penumpang, biaya_kendaraan, biaya_penumpang,total;

    //Setter
    public void setJenis(String jenisA) {
        this.jenis = jenisA;
    }
    public void setJumlah_penumpang(int jumlah_penumpangA) {
        this.jumlah_penumpang = jumlah_penumpangA;
    }
    public void setBiaya_kendaraan(int biaya_kendaraanA) {
        this.biaya_kendaraan = biaya_kendaraanA;
    }
    public void setBiaya_penumpang(int biaya_penumpangA) {
        this.biaya_penumpang = biaya_penumpangA;
    }
    //Getter
    public String getJenis() {
        return jenis;
    }
    public int getJumlah_penumpang() {
        return jumlah_penumpang;
    }
    public int getBiaya_kendaraan() {
        return biaya_kendaraan;
    }
    public int getBiaya_penumpang() {
        return biaya_penumpang;
    }
    //method hitung total
    public void hitungTotal(){
        this.total = jumlah_penumpang * (biaya_kendaraan + biaya_penumpang);
    }
    public int getTotal() {
        return total;
    }
}
