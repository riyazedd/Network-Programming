import java.net.*;
import java.io.*;

public class UDPClient {
    public static void main(String[] args) {
        try(DatagramSocket socket = new DatagramSocket();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in))){
            InetAddress host = InetAddress.getByName("localhost");

            String message = in.readLine();
            byte[] data = message.getBytes();

            DatagramPacket request = new DatagramPacket(data,data.length,host,8000);
            socket.send(request);

            DatagramPacket response = new DatagramPacket(new byte[1024],1024);
            socket.receive(response);

            String result = new String(response.getData(),0,response.getLength());
            System.out.println(result);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
