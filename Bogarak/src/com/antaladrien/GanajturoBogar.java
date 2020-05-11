package com.antaladrien;

import java.util.Random;

public class GanajturoBogar extends Bogar {

    GanajturoBogar(int x, int y) {
        super(x, y);
    }

    void lep() {
        Random rand = new Random();
        int veletlenX = rand.nextInt(5);     // 0 - 4
        veletlenX -= 2;     // -2 - 2
        int veletlenY = rand.nextInt(5);     // 0 - 4
        veletlenY -= 2;     // -2 - 2
        x += veletlenX;
        y += veletlenY;
        System.out.println(kiirPozicio());
    }
}
