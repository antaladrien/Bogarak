package com.antaladrien;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Bogar b1 = new KaticaBogar(2,3);
        Bogar b2 = new Csodabogar(-4, -8);
        Bogar b3 = new GanajturoBogar(4, 4);

        for (int i = 0; i < 10; i++) {
            System.out.println("KaticaBogar: ");
            b1.lep();
            System.out.println("Csodabogar: ");
            b2.lep();
            System.out.println("GanajturoBogar: ");
            b3.lep();
            System.out.println();
            System.out.println();
            Thread.sleep(1000);
        }
    }
}
