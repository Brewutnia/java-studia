import java.util.Scanner;

import static java.lang.Math.sqrt;

public class zad11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("wprowadź współczynniki równania a: ");
        double a = sc.nextDouble();

        System.out.print("wprowadź współczynniki równania b: ");
        double b = sc.nextDouble();

        System.out.print("wprowadź współczynniki równania c: ");
        double c = sc.nextDouble();

        double delta, x1, x2;

        if (a == 0) {
            System.out.println("to nie jest równanie kwadratowe");
        } else {
            delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("równanie nie ma pierwiastków");
            } else if (delta == 0) {
                x1 = -b / (2 * a);
                System.out.println("x=" + x1);
            } else {
                x1 = (-b - sqrt(delta)) / (2 * a);
                x2 = (-b + sqrt(delta)) / (2 * a);
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x2);
            }



        }
    }
}
