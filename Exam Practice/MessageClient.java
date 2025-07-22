import java.io.*;
import java.net.*;

public class MessageClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 1236);
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String message;
        while ((message = input.readLine())!=null) {
            out.println(message);
            System.out.println("Server: " + in.readLine());
        }

        socket.close();
    }
}
