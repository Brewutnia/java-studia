import java.net.InetAddress;
import java.net.UnknownHostException;

public class zad2 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Wywołanie programu: Main nazwa_hosta");
            System.exit(0);
        }

        for (int i = 0; i < args.length; i++) {
            String host = args[i];
            InetAddress inetAddress = null;
            try {
                inetAddress = InetAddress.getByName(host);
            } catch (UnknownHostException e) {
                System.out.println("Nie można uzyskać adresu IP dla hosta " + host);
                System.exit(0);
            }
            String ip = inetAddress.getHostAddress();
            System.out.println("Adres IP " + host + " to " + ip);
        }
    }
}
