import java.io.*;
import java.net.*;

public class AllMimeHeaders {
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++){
            try{
                @SuppressWarnings("deprecation")
                URL u = new URL(args[i]);
                URLConnection uc = u.openConnection();
                for(int j=0; ; j++){
                    String header= uc.getHeaderField(j);
                    if(header==null) break;
                    System.out.println(uc.getHeaderField(j)+": "+header);
                }
            }catch(MalformedURLException ex){
                System.err.println(ex);
            }catch(IOException ex){
                System.err.println(ex);
            }
        }
    }
}
