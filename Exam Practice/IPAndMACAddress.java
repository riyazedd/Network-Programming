import java.net.*;
import java.util.*;

public class IPAndMACAddress {
    public static void main(String[] args) throws Exception {
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println("IP address: " + ip.getHostAddress());

        NetworkInterface ni = NetworkInterface.getByInetAddress(ip);
        byte[] mac = ni.getHardwareAddress();

        System.out.print("MAC address: ");
        for (int i = 0; i < mac.length; i++) {
            System.out.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : "");
        }
    }
}