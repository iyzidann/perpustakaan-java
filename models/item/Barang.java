package models.item;

public abstract class Barang {
    protected String kode;
    protected String nama;

    public Barang(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public abstract void tampilkanInfo();
}
