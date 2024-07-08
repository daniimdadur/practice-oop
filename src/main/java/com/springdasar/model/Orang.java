package com.springdasar.model;

public class Orang {
    private String name;
    private String jk;
    private Integer umur;
    private String alamat;

    public Orang(String name, String jk, Integer umur, String alamat) {
        this.name = name;
        this.jk = jk;
        this.umur = umur;
        this.alamat = alamat;
    }
    public Orang(String name){
        this(name,null,0,null);
    }
    public Orang(String name,String jk){
        this(name,jk,null,null);
    }
    public Orang(String name,String jk,Integer umur){
        this(name,jk,umur,null);
    }
    public Orang(){
        this(null,null,0,null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public Integer getUmur() {
        return umur;
    }

    public void setUmur(Integer umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
