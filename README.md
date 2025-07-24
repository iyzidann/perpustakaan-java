# Sistem Manajemen Perpustakaan Mini

Contoh sederhana penerapan **Object-Oriented Programming (OOP)** menggunakan Java dalam sistem peminjaman barang perpustakaan.

## 🎯 Fitur
- Peminjaman dan pengembalian barang (buku, majalah)
- Pengguna dari dua jenis: Mahasiswa dan Dosen
- Relasi antar objek melalui Transaksi

## 🔍 Konsep OOP yang Diterapkan

### 1. **Encapsulation**
- Atribut class dibuat `private` atau `protected`
- Akses data melalui getter/setter

### 2. **Inheritance**
- Class `Mahasiswa` dan `Dosen` mewarisi class `User`
- Class `Buku` dan `Majalah` mewarisi class `Barang`

### 3. **Polymorphism**
- Method `info()` dan `tampilkanInfo()` di-override oleh subclass

### 4. **Abstract Class**
- `User` dan `Barang` adalah abstract class yang tidak bisa diinstansiasi langsung

### 5. **Interface**
- `IPeminjaman` mendefinisikan kontrak `pinjam()` dan `kembalikan()` yang diimplementasi oleh `Transaksi`

### 6. **Instantiation & Constructors**
- Objek dibuat menggunakan `new` dan dikonstruksi dengan parameter

---
