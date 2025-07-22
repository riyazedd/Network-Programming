import java.io.*;
import java.net.*;

public class TCPDayTimeClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 1235);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String response = in.readLine();
        System.out.println("Server Time: " + response);

        socket.close();
    }
}
