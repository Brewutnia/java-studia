import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;


public class Zad3 extends JFrame implements ActionListener {
    public static void main(String[]args){

        Zad3 zad3 = new Zad3();
        zad3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        zad3.setVisible(true);
    }
    JButton konwert;
    JTextField hostName;
    JTextField hostIp;

    public Zad3() {
        setSize(500, 200);
        setLayout(null);

        konwert = new JButton("Konwertuj");
        konwert.setBounds(350, 25, 100, 30);
        add(konwert);
        konwert.addActionListener(this);

        hostName = new JTextField();
        hostName.setBounds(100, 25, 200, 30);
        add(hostName);

        hostIp = new JTextField();
        hostIp.setBounds(100, 60, 200, 30);
        add(hostIp);

    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        String [] args = new String [3];
        Object target = ev.getSource();

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

            if (target == konwert);
            hostIp.setText(ip);
            System.out.println("Adres IP " + host + " to " + ip);
        }
    }
}







