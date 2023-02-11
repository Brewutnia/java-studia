import javax.swing.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        InetAddress inetAddress = null;
        try {
            inetAddress = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            System.out.println("Nie można uzyskać adresu IP");
            System.exit(0);
        }
        String ip = inetAddress.getHostAddress();
        System.out.println("Adres IP tego komputera to: " + ip);

        String name = inetAddress.getHostName();
        System.out.println("nazwa tego komputera to: " + name);

       /* Zad3 zad3 = new Zad3();
        zad3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        zad3.setVisible(true);
        }*/
    }
}
