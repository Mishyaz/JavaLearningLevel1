package ex16;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketDispatcher implements Runnable {
    private Socket socket;

    public SocketDispatcher(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            test(socket);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void test(Socket socket) throws IOException {
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();

        //прочитать
        String html = "<html>" +
                "<head><body><title>Super server a la apache</title></head>" +
                "<h1>Hi, java!</h1>" +
                "<br/>" +
                "<img src='http://obovsem.pp.ua/wp-content/uploads/kotiki-31.jpg'>" +
                "</body>" +
                "</html>";

        String header = "HTTP/1.1 200 OK\n" +
                "Content-Type: text/html\n" +
                "Content-Length: " + html.length() + "\n" +
                "Conection: closed\n\n";

        String resultText = header + html;

        outputStream.write(resultText.getBytes());
    }
}


