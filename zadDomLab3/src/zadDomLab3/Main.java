package zadDomLab3;

public class Main {
    public static void main(String[] args) {
        Angle angle = new Angle();


        /*angle.x = Math.PI;*/
        angle.x = 1;

        double y = 180;
        System.out.println(angle.sin(angle.x));
        System.out.println(angle.cos(angle.x));
        System.out.println(angle.tan(angle.x));

        System.out.println(angle.radian(angle.x));
        System.out.println(angle.degree(angle.x));

        System.out.println(angle.toString(angle.x));



       /* System.out.println(angle.sin(4,3));
        System.out.println(angle.cos(5,3));
        System.out.println(angle.tg(4,5));
        System.out.println(angle.ctg(5,4));*/


    }
}