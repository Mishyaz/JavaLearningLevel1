package ex16;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer2 {
    public static void start() throws IOException {
        ServerSocket serverSocket = new ServerSocket(8084);

        while (true) {
            Socket socket = serverSocket.accept();

            new Thread(new SocketDispatcher(socket)).start();
        }

//        serverSocket.close();
    }
}
