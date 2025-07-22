import java.io.*;
import java.net.*;

public class TCPEchoClient {
    public static void main(String[] args) throws Exception{
        Socket server = new Socket("localhost",8000);

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(server.getOutputStream(),true);
        BufferedReader in = new BufferedReader(new InputStreamReader(server.getInputStream()));

        String message;
        while((message=input.readLine())!=null){
            out.println(message);
            System.out.println(in.readLine());
        }

        server.close();

    }
}
