package com.springdasar.model2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orang {
    private Integer nik;
    private String name;
    private TempatTanggalLahir tempatTanggalLahir;
    private String gender;
    private Alamat alamat;
    private String agama;
    private String status;
    private String pekerjaan;
    private String kewarganegaraan;
}
