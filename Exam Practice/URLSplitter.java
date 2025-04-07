import java.net.*;

public class URLSplitter {
    public static void main(String[] args) {
        for(int i=0; i<args.length; i++){
            try{
                @SuppressWarnings("deprecation")
                URL u = new URL(args[i]);
                System.out.println("URL: "+u);
                System.out.println("Protocol: "+u.getProtocol());
                System.out.println("User Info: "+u.getUserInfo());
                System.out.println("Path: "+u.getPath());
                System.out.println("Port: "+u.getPort());
            }catch(MalformedURLException ex){
                System.err.println(args[i]+" is not a URL I understand.");
            }
            System.out.println();
        }
    }
}
