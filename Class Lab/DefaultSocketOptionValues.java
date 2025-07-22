import java.io.*;
import java.net.*;
import java.nio.channels.*;

public class DefaultSocketOptionValues {
    public static void main(String[] args) {
        try(DatagramChannel channel = DatagramChannel.open()){
            for(SocketOption<?> option : channel.supportedOptions()){
                System.out.println(option.name()+": "+channel.getOption(option));
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
