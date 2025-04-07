import java.io.*;
import java.net.*;

public class SourceViewer2 {
    public static void main(String[] args) {
        if(args.length>0){
            try{
                @SuppressWarnings("deprecation")
                URL u = new URL(args[0]);
                URLConnection uc=u.openConnection();
                try(InputStream raw=uc.getInputStream()){
                    InputStream buffer=new BufferedInputStream(raw);
                    Reader reader=new InputStreamReader(buffer);
                    int c;
                    while((c=reader.read())!=-1){
                        System.out.print((char) c);
                    }
                }catch(Exception ex){
                    System.err.println(ex);
                }
            }catch(MalformedURLException ex){
                System.err.println(args[0]+" is not a parseable URL");
            }catch(IOException ex){
                System.err.println(ex);
            }
        }
    }
}
