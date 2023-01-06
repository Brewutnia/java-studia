import java.util.Random;
import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Random g = new Random();
        int losowanaLiczba = g.nextInt(10) + 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Zgadnij jaką liczbę z zakresu 1-10 wylosował komputer:");
        int zgadywanaLiczba = sc.nextInt();

        int[] liczbaprob = new int[10];

        for (int i = 0; i < liczbaprob.length; i++) {

            liczbaprob[i] = i + 1;
            if (zgadywanaLiczba > losowanaLiczba) {
                System.out.println("Podana przez Ciebie liczba jest większa od liczby wylosowanej przez komputer");
                zgadywanaLiczba = sc.nextInt();
            } else if (zgadywanaLiczba < losowanaLiczba) {
                System.out.println("Podana przez Ciebie liczba jest mniejsza od liczby wylosowanej przez komputer");
                zgadywanaLiczba = sc.nextInt();
            } else if (zgadywanaLiczba == losowanaLiczba && i != 0) {
                System.out.println("bingo, " + "liczba prób: " + liczbaprob[i]);
                break;
            } else {
                System.out.println("mistrz");
                break;
            }

        }
    }
}
