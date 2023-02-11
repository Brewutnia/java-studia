import java.util.Random;

public class zaddwa {
    public static void main(String[] args) {
        Random g = new Random ();
        int los = g.nextInt(10)+1;
        System.out.println(los);
        if (los%2 == 0){
            System.out.println("Sukces");
        } else {
            System.out.println("Porażka");
        }
    }
}
