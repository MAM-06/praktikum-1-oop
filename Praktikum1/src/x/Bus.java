package x;

public class Bus extends Kendaraan {
    @Override
    public void setJenis(String jenisA) {
        super.setJenis(jenisA);
    }
    @Override
    public void setJumlah_penumpang(int jumlah_penumpangA) {
        super.setJumlah_penumpang(jumlah_penumpangA);
    }
    @Override
    public void setBiaya_penumpang(int biaya_penumpangA) {
        super.setBiaya_penumpang(biaya_penumpangA);
    }
    @Override
    public void setBiaya_kendaraan(int biaya_kendaraanA) {
        super.setBiaya_kendaraan(biaya_kendaraanA);
    }
    @Override
    public String getJenis() {
        return super.getJenis();
    }
    @Override
    public int getBiaya_kendaraan() {
        return super.getBiaya_kendaraan();
    }
    @Override
    public int getBiaya_penumpang() {
        return super.getBiaya_penumpang();
    }
    @Override
    public int getJumlah_penumpang() {
        return super.getJumlah_penumpang();
    }
    @Override
    public void hitungTotal() {
        super.hitungTotal();
    }
    @Override
    public int getTotal() {
        return super.getTotal();
    }
}

