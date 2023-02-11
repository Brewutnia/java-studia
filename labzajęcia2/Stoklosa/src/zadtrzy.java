import java.util.Random;

public class zadtrzy {
    public static void main(String[] args) {
        Random g = new Random ();
        int los = g.nextInt(2);

        if (los == 0){
            System.out.println("reszka");
        } else {
            System.out.println("orzeł");
        }
    }
}
