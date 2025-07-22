import java.io.*;
import java.net.*;
import java.util.Date;

public class TCPDayTimeServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(1235);
        System.out.println("Daytime Server started...");

        Socket client = serverSocket.accept();
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);
        out.println(new Date());

        client.close();
        serverSocket.close();
    }
}
