import java.net.*;
import java.io.*;

public class TCPEchoServer {
    public static void main(String[] args) throws Exception{
        ServerSocket server= new ServerSocket(8000);
        System.out.println("Server Running");
        Socket client=server.accept();

        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter out = new PrintWriter(client.getOutputStream(),true);

        String message;
        while((message=in.readLine())!=null){
            out.println("Echo:"+message);
            System.out.println(message);
        }

        client.close();
        server.close();
    }
}
