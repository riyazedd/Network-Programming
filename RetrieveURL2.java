import java.io.IOException;
import java.io.InputStream;
import java.net.*;

public class RetrieveURL2 {
    public static void main(String[] args) {
        try {
            URL u = new URL("https://news.ycombinator.com/");
            try {
                URLConnection uc = u.openConnection();
                InputStream in = uc.getInputStream();
                int c;
                while ((c = in.read()) != -1)
                    System.out.write(c);
                in.close();
            } catch (IOException ex) {
                System.err.println(ex);
            }
        } catch (MalformedURLException ex) {
            System.err.println(ex);
        }
    }
}
