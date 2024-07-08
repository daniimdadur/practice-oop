package com.springdasar.controller;

import com.springdasar.model.Dosen;
import com.springdasar.model.Kelas;
import com.springdasar.model.Mahasiswa;
import com.springdasar.model.MataKuliah;
import com.springdasar.model2.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/list")
public class ListApp {
    @GetMapping
    public ResponseEntity<Object> data(){
        List<Kelas> result = new ArrayList<>();

        Dosen dosen = new Dosen("Dani","S.kom","123");
        MataKuliah mataKuliah = new MataKuliah("1212","OOP","3");

        List<Mahasiswa> mahasiswa = Arrays.asList(
                new Mahasiswa("Dani",20,"Informatika","Teknik",6),
                new Mahasiswa("Sabil",30,"Pertanian","Teknik",12)
        );
        Kelas kelas = new Kelas("K123",mataKuliah,dosen,"Senin",mahasiswa);
        result.add(kelas);

        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/list2")
    public ResponseEntity<Object> data2(){
        List<Keluarga> result2 = new ArrayList<>();

        Alamat alamatIbu = new Alamat("Perum taman permata indah","04/04", "Waringin Jaya","Kedung Waringin","Bekasi","Jawa Barat","Indonesia");
        Alamat alamatAyah = new Alamat("Ciparakan","09/04","Sukahurip","Pamarican","Ciamis","Jawa Barat","Indonesia");
        Alamat alamatAnak = new Alamat("Ciparakan","09/04","Sukahurip","Pamarican","Ciamis","Jawa Barat","Indonesia");

        TempatTanggalLahir ttlAyah = new TempatTanggalLahir("Ciamis","13-12-2003");
        TempatTanggalLahir ttlIbu = new TempatTanggalLahir("Bekasi","22-12-05");
        TempatTanggalLahir ttlAnak1 = new TempatTanggalLahir("Ciamis","13-12-2033");
        TempatTanggalLahir ttlAnak2 = new TempatTanggalLahir("Banjar","22-12-2035");

        Ayah ayah = new Ayah(1322,"Dani",ttlAyah,"Laki-laki",alamatAyah,"Islam","Sudah Kawin","Job Develoment","Indonesia",30_000_000,"Fulan","Fulanah",2);
        Ibu ibu = new Ibu(2212,"Vida",ttlIbu,"Perempuan",alamatIbu,"Islam","Sudah Kawin","IRT","Indonesia",25_000_000,"Fulan","Fulanah",1);

        List<Anak> anak = Arrays.asList(
                new Anak(1223,"Syahsu",ttlAnak1,"Laki-laki",alamatAnak,"Islam","Belum Kawin","Pelajar","Indoneisa","Dani","Vida"),
                new Anak(2132,"Fulanah",ttlAnak2,"Perempuan",alamatAnak,"Islam","Belum Kawin","Pelajar","Indonesia","Dani","Vida")
        );
        Keluarga keluarga = new Keluarga(1234,ayah,ibu,anak);
        result2.add(keluarga);

        return ResponseEntity.ok().body(result2);
    }
}
