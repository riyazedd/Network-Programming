import java.io.*;
import java.net.*;

public class URLDecoderTest {
    public static void main(String[] args) {
        try{
            String input= "https://www.google.com/search?q=home+automation+project&rlz=1C1VDKB_enNP1145NP1145&oq=&gs_lcrp=EgZjaHJvbWUqCQgAECMYJxjqAjIJCAAQIxgnGOoCMgkIARAuGCcY6gIyCQgCECMYJxjqAjIJCAMQIxgnGOoCMgkIBBAjGCcY6gIyCQgFECMYJxjqAjIJCAYQIxgnGOoCMgkIBxAjGCcY6gLSAQo3MDU0MjRqMWoxqAIIsAIB8QX1JZPiwirjz_EF9SWT4sIq488&sourceid=chrome&ie=UTF-8";
            String output = URLDecoder.decode(input, "UTF-8");
            System.out.println(output);
        }catch(UnsupportedEncodingException ex){
            System.err.println(ex);
        }
    }
}
