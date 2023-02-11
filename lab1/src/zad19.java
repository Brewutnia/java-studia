import java.util.Scanner;
import java.util.Random;

public class zad19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile liczb ma być losowanych: ");
        int ileLiczb = scanner.nextInt();

        Random rand = new Random();

        int min = 1000;
        int max = 0;
        int i = 1;

        while (i <= ileLiczb) {
            int n = rand.nextInt(1000) + 1;
            System.out.println("losowe liczby: " + n);
            i++;
            if (n<min){
                min = n;
            }
            if (n>max){
                max = n;
            }
        }
        System.out.println("Wartość najmniejsza: " + min);
        System.out.println("Wartość największa: " + max);
    }
}

