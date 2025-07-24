package models;

import interfaces.IPeminjaman;
import models.item.Barang;
import models.user.User;

public class Transaksi implements IPeminjaman {
    private User user;
    private Barang barang;

    public Transaksi(User user, Barang barang) {
        this.user = user;
        this.barang = barang;
    }

    @Override
    public void pinjam() {
        System.out.println(user.getNama() + " meminjam " + barang.getKode());
    }

    @Override
    public void kembalikan() {
        System.out.println(user.getNama() + " mengembalikan " + barang.getKode());
    }
}
