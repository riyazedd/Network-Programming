import java.net.*;

public class URLEncoderDecoder {
    public static void main(String[] args) throws Exception {
        String data = "Hello World!";
        String encode = URLEncoder.encode(data,"UTF-8");
        String decode = URLDecoder.decode(data,"UTF-8");
        System.out.println("Data:"+data);
        System.out.println("Encoded Data:"+encode);
        System.out.println("Decoded Data:"+decode);
    }
}
