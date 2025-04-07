import java.net.*;

public class ProtocolTester {
    public static void main(String[] args) {
        testProtocol("http://adc.org");
        testProtocol("https://www.facebook.com");
    }

    public static void testProtocol(String url){
        try{
            @SuppressWarnings("deprecation")
            URL u = new URL(url);
            System.out.println(u.getProtocol()+" is supported.");
        }catch(MalformedURLException ex){
            String protocol = url.substring(0,url.indexOf(':'));
            System.out.println(protocol+" is not supported");
        }
    }
}
