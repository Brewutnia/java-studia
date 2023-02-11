import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        System.out.print("dzień tygodnia : ");
        int N = sca.nextInt();

        switch (N) {
            case 1:
                System.out.println("poniedziałek");
                break;
            case 2:
                System.out.println("wtorek");
                break;
            case 3:
                System.out.println("środa");
                break;
            case 4:
                System.out.println("czwartek");
                break;
            case 5:
                System.out.println("piątek");
                break;
            case 6:
                System.out.println("sobota");
                break;
            case 7:
                System.out.println("niedziela");
                break;
            default:
                System.out.println("nieprawidłowy dzień tygodnia");
        }
    }
}
