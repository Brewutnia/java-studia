package serer.klient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Serwer {
    public static final int PORT=50010;

    public static void main(String[] args) throws IOException {
        ServerSocket serv;
        serv=new ServerSocket(PORT);

        System.out.println("Nasluchuje: " + serv);
        Socket sock;
        sock=serv.accept();
        System.out.println("Jest polaczenie: "+sock);

        BufferedReader inp;
        inp=new BufferedReader(new InputStreamReader(sock.getInputStream()));

        String str;
        str=inp.readLine();
        System.out.println("<Odebrano:> " + str);

        System.out.println("Kończę działanie serwera");

        inp.close();
        sock.close();
        serv.close();

    }
}
