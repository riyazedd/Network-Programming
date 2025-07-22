import java.io.*;
import java.net.*;

public class TCPMultithreadServer {
    public static void main(String[] args) throws Exception{
        ServerSocket server = new ServerSocket(3000);
        System.out.println("Server running");

        
        Socket client = server.accept();
        new Thread(()->{
            try{
                BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter out = new PrintWriter(client.getOutputStream(),true);

            int num = Integer.parseInt(in.readLine());
            boolean isPrime = true;
            if(num<=1){
                isPrime=false;
            }else{
                for(int i=2;i<=Math.sqrt(num);i++){
                    if(num%i==0){
                        isPrime = false;
                        break;
                    }
                }
            }

            out.println(num+(isPrime ? " is Prime" : " is Composite"));
            client.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }).start();
    }
}
