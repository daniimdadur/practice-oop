package com.springdasar.model2;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Alamat {
    private String dusun;
    private String rtrw;
    private String desa;
    private String kec;
    private String kab;
    private String prov;
    private String country;
}
