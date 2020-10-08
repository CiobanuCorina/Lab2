package com.company.inheritance.hierarchical;

public class Magazin {
    private String denumire;
    private String prorietar;
    private int anulInfiintarii;
    private String locatia;
    public Magazin(String denumire, String prorietar, int anulInfiintarii, String locatia)
    {
        this.denumire = denumire;
        this.prorietar = prorietar;
        this.anulInfiintarii = anulInfiintarii;
        this.locatia = locatia;
    }

    public String getDenumire()
    {
        return this.denumire;
    }

    public String getProrietar()
    {
        return this.prorietar;
    }

    public int getAnulInfiintarii()
    {
        return this.anulInfiintarii;
    }

    public String getLocatia()
    {
        return this.locatia;
    }


    public String print()
    {
        return "Denumire: " + this.denumire + "\n" +
                "Proprietar: " + this.prorietar + "\n" +
                "Anul infiintarii: " + this.anulInfiintarii + "\n" +
                "Locatia: " + this.locatia + "\n";
    }


    public void setDenumire(String denumire)
    {
        this.denumire = denumire;
    }

    public void setProrietar(String prorietar)
    {
        this.prorietar = prorietar;
    }

    public void setAnulInfiintarii(int anulInfiintarii)
    {
        this.anulInfiintarii = anulInfiintarii;
    }

    public void setLocatia(String locatia)
    {
        this.locatia = locatia;
    }
}
