package com.springdasar.model;

public class Dosen extends Orang{

    private String title;
    private String nip;

    public Dosen(String name, String jk, Integer umur, String alamat, String title, String nip) {
        super(name, jk, umur, alamat);
        this.title = title;
        this.nip = nip;
    }

    public Dosen(String name, String title, String nip) {
        super(name);
        this.title = title;
        this.nip = nip;
    }

    public Dosen(String name, String jk, String title, String nip) {
        super(name, jk);
        this.title = title;
        this.nip = nip;
    }

    public Dosen(String name, String jk, Integer umur, String title, String nip) {
        super(name, jk, umur);
        this.title = title;
        this.nip = nip;
    }

    public Dosen(String title, String nip) {
        this.title = title;
        this.nip = nip;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
}
