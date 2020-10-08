package com.company.inheritance.hierarchical;

public class Detergenti extends Magazin{
    private String sferaUtilizare;
    public Detergenti(String denumire, String proprietar, int anulInfiintarii, String locatia, String sferaUtilizare)
    {
        super(denumire, proprietar, anulInfiintarii, locatia);
        this.sferaUtilizare = sferaUtilizare;
    }

    public String getSferaUtilizare()
    {
        return this.sferaUtilizare;
    }

    @Override
    public String print()
    {
        return super.print() + "Sfera de utilizare: " + this.sferaUtilizare;
    }

    public String print(String message)
    {
        return message;
    }

    public void setSferaUtilizare(String sferaUtilizare)
    {
        this.sferaUtilizare = sferaUtilizare;
    }
}
