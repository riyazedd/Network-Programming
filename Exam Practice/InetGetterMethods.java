 import java.net.*;
 
 public class InetGetterMethods {
    public static void main(String[] args) throws Exception {
        InetAddress add = InetAddress.getLocalHost();
        System.out.println("Host name: "+add.getHostName());
        System.out.println("Canonical Host name: "+add.getCanonicalHostName());
        // System.out.println("Address: "+add.getAddress());
        byte[] address = add.getAddress();
        System.out.print("Address: ");
        for (byte b : address) {
            System.out.print((b < 0 ? b + 256 : b) + ".");
        }

        System.out.println("\nHost address: "+add.getHostAddress());
    }
}
