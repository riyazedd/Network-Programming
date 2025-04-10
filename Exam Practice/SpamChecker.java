import java.net.*;

public class SpamChecker {
    public static final String BLACKHOLE="sbl.spamhaus.org";

    public static void main(String[] args) {
        for(String arg:args){
            if(isSpammer(arg))
                System.out.println(arg+" is known Spammer");
            else
                System.out.println(arg+" seems legitimate.");
        }
    }

    public static boolean isSpammer(String arg){
        try{
            InetAddress add = InetAddress.getByName(arg);
            byte[] quad = add.getAddress();
            String query = BLACKHOLE;
            for(byte octet:quad){
                int unsignedByte=octet<0 ? octet+256 : octet;
                query = unsignedByte+"."+query;
            }
            InetAddress.getByName(query);
            return true;
        }catch(UnknownHostException ex){
           return false;
        }
    }
}
