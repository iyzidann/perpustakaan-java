import models.item.*;
import models.user.*;
import models.Transaksi;

public class Main {
    public static void main(String[] args) {
        User mhs = new Mahasiswa("Zidan", "2241760128");
        User dosen = new Dosen("Pak Budi", "D12345");

        Barang buku = new Buku("B001", "Pemrograman Java", "Andi");
        Barang majalah = new Majalah("M001", "National Geographic", "Edisi Maret 2024");

        mhs.info();
        dosen.info();
        buku.tampilkanInfo();
        majalah.tampilkanInfo();

        Transaksi trx1 = new Transaksi(mhs, buku);
        trx1.pinjam();
        trx1.kembalikan();
    }
}
