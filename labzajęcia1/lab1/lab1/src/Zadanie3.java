import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj nazwę : ");
        String nazwa = sc.nextLine();

        System.out.println(nazwa.toUpperCase());

    }
}
