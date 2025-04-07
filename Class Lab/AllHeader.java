import java.net.*;
import java.io.*;

public class AllHeader {
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++){
            try{
                @SuppressWarnings("deprecation")
                URL u = new URL(args[i]);
                URLConnection uc = u.openConnection();
                for(int j=1; ; j++){
                    String header=uc.getHeaderField(j);
                    if(header==null) break;
                    System.out.println(uc.getHeaderFieldKey(j)+": "+header);
                }

                String date = uc.getHeaderField("date");
                String expires = uc.getHeaderField("expires");
                String contentLength=uc.getHeaderField("Content-length");
                System.out.println("Date: "+date+"\nExpires: "+expires+"\nContent-Length: "+contentLength);

            }catch(MalformedURLException ex){
                System.err.println(args[i]+" is not a URL i understand");
            }catch(IOException ex){
                System.err.println(ex);
            }
            System.out.println();
        }
    }
}
