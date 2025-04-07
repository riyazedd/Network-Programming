import java.net.*;

public class URISplitter {
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++){
            try{
                URI u = new URI(args[i]);
                System.out.println("URI: "+u);
                if(u.isOpaque()){
                    System.out.println("This is Opaque URI");
                    System.out.println("Scheme: "+u.getScheme());
                    System.out.println("Fragment ID: "+u.getFragment());
                }else{
                    System.out.println("This is hierarchical URI");
                    System.out.println("Scheme: "+u.getScheme());
                    System.out.println("Path: "+u.getPath());
                    System.out.println("Fragment ID: "+u.getFragment());
                }
            }catch(URISyntaxException ex){
                System.err.println(ex);
            }
        }
    }
}
