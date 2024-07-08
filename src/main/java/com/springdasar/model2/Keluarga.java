package com.springdasar.model2;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Keluarga {
    private Integer noKK;
    private Ayah kepalaKeluarga;
    private Ibu ibu;
    private List<Anak> anak;

    public Keluarga(Ayah kepalaKeluarga, Ibu ibu, List<Anak> anak) {
        this.kepalaKeluarga = kepalaKeluarga;
        this.ibu = ibu;
        this.anak = anak;
    }
}
