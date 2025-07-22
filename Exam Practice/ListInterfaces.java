import java.net.*;
import java.util.*;

public class ListInterfaces {
    public static void main(String[] args) throws Exception{
        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
        while(interfaces.hasMoreElements()){
            NetworkInterface ni = interfaces.nextElement();
            System.out.println("Interfaces: "+ni.getName());
        }
    }
}
