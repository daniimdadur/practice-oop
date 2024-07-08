package com.springdasar.controller;

import com.springdasar.model.Mahasiswa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mahasiswa")
public class MahasiswaApp {

    @GetMapping
    public Mahasiswa data(){
        return new Mahasiswa("Sabil",30,"Informatika","Teknik",4);
    }
    @GetMapping("/mahasiswa1")
    public Mahasiswa data1(){
        return new Mahasiswa("Dani",20,"Informatika","Teknik",7);
    }
}
