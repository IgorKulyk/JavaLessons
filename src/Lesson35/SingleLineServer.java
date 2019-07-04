package ClientServer;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SingleLineServer {
    public static void main(String[] args) {
        ServerSocket serverSocke = null;
        Socket socket = null;

        try {
            serverSocke = new ServerSocket(9999);
            socket = serverSocke.accept();
        } catch (IOException e) {
            e.printStackTrace();
        }


        String res = "";

        InputStream inputStream = null;

        try {
            inputStream = socket.getInputStream();
            res = recvString(inputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] resSplit = res.split("_");

        UserWithMessage userWithMessage =
                new UserWithMessage(
                        resSplit[0],
                        resSplit[1]
                );

        System.out.println(userWithMessage.name);
        System.out.println(userWithMessage.message);

//        void add(UserWithMessage userWithMessage) {
//
//            document.put("name", userWithMessage.name);
//            document.put("message", userWithMessage.message);
//
//            db.insert(document);
//        }


        try {
            inputStream.close();
            socket.close();
            serverSocke.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
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

class UserWithMessage{
    String name;
    String message;

    public UserWithMessage(String name, String message) {
        this.name = name;
        this.message = message;
    }
}
