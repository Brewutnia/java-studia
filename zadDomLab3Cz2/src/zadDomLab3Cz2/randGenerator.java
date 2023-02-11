package zadDomLab3Cz2;

import java.util.Random;

public class randGenerator {
    public static double rand(double a, double b) {
        Random r = new Random();
        return r.nextDouble(a,b);
    }
}
