package com.antaladrien;

import java.util.Random;

public class KaticaBogar extends Bogar {

    KaticaBogar(int x, int y) {
        super(x, y);
    }

    void lep() {
        Random rand = new Random();
        int veletlenX = rand.nextInt(3);     // 0 - 2
        veletlenX--;     // -1 - 1
        int veletlenY = rand.nextInt(3);     // 0 - 2
        veletlenY--;     // -1 - 1
        x += veletlenX;     // ha x = 5, akkor + (-1, 0, 1)
        y += veletlenY;
        System.out.println(kiirPozicio());
    }
}
