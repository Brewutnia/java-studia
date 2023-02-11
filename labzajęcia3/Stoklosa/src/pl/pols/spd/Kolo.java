package pl.pols.spd;

public class Kolo {
    double r;
    double obwod () {
        return 2*Math.PI*r;
    }
    double pole () {
        return Math.PI*Math.pow(r,2);
    }
}
