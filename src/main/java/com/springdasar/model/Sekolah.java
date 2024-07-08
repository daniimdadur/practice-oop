package com.springdasar.model;

public class Sekolah {
    private String name;
    private String alamat;

    public Sekolah(String name, String alamat) {
        this.name = name;
        this.alamat = alamat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
