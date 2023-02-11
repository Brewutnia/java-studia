import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj liczbe : ");
        int liczba = sc.nextInt();

        if (liczba % 2 == 0)
        {
            System.out.println("Liczba jest parzysta");
        } else {
            System.out.println(" Liczba jest nieparzysta");

        }
    }
}
