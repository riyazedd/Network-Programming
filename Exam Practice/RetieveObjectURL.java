import java.io.*;
import java.net.*;

public class RetieveObjectURL {
    public static void main(String[] args) {
        try{
            @SuppressWarnings("deprecation")
            URL u = new URL("https://www.google.com");
            try{
                URLConnection uc = u.openConnection();
                InputStream in =uc.getInputStream();
                int c;
                while((c=in.read())!=-1) System.out.write(c);
                in.close();
            }catch(IOException ex){
                System.err.println(ex);
            }
        }catch(MalformedURLException ex){
            System.err.println(ex);
        }
    }
}
