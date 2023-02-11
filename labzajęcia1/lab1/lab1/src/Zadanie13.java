import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        System.out.print("podaj liczbę : ");
        int N = sca.nextInt();
        int wynik = 0;
        int i = 0;
        while (i < N) {
            System.out.println("podaj liczbe : ");
            int temp = sca.nextInt();
            wynik += temp;
            i++;
        }

        System.out.println(wynik/N);
    }


}
