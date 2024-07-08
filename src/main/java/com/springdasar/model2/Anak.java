package com.springdasar.model2;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Anak extends Orang{
    private String  namaAyah;
    private String namaIbu;

    public Anak(Integer nik, String name, TempatTanggalLahir tempatTanggalLahir, String gender, Alamat alamat, String agama, String status, String pekerjaan, String kewarganegaraan, String namaAyah, String namaIbu) {
        super(nik, name, tempatTanggalLahir, gender, alamat, agama, status, pekerjaan, kewarganegaraan);
        this.namaAyah = namaAyah;
        this.namaIbu = namaIbu;
    }
}
