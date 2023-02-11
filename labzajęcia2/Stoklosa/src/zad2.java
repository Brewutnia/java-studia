import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj imię: ");

        String imie = sc.nextLine();

        for (int i = 0; i < imie.length(); i++)
        {
            if (imie.charAt(i) == 'a') {
                System.out.print('A');
            }else {
                System.out.print(imie.charAt(i));
            }
        }
    }
}
