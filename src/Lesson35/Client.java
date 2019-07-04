package ClientServer;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

import static ClientServer.ServerThread.recvString;
import static ClientServer.ServerThread.sendString;

public class Client {
    public static void main(String[] args) {
        Socket s = null;
        try {
            s = new Socket("127.0.0.1", 9999);
    //        s = new Socket("localhost", 15099);
        } catch (Exception ex) {
            System.out.println(ex.toString());
            System.exit(0);
        }

        int nPort = s.getLocalPort();
        System.out.println("Local Port: " + nPort);

        InputStream is;
        OutputStream os;

        try {
            is = s.getInputStream();
            os = s.getOutputStream();
            String szStr;
            Scanner scanner = new Scanner(System.in);
            while (true) {
                szStr = scanner.next();
                sendString(os, szStr);
                os.flush();
                System.out.println("If u wanna exit please enter \"quit\"");
                if (szStr.equals("quit"))
                    break;
//                szStr = recvString(is);
//                System.out.println(szStr);
            }
            is.close();
            os.close();
            s.close();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
