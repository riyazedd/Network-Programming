import java.io.*;
import java.net.*;

public class URLEncoderTest {
    public static void main(String[] args) {
        try{
            System.out.println(URLEncoder.encode("This string has spaces.","UTF-8"));
            System.out.println(URLEncoder.encode("This*string*has*asteriks.","UTF-8"));
            System.out.println(URLEncoder.encode("This%string%has%percentage.","UTF-8"));
            System.out.println(URLEncoder.encode("This+string+has+plus+sign.","UTF-8"));
        }catch(UnsupportedEncodingException ex){
            System.err.println(ex);
        }
    }
}
