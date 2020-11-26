package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Camin camin = new Camin(3,10,"Studentilor 7/1");

        camin.printCamin();
        camin.printNew();

        Scanner cin = new Scanner(System.in);

        Camera camera = new Camera(camin.getNumarCam(), 10,"Studentilor 7/1");
        camera.printCamin();
        camera.printNew();

        Camera camera1 = new Camera("Studenrilor 9/2");

        System.out.println("Dati numar camerei nou!"); int new_cam = cin.nextInt();
        camera1.setNumarCam(new_cam);

        System.out.println("Datin etajul nou!"); int new_etaj = cin.nextInt();
        camera1.setEtaj(new_etaj);

        camera1.printCamin();
        System.out.println(camera);
    }
}