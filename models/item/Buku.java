package models.item;

public class Buku extends Barang {
    private String penulis;

    public Buku(String kode, String nama, String penulis) {
        super(kode, nama);
        this.penulis = penulis;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("[Buku] " + nama + " oleh " + penulis);
    }
}
