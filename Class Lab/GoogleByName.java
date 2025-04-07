import java.net.*;

public class GoogleByName {
    public static void main(String[] args){
        try{
            // InetAddress address= InetAddress.getByName("www.google.com");
            // System.out.println(address);

            InetAddress address= InetAddress.getByName("208.201.239.100");
            System.out.println(address.getHostName());


        }catch(UnknownHostException ex){
            System.out.println("Could not found www.google.com");
        }
    }
}
