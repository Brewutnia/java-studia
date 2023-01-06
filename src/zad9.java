import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków, który chcesz skompresować");
        String ciagZnakow = sc.nextLine();

        String skompresowany = "";
        int powt = 1;
        char znak = ciagZnakow.charAt(1);
        char poprzedniZnak = ciagZnakow.charAt(0);

        for (int i = 1; i < ciagZnakow.length(); i++) {
            znak = ciagZnakow.charAt(i);
            poprzedniZnak = ciagZnakow.charAt(i - 1);
            if ( znak != poprzedniZnak ) {
                skompresowany = skompresowany + poprzedniZnak + powt + ";";
                powt = 1;
            }
            else {
                powt++;
            }
        }
        skompresowany = skompresowany + znak + powt;
        System.out.print(skompresowany);
    }
}

