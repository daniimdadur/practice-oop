package com.springdasar.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Kelas {
    private String kode;
    private MataKuliah mataKuliah;
    private Dosen dosen;
    private String hari;
    private List<Mahasiswa> mahasiswa;

    public Kelas(String kode, MataKuliah mataKuliah, Dosen dosen, String hari, List<Mahasiswa> mahasiswa) {
        this.kode = kode;
        this.mataKuliah = mataKuliah;
        this.dosen = dosen;
        this.hari = hari;
        this.mahasiswa = mahasiswa;
    }
}
