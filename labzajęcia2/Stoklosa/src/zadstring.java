import java.util.Scanner;

public class zadstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadź datę");

        String data = sc.nextLine();
        //System.out.println(data.substring(3,5));
        int m = Integer.parseInt(data.substring(0,2));
        int n = Integer.parseInt(data.substring(3,5));
        int l = Integer.parseInt(data.substring(6,8));

        System.out.println(m + n + l);
    }
}
