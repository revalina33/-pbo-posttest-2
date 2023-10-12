/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.toko.buku;
import java.util.Scanner;
import java.util.ArrayList;
import Data.Buku;
import Data.Staff;
import Data.Pelanggan;
       
/**
 *
 * @author Lenovo
 */
public class TokoBuku {
    private final ArrayList<Buku> daftarBuku = new ArrayList<>();
    private final ArrayList<Staff> daftarStaff = new ArrayList<>();
    private final ArrayList<Pelanggan> daftarMember = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);
     

    public static void main(String[] args) {
     
        final TokoBuku toko = new TokoBuku();
        toko.menuUtama();
    }

    public void menuUtama() {
        while (true) {
            System.out.println("Selamat datang di toko buku");
            System.out.println("1. Login sebagai Staff");
            System.out.println("2. Login sebagai pelanggan");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi (1/2/3): ");
            final int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    loginStaff();
                    break;
                case 2:
                    loginpelanggan();
                    break;
                case 3:
                    System.out.println("Terima kasih");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
        }
    }

    public void loginStaff() {
        
        sc.nextLine();
        System.out.print("Masukkan username: ");
        final String username = sc.nextLine();
        System.out.print("Masukkan password: ");
        final String password = sc.nextLine();
        
        
       if (username.equals("sanny") && password.equals("123")) {
            System.out.println("Selamat datang anda adalah staff!");
            menuStaff();
        } else {
            System.out.println("Login gagal, username atau password yang dimasukkan salah");
        }
    }

    public void loginpelanggan() {
        sc.nextLine();
        System.out.print("Masukkan username: ");
        final String username = sc.nextLine();
        System.out.print("Masukkan password: ");
        final String password = sc.nextLine();

        if (username.equals("user") && password.equals("111")) {
            System.out.println("Selamat datang anda adalah Member!");
            menupelanggan();
        } else {
            System.out.println("Login gagal, username atau password yang dimasukkan salah");
        }
    }

    public boolean autentikasiStaff(final String username, final String password) {
        for (final Staff staff : daftarStaff) {
            if (staff.getUsername().equals(username) && staff.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public boolean autentikasiMember(final String username, final String password) {
        for (final Pelanggan member : daftarMember) {
            if (member.getUsername().equals(username) && member.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public void menuStaff() {
        while (true) {
            System.out.println("1. Tampilkan buku");
            System.out.println("2. Tambah buku");
            System.out.println("3. Hapus buku");
            System.out.println("4. Keluar");
            System.out.print("Pilih cara (1/2/3/4/5): ");
            final int pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    tampilkanDaftarBuku();
                    break;
                case 2:
                    tambahBuku();
                    break;
                
                case 3:
                    hapusBuku();
                    break;
                case 4:
                    System.out.println("Keluar dari menu buku");
                    return;
                default:
                    System.out.println("Pilihan tidak tersedia");
            }
        }
    }

   public void tampilkanDaftarBuku() {
        for (Buku buku : daftarBuku) {
            System.out.println("Judul: " + buku.getJudul());
            System.out.println("Pengarang: " + buku.getPengarang());
            System.out.println("Tebal: " + buku.getTebal());
            System.out.println("Harga: " + buku.getHarga());
            System.out.println();
        }
    }


     public void tambahBuku() {
        sc.nextLine();
        System.out.print("Masukkan judul buku: ");
        String judul = sc.nextLine();
        System.out.print("Masukkan pengarang: ");
        String pengarang = sc.nextLine();
        System.out.print("Masukkan tebal buku: ");
        int tebal = sc.nextInt();
        System.out.print("Masukkan harga buku: ");
        int harga = sc.nextInt();

        Buku bukuBaru = new Buku(judul, pengarang, tebal, harga);
        daftarBuku.add(bukuBaru);
        System.out.println("Buku telah ditambahkan.");
    }
   

    public void hapusBuku() {
        sc.nextLine();
        System.out.print("Masukkan judul buku yang ingin dihapus: ");
        String judul = sc.nextLine();

        for (Buku buku : daftarBuku) {
            if (buku.getJudul().equals(judul)) {
                daftarBuku.remove(buku);
                System.out.println("Buku telah dihapus.");
                return;
            }
        }
        System.out.println("Buku tidak ditemukan.");
    }

public void menupelanggan() {
     while (true) {
            System.out.println("1. Tampilkan buku");
             System.out.println("2. Beli buku");
             System.out.println("3. Keluar");
            System.out.print("Pilih cara (1/2/3): ");
            
            final int pilih = sc.nextInt();
            sc.nextLine();
            
            
            switch (pilih) {
                case 1:
                    tampilkanDaftarBukupelanggan();
                    break;
                case 2:
                    beliBuku();
                case 3:
                     System.out.println("Keluar dari menu buku");
                    return;
                    
}
     }
}
 public void tampilkanDaftarBukupelanggan() {
        for (Buku buku : daftarBuku) {
            System.out.println("Judul: " + buku.getJudul());
            System.out.println("Pengarang: " + buku.getPengarang());
            System.out.println("Tebal: " + buku.getTebal());
            System.out.println("Harga: " + buku.getHarga());
            System.out.println();

 }
 }
    public void beliBuku() {
    sc.nextLine();
    System.out.print("Masukkan judul buku yang ingin dibeli: ");
    String judul = sc.nextLine();

    for (Buku buku : daftarBuku) {
        if (buku.getJudul().equals(judul)) {
            System.out.println("Buku ditemukan. Masukkan jumlah yang ingin dibeli:");
            int jumlahBeli = sc.nextInt();
            
            if (jumlahBeli > 0) {
                int totalHarga = buku.getHarga() * jumlahBeli;
                System.out.println("Anda telah membeli " + jumlahBeli + " eksemplar " + buku.getJudul());
                System.out.println("Total Harga: " + totalHarga);
            } else {
                System.out.println("Jumlah pembelian tidak valid.");
            }
            return;
        }
    }
    System.out.println("Buku tidak ditemukan.");
}
 }
