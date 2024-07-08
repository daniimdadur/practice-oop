package com.springdasar.controller;

import com.springdasar.model.Orang;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orang")
public class OrangApp {
    @GetMapping
    public Orang data(){
        return new Orang("Dani","Laki-laki",20,"Pamarican");
    }
    @GetMapping("/orang1")
    public Orang data1(){
        return new Orang("Sabil","Laki-laki",20,"Surabaya");
    }
    @GetMapping("/orang2")
    public Orang data2(){
        return new Orang("Sabil");
    }
    @GetMapping("/orang3")
    public Orang data3(){
        return new Orang("Sabil","Laki-laki",30);
    }
    @GetMapping("/orang4")
    public Orang data4(){
        return new Orang();
    }
    @GetMapping("/orang5")
    public Orang data5(){
        return new Orang("Sabil","Laki-laki");
    }
}
