import java.net.*;

public class InetAddressExamples{
    public static void main(String[] args) {
        try{
            InetAddress address = InetAddress.getByName(args[0]);
            System.out.println("Host Name: "+address.getHostName());
            System.out.println("IP Address: "+address.getHostAddress());
            System.out.println("Is Loopback: "+address.isLoopbackAddress());
            System.out.println("Is Multicast: "+address.isMulticastAddress());
        }catch(UnknownHostException ex){
            System.err.println(ex);
        }
    }
}