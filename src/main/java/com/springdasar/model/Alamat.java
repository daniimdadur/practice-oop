package com.springdasar.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Alamat {
    public Integer id;
    public String jalan;
    public String desa;
    public String kecamatan;
    public String kabupaten;
    public String provinsi;
    public String country;

    public Alamat(Integer id, String jalan, String desa, String kecamatan, String kabupaten, String provinsi, String country) {
        this.id = id;
        this.jalan = jalan;
        this.desa = desa;
        this.kecamatan = kecamatan;
        this.kabupaten = kabupaten;
        this.provinsi = provinsi;
        this.country = country;
    }
}
