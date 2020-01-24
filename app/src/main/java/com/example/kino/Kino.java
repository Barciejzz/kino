package com.example.kino;

public class Kino {
    String nazwa;
    int id;
    int numer_sali;


    public Kino(){}

    public Kino(String nazwa,int id, int numer_sali)
    {
        this.nazwa=nazwa;
        this.id=id;
        this.numer_sali=numer_sali;


    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumer_sali() {
        return numer_sali;
    }

    public void setNumer_sali(int numer_sali) {
        this.numer_sali = numer_sali;
    }
}
