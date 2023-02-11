public class zad4 {
    public static void main(String[] args) {

        for (int j = 1; j <= 10; j++) {
            for (int i =1; i<=10; i++) {
                System.out.print(i*j + " ");
            }
            if ( j % 2 != 0)
                continue;
            System.out.println();
        }
    }
}
