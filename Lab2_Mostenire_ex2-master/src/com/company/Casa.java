package com.company;

public class Casa {
    private  int aria;
    private  int etaje;
    private String disain;

    public Casa() {}

    public Casa(int aria, int etaje, String disain) {
        this.aria = aria;
        this.etaje = etaje;
        this.disain = disain;
    }

    public Casa(int aria, String disain) {
        this.aria = aria;
        this.disain = disain;
    }

    public void setAria(int aria) {
        this.aria = aria;
    }

    public void setEtaje(int etaje) {
        this.etaje = etaje;
    }

    public void setDisain(String disain) {
        this.disain = disain;
    }

    public int getAria() {
        return aria;
    }

    public int getEtaje() {
        return etaje;
    }

    public String getDisain() {
        return disain;
    }

    public void print() {
        System.out.println("\nCasa dm are ===> " + getAria() + " m^2 <=== ");
        System.out.println("Ea are ===> " + getEtaje() + " <=== etaje");
        System.out.println("Disain in stilul ===> " + getDisain() + " <===" );
    }

    public void prinNew() {
        System.out.println("//**********************************************************************************");
    }
}
