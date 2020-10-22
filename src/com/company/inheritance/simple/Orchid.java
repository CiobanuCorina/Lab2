package com.company.inheritance.simple;

public class Orchid extends Plante{
    private String genus;
    private String pollination;
    public Orchid(String genus, String pollination)
    {
        super("Magnoleophyta", "Liliopsida", "Asparagales", "Orchidaceae");
        this.genus = genus;
        this.pollination = pollination;
    }

    public String getGenus()
    {
        return this.genus;
    }

    public String getPollination()
    {
        return this.pollination;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Genus: " + this.genus + "\n" +
                "Pollination: " + this.pollination;
    }

    public void setGenus(String genus)
    {
        this.genus = genus;
    }

    public void setPollination(String pollination)
    {
        this.pollination = pollination;
    }

}
