package com.springdasar.model;

public class Mahasiswa {
    private String nama;
    private Integer umur;
    private String jurusan;
    private String fakultas;
    private Integer semester;

    public Mahasiswa(String nama, Integer umur, String jurusan, String fakultas, Integer semester) {
        this.nama = nama;
        this.umur = umur;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.semester = semester;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getUmur() {
        return umur;
    }

    public void setUmur(Integer umur) {
        this.umur = umur;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }
}
