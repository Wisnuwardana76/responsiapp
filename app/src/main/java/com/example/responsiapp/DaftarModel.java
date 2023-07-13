package com.example.responsiapp;

import java.io.Serializable;

public class DaftarModel implements Serializable {
    public String Nama;
    public String Namaaplikasi;
    public String NamaTim;

    public DaftarModel(String Nama, String Namaaplikasi, String NamaTim){
        this.Nama = Nama;
        this.Namaaplikasi = Namaaplikasi;
        this.NamaTim = NamaTim;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getNamaaplikasi() {
        return Namaaplikasi;
    }

    public void setNamaaplikasi(String namaaplikasi) {
        Namaaplikasi = namaaplikasi;
    }

    public String getNamaTim() {
        return NamaTim;
    }

    public void setNamaTim(String namaTim) {
        NamaTim = namaTim;
    }
}
