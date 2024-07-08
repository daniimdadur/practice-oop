package com.springdasar.model2;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ayah extends Orang{
    private Integer penghasilan;
    private String namaAyah;
    private String namaIbu;
    private Integer anakke;

    public Ayah(Integer nik, String name, TempatTanggalLahir tempatTanggalLahir, String gender, Alamat alamat, String agama, String status, String pekerjaan, String kewarganegaraan, Integer penghasilan, String namaAyah, String namaIbu, Integer anakke) {
        super(nik, name, tempatTanggalLahir, gender, alamat, agama, status, pekerjaan, kewarganegaraan);
        this.penghasilan = penghasilan;
        this.namaAyah = namaAyah;
        this.namaIbu = namaIbu;
        this.anakke = anakke;
    }
}
