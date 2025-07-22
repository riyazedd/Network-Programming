import java.io.*;
import java.net.*;

public class TCPMultithreadClient {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("localhost",3000);

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String num;
        while((num=input.readLine())!=null){
            out.println(num);
            System.out.println(in.readLine());
        }

        socket.close();
    }
}
