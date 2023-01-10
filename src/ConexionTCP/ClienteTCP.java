package ConexionTCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClienteTCP {
    public static void main(String[] args) {
        try {
            //1.- Creación de socket de tipo cliente
            System.out.println("(Cliente): Creación de socket...");
            InetAddress local = InetAddress.getLocalHost();
            Socket socketCliente = new Socket(local, 50000);

            //2.- Creación de socket de tipo cliente
            System.out.println("(Cliente): Apertura de flujos de entrada y salida...");
            OutputStream os = socketCliente.getOutputStream();
            InputStream is = socketCliente.getInputStream();

            //3.- Intercambio de datos con el servidor
            System.out.println("(Cliente): Enviar mensaje al servidor con 14...");
            os.write(14);

            System.out.println("(Cliente): Lectura del mensaje del servidor...");
            System.out.println("Mensaje recibido por servidor: " + is.read());


            //4.- Cerrar los flujos de lectura y escritura
            System.out.println("(Cliente): Cerramos flujo de lectura y escritura...");
            os.close();
            is.close();

            // 5 - Cerrar la conexión
            socketCliente.close();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
