import java.net.*;
public interface CheckIPVersion {
    public static void main(String[] args) throws Exception{
        InetAddress add = InetAddress.getByName(args[0]);
        byte[] version = add.getAddress();
        if(version.length==4)
            System.out.println("Ipv4");
        else
            System.out.println("Ipv6");
    }
}
