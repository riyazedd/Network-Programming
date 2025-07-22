import javax.net.ssl.*;
import java.io.*;
public class SecureSocket {
    public static void main(String[] args) throws Exception {

        SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
        SSLSocket socket = (SSLSocket) factory.createSocket("tufohss.edu.np", 443);

        PrintWriter out = new PrintWriter(socket.getOutputStream());

        out.println("GET / HTTP/1.1");
        out.println("Host: tufohss.edu.np");
        out.println("Connection: close");
        out.println();
        out.flush();
        
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        socket.close();
    }
}
