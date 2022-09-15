package com.example.sholatwajibsunnah;

public class DaftarMasjid {
    private int id;
    private String
            gambar,
            deskripsi,
            nama,
            clicktovisit,
            alamat;

    public DaftarMasjid(int id, String gambar, String deskripsi, String nama, String clicktovisit, String alamat) {
        this.id = id;
        this.gambar = gambar;
        this.deskripsi = deskripsi;
        this.nama = nama;
        this.clicktovisit = clicktovisit;
        this.alamat = alamat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getClicktovisit() {
        return clicktovisit;
    }

    public void setClicktovisit(String clicktovisit) {
        this.clicktovisit = clicktovisit;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
