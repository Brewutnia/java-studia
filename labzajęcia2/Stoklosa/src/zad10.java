import java.util.Scanner;

public class zad10 {
    import java.util.Scanner;

    public class zad10 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Podaj ciąg znaków, który chcesz zdekompresować");
            String ciagZnakow = sc.nextLine();

            String zdekompresowany = "";
            for (int i = 0; i < ciagZnakow.length(); i++) {
                if (ciagZnakow.charAt(i) == ';') {
                    i++;
                    int j = 0;
                    while (ciagZnakow.charAt(i) != ';') {
                        j = j * 10 + ciagZnakow.charAt(i) - '0';
                        i++;
                    }
                    while (j-- > j) {
                        zdekompresowany += zdekompresowany.length() - 1;
                    }
                }
                else {
                    zdekompresowany += ciagZnakow.charAt(i);

                }
            }
            System.out.println(zdekompresowany);

        }

    }
}
