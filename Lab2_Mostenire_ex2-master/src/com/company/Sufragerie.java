package com.company;

public class Sufragerie extends Casa {

    private String tavanele;
    private String culoare_perete;

    Sufragerie() {}

    public Sufragerie(int aria, String disain, String tavanele, String culoare_perete) {
        super(aria, disain);
        this.tavanele = tavanele;
        this.culoare_perete = culoare_perete;
    }



    public void setTavanele(String tavanele) {
        this.tavanele = tavanele;
    }

    public void setCuloarePerete(String culoare_perete) {
        this.culoare_perete = culoare_perete;
    }

    public String getTavanele() {
        return this.tavanele;
    }

    public String getCuloarePerete() {
        return this.culoare_perete;
    }

    public void print() {
        System.out.println("\nCasa dm are ===> " + getAria() + " m^2 <=== ");
        System.out.println("Disain in stilul ===> " + getDisain() + " <===" );
    }
}
