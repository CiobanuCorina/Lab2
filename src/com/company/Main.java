package com.company;

import com.company.encapsulation.Haine;
import com.company.encapsulation.Pictura;
import com.company.inheritance.hierarchical.Lactate;
import com.company.inheritance.hierarchical.Detergenti;
import com.company.inheritance.hierarchical.Magazin;
import com.company.inheritance.simple.Orchid;
import com.company.inheritance.simple.Plante;

public class Main {

    public static void main(String[] args) {
        Haine bluza = new Haine("dame", 36, "coton");
        System.out.println(bluza.print());

        bluza.setMarime(40);
        System.out.println(bluza.print());

        System.out.println(bluza.getMaterial());


        Pictura daVinci = new Pictura("Omul vitruvian", "Leonardo da Vinci", 136, 56);
        System.out.println(daVinci.print());

        daVinci.setLatime(90);
        System.out.println(daVinci.print());

        System.out.println(daVinci.getDenumire());

        System.out.println("--------------------------------------------------------");

        Plante apple = new Plante("Tracheophyta","Magnoliopsida","Rosales","Rosaceae");
        System.out.println(apple.print());

        System.out.println(apple.getPlantClass());
        apple.setDivision("Magnoliophyta");

        System.out.println(apple.print());

        Orchid laelia = new Orchid("Laelia","cross pollination");
        System.out.println(laelia.print());

        System.out.println("---------------------------------------------------");

        Magazin nr1 = new Magazin("Nr. 1", "Vasile Cretu",2000,"Stefan cel Mare 3");
        System.out.println(nr1.print());

        Lactate branza = new Lactate("Nr. 1",
                "Vasile Cretu",
                2000,
                "Stefan cel Mare 3",
                "20.03.2021",
                "JLC");

        System.out.println(branza.print());

        Detergenti sano = new Detergenti("Zolusca",
                "Anrei Sajin",
                2010,
                "Mihai Viteazu 12",
                "spalarea vaselor");
        System.out.println(sano.print());
    }

}
