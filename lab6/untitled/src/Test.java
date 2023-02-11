class MojWyjatek extends Throwable {
}
public class Test {
    public static void main(String[] args) {
        try {
            mojaMetoda();
        } catch (MojWyjatek e) {
            System.out.println("Wystapil wyjątek");
        }
    }
    public static void mojaMetoda() throws MojWyjatek {
        throw new MojWyjatek ();
    }
}