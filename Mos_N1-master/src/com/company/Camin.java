package com.company;

public class Camin {

    private int numar_cam;
    private int etaj;
    private String strada;

    public Camin() {}

    public Camin(int numar_cam, int etaj, String strada) {
        this.numar_cam = numar_cam;
        this.etaj = etaj;
        this.strada = strada;
    }

    public Camin(String strada) {
        this.strada = strada;
    }

    public void printNew() {
        System.out.println("//**************************************************************************************************************************");
    }

    public void setEtaj(int etaj) {
        this.etaj = etaj;
    }

    public void setNumarCam(int numar_cam) {
        this.numar_cam = numar_cam;
    }

    public int getNumarCam() {
        return this.numar_cam;
    }

    public int getEtaj() {
        return this.etaj;
    }

    public String getStrada() {
        return this.strada;
    }

    public void printCamin () {

        System.out.println("\nCaminul dm are loc la ===> " + "str " + getStrada() + " <===");
        System.out.print("Dm sunteti inregistrati la camin numaru ===> " + getNumarCam() + " <===");
        System.out.println(" la etajul ===> " + getEtaj() + " <===");
    }
}
