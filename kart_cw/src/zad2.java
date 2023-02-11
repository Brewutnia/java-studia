import java.sql.SQLOutput;
import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj miasto");
        String miasto = scanner.nextLine();


        int i = 0;
        char litera = miasto.charAt(i);
        while (i < miasto.length()){
             if (litera == 'b')
                System.out.println(litera);

             i++;
            }
           // System.out.println(n);
        }
    }

