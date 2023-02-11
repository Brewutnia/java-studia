import java.util.Scanner;



public class Zadanie8 {
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);

        System.out.print("Podaj pesel : ");
        String pesel = sca.nextLine();

        int cyfra = Character.getNumericValue(pesel.charAt(9));

        if (cyfra % 2 == 0) {
            System.out.println("Jesteś kobietą");
        } else {
            System.out.println("Jesteś mężczyzną");
        }
    }
}