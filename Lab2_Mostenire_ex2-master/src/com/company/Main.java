package com.company;

public class Main {

    public static void main(String[] args) {
        Casa casa = new Casa(123,2,"hi-tech");
        casa.print();
        casa.prinNew();

        Sufragerie sufragerie = new Sufragerie(19,"avangard",
                        "tavan întins", "blue");

        sufragerie.print();
        sufragerie.prinNew();

        Dormitor dormitor = new Dormitor(12,"Ampir","gips_korton","rosu",
                12,"laminat");
        dormitor.print();

    }
}
