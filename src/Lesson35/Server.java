package ClientServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket ss = null;
        Socket s = null;
        try {
            ss = new ServerSocket(9999);
        } catch (Exception ex) {
            System.out.println(ex.toString());
            System.exit(0);
        }

        int nPort = ss.getLocalPort();

        System.out.println(ss.getInetAddress().toString());
        System.out.println(
                "Local Port: " + nPort);

        while (true) {

            try {
                s = ss.accept();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Thread sThread = new Thread(new ServerThread(s));

            sThread.start();

            System.out.println(
                    "We have new connection on port : " + s.getLocalPort());
        }
    }
}

class ServerThread implements Runnable {
    Socket s = null;

    public ServerThread(Socket sSocket) {
        s = sSocket;
    }

    @Override
    public void run() {
        InputStream is = null;
        OutputStream os = null;

        try {
            is = s.getInputStream();
            os = s.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (true) {
            String szStr = null;
            try {
                szStr = recvString(is);
                sendString(os, "* " + szStr + " *");
                os.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() +
                    " : " + szStr);

            if (szStr.equals("quit"))
                break;
        }

        try {
            is.close();
            os.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static void sendString(OutputStream os,
                           String s)
            throws IOException {
        for (int i = 0; i < s.length(); i++) {
            os.write((byte) s.charAt(i));
        }
        os.write('\n');
        os.flush();
    }

    static String recvString(InputStream is)
            throws IOException {
        String szBuf = "";
        int ch = is.read();

        while (ch >= 0 && ch != '\n') {
            szBuf += (char) ch;
            ch = is.read();
        }
        return szBuf;
    }
}