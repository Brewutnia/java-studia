public class zad20 {
    public static void main(String[] args) {
        int n = 6;
        int i;
        int j;

        for (i=0;i<=n;i++){
            for (j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for (j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
