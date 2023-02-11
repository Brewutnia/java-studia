import java.util.InputMismatchException; // 1
import java.util.Scanner;

import static java.lang.Math.abs;

public class GetInt {
    public static void main(String[] args) {
        boolean wartoscWprowadzona = false; // 2
        int x = 0;
        while (!wartoscWprowadzona) { // 3
            try {
                System.out.print("Podaj liczbę: ");
                x = getInt(); // 4
                wartoscWprowadzona = true; // 5
            } catch (InputMismatchException e) { // 6
                System.out.println("To nie jest liczba!");
            }
        }
        int modul = abs(x);
        System.out.println("Moduł tej liczby wynosi " + modul);
    }
    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}