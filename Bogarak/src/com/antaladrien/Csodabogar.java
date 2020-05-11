package com.antaladrien;

import java.util.Random;

public class Csodabogar extends Bogar {

    Csodabogar(int x, int y) {
        super(x, y);
    }

    void lep() {
        Random rand = new Random();
        int veletlenX = rand.nextInt(3);     // 0 - 2
        veletlenX -= 2;     // -2 - 0
        int veletlenY = rand.nextInt(3);     // 0 - 2
        x += veletlenX;
        y += veletlenY;
        System.out.println(kiirPozicio());
    }
}
