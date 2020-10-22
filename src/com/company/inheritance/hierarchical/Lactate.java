package com.company.inheritance.hierarchical;

public class Lactate extends Magazin{

    private String dataExpirarii;
    private String producator;

    public Lactate(String denumire,
                   String proprietar,
                   int anulInfiintarii,
                   String locatia,
                   String dataExpirarii,
                   String producator)
    {
        super(denumire, proprietar, anulInfiintarii, locatia);
        this.dataExpirarii = dataExpirarii;
        this.producator = producator;
    }

    public String getDataExpirarii()
    {
        return this.dataExpirarii;
    }

    public String getProducator()
    {
        return this.producator;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Data expirarii: " + this.dataExpirarii + "\n" +
                "Producator: " + this.producator;
    }

    public void setDataExpirarii(String dataExpirarii)
    {
        this.dataExpirarii = dataExpirarii;
    }

    public void setProducator(String producator)
    {
        this.producator = producator;
    }
}
