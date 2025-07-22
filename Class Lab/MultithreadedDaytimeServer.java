import java.io.*;
import java.net.*;
import java.util.*;

public class MultithreadedDaytimeServer {

    public final static int PORT = 13;
    public static void main(String[] args) {
        try(ServerSocket server = new ServerSocket(PORT)){
            while(true){
                try{
                    Socket connection = server.accept();
                    Thread task = new DayTimeThread(connection);
                    task.start();
                }catch(IOException ex){}
            }
        }catch(IOException ex){
            System.err.println("Couldn't start server");
        }
    }

    private static class DayTimeThread extends Thread{
        private Socket connection;

        public DayTimeThread(Socket connection){
            this.connection = connection;
        }

        public void run(){
            try(Writer out = new OutputStreamWriter(connection.getOutputStream())){
                Date now = new Date();
                out.write(now.toString()+"\r\n");
                out.flush();
                connection.close();
            }catch(IOException ex){}
        }
    }
}
