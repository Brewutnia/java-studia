import java.util.Scanner;

public class zadkartko {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj liczbę");

        int liczba = sc.nextInt();
        int i = 1;

        //   for (int i = 1; i <= liczba; i++) {
        //         System.out.println(i);
        //   }
       // while (i <= liczba) {
         //   System.out.println(i);
         //   i++;

      //  }
        do {
            System.out.println(i);
            i++;
        }while (i <= liczba);
    }
}
