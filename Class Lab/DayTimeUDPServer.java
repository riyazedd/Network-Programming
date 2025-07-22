import java.util.*;
import java.io.*;
import java.net.*;

public class DayTimeUDPServer {
    private final static int PORT = 13;
    public static void main(String[] args) {
        try(DatagramSocket socket = new DatagramSocket(PORT)){
            while (true) {
                try{
                    DatagramPacket request = new DatagramPacket(new byte[1024],1024);
                    socket.receive(request);

                    String daytime = new Date().toString();
                    byte[] data = daytime.getBytes();

                    DatagramPacket response = new DatagramPacket(data,data.length,request.getAddress(),request.getPort());
                    socket.send(response);
                }catch(IOException | RuntimeException ex){
                   System.err.println(ex);
                }   
            }
        }catch(IOException ex){
            System.err.println(ex);
        }
    }
}
