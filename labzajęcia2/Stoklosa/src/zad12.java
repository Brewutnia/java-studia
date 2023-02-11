import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {
        int [] t = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj 5 znaków");


        for (int i = 0; i < t.length; i++) {
            int znaki = sc.nextInt();
            t[i] = znaki;
        }
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i]);
        }
    }
}
