package pl.pols.spd;

import java.util.Random;

public class Moneta {
    char rzut() {
        Random g = new Random();
        if (g.nextInt(2) == 0) {
            return 'r';
        } else {
            return 'o';
        }
    }
}
