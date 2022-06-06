package Principal;

import java.io.*;
import java.net.*;
import java.util.logging.*;

/**
 * La clase Servidor es la encargada de recibir cada una de las acciones que
 * realiza el juego.
 *
 * @author Brandon
 * @author Axel
 *
 *
 */
public class Servidor {

    /**
     * El método main es el encargado de la funcionabilidad de todo el programa
     * adquieriendo todos los datos requeridos por el administrador
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServerSocket servidor = null;
        Socket sc = null;
        DataInputStream in;
        DataOutputStream out;

        final int puente = 5000;

        try {
            servidor = new ServerSocket(puente);
            System.out.println("Servidor inicializado");

            while (true) {

                sc = servidor.accept();
                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());
                String mensaje = in.readUTF();

                System.out.println(mensaje);
                out.writeUTF(mensaje);
                sc.close();
            }

        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
