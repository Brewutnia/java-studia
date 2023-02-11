package obiekty_i_pakiety;

public class Main {
    public static void main(String[] args) {
        MyNumber numer = new MyNumber(4);
        System.out.println(numer.isEven());
        System.out.println(numer.isOdd());
        double pierwiastek = numer.sqrt();
        System.out.println(pierwiastek);

    }
}