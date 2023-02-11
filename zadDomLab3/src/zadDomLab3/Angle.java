package zadDomLab3;

import org.jetbrains.annotations.NotNull;

public class Angle {
    double x;

    public static double sin( double x){
        return Math.sin(x);
    }
    public static double cos(double x){
        return Math.cos(x);
    }
    public static double tan(double x){
        return Math.tan(x);
    }

    public static double radian(double x){
        return Math.toRadians(x);
    }

    public static double degree(double x){
        return Math.toDegrees(x);
    }

    public static @NotNull String toString(double x){
        double a = Math.toDegrees(x);
        int deg, min, sec;
        deg = (int) a;
        min = (int) ((a - deg) * 60);
        sec = (int) ((a - deg - (double) min/60) * 60 * 60);
        return String.valueOf (deg) + "°" + String.valueOf(min) + "\'" + String.valueOf(sec) + "\"";

    }



    }

    /*public static double sin (double a, double c) {
        return a/c;
    }
    public static double cos (double b, double c) {
        return b/c;
    }
    public static double tg (double a, double b) {
        return a / b;
    }
    public static double ctg (double b, double a) {
        return b / a;
    }*/

