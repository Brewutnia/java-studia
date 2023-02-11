import java.util.Scanner;

public class zad18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ile liczb pierwszych chcesz wyznaczyć");
        int szukaneLiczbyPierwsze = sc.nextInt();
        int znalezioneLiczbyPierwsze = 0;
        boolean czyLiczbaPierwsza = true;
        int j = 2;
        int i;

        while (znalezioneLiczbyPierwsze < szukaneLiczbyPierwsze) {
            czyLiczbaPierwsza = true;
            for (i = 2; i < j; i++) {
                if (j % i == 0) {
                    czyLiczbaPierwsza = false;
                }
            }
            if (czyLiczbaPierwsza) {
                System.out.println(j);
                znalezioneLiczbyPierwsze++;
            }
            j++;
        }

    }
}

