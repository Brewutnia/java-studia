import java.util.Random;

public class zad4 {
    public static void main(String[] args) {
        Random g = new Random();
        int los = g.nextInt(2);

        int liczbaReszek = 0;
        for (int i=0; i < 10; i++) {
            int moneta = g.nextInt(2);
            if (moneta ==0) {
                liczbaReszek++;
            }
        }
        if (liczbaReszek>5){
            System.out.println("Na piwo!");
        }

        int i = 0;
        do {
            int moneta = g.nextInt(2);
            if (moneta == 0) {
                liczbaReszek++;
                i++;
            }
        }while (i < 10);
        if (liczbaReszek>5){
            System.out.println("Na piwo");
        }
    }
}

