package com.company.inheritance.simple;

public class Plante {
    private String division;
    private String plantClass;
    private String order;
    private String family;
    public Plante(String division, String plantClass, String order, String family)
    {
        this.division = division;
        this.plantClass = plantClass;
        this.order = order;
        this.family = family;
    }

    public String getDivision()
    {
        return this.division;
    }

    public String getPlantClass()
    {
        return this.plantClass;
    }

    public String getOrder()
    {
        return this.order;
    }

    public String getFamily()
    {
        return this.family;
    }

    @Override
    public String toString()
    {
        return "Division: " + this.division + "\n" +
                "Class: " + this.plantClass + "\n" +
                "Order: " + this.order + "\n" +
                "Family: " + this.family + "\n";
    }

    public void setDivision(String division)
    {
        this.division = division;
    }

    public void setPlantClass(String plantClass)
    {
        this.plantClass = plantClass;
    }

    public void setOrder(String order)
    {
        this.order = order;
    }

    public void setFamily(String family)
    {
        this.family = family;
    }
}
