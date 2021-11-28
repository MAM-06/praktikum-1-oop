package x;

public class Minibus extends Kendaraan {
    public void setJenis(String jenisA) {
        super.setJenis(jenisA);
    }

    public void setJumlah_penumpang(int jumlah_penumpangA) {
        super.setJumlah_penumpang(jumlah_penumpangA);
    }

    public void setBiaya_penumpang(int biaya_penumpangA) {
        super.setBiaya_penumpang(biaya_penumpangA);
    }

    public void setBiaya_kendaraan(int biaya_kendaraanA) {
        super.setBiaya_kendaraan(biaya_kendaraanA);
    }

    public String getJenis() {
        return super.getJenis();
    }

    public int getBiaya_kendaraan() {
        return super.getBiaya_kendaraan();
    }

    public int getBiaya_penumpang() {
        return super.getBiaya_penumpang();
    }

    public int getJumlah_penumpang() {
        return super.getJumlah_penumpang();
    }
    public void hitungTotal() {
        super.hitungTotal();
    }
    public int getTotal() {
        return super.getTotal();
    }
}

