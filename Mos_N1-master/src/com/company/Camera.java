package com.company;

public class Camera  extends  Camin {

    private int pret = 1910;
    private int cat_pers_cam = 3;

    Camera(){}

    public Camera(String strada) {
        super(strada);
    }

    public Camera(int numar_cam, int etaj, String strada, int pret) {
        super(numar_cam, etaj, strada);
    }

    public Camera(int numar_cam, int etaj, String strada) {
        super(numar_cam, etaj, strada);
    }

    @Override
    public void printCamin() {
        super.printCamin();
    }

    @Override
    public String toString() {
        return "Pretul va fi ===> " + pret + " lei <===" + "\nCamera cu ===> " +
                cat_pers_cam + " persoane <===";
    }
}
