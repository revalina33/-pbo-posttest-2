/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author Lenovo
 */
public class Buku {
    private final String judul;
    private final String pengarang;
    private final int tebal;
    private final int harga;

    public Buku(String judul, String pengarang, int tebal, int harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tebal = tebal;
        this.harga = harga;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public int getTebal() {
        return tebal;
    }

    public int getHarga() {
        return harga;
    }
}

