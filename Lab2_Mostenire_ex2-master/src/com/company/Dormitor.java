package com.company;

public class Dormitor extends Sufragerie {

    private int lungimea_h;
    private String podea;

    public Dormitor() {}

    public Dormitor(int aria, String disain, String tavanele,String culoarea_perte,
                    int lungimea_h, String podea) {

        super(aria,disain,tavanele,culoarea_perte);
        this.lungimea_h = lungimea_h;
        this.podea = podea;
    }

    public void setLungimeaH(int lungimea_h) {
        this.lungimea_h = lungimea_h;
    }

    public void setPodea(String podea) {
        this.podea = podea;
    }

    public int getLungimeaH() {
        return lungimea_h;
    }

    public String getPodea() {
        return podea;
    }

    @Override
    public void print() {
        super.print();
        System.out.print("In dormitoir lungimea de la podea pan la tavanele va fi ===> " + getLungimeaH()
                + " <===");
        System.out.println(" si podea facuta de ===> " + getPodea() + " <===");
    }
}
