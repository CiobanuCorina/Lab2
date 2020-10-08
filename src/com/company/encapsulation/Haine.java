package com.company.encapsulation;

public class Haine {
    private String model;
    private int marime;
    private String material;

    public Haine(String model, int marime, String material)
    {
        this.model = model;
        this.marime = marime;
        this.material = material;
    }



    public String getModel()
    {
        return this.model;
    }

    public int getMarime()
    {
        return this.marime;
    }

    public String getMaterial()
    {
        return this.material;
    }



    public String print()
    {
        return "Model: " + this.model + "\n" +
                "Marime: " + this.marime + "\n" +
                "Material: " + this.material + "\n";
    }


    public void setModel(String model)
    {
        this.model = model;
    }

    public void setMarime(int marime)
    {
        this.marime = marime;
    }

    public void setMaterial(String material)
    {
        this.material = material;
    }

}
