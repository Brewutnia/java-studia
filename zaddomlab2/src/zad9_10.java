import java.util.Scanner;

public class zad9_10 {
    public static void main(String[] args) {
        String tekst;
        Scanner sc = new Scanner(System.in);
        String wynik = " ";
        System.out.print("Podaj swój tekst: ");
        tekst = sc.nextLine();
        int znak = 1;
        char znakChar =' ';

        for (int i = 0; i < tekst.length(); i++) {
            if (i == tekst.length()- 1 || tekst.charAt(i) != tekst.charAt(i + 1))  {
//                System.out.println("Sprawdził warunek");
                znakChar = tekst.charAt(i);
//                System.out.println("Przypisał znak");
                wynik = wynik + String.valueOf(znakChar) + String.valueOf(znak);
                znak = 1;
                znakChar = ' ';
            }else if (tekst.charAt(i) == tekst.charAt(i + 1)) {
//                System.out.println("Przeszedł do elsa");
                znakChar = tekst.charAt(i);
                znak++;
            }
        }
        wynik = wynik.substring(1, wynik.length());
        System.out.println(wynik);

        int powrot = 1;
        char znakPowrot = ' ';
        String tekstPowrot = " ";
        for (int i = 0; i < wynik.length(); i++) {
//            System.out.println("Pierwsza pętla");
            if (i%2 == 0) {
                znakPowrot = wynik.charAt(i);
            } else {
                powrot = Character.getNumericValue(wynik.charAt(i));
                for (int j = 0; j < powrot; j++) {
                    tekstPowrot = tekstPowrot + String.valueOf(znakPowrot);
                }
                powrot = 1;
                znakPowrot = ' ';
            }


        }
        System.out.println(tekstPowrot);
    }
}