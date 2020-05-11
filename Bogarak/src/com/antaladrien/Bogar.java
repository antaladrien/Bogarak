package com.antaladrien;

public class Bogar {
    int x;
    int y;

    Bogar(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void lep() {}

    String kiirPozicio() {
        return "x: <" + x + "> y: <" + y + ">";
    }
}
