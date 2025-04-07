import java.io.*;
import java.net.*;

public class RetriveURL {
    public static void main(String[] args) {
        try{
            @SuppressWarnings("deprecation")
            URL u = new URL("https://www.google.com");
            InputStream in = u.openStream();
            int c;
            while((c=in.read())!=-1) System.out.write(c);
            in.close();
        }catch(IOException ex){
            System.err.println(ex);
        }
    }
}
