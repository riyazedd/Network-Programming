import java.io.*;
import java.net.*;

public class MessageServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(1236);
        System.out.println("Server started...");

        Socket socket = serverSocket.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        String message;
        while ((message = in.readLine()) != null) {
            System.out.println("Client: " + message);
            out.println("Message received");
        }

        socket.close();
        serverSocket.close();
    }
}
