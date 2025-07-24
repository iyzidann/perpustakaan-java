package models.item;

public class Majalah extends Barang {
    private String edisi;

    public Majalah(String kode, String nama, String edisi) {
        super(kode, nama);
        this.edisi = edisi;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("[Majalah] " + nama + " - " + edisi);
    }
}
