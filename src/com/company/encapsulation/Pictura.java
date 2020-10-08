package com.company.encapsulation;

public class Pictura {
    private String denumire;
    private String autor;
    private double inaltime;
    private double latime;

    public Pictura(String denumire, String autor, double inaltime, double latime)
    {
        this.denumire = denumire;
        this.autor = autor;
        this.inaltime = inaltime;
        this.latime = latime;
    }


    public String getDenumire() {
        return denumire;
    }

    public String getAutor() {
        return autor;
    }

    public double getInaltime() {
        return inaltime;
    }

    public double getLatime() {
        return latime;
    }


    public String print()
    {
        return "Denumire: " + this.denumire + "\n" +
                "Auutor: " + this.autor + "\n" +
                "Inaltime: " + this.inaltime + "\n" +
                "Latime: " + this.latime + "\n";
    }


    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setInaltime(double inaltime) {
        this.inaltime = inaltime;
    }

    public void setLatime(double latime) {
        this.latime = latime;
    }
}
