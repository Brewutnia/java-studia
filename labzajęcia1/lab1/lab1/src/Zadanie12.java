import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        System.out.print("podaj liczbę : ");
        int N = sca.nextInt();

        int silnia = 1;
        int i;

        for (i=1;i<=N;i++) {
            silnia=silnia*i;

        } System.out.println("silnia: " + silnia);
    }
}
