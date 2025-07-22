import java.net.*;
import java.io.*;

public class UDPServer {
    public static void main(String[] args) {
        try(DatagramSocket socket=new DatagramSocket(8000)){
            System.out.println("Server running");

            DatagramPacket request = new DatagramPacket(new byte[1024],1024);
            socket.receive(request);

            String message = new String(request.getData(),0,request.getLength());
            int num = Integer.parseInt(message);
            String res;
            res = num%2==0 ? "Number is Even" : "Number is Odd";
            byte[] data = res.getBytes();

            DatagramPacket response = new DatagramPacket(data,data.length,request.getAddress(),request.getPort());
            socket.send(response);

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
