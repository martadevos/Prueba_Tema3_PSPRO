import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try{
            InetAddress direccion = InetAddress.getByName("www.google.es");
            System.out.println(direccion.getHostAddress());

            InetAddress local = InetAddress.getLocalHost();
            System.out.println(local.getHostAddress());
        } catch (UnknownHostException e) {
            System.err.println("");
            e.printStackTrace();
        }
    }
}