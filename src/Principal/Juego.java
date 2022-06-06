package Principal;

import java.awt.Image;
import java.io.*;
import java.net.Socket;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;

/**
 * Esta clase es la que lleva toda la funcionalidad del juego, es decir todos
 * los métodos necesarios para que el juego fucione.
 *
 * @author Brandon
 * @author Axel
 *
 */
public final class Juego extends javax.swing.JFrame {

    int s = 1;//espara la validacion de repartir
    int jugador;//cambia de posicion al label que esta en turno
    int b = 0, j = 0, p = 0;//validacion
    int x = 449, y = 559;//mazo inicial
    int z = 517, w = 559;//carta sacada 
    int[] carta = new int[10000];
    int turno = 1;//posicion del turno
    int p1 = 808, p2 = 559;//posicion del basurero
    // jLabel1.setLocation(jLabel1.getLocation().x + evt.getX() - jLabel1.getWidth() / 2, jLabel1.getLocation().y + evt.getY() - jLabel1.getHeight() / 2);

    /**
     *
     * El método es el encargado de desplegar la ventana del juego.
     *
     */
    public Juego() {
        this.setResizable(false);//no me deja modificarle el tamaño con el cuadro
        initComponents();
        setSize(new java.awt.Dimension(1370, 715));// define el tamaño de la pestaña
        this.setLocationRelativeTo(null);//me centra la pestaña
        fondo();//me da el fondo de la pestaña
    }

    /**
     *
     * El método es el encargado de pasar la cartas a un punto específico fuera
     * de la zona del jugador, este método es necesario para que el método
     * cambio_de_mazo funcione correctamente.
     *
     */
    public void pasar_a_zona() {
        int x1 = 0, y1 = 0;
        int p1 = 0, p2 = 0;
        for (int i = 1; i <= 6; i++) {
            switch (i) {
                case 1:
                    x1 = 309;
                    y1 = 145;
                    p1 = 249;
                    p2 = 146;
                    break;
                case 2:
                    x1 = 998;
                    y1 = 145;
                    p1 = 1057;
                    p2 = 148;
                    break;
                case 3:
                    x1 = 309;
                    y1 = 370;
                    p1 = 250;
                    p2 = 372;
                    break;
                case 4:
                    x1 = 996;
                    y1 = 371;
                    p1 = 1055;
                    p2 = 375;
                    break;
                case 5:
                    x1 = 309;
                    y1 = 600;
                    p1 = 250;
                    p2 = 603;
                    break;
                case 6:
                    x1 = 996;
                    y1 = 597;
                    p1 = 1056;
                    p2 = 602;
                    break;
                default:
                    break;
            }

            if (jLabel3.getX() == x1 && jLabel3.getY() == y1) {
                jLabel3.setLocation(p1, p2);
                String dato = "La carta 1 ha sido cambiada";
                envio_al_servidor(dato);
            }
            if (jLabel4.getX() == x1 && jLabel4.getY() == y1) {
                jLabel4.setLocation(p1, p2);
                String dato = "La carta 2 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel5.getX() == x1 && jLabel5.getY() == y1) {
                jLabel5.setLocation(p1, p2);
                String dato = "La carta 3 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel6.getX() == x1 && jLabel6.getY() == y1) {
                jLabel6.setLocation(p1, p2);
                String dato = "La carta 4 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel7.getX() == x1 && jLabel7.getY() == y1) {
                jLabel7.setLocation(p1, p2);
                String dato = "La carta 5 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel8.getX() == x1 && jLabel8.getY() == y1) {
                jLabel8.setLocation(p1, p2);
                String dato = "La carta 6 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel9.getX() == x1 && jLabel9.getY() == y1) {
                jLabel9.setLocation(p1, p2);
                String dato = "La carta 7 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel10.getX() == x1 && jLabel10.getY() == y1) {
                jLabel10.setLocation(p1, p2);
                String dato = "La carta 8 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel11.getX() == x1 && jLabel11.getY() == y1) {
                jLabel11.setLocation(p1, p2);
                String dato = "La carta 9 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel12.getX() == x1 && jLabel12.getY() == y1) {
                jLabel12.setLocation(p1, p2);
                String dato = "La carta 10 ha sido cambiada";
                envio_al_servidor(dato);

            }

            if (jLabel13.getX() == x1 && jLabel13.getY() == y1) {
                jLabel13.setLocation(p1, p2);
                String dato = "La carta 11 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel14.getX() == x1 && jLabel14.getY() == y1) {
                jLabel14.setLocation(p1, p2);
                String dato = "La carta 12 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel15.getX() == x1 && jLabel15.getY() == y1) {
                jLabel15.setLocation(p1, p2);
                String dato = "La carta 13 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel16.getX() == x1 && jLabel16.getY() == y1) {
                jLabel16.setLocation(p1, p2);
                String dato = "La carta 14 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel17.getX() == x1 && jLabel17.getY() == y1) {
                jLabel17.setLocation(p1, p2);
                String dato = "La carta 15 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel18.getX() == x1 && jLabel18.getY() == y1) {
                jLabel18.setLocation(p1, p2);
                String dato = "La carta 16 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel19.getX() == x1 && jLabel19.getY() == y1) {
                jLabel19.setLocation(p1, p2);
                String dato = "La carta 17 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel20.getX() == x1 && jLabel20.getY() == y1) {
                jLabel20.setLocation(p1, p2);
                String dato = "La carta 18 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel21.getX() == x1 && jLabel21.getY() == y1) {
                jLabel21.setLocation(p1, p2);
                String dato = "La carta 19 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel22.getX() == x1 && jLabel22.getY() == y1) {
                jLabel22.setLocation(p1, p2);
                String dato = "La carta 20 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel23.getX() == x1 && jLabel23.getY() == y1) {
                jLabel23.setLocation(p1, p2);
                String dato = "La carta 21 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel24.getX() == x1 && jLabel24.getY() == y1) {
                jLabel24.setLocation(p1, p2);
                String dato = "La carta 22 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel25.getX() == x1 && jLabel25.getY() == y1) {
                jLabel25.setLocation(p1, p2);
                String dato = "La carta 23 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel26.getX() == x1 && jLabel26.getY() == y1) {
                jLabel26.setLocation(p1, p2);
                String dato = "La carta 24 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel27.getX() == x1 && jLabel27.getY() == y1) {
                jLabel27.setLocation(p1, p2);
                String dato = "La carta 25 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel28.getX() == x1 && jLabel28.getY() == y1) {
                jLabel28.setLocation(p1, p2);
                String dato = "La carta 26 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel29.getX() == x1 && jLabel29.getY() == y1) {
                jLabel29.setLocation(p1, p2);
                String dato = "La carta 27 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel30.getX() == x1 && jLabel30.getY() == y1) {
                jLabel30.setLocation(p1, p2);
                String dato = "La carta 28 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel31.getX() == x1 && jLabel31.getY() == y1) {
                jLabel31.setLocation(p1, p2);
                String dato = "La carta 29 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel32.getX() == x1 && jLabel32.getY() == y1) {
                jLabel32.setLocation(p1, p2);
                String dato = "La carta 30 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel33.getX() == x1 && jLabel33.getY() == y1) {
                jLabel33.setLocation(p1, p2);
                String dato = "La carta 31 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel34.getX() == x1 && jLabel34.getY() == y1) {
                jLabel34.setLocation(p1, p2);
                String dato = "La carta 32 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel35.getX() == x1 && jLabel35.getY() == y1) {
                jLabel35.setLocation(p1, p2);
                String dato = "La carta 33 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel36.getX() == x1 && jLabel36.getY() == y1) {
                jLabel36.setLocation(p1, p2);
                String dato = "La carta 34 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel37.getX() == x1 && jLabel37.getY() == y1) {
                jLabel37.setLocation(p1, p2);
                String dato = "La carta 35 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel38.getX() == x1 && jLabel38.getY() == y1) {
                jLabel38.setLocation(p1, p2);
                String dato = "La carta 36 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel39.getX() == x1 && jLabel39.getY() == y1) {
                jLabel39.setLocation(p1, p2);
                String dato = "La carta 37 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel40.getX() == x1 && jLabel40.getY() == y1) {
                jLabel40.setLocation(p1, p2);
                String dato = "La carta 38 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel41.getX() == x1 && jLabel41.getY() == y1) {
                jLabel41.setLocation(p1, p2);
                String dato = "La carta 39 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel42.getX() == x1 && jLabel42.getY() == y1) {
                jLabel42.setLocation(p1, p2);
                String dato = "La carta 40 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel43.getX() == x1 && jLabel43.getY() == y1) {
                jLabel43.setLocation(p1, p2);
                String dato = "La carta 41 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel44.getX() == x1 && jLabel44.getY() == y1) {
                jLabel44.setLocation(p1, p2);
                String dato = "La carta 42 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel45.getX() == x1 && jLabel45.getY() == y1) {
                jLabel45.setLocation(p1, p2);
                String dato = "La carta 43 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel46.getX() == x1 && jLabel46.getY() == y1) {
                jLabel46.setLocation(p1, p2);
                String dato = "La carta 44 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel47.getX() == x1 && jLabel47.getY() == y1) {
                jLabel47.setLocation(p1, p2);
                String dato = "La carta 45 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel48.getX() == x1 && jLabel48.getY() == y1) {
                jLabel48.setLocation(p1, p2);
                String dato = "La carta 46 ha sido cambiada";
                envio_al_servidor(dato);

            }

            if (jLabel49.getX() == x1 && jLabel49.getY() == y1) {
                jLabel49.setLocation(p1, p2);
                String dato = "La carta 47 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel50.getX() == x1 && jLabel50.getY() == y1) {
                jLabel50.setLocation(p1, p2);
                String dato = "La carta 48 ha sido cambiada";
                envio_al_servidor(dato);

            }

            if (jLabel51.getX() == x1 && jLabel51.getY() == y1) {
                jLabel51.setLocation(p1, p2);
                String dato = "La carta 49 ha sido cambiada";
                envio_al_servidor(dato);

            }

            if (jLabel52.getX() == x1 && jLabel52.getY() == y1) {
                jLabel52.setLocation(p1, p2);
                String dato = "La carta 50 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel53.getX() == x1 && jLabel53.getY() == y1) {
                jLabel53.setLocation(p1, p2);
                String dato = "La carta 51 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel54.getX() == x1 && jLabel54.getY() == y1) {
                jLabel54.setLocation(p1, p2);
                String dato = "La carta 52 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel55.getX() == x1 && jLabel55.getY() == y1) {
                jLabel55.setLocation(p1, p2);
                String dato = "La carta 53 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel56.getX() == x1 && jLabel56.getY() == y1) {
                jLabel56.setLocation(p1, p2);
                String dato = "La carta 54 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel57.getX() == x1 && jLabel57.getY() == y1) {
                jLabel57.setLocation(p1, p2);
                String dato = "La carta 55 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel58.getX() == x1 && jLabel58.getY() == y1) {
                jLabel58.setLocation(p1, p2);
                String dato = "La carta 56 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel59.getX() == x1 && jLabel59.getY() == y1) {
                jLabel59.setLocation(p1, p2);
                String dato = "La carta 57 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel60.getX() == x1 && jLabel60.getY() == y1) {
                jLabel60.setLocation(p1, p2);
                String dato = "La carta 58 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel61.getX() == x1 && jLabel61.getY() == y1) {
                jLabel61.setLocation(p1, p2);
                String dato = "La carta 59 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel62.getX() == x1 && jLabel62.getY() == y1) {
                jLabel62.setLocation(p1, p2);
                String dato = "La carta 60 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel63.getX() == x1 && jLabel63.getY() == y1) {
                jLabel63.setLocation(p1, p2);
                String dato = "La carta 61 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel64.getX() == x1 && jLabel64.getY() == y1) {
                jLabel64.setLocation(p1, p2);
                String dato = "La carta 62 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel65.getX() == x1 && jLabel65.getY() == y1) {
                jLabel65.setLocation(p1, p2);
                String dato = "La carta 63 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel66.getX() == x1 && jLabel66.getY() == y1) {
                jLabel66.setLocation(p1, p2);
                String dato = "La carta 64 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel67.getX() == x1 && jLabel67.getY() == y1) {
                jLabel67.setLocation(p1, p2);
                String dato = "La carta 65 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel68.getX() == x1 && jLabel68.getY() == y1) {
                jLabel68.setLocation(p1, p2);
                String dato = "La carta 66 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel69.getX() == x1 && jLabel69.getY() == y1) {
                jLabel69.setLocation(p1, p2);
                String dato = "La carta 67 ha sido cambiada";
                envio_al_servidor(dato);
            }

            if (jLabel70.getX() == x1 && jLabel70.getY() == y1) {
                jLabel70.setLocation(p1, p2);
                String dato = "La carta 68 ha sido cambiada";
                envio_al_servidor(dato);
            }
        }

    }

    /**
     *
     * El método cambio_de_mazo es el encargado de pasar la cartas a un punto
     * específico dentro de las zonas de los jugadores a los que se les va a
     * hacer el cambio de mazo.
     *
     */
    public void cambio_de_mazo() {

        int x1 = 0, x2 = 0, y1 = 0, y2 = 0;
        int p1 = 0, p2 = 0;
        int numero_de_jugador = 0;
        int numero_de_jugador2 = 0;
        int aux1, aux2;
        while (true) {
            numero_de_jugador = Integer.parseInt(JOptionPane.showInputDialog("Dígite su número de jugador."));
            if (numero_de_jugador < 1 && numero_de_jugador >= jugador) {
                JOptionPane.showMessageDialog(null, "EL número exedio los limites entre 1 y 6,\n"
                        + " por favor dígite otro número ", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
            } else {
                break;
            }
        }

        while (true) {

            numero_de_jugador2 = Integer.parseInt(JOptionPane.showInputDialog("Dígite el número del jugador con el\n "
                    + "que quiere cambiar el mazo."));
            if (numero_de_jugador == numero_de_jugador2) {
                JOptionPane.showMessageDialog(null, "El número del segundo jugador es igual al primero,\n"
                        + " por favor dígite otro número ", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
            } else if (numero_de_jugador2 < 1 && numero_de_jugador2 >= jugador) {
                JOptionPane.showMessageDialog(null, "El número exedio los limites entre 1 y 6,\n"
                        + " por favor dígite otro número ", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
            } else if (numero_de_jugador2 != numero_de_jugador) {
                break;
            }
        }

        for (int i = 1; i <= 2; i++) {

            if (i == 2) {
                aux1 = numero_de_jugador;
                aux2 = numero_de_jugador2;

                numero_de_jugador = aux2;
                numero_de_jugador2 = aux1;

            }

            switch (numero_de_jugador) {
                case 1:
                    x1 = 0;
                    x2 = 257;
                    y1 = 0;
                    y2 = 170;
                    switch (numero_de_jugador2) {
                        case 2:
                            p1 = 998;
                            p2 = 145;
                            break;
                        case 3:
                            p1 = 309;
                            p2 = 370;
                            break;
                        case 4:
                            p1 = 996;
                            p2 = 371;
                            break;
                        case 5:
                            p1 = 309;
                            p2 = 600;
                            break;
                        case 6:
                            p1 = 996;
                            p2 = 597;
                            break;
                        default:
                            break;
                    }

                    break;
                case 2:
                    x1 = 1050;
                    x2 = 1306;
                    y1 = 1;
                    y2 = 169;
                    switch (numero_de_jugador2) {
                        case 1:
                            p1 = 309;
                            p2 = 145;
                            break;
                        case 3:
                            p1 = 309;
                            p2 = 370;
                            break;
                        case 4:
                            p1 = 996;
                            p2 = 371;
                            break;
                        case 5:
                            p1 = 309;
                            p2 = 600;
                            break;
                        case 6:
                            p1 = 996;
                            p2 = 597;
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    x1 = 0;
                    x2 = 259;
                    y1 = 227;
                    y2 = 391;
                    switch (numero_de_jugador2) {
                        case 1:
                            p1 = 309;
                            p2 = 145;
                            break;
                        case 2:
                            p1 = 998;
                            p2 = 145;
                            break;
                        case 4:
                            p1 = 996;
                            p2 = 371;
                            break;
                        case 5:
                            p1 = 309;
                            p2 = 600;
                            break;
                        case 6:
                            p1 = 996;
                            p2 = 597;
                            break;
                        default:
                            break;
                    }
                    break;
                case 4:
                    x1 = 1050;
                    x2 = 1309;
                    y1 = 231;
                    y2 = 391;
                    if (numero_de_jugador2 == 1) {
                        p1 = 309;
                        p2 = 145;
                    }
                    switch (numero_de_jugador2) {
                        case 2:
                            p1 = 998;
                            p2 = 145;
                            break;
                        case 3:
                            p1 = 309;
                            p2 = 370;
                            break;
                        case 5:
                            p1 = 309;
                            p2 = 600;
                            break;
                        case 6:
                            p1 = 996;
                            p2 = 597;
                            break;
                        default:
                            break;
                    }

                    break;
                case 5:
                    x1 = 3;
                    x2 = 254;
                    y1 = 442;
                    y2 = 619;
                    if (numero_de_jugador2 == 1) {
                        p1 = 309;
                        p2 = 145;
                    }
                    switch (numero_de_jugador2) {
                        case 2:
                            p1 = 998;
                            p2 = 145;
                            break;
                        case 3:
                            p1 = 309;
                            p2 = 370;
                            break;
                        case 4:
                            p1 = 996;
                            p2 = 371;
                            break;
                        case 6:
                            p1 = 996;
                            p2 = 597;
                            break;
                        default:
                            break;
                    }
                    break;
                case 6:
                    x1 = 1050;
                    x2 = 1307;
                    y1 = 442;
                    y2 = 620;
                    if (numero_de_jugador2 == 1) {
                        p1 = 309;
                        p2 = 145;
                    }
                    switch (numero_de_jugador2) {
                        case 2:
                            p1 = 998;
                            p2 = 145;
                            break;
                        case 3:
                            p1 = 309;
                            p2 = 370;
                            break;
                        case 4:
                            p1 = 996;
                            p2 = 371;
                            break;
                        case 5:
                            p1 = 309;
                            p2 = 600;
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    break;
            }

            if (jLabel3.getX() >= x1 && jLabel3.getX() <= x2 && jLabel3.getY() >= y1 && jLabel3.getY() <= y2) {
                jLabel3.setLocation(p1, p2);

            }

            if (jLabel4.getX() >= x1 && jLabel4.getX() <= x2 && jLabel4.getY() >= y1 && jLabel4.getY() <= y2) {
                jLabel4.setLocation(p1, p2);
            }

            if (jLabel5.getX() >= x1 && jLabel5.getX() <= x2 && jLabel5.getY() >= y1 && jLabel5.getY() <= y2) {
                jLabel5.setLocation(p1, p2);
            }

            if (jLabel6.getX() >= x1 && jLabel6.getX() <= x2 && jLabel6.getY() >= y1 && jLabel6.getY() <= y2) {
                jLabel6.setLocation(p1, p2);
            }

            if (jLabel7.getX() >= x1 && jLabel7.getX() <= x2 && jLabel7.getY() >= y1 && jLabel7.getY() <= y2) {
                jLabel7.setLocation(p1, p2);
            }

            if (jLabel8.getX() >= x1 && jLabel8.getX() <= x2 && jLabel8.getY() >= y1 && jLabel8.getY() <= y2) {
                jLabel8.setLocation(p1, p2);
            }

            if (jLabel9.getX() >= x1 && jLabel9.getX() <= x2 && jLabel9.getY() >= y1 && jLabel9.getY() <= y2) {
                jLabel9.setLocation(p1, p2);
            }

            if (jLabel10.getX() >= x1 && jLabel10.getX() <= x2 && jLabel10.getY() >= y1 && jLabel10.getY() <= y2) {
                jLabel10.setLocation(p1, p2);
            }

            if (jLabel11.getX() >= x1 && jLabel11.getX() <= x2 && jLabel11.getY() >= y1 && jLabel11.getY() <= y2) {
                jLabel11.setLocation(p1, p2);
            }

            if (jLabel12.getX() >= x1 && jLabel12.getX() <= x2 && jLabel12.getY() >= y1 && jLabel12.getY() <= y2) {
                jLabel12.setLocation(p1, p2);
            }

            if (jLabel13.getX() >= x1 && jLabel13.getX() <= x2 && jLabel13.getY() >= y1 && jLabel13.getY() <= y2) {
                jLabel13.setLocation(p1, p2);
            }

            if (jLabel14.getX() >= x1 && jLabel14.getX() <= x2 && jLabel14.getY() >= y1 && jLabel14.getY() <= y2) {
                jLabel14.setLocation(p1, p2);
            }

            if (jLabel15.getX() >= x1 && jLabel15.getX() <= x2 && jLabel15.getY() >= y1 && jLabel15.getY() <= y2) {
                jLabel15.setLocation(p1, p2);
            }

            if (jLabel16.getX() >= x1 && jLabel16.getX() <= x2 && jLabel16.getY() >= y1 && jLabel16.getY() <= y2) {
                jLabel16.setLocation(p1, p2);
            }

            if (jLabel17.getX() >= x1 && jLabel17.getX() <= x2 && jLabel17.getY() >= y1 && jLabel17.getY() <= y2) {
                jLabel17.setLocation(p1, p2);
            }

            if (jLabel18.getX() >= x1 && jLabel18.getX() <= x2 && jLabel18.getY() >= y1 && jLabel18.getY() <= y2) {
                jLabel18.setLocation(p1, p2);
            }

            if (jLabel19.getX() >= x1 && jLabel19.getX() <= x2 && jLabel19.getY() >= y1 && jLabel19.getY() <= y2) {
                jLabel19.setLocation(p1, p2);
            }

            if (jLabel20.getX() >= x1 && jLabel20.getX() <= x2 && jLabel20.getY() >= y1 && jLabel20.getY() <= y2) {
                jLabel20.setLocation(p1, p2);
            }

            if (jLabel21.getX() >= x1 && jLabel21.getX() <= x2 && jLabel21.getY() >= y1 && jLabel21.getY() <= y2) {
                jLabel21.setLocation(p1, p2);
            }

            if (jLabel22.getX() >= x1 && jLabel22.getX() <= x2 && jLabel22.getY() >= y1 && jLabel22.getY() <= y2) {
                jLabel22.setLocation(p1, p2);
            }

            if (jLabel23.getX() >= x1 && jLabel23.getX() <= x2 && jLabel23.getY() >= y1 && jLabel23.getY() <= y2) {
                jLabel23.setLocation(p1, p2);
            }

            if (jLabel24.getX() >= x1 && jLabel24.getX() <= x2 && jLabel24.getY() >= y1 && jLabel24.getY() <= y2) {
                jLabel24.setLocation(p1, p2);
            }

            if (jLabel25.getX() >= x1 && jLabel25.getX() <= x2 && jLabel25.getY() >= y1 && jLabel25.getY() <= y2) {
                jLabel25.setLocation(p1, p2);
            }

            if (jLabel26.getX() >= x1 && jLabel26.getX() <= x2 && jLabel26.getY() >= y1 && jLabel26.getY() <= y2) {
                jLabel26.setLocation(p1, p2);
            }

            if (jLabel27.getX() >= x1 && jLabel27.getX() <= x2 && jLabel27.getY() >= y1 && jLabel27.getY() <= y2) {
                jLabel27.setLocation(p1, p2);
            }

            if (jLabel28.getX() >= x1 && jLabel28.getX() <= x2 && jLabel28.getY() >= y1 && jLabel28.getY() <= y2) {
                jLabel28.setLocation(p1, p2);
            }

            if (jLabel29.getX() >= x1 && jLabel29.getX() <= x2 && jLabel29.getY() >= y1 && jLabel29.getY() <= y2) {
                jLabel29.setLocation(p1, p2);
            }

            if (jLabel30.getX() >= x1 && jLabel30.getX() <= x2 && jLabel30.getY() >= y1 && jLabel30.getY() <= y2) {
                jLabel30.setLocation(p1, p2);
            }

            if (jLabel31.getX() >= x1 && jLabel31.getX() <= x2 && jLabel31.getY() >= y1 && jLabel31.getY() <= y2) {
                jLabel31.setLocation(p1, p2);
            }

            if (jLabel32.getX() >= x1 && jLabel32.getX() <= x2 && jLabel32.getY() >= y1 && jLabel32.getY() <= y2) {
                jLabel32.setLocation(p1, p2);
            }

            if (jLabel33.getX() >= x1 && jLabel33.getX() <= x2 && jLabel33.getY() >= y1 && jLabel33.getY() <= y2) {
                jLabel33.setLocation(p1, p2);
            }

            if (jLabel34.getX() >= x1 && jLabel34.getX() <= x2 && jLabel34.getY() >= y1 && jLabel34.getY() <= y2) {
                jLabel34.setLocation(p1, p2);
            }

            if (jLabel35.getX() >= x1 && jLabel35.getX() <= x2 && jLabel35.getY() >= y1 && jLabel35.getY() <= y2) {
                jLabel35.setLocation(p1, p2);
            }

            if (jLabel36.getX() >= x1 && jLabel36.getX() <= x2 && jLabel36.getY() >= y1 && jLabel36.getY() <= y2) {
                jLabel36.setLocation(p1, p2);
            }

            if (jLabel37.getX() >= x1 && jLabel37.getX() <= x2 && jLabel37.getY() >= y1 && jLabel37.getY() <= y2) {
                jLabel37.setLocation(p1, p2);
            }

            if (jLabel38.getX() >= x1 && jLabel38.getX() <= x2 && jLabel38.getY() >= y1 && jLabel38.getY() <= y2) {
                jLabel38.setLocation(p1, p2);
            }

            if (jLabel39.getX() >= x1 && jLabel39.getX() <= x2 && jLabel39.getY() >= y1 && jLabel39.getY() <= y2) {
                jLabel39.setLocation(p1, p2);
            }

            if (jLabel40.getX() >= x1 && jLabel40.getX() <= x2 && jLabel40.getY() >= y1 && jLabel40.getY() <= y2) {
                jLabel40.setLocation(p1, p2);
            }

            if (jLabel41.getX() >= x1 && jLabel41.getX() <= x2 && jLabel41.getY() >= y1 && jLabel41.getY() <= y2) {
                jLabel41.setLocation(p1, p2);
            }

            if (jLabel42.getX() >= x1 && jLabel42.getX() <= x2 && jLabel42.getY() >= y1 && jLabel42.getY() <= y2) {
                jLabel42.setLocation(p1, p2);
            }

            if (jLabel43.getX() >= x1 && jLabel43.getX() <= x2 && jLabel43.getY() >= y1 && jLabel43.getY() <= y2) {
                jLabel43.setLocation(p1, p2);
            }

            if (jLabel44.getX() >= x1 && jLabel44.getX() <= x2 && jLabel44.getY() >= y1 && jLabel44.getY() <= y2) {
                jLabel44.setLocation(p1, p2);
            }

            if (jLabel45.getX() >= x1 && jLabel45.getX() <= x2 && jLabel45.getY() >= y1 && jLabel45.getY() <= y2) {
                jLabel45.setLocation(p1, p2);
            }

            if (jLabel46.getX() >= x1 && jLabel46.getX() <= x2 && jLabel46.getY() >= y1 && jLabel46.getY() <= y2) {
                jLabel46.setLocation(p1, p2);
            }

            if (jLabel47.getX() >= x1 && jLabel47.getX() <= x2 && jLabel47.getY() >= y1 && jLabel47.getY() <= y2) {
                jLabel47.setLocation(p1, p2);
            }

            if (jLabel48.getX() >= x1 && jLabel48.getX() <= x2 && jLabel48.getY() >= y1 && jLabel48.getY() <= y2) {
                jLabel48.setLocation(p1, p2);
            }

            if (jLabel49.getX() >= x1 && jLabel49.getX() <= x2 && jLabel49.getY() >= y1 && jLabel49.getY() <= y2) {
                jLabel49.setLocation(p1, p2);
            }

            if (jLabel50.getX() >= x1 && jLabel50.getX() <= x2 && jLabel50.getY() >= y1 && jLabel50.getY() <= y2) {
                jLabel50.setLocation(p1, p2);
            }

            if (jLabel51.getX() >= x1 && jLabel51.getX() <= x2 && jLabel51.getY() >= y1 && jLabel51.getY() <= y2) {
                jLabel51.setLocation(p1, p2);
            }

            if (jLabel52.getX() >= x1 && jLabel52.getX() <= x2 && jLabel52.getY() >= y1 && jLabel52.getY() <= y2) {
                jLabel52.setLocation(p1, p2);
            }

            if (jLabel53.getX() >= x1 && jLabel53.getX() <= x2 && jLabel53.getY() >= y1 && jLabel53.getY() <= y2) {
                jLabel53.setLocation(p1, p2);
            }

            if (jLabel54.getX() >= x1 && jLabel54.getX() <= x2 && jLabel54.getY() >= y1 && jLabel54.getY() <= y2) {
                jLabel54.setLocation(p1, p2);
            }

            if (jLabel55.getX() >= x1 && jLabel55.getX() <= x2 && jLabel55.getY() >= y1 && jLabel55.getY() <= y2) {
                jLabel55.setLocation(p1, p2);
            }

            if (jLabel56.getX() >= x1 && jLabel56.getX() <= x2 && jLabel56.getY() >= y1 && jLabel56.getY() <= y2) {
                jLabel56.setLocation(p1, p2);
            }

            if (jLabel57.getX() >= x1 && jLabel57.getX() <= x2 && jLabel57.getY() >= y1 && jLabel57.getY() <= y2) {
                jLabel57.setLocation(p1, p2);
            }

            if (jLabel58.getX() >= x1 && jLabel58.getX() <= x2 && jLabel58.getY() >= y1 && jLabel58.getY() <= y2) {
                jLabel58.setLocation(p1, p2);
            }

            if (jLabel59.getX() >= x1 && jLabel59.getX() <= x2 && jLabel59.getY() >= y1 && jLabel59.getY() <= y2) {
                jLabel59.setLocation(p1, p2);
            }

            if (jLabel60.getX() >= x1 && jLabel60.getX() <= x2 && jLabel60.getY() >= y1 && jLabel60.getY() <= y2) {
                jLabel60.setLocation(p1, p2);
            }

            if (jLabel61.getX() >= x1 && jLabel61.getX() <= x2 && jLabel61.getY() >= y1 && jLabel61.getY() <= y2) {
                jLabel61.setLocation(p1, p2);
            }

            if (jLabel62.getX() >= x1 && jLabel62.getX() <= x2 && jLabel62.getY() >= y1 && jLabel62.getY() <= y2) {
                jLabel62.setLocation(p1, p2);
            }

            if (jLabel63.getX() >= x1 && jLabel63.getX() <= x2 && jLabel63.getY() >= y1 && jLabel63.getY() <= y2) {
                jLabel63.setLocation(p1, p2);
            }

            if (jLabel64.getX() >= x1 && jLabel64.getX() <= x2 && jLabel64.getY() >= y1 && jLabel64.getY() <= y2) {
                jLabel64.setLocation(p1, p2);
            }

            if (jLabel65.getX() >= x1 && jLabel65.getX() <= x2 && jLabel65.getY() >= y1 && jLabel65.getY() <= y2) {
                jLabel65.setLocation(p1, p2);
            }

            if (jLabel66.getX() >= x1 && jLabel66.getX() <= x2 && jLabel66.getY() >= y1 && jLabel66.getY() <= y2) {
                jLabel66.setLocation(p1, p2);
            }

            if (jLabel67.getX() >= x1 && jLabel67.getX() <= x2 && jLabel67.getY() >= y1 && jLabel67.getY() <= y2) {
                jLabel67.setLocation(p1, p2);
            }

            if (jLabel68.getX() >= x1 && jLabel68.getX() <= x2 && jLabel68.getY() >= y1 && jLabel68.getY() <= y2) {
                jLabel68.setLocation(p1, p2);
            }

            if (jLabel69.getX() >= x1 && jLabel69.getX() <= x2 && jLabel69.getY() >= y1 && jLabel69.getY() <= y2) {
                jLabel69.setLocation(p1, p2);
            }

            if (jLabel70.getX() >= x1 && jLabel70.getX() <= x2 && jLabel70.getY() >= y1 && jLabel70.getY() <= y2) {
                jLabel70.setLocation(p1, p2);
            }
        }
        pasar_a_zona();
    }

    /**
     *
     * El método Retirar_manos es el encargado de enviar al basurero las cartas
     * de los demás jugadores exepto las del jugador que este realizando el
     * método con la carta correspondiente.
     *
     */
    public void Retirar_manos() {
        int end = jugador;
        int numero_de_jugador = Integer.parseInt(JOptionPane.showInputDialog("Dígite su número de jugador."));

        if (numero_de_jugador > end || numero_de_jugador < 1) {
            JOptionPane.showInputDialog("Número de jugador no existente en la\n"
                    + "partida, por favor dígitelo de nuevo. ");
            Retirar_manos();
        }

        int x1 = 510, x2 = 527, y1 = 550, y2 = 568;
        int p1 = 808, p2 = 559;
        int cambio = 0;

        for (int i = 1; i <= end; i++) {
            cambio++;
            switch (numero_de_jugador) {
                case 1:
                    switch (cambio) {
                        case 2:
                            x1 = 930;
                            x2 = 998;
                            y1 = 2;
                            y2 = 88;
                            break;
                        case 3:
                            x1 = 305;
                            x2 = 372;
                            y1 = 218;
                            y2 = 315;
                            break;
                        case 4:
                            x1 = 930;
                            x2 = 998;
                            y1 = 226;
                            y2 = 317;
                            break;
                        case 5:
                            x1 = 305;
                            x2 = 368;
                            y1 = 455;
                            y2 = 544;
                            break;
                        case 6:
                            x1 = 930;
                            x2 = 998;
                            y1 = 449;
                            y2 = 545;
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    switch (cambio) {
                        case 1:
                            x1 = 305;
                            x2 = 372;
                            y1 = 2;
                            y2 = 95;
                            break;
                        case 3:
                            x1 = 305;
                            x2 = 372;
                            y1 = 218;
                            y2 = 315;
                            break;
                        case 4:
                            x1 = 930;
                            x2 = 998;
                            y1 = 226;
                            y2 = 317;
                            break;
                        case 5:
                            x1 = 305;
                            x2 = 368;
                            y1 = 455;
                            y2 = 544;
                            break;
                        case 6:
                            x1 = 930;
                            x2 = 998;
                            y1 = 449;
                            y2 = 545;
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    switch (cambio) {
                        case 1:
                            x1 = 305;
                            x2 = 372;
                            y1 = 2;
                            y2 = 95;
                            break;
                        case 2:
                            x1 = 930;
                            x2 = 998;
                            y1 = 2;
                            y2 = 88;
                            break;
                        case 4:
                            x1 = 930;
                            x2 = 998;
                            y1 = 226;
                            y2 = 317;
                            break;
                        case 5:
                            x1 = 305;
                            x2 = 368;
                            y1 = 455;
                            y2 = 544;
                            break;
                        case 6:
                            x1 = 930;
                            x2 = 998;
                            y1 = 449;
                            y2 = 545;
                            break;
                        default:
                            break;
                    }
                    break;
                case 4:
                    switch (cambio) {
                        case 1:
                            x1 = 305;
                            x2 = 372;
                            y1 = 2;
                            y2 = 95;
                            break;
                        case 2:
                            x1 = 930;
                            x2 = 998;
                            y1 = 2;
                            y2 = 88;
                            break;
                        case 3:
                            x1 = 305;
                            x2 = 372;
                            y1 = 218;
                            y2 = 315;
                            break;
                        case 5:
                            x1 = 305;
                            x2 = 368;
                            y1 = 455;
                            y2 = 544;
                            break;
                        case 6:
                            x1 = 930;
                            x2 = 998;
                            y1 = 449;
                            y2 = 545;
                            break;
                        default:
                            break;
                    }
                    break;
                case 5:
                    switch (cambio) {
                        case 1:
                            x1 = 305;
                            x2 = 372;
                            y1 = 2;
                            y2 = 95;
                            break;
                        case 2:
                            x1 = 930;
                            x2 = 998;
                            y1 = 2;
                            y2 = 88;
                            break;
                        case 3:
                            x1 = 305;
                            x2 = 372;
                            y1 = 218;
                            y2 = 315;
                            break;
                        case 4:
                            x1 = 930;
                            x2 = 998;
                            y1 = 226;
                            y2 = 317;
                            break;
                        case 6:
                            x1 = 930;
                            x2 = 998;
                            y1 = 449;
                            y2 = 545;
                            break;
                        default:
                            break;
                    }
                    break;
                case 6:
                    switch (cambio) {
                        case 1:
                            x1 = 305;
                            x2 = 372;
                            y1 = 2;
                            y2 = 95;
                            break;
                        case 2:
                            x1 = 930;
                            x2 = 998;
                            y1 = 2;
                            y2 = 88;
                            break;
                        case 3:
                            x1 = 305;
                            x2 = 372;
                            y1 = 218;
                            y2 = 315;
                            break;
                        case 4:
                            x1 = 930;
                            x2 = 998;
                            y1 = 226;
                            y2 = 317;
                            break;
                        case 5:
                            x1 = 305;
                            x2 = 368;
                            y1 = 455;
                            y2 = 544;
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    break;
            }

            if (jLabel3.getX() >= x1 && jLabel3.getX() <= x2 && jLabel3.getY() >= y1 && jLabel3.getY() <= y2) {
                jLabel3.setLocation(p1, p2);
                String dato = "La carta 1 ha sido enviada al basurero ";
                envio_al_servidor(dato);
            }

            if (jLabel4.getX() >= x1 && jLabel4.getX() <= x2 && jLabel4.getY() >= y1 && jLabel4.getY() <= y2) {
                jLabel4.setLocation(p1, p2);
                String dato = "La carta 2 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel5.getX() >= x1 && jLabel5.getX() <= x2 && jLabel5.getY() >= y1 && jLabel5.getY() <= y2) {
                jLabel5.setLocation(p1, p2);
                String dato = "La carta 3 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel6.getX() >= x1 && jLabel6.getX() <= x2 && jLabel6.getY() >= y1 && jLabel6.getY() <= y2) {
                jLabel6.setLocation(p1, p2);
                String dato = "La carta 4 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel7.getX() >= x1 && jLabel7.getX() <= x2 && jLabel7.getY() >= y1 && jLabel7.getY() <= y2) {
                jLabel7.setLocation(p1, p2);
                String dato = "La carta 5 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel8.getX() >= x1 && jLabel8.getX() <= x2 && jLabel8.getY() >= y1 && jLabel8.getY() <= y2) {
                jLabel8.setLocation(p1, p2);
                String dato = "La carta 6 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel9.getX() >= x1 && jLabel9.getX() <= x2 && jLabel9.getY() >= y1 && jLabel9.getY() <= y2) {
                jLabel9.setLocation(p1, p2);
                String dato = "La carta 7 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel10.getX() >= x1 && jLabel10.getX() <= x2 && jLabel10.getY() >= y1 && jLabel10.getY() <= y2) {
                jLabel10.setLocation(p1, p2);
                String dato = "La carta 8 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel11.getX() >= x1 && jLabel11.getX() <= x2 && jLabel11.getY() >= y1 && jLabel11.getY() <= y2) {
                jLabel11.setLocation(p1, p2);
                String dato = "La carta 9 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel12.getX() >= x1 && jLabel12.getX() <= x2 && jLabel12.getY() >= y1 && jLabel12.getY() <= y2) {
                jLabel12.setLocation(p1, p2);
                String dato = "La carta 10 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel13.getX() >= x1 && jLabel13.getX() <= x2 && jLabel13.getY() >= y1 && jLabel13.getY() <= y2) {
                jLabel13.setLocation(p1, p2);
                String dato = "La carta 11 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel14.getX() >= x1 && jLabel14.getX() <= x2 && jLabel14.getY() >= y1 && jLabel14.getY() <= y2) {
                jLabel14.setLocation(p1, p2);
                String dato = "La carta 12 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel15.getX() >= x1 && jLabel15.getX() <= x2 && jLabel15.getY() >= y1 && jLabel15.getY() <= y2) {
                jLabel15.setLocation(p1, p2);
                String dato = "La carta 13 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel16.getX() >= x1 && jLabel16.getX() <= x2 && jLabel16.getY() >= y1 && jLabel16.getY() <= y2) {
                jLabel16.setLocation(p1, p2);
                String dato = "La carta 14 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel17.getX() >= x1 && jLabel17.getX() <= x2 && jLabel17.getY() >= y1 && jLabel17.getY() <= y2) {
                jLabel17.setLocation(p1, p2);
                String dato = "La carta 15 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel18.getX() >= x1 && jLabel18.getX() <= x2 && jLabel18.getY() >= y1 && jLabel18.getY() <= y2) {
                jLabel18.setLocation(p1, p2);
                String dato = "La carta 16 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel19.getX() >= x1 && jLabel19.getX() <= x2 && jLabel19.getY() >= y1 && jLabel19.getY() <= y2) {
                jLabel19.setLocation(p1, p2);
                String dato = "La carta 17 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel20.getX() >= x1 && jLabel20.getX() <= x2 && jLabel20.getY() >= y1 && jLabel20.getY() <= y2) {
                jLabel20.setLocation(p1, p2);
                String dato = "La carta 18 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel21.getX() >= x1 && jLabel21.getX() <= x2 && jLabel21.getY() >= y1 && jLabel21.getY() <= y2) {
                jLabel21.setLocation(p1, p2);
                String dato = "La carta 19 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel22.getX() >= x1 && jLabel22.getX() <= x2 && jLabel22.getY() >= y1 && jLabel22.getY() <= y2) {
                jLabel22.setLocation(p1, p2);
                String dato = "La carta 20 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel23.getX() >= x1 && jLabel23.getX() <= x2 && jLabel23.getY() >= y1 && jLabel23.getY() <= y2) {
                jLabel23.setLocation(p1, p2);
                String dato = "La carta 21 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel24.getX() >= x1 && jLabel24.getX() <= x2 && jLabel24.getY() >= y1 && jLabel24.getY() <= y2) {
                jLabel24.setLocation(p1, p2);
                String dato = "La carta 22 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel25.getX() >= x1 && jLabel25.getX() <= x2 && jLabel25.getY() >= y1 && jLabel25.getY() <= y2) {
                jLabel25.setLocation(p1, p2);
                String dato = "La carta 23 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel26.getX() >= x1 && jLabel26.getX() <= x2 && jLabel26.getY() >= y1 && jLabel26.getY() <= y2) {
                jLabel26.setLocation(p1, p2);
                String dato = "La carta 24 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel27.getX() >= x1 && jLabel27.getX() <= x2 && jLabel27.getY() >= y1 && jLabel27.getY() <= y2) {
                jLabel27.setLocation(p1, p2);
                String dato = "La carta 25 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel28.getX() >= x1 && jLabel28.getX() <= x2 && jLabel28.getY() >= y1 && jLabel28.getY() <= y2) {
                jLabel28.setLocation(p1, p2);
                String dato = "La carta 26 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel29.getX() >= x1 && jLabel29.getX() <= x2 && jLabel29.getY() >= y1 && jLabel29.getY() <= y2) {
                jLabel29.setLocation(p1, p2);
                String dato = "La carta 27 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel30.getX() >= x1 && jLabel30.getX() <= x2 && jLabel30.getY() >= y1 && jLabel30.getY() <= y2) {
                jLabel30.setLocation(p1, p2);
                String dato = "La carta 28 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel31.getX() >= x1 && jLabel31.getX() <= x2 && jLabel31.getY() >= y1 && jLabel31.getY() <= y2) {
                jLabel31.setLocation(p1, p2);
                String dato = "La carta 29 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel32.getX() >= x1 && jLabel32.getX() <= x2 && jLabel32.getY() >= y1 && jLabel32.getY() <= y2) {
                jLabel32.setLocation(p1, p2);
                String dato = "La carta 30 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel33.getX() >= x1 && jLabel33.getX() <= x2 && jLabel33.getY() >= y1 && jLabel33.getY() <= y2) {
                jLabel33.setLocation(p1, p2);
                String dato = "La carta 31 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel34.getX() >= x1 && jLabel34.getX() <= x2 && jLabel34.getY() >= y1 && jLabel34.getY() <= y2) {
                jLabel34.setLocation(p1, p2);
                String dato = "La carta 32 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel35.getX() >= x1 && jLabel35.getX() <= x2 && jLabel35.getY() >= y1 && jLabel35.getY() <= y2) {
                jLabel35.setLocation(p1, p2);
                String dato = "La carta 33 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel36.getX() >= x1 && jLabel36.getX() <= x2 && jLabel36.getY() >= y1 && jLabel36.getY() <= y2) {
                jLabel36.setLocation(p1, p2);
                String dato = "La carta 34 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel37.getX() >= x1 && jLabel37.getX() <= x2 && jLabel37.getY() >= y1 && jLabel37.getY() <= y2) {
                jLabel37.setLocation(p1, p2);
                String dato = "La carta 35 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel38.getX() >= x1 && jLabel38.getX() <= x2 && jLabel38.getY() >= y1 && jLabel38.getY() <= y2) {
                jLabel38.setLocation(p1, p2);
                String dato = "La carta 36 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel39.getX() >= x1 && jLabel39.getX() <= x2 && jLabel39.getY() >= y1 && jLabel39.getY() <= y2) {
                jLabel39.setLocation(p1, p2);
                String dato = "La carta 37 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel40.getX() >= x1 && jLabel40.getX() <= x2 && jLabel40.getY() >= y1 && jLabel40.getY() <= y2) {
                jLabel40.setLocation(p1, p2);
                String dato = "La carta 38 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel41.getX() >= x1 && jLabel41.getX() <= x2 && jLabel41.getY() >= y1 && jLabel41.getY() <= y2) {
                jLabel41.setLocation(p1, p2);
                String dato = "La carta 39 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel42.getX() >= x1 && jLabel42.getX() <= x2 && jLabel42.getY() >= y1 && jLabel42.getY() <= y2) {
                jLabel42.setLocation(p1, p2);
                String dato = "La carta 40 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel43.getX() >= x1 && jLabel43.getX() <= x2 && jLabel43.getY() >= y1 && jLabel43.getY() <= y2) {
                jLabel43.setLocation(p1, p2);
                String dato = "La carta 41 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel44.getX() >= x1 && jLabel44.getX() <= x2 && jLabel44.getY() >= y1 && jLabel44.getY() <= y2) {
                jLabel44.setLocation(p1, p2);
                String dato = "La carta 42 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel45.getX() >= x1 && jLabel45.getX() <= x2 && jLabel45.getY() >= y1 && jLabel45.getY() <= y2) {
                jLabel45.setLocation(p1, p2);
                String dato = "La carta 43 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel46.getX() >= x1 && jLabel46.getX() <= x2 && jLabel46.getY() >= y1 && jLabel46.getY() <= y2) {
                jLabel46.setLocation(p1, p2);
                String dato = "La carta 44 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel47.getX() >= x1 && jLabel47.getX() <= x2 && jLabel47.getY() >= y1 && jLabel47.getY() <= y2) {
                jLabel47.setLocation(p1, p2);
                String dato = "La carta 45 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel48.getX() >= x1 && jLabel48.getX() <= x2 && jLabel48.getY() >= y1 && jLabel48.getY() <= y2) {
                jLabel48.setLocation(p1, p2);
                String dato = "La carta 46 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel49.getX() >= x1 && jLabel49.getX() <= x2 && jLabel49.getY() >= y1 && jLabel49.getY() <= y2) {
                jLabel49.setLocation(p1, p2);
                String dato = "La carta 47 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel50.getX() >= x1 && jLabel50.getX() <= x2 && jLabel50.getY() >= y1 && jLabel50.getY() <= y2) {
                jLabel50.setLocation(p1, p2);
                String dato = "La carta 48 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel51.getX() >= x1 && jLabel51.getX() <= x2 && jLabel51.getY() >= y1 && jLabel51.getY() <= y2) {
                jLabel51.setLocation(p1, p2);
                String dato = "La carta 49 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel52.getX() >= x1 && jLabel52.getX() <= x2 && jLabel52.getY() >= y1 && jLabel52.getY() <= y2) {
                jLabel52.setLocation(p1, p2);
                String dato = "La carta 50 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel53.getX() >= x1 && jLabel53.getX() <= x2 && jLabel53.getY() >= y1 && jLabel53.getY() <= y2) {
                jLabel53.setLocation(p1, p2);
                String dato = "La carta 51 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel54.getX() >= x1 && jLabel54.getX() <= x2 && jLabel54.getY() >= y1 && jLabel54.getY() <= y2) {
                jLabel54.setLocation(p1, p2);
                String dato = "La carta 52 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel55.getX() >= x1 && jLabel55.getX() <= x2 && jLabel55.getY() >= y1 && jLabel55.getY() <= y2) {
                jLabel55.setLocation(p1, p2);
                String dato = "La carta 53 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel56.getX() >= x1 && jLabel56.getX() <= x2 && jLabel56.getY() >= y1 && jLabel56.getY() <= y2) {
                jLabel56.setLocation(p1, p2);
                String dato = "La carta 54 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel57.getX() >= x1 && jLabel57.getX() <= x2 && jLabel57.getY() >= y1 && jLabel57.getY() <= y2) {
                jLabel57.setLocation(p1, p2);
                String dato = "La carta 55 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel58.getX() >= x1 && jLabel58.getX() <= x2 && jLabel58.getY() >= y1 && jLabel58.getY() <= y2) {
                jLabel58.setLocation(p1, p2);
                String dato = "La carta 56 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel59.getX() >= x1 && jLabel59.getX() <= x2 && jLabel59.getY() >= y1 && jLabel59.getY() <= y2) {
                jLabel59.setLocation(p1, p2);
                String dato = "La carta 57 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel60.getX() >= x1 && jLabel60.getX() <= x2 && jLabel60.getY() >= y1 && jLabel60.getY() <= y2) {
                jLabel60.setLocation(p1, p2);
                String dato = "La carta 58 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel61.getX() >= x1 && jLabel61.getX() <= x2 && jLabel61.getY() >= y1 && jLabel61.getY() <= y2) {
                jLabel61.setLocation(p1, p2);
                String dato = "La carta 59 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel62.getX() >= x1 && jLabel62.getX() <= x2 && jLabel62.getY() >= y1 && jLabel62.getY() <= y2) {
                jLabel62.setLocation(p1, p2);
                String dato = "La carta 60 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel63.getX() >= x1 && jLabel63.getX() <= x2 && jLabel63.getY() >= y1 && jLabel63.getY() <= y2) {
                jLabel63.setLocation(p1, p2);
                String dato = "La carta 61 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel64.getX() >= x1 && jLabel64.getX() <= x2 && jLabel64.getY() >= y1 && jLabel64.getY() <= y2) {
                jLabel64.setLocation(p1, p2);
                String dato = "La carta 62 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel65.getX() >= x1 && jLabel65.getX() <= x2 && jLabel65.getY() >= y1 && jLabel65.getY() <= y2) {
                jLabel65.setLocation(p1, p2);
                String dato = "La carta 63 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel66.getX() >= x1 && jLabel66.getX() <= x2 && jLabel66.getY() >= y1 && jLabel66.getY() <= y2) {
                jLabel66.setLocation(p1, p2);
                String dato = "La carta 64 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel67.getX() >= x1 && jLabel67.getX() <= x2 && jLabel67.getY() >= y1 && jLabel67.getY() <= y2) {
                jLabel67.setLocation(p1, p2);
                String dato = "La carta 65 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel68.getX() >= x1 && jLabel68.getX() <= x2 && jLabel68.getY() >= y1 && jLabel68.getY() <= y2) {
                jLabel68.setLocation(p1, p2);
                String dato = "La carta 66 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel69.getX() >= x1 && jLabel69.getX() <= x2 && jLabel69.getY() >= y1 && jLabel69.getY() <= y2) {
                jLabel69.setLocation(p1, p2);
                String dato = "La carta 67 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }

            if (jLabel70.getX() >= x1 && jLabel70.getX() <= x2 && jLabel70.getY() >= y1 && jLabel70.getY() <= y2) {
                jLabel70.setLocation(p1, p2);
                String dato = "La carta 68 ha sido enviada al basurero";
                envio_al_servidor(dato);
            }
        }
    }

    /**
     *
     * El método envio_al_servidor es el encargado de enviar al servidor las
     * acciones que se realicen durante la partida.
     *
     * @param dato Es el que resive y envia los datos al servidor
     */
    public void envio_al_servidor(String dato) {
        final String host = "127.0.0.1";

        final int puente = 5000;
        DataInputStream in;
        DataOutputStream out;

        try {
            try (Socket sc = new Socket(host, puente)) {
                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());

                out.writeUTF(dato);

                String mensaje = in.readUTF();

                System.out.println("Mensaje del servidor ->" + mensaje);

            }

        } catch (IOException ex) {
            Logger.getLogger(Juego.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * El método fondo es el encargado de acomodar y dar imagen al las cartas y
     * al fondo del juego
     */
    public void fondo() {
        jLabel3.setLocation(x, y);
        jLabel4.setLocation(x, y);
        jLabel5.setLocation(x, y);
        jLabel6.setLocation(x, y);
        jLabel7.setLocation(x, y);
        jLabel8.setLocation(x, y);
        jLabel9.setLocation(x, y);
        jLabel10.setLocation(x, y);
        jLabel11.setLocation(x, y);
        jLabel12.setLocation(x, y);
        jLabel13.setLocation(x, y);
        jLabel14.setLocation(x, y);
        jLabel15.setLocation(x, y);
        jLabel16.setLocation(x, y);
        jLabel17.setLocation(x, y);
        jLabel18.setLocation(x, y);
        jLabel19.setLocation(x, y);
        jLabel20.setLocation(x, y);
        jLabel21.setLocation(x, y);
        jLabel22.setLocation(x, y);
        jLabel23.setLocation(x, y);
        jLabel24.setLocation(x, y);
        jLabel25.setLocation(x, y);
        jLabel26.setLocation(x, y);
        jLabel27.setLocation(x, y);
        jLabel28.setLocation(x, y);
        jLabel29.setLocation(x, y);
        jLabel30.setLocation(x, y);
        jLabel31.setLocation(x, y);
        jLabel32.setLocation(x, y);
        jLabel33.setLocation(x, y);
        jLabel34.setLocation(x, y);
        jLabel35.setLocation(x, y);
        jLabel36.setLocation(x, y);
        jLabel37.setLocation(x, y);
        jLabel38.setLocation(x, y);
        jLabel39.setLocation(x, y);
        jLabel40.setLocation(x, y);
        jLabel41.setLocation(x, y);
        jLabel42.setLocation(x, y);
        jLabel43.setLocation(x, y);
        jLabel44.setLocation(x, y);
        jLabel45.setLocation(x, y);
        jLabel46.setLocation(x, y);
        jLabel47.setLocation(x, y);
        jLabel48.setLocation(x, y);
        jLabel49.setLocation(x, y);
        jLabel50.setLocation(x, y);
        jLabel51.setLocation(x, y);
        jLabel52.setLocation(x, y);
        jLabel53.setLocation(x, y);
        jLabel54.setLocation(x, y);
        jLabel55.setLocation(x, y);
        jLabel56.setLocation(x, y);
        jLabel57.setLocation(x, y);
        jLabel58.setLocation(x, y);
        jLabel59.setLocation(x, y);
        jLabel60.setLocation(x, y);
        jLabel61.setLocation(x, y);
        jLabel62.setLocation(x, y);
        jLabel63.setLocation(x, y);
        jLabel64.setLocation(x, y);
        jLabel65.setLocation(x, y);
        jLabel66.setLocation(x, y);
        jLabel67.setLocation(x, y);
        jLabel68.setLocation(x, y);
        jLabel69.setLocation(x, y);
        jLabel70.setLocation(x, y);

        ImageIcon imagen2 = new ImageIcon(getClass().getResource("/Principal/Turno.png"));
        ImageIcon icono2 = new ImageIcon(imagen2.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_DEFAULT));
        jLabel2.setIcon(icono2);

        ImageIcon imagen = new ImageIcon(getClass().getResource("/Principal/fondo.png"));
        ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
        jLabel1.setIcon(icono);

        ImageIcon imagen3 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono3 = new ImageIcon(imagen3.getImage().getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_DEFAULT));
        jLabel3.setIcon(icono3);

        ImageIcon imagen4 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono4 = new ImageIcon(imagen4.getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT));
        jLabel4.setIcon(icono4);

        ImageIcon imagen5 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono5 = new ImageIcon(imagen5.getImage().getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_DEFAULT));
        jLabel5.setIcon(icono5);

        ImageIcon imagen6 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono6 = new ImageIcon(imagen6.getImage().getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_DEFAULT));
        jLabel6.setIcon(icono6);

        ImageIcon imagen7 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono7 = new ImageIcon(imagen7.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_DEFAULT));
        jLabel7.setIcon(icono7);

        ImageIcon imagen8 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono8 = new ImageIcon(imagen8.getImage().getScaledInstance(jLabel8.getWidth(), jLabel8.getHeight(), Image.SCALE_DEFAULT));
        jLabel8.setIcon(icono8);

        ImageIcon imagen9 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono9 = new ImageIcon(imagen9.getImage().getScaledInstance(jLabel9.getWidth(), jLabel9.getHeight(), Image.SCALE_DEFAULT));
        jLabel9.setIcon(icono9);

        ImageIcon imagen10 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono10 = new ImageIcon(imagen10.getImage().getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(), Image.SCALE_DEFAULT));
        jLabel10.setIcon(icono10);

        ImageIcon imagen11 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono11 = new ImageIcon(imagen11.getImage().getScaledInstance(jLabel11.getWidth(), jLabel11.getHeight(), Image.SCALE_DEFAULT));
        jLabel11.setIcon(icono11);

        ImageIcon imagen12 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono12 = new ImageIcon(imagen12.getImage().getScaledInstance(jLabel12.getWidth(), jLabel12.getHeight(), Image.SCALE_DEFAULT));
        jLabel12.setIcon(icono12);

        ImageIcon imagen13 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono13 = new ImageIcon(imagen13.getImage().getScaledInstance(jLabel13.getWidth(), jLabel13.getHeight(), Image.SCALE_DEFAULT));
        jLabel13.setIcon(icono13);

        ImageIcon imagen14 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono14 = new ImageIcon(imagen14.getImage().getScaledInstance(jLabel14.getWidth(), jLabel14.getHeight(), Image.SCALE_DEFAULT));
        jLabel14.setIcon(icono14);

        ImageIcon imagen15 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono15 = new ImageIcon(imagen15.getImage().getScaledInstance(jLabel15.getWidth(), jLabel15.getHeight(), Image.SCALE_DEFAULT));
        jLabel15.setIcon(icono15);

        ImageIcon imagen16 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono16 = new ImageIcon(imagen16.getImage().getScaledInstance(jLabel16.getWidth(), jLabel16.getHeight(), Image.SCALE_DEFAULT));
        jLabel16.setIcon(icono16);

        ImageIcon imagen17 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono17 = new ImageIcon(imagen17.getImage().getScaledInstance(jLabel17.getWidth(), jLabel17.getHeight(), Image.SCALE_DEFAULT));
        jLabel17.setIcon(icono17);

        ImageIcon imagen18 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono18 = new ImageIcon(imagen18.getImage().getScaledInstance(jLabel18.getWidth(), jLabel18.getHeight(), Image.SCALE_DEFAULT));
        jLabel18.setIcon(icono18);

        ImageIcon imagen19 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono19 = new ImageIcon(imagen19.getImage().getScaledInstance(jLabel19.getWidth(), jLabel19.getHeight(), Image.SCALE_DEFAULT));
        jLabel19.setIcon(icono19);

        ImageIcon imagen20 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono20 = new ImageIcon(imagen20.getImage().getScaledInstance(jLabel20.getWidth(), jLabel20.getHeight(), Image.SCALE_DEFAULT));
        jLabel20.setIcon(icono20);

        ImageIcon imagen21 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono21 = new ImageIcon(imagen21.getImage().getScaledInstance(jLabel21.getWidth(), jLabel21.getHeight(), Image.SCALE_DEFAULT));
        jLabel21.setIcon(icono21);

        ImageIcon imagen22 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono22 = new ImageIcon(imagen22.getImage().getScaledInstance(jLabel22.getWidth(), jLabel22.getHeight(), Image.SCALE_DEFAULT));
        jLabel22.setIcon(icono22);

        ImageIcon imagen23 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono23 = new ImageIcon(imagen23.getImage().getScaledInstance(jLabel23.getWidth(), jLabel23.getHeight(), Image.SCALE_DEFAULT));
        jLabel23.setIcon(icono23);

        ImageIcon imagen24 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono24 = new ImageIcon(imagen24.getImage().getScaledInstance(jLabel24.getWidth(), jLabel24.getHeight(), Image.SCALE_DEFAULT));
        jLabel24.setIcon(icono24);

        ImageIcon imagen25 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono25 = new ImageIcon(imagen25.getImage().getScaledInstance(jLabel25.getWidth(), jLabel25.getHeight(), Image.SCALE_DEFAULT));
        jLabel25.setIcon(icono25);

        ImageIcon imagen26 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono26 = new ImageIcon(imagen26.getImage().getScaledInstance(jLabel26.getWidth(), jLabel26.getHeight(), Image.SCALE_DEFAULT));
        jLabel26.setIcon(icono26);

        ImageIcon imagen27 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono27 = new ImageIcon(imagen27.getImage().getScaledInstance(jLabel27.getWidth(), jLabel27.getHeight(), Image.SCALE_DEFAULT));
        jLabel27.setIcon(icono27);

        ImageIcon imagen28 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono28 = new ImageIcon(imagen28.getImage().getScaledInstance(jLabel28.getWidth(), jLabel28.getHeight(), Image.SCALE_DEFAULT));
        jLabel28.setIcon(icono28);

        ImageIcon imagen29 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono29 = new ImageIcon(imagen29.getImage().getScaledInstance(jLabel29.getWidth(), jLabel29.getHeight(), Image.SCALE_DEFAULT));
        jLabel29.setIcon(icono29);

        ImageIcon imagen30 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono30 = new ImageIcon(imagen30.getImage().getScaledInstance(jLabel30.getWidth(), jLabel30.getHeight(), Image.SCALE_DEFAULT));
        jLabel30.setIcon(icono30);

        ImageIcon imagen31 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono31 = new ImageIcon(imagen31.getImage().getScaledInstance(jLabel31.getWidth(), jLabel31.getHeight(), Image.SCALE_DEFAULT));
        jLabel31.setIcon(icono31);

        ImageIcon imagen32 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono32 = new ImageIcon(imagen32.getImage().getScaledInstance(jLabel32.getWidth(), jLabel32.getHeight(), Image.SCALE_DEFAULT));
        jLabel32.setIcon(icono32);

        ImageIcon imagen33 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono33 = new ImageIcon(imagen33.getImage().getScaledInstance(jLabel33.getWidth(), jLabel33.getHeight(), Image.SCALE_DEFAULT));
        jLabel33.setIcon(icono33);

        ImageIcon imagen34 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono34 = new ImageIcon(imagen34.getImage().getScaledInstance(jLabel34.getWidth(), jLabel34.getHeight(), Image.SCALE_DEFAULT));
        jLabel34.setIcon(icono34);

        ImageIcon imagen35 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono35 = new ImageIcon(imagen35.getImage().getScaledInstance(jLabel35.getWidth(), jLabel35.getHeight(), Image.SCALE_DEFAULT));
        jLabel35.setIcon(icono35);

        ImageIcon imagen36 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono36 = new ImageIcon(imagen36.getImage().getScaledInstance(jLabel36.getWidth(), jLabel36.getHeight(), Image.SCALE_DEFAULT));
        jLabel36.setIcon(icono36);

        ImageIcon imagen37 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono37 = new ImageIcon(imagen37.getImage().getScaledInstance(jLabel37.getWidth(), jLabel37.getHeight(), Image.SCALE_DEFAULT));
        jLabel37.setIcon(icono37);

        ImageIcon imagen38 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono38 = new ImageIcon(imagen38.getImage().getScaledInstance(jLabel38.getWidth(), jLabel38.getHeight(), Image.SCALE_DEFAULT));
        jLabel38.setIcon(icono38);

        ImageIcon imagen39 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono39 = new ImageIcon(imagen39.getImage().getScaledInstance(jLabel39.getWidth(), jLabel39.getHeight(), Image.SCALE_DEFAULT));
        jLabel39.setIcon(icono39);

        ImageIcon imagen40 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono40 = new ImageIcon(imagen40.getImage().getScaledInstance(jLabel40.getWidth(), jLabel40.getHeight(), Image.SCALE_DEFAULT));
        jLabel40.setIcon(icono40);

        ImageIcon imagen41 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono41 = new ImageIcon(imagen41.getImage().getScaledInstance(jLabel41.getWidth(), jLabel41.getHeight(), Image.SCALE_DEFAULT));
        jLabel41.setIcon(icono41);

        ImageIcon imagen42 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono42 = new ImageIcon(imagen42.getImage().getScaledInstance(jLabel42.getWidth(), jLabel42.getHeight(), Image.SCALE_DEFAULT));
        jLabel42.setIcon(icono42);

        ImageIcon imagen43 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono43 = new ImageIcon(imagen43.getImage().getScaledInstance(jLabel43.getWidth(), jLabel43.getHeight(), Image.SCALE_DEFAULT));
        jLabel43.setIcon(icono43);

        ImageIcon imagen44 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono44 = new ImageIcon(imagen44.getImage().getScaledInstance(jLabel44.getWidth(), jLabel44.getHeight(), Image.SCALE_DEFAULT));
        jLabel44.setIcon(icono44);

        ImageIcon imagen45 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono45 = new ImageIcon(imagen45.getImage().getScaledInstance(jLabel45.getWidth(), jLabel45.getHeight(), Image.SCALE_DEFAULT));
        jLabel45.setIcon(icono45);

        ImageIcon imagen46 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono46 = new ImageIcon(imagen46.getImage().getScaledInstance(jLabel46.getWidth(), jLabel46.getHeight(), Image.SCALE_DEFAULT));
        jLabel46.setIcon(icono46);

        ImageIcon imagen47 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono47 = new ImageIcon(imagen47.getImage().getScaledInstance(jLabel47.getWidth(), jLabel47.getHeight(), Image.SCALE_DEFAULT));
        jLabel47.setIcon(icono47);

        ImageIcon imagen48 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono48 = new ImageIcon(imagen48.getImage().getScaledInstance(jLabel48.getWidth(), jLabel48.getHeight(), Image.SCALE_DEFAULT));
        jLabel48.setIcon(icono48);

        ImageIcon imagen49 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono49 = new ImageIcon(imagen49.getImage().getScaledInstance(jLabel49.getWidth(), jLabel49.getHeight(), Image.SCALE_DEFAULT));
        jLabel49.setIcon(icono49);

        ImageIcon imagen50 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono50 = new ImageIcon(imagen50.getImage().getScaledInstance(jLabel50.getWidth(), jLabel50.getHeight(), Image.SCALE_DEFAULT));
        jLabel50.setIcon(icono50);

        ImageIcon imagen51 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono51 = new ImageIcon(imagen51.getImage().getScaledInstance(jLabel51.getWidth(), jLabel51.getHeight(), Image.SCALE_DEFAULT));
        jLabel51.setIcon(icono51);

        ImageIcon imagen52 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono52 = new ImageIcon(imagen52.getImage().getScaledInstance(jLabel52.getWidth(), jLabel52.getHeight(), Image.SCALE_DEFAULT));
        jLabel52.setIcon(icono52);

        ImageIcon imagen53 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono53 = new ImageIcon(imagen53.getImage().getScaledInstance(jLabel53.getWidth(), jLabel53.getHeight(), Image.SCALE_DEFAULT));
        jLabel53.setIcon(icono53);

        ImageIcon imagen54 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono54 = new ImageIcon(imagen54.getImage().getScaledInstance(jLabel54.getWidth(), jLabel54.getHeight(), Image.SCALE_DEFAULT));
        jLabel54.setIcon(icono54);

        ImageIcon imagen55 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono55 = new ImageIcon(imagen55.getImage().getScaledInstance(jLabel55.getWidth(), jLabel55.getHeight(), Image.SCALE_DEFAULT));
        jLabel55.setIcon(icono55);

        ImageIcon imagen56 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono56 = new ImageIcon(imagen56.getImage().getScaledInstance(jLabel56.getWidth(), jLabel56.getHeight(), Image.SCALE_DEFAULT));
        jLabel56.setIcon(icono56);

        ImageIcon imagen57 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono57 = new ImageIcon(imagen57.getImage().getScaledInstance(jLabel57.getWidth(), jLabel57.getHeight(), Image.SCALE_DEFAULT));
        jLabel57.setIcon(icono57);

        ImageIcon imagen58 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono58 = new ImageIcon(imagen58.getImage().getScaledInstance(jLabel58.getWidth(), jLabel58.getHeight(), Image.SCALE_DEFAULT));
        jLabel58.setIcon(icono58);

        ImageIcon imagen59 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono59 = new ImageIcon(imagen59.getImage().getScaledInstance(jLabel59.getWidth(), jLabel59.getHeight(), Image.SCALE_DEFAULT));
        jLabel59.setIcon(icono59);

        ImageIcon imagen60 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono60 = new ImageIcon(imagen60.getImage().getScaledInstance(jLabel60.getWidth(), jLabel60.getHeight(), Image.SCALE_DEFAULT));
        jLabel60.setIcon(icono60);

        ImageIcon imagen61 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono61 = new ImageIcon(imagen61.getImage().getScaledInstance(jLabel61.getWidth(), jLabel61.getHeight(), Image.SCALE_DEFAULT));
        jLabel61.setIcon(icono61);

        ImageIcon imagen62 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono62 = new ImageIcon(imagen62.getImage().getScaledInstance(jLabel62.getWidth(), jLabel62.getHeight(), Image.SCALE_DEFAULT));
        jLabel62.setIcon(icono62);

        ImageIcon imagen63 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono63 = new ImageIcon(imagen63.getImage().getScaledInstance(jLabel63.getWidth(), jLabel63.getHeight(), Image.SCALE_DEFAULT));
        jLabel63.setIcon(icono63);

        ImageIcon imagen64 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono64 = new ImageIcon(imagen64.getImage().getScaledInstance(jLabel64.getWidth(), jLabel64.getHeight(), Image.SCALE_DEFAULT));
        jLabel64.setIcon(icono64);

        ImageIcon imagen65 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono65 = new ImageIcon(imagen65.getImage().getScaledInstance(jLabel65.getWidth(), jLabel65.getHeight(), Image.SCALE_DEFAULT));
        jLabel65.setIcon(icono65);

        ImageIcon imagen66 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono66 = new ImageIcon(imagen66.getImage().getScaledInstance(jLabel66.getWidth(), jLabel66.getHeight(), Image.SCALE_DEFAULT));
        jLabel66.setIcon(icono66);

        ImageIcon imagen67 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono67 = new ImageIcon(imagen67.getImage().getScaledInstance(jLabel67.getWidth(), jLabel67.getHeight(), Image.SCALE_DEFAULT));
        jLabel67.setIcon(icono67);

        ImageIcon imagen68 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono68 = new ImageIcon(imagen68.getImage().getScaledInstance(jLabel68.getWidth(), jLabel68.getHeight(), Image.SCALE_DEFAULT));
        jLabel68.setIcon(icono68);

        ImageIcon imagen69 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono69 = new ImageIcon(imagen69.getImage().getScaledInstance(jLabel69.getWidth(), jLabel69.getHeight(), Image.SCALE_DEFAULT));
        jLabel69.setIcon(icono69);

        ImageIcon imagen70 = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        ImageIcon icono70 = new ImageIcon(imagen70.getImage().getScaledInstance(jLabel70.getWidth(), jLabel70.getHeight(), Image.SCALE_DEFAULT));
        jLabel70.setIcon(icono70);
    }

    /**
     * El método ganador es el encargado de mostrar cual de los jugadores ha
     * ganado la partida, esto según las instrucciones del juego.
     *
     */
    public void Ganador() {
        int x1 = 0, x2 = 0, y1 = 0, y2 = 0;
        int cambio = 0;

        for (int i = 1; i < 7; i++) {
            int cerebro = 0, hueso = 0, estomago = 0, corazon = 0;
            int virus = 0, organo_comodin = 0;
            int suma_de_organos = 0;
            cambio++;
            switch (cambio) {
                case 1:
                    //cordenadas del jugador 1
                    x1 = 4;
                    x2 = 255;
                    y1 = 6;
                    y2 = 150;
                    break;
                case 2:
                    //cordenadas del jugador 2
                    x1 = 1053;
                    x2 = 1308;
                    y1 = 6;
                    y2 = 150;
                    break;
                case 3:
                    //cordenadas del jugador 3
                    x1 = 4;
                    x2 = 255;
                    y1 = 226;
                    y2 = 376;
                    break;
                case 4:
                    //cordenadas del jugador 4
                    x1 = 1053;
                    x2 = 1308;
                    y1 = 226;
                    y2 = 376;
                    break;
                case 5:
                    //cordenadas del jugador 5
                    x1 = 4;
                    x2 = 255;
                    y1 = 450;
                    y2 = 607;
                    break;
                case 6:
                    //cordenadas del jugador6
                    x1 = 1053;
                    x2 = 1308;
                    y1 = 450;
                    y2 = 607;
                    cambio = 0;
                    break;
                default:
                    break;
            }
            if (jLabel3.getX() >= x1 && jLabel3.getX() <= x2 && jLabel3.getY() >= y1 && jLabel3.getY() <= y2) {
                cerebro = 1;
            }
            if (jLabel4.getX() >= x1 && jLabel4.getX() <= x2 && jLabel4.getY() >= y1 && jLabel4.getY() <= y2) {
                cerebro = 1;
            }
            if (jLabel5.getX() >= x1 && jLabel5.getX() <= x2 && jLabel5.getY() >= y1 && jLabel5.getY() <= y2) {
                cerebro = 1;
            }
            if (jLabel6.getX() >= x1 && jLabel6.getX() <= x2 && jLabel6.getY() >= y1 && jLabel6.getY() <= y2) {
                cerebro = 1;
            }
            if (jLabel7.getX() >= x1 && jLabel7.getX() <= x2 && jLabel7.getY() >= y1 && jLabel7.getY() <= y2) {
                cerebro = 1;
            }

            if (jLabel8.getX() >= x1 && jLabel8.getX() <= x2 && jLabel8.getY() >= y1 && jLabel8.getY() <= y2) {
                hueso = 1;
            }
            if (jLabel9.getX() >= x1 && jLabel9.getX() <= x2 && jLabel9.getY() >= y1 && jLabel9.getY() <= y2) {
                hueso = 1;
            }
            if (jLabel10.getX() >= x1 && jLabel10.getX() <= x2 && jLabel10.getY() >= y1 && jLabel10.getY() <= y2) {
                hueso = 1;
            }
            if (jLabel11.getX() >= x1 && jLabel11.getX() <= x2 && jLabel11.getY() >= y1 && jLabel11.getY() <= y2) {
                hueso = 1;
            }
            if (jLabel12.getX() >= x1 && jLabel12.getX() <= x2 && jLabel12.getY() >= y1 && jLabel12.getY() <= y2) {
                hueso = 1;
            }

            if (jLabel13.getX() >= x1 && jLabel13.getX() <= x2 && jLabel13.getY() >= y1 && jLabel13.getY() <= y2) {
                estomago = 1;
            }
            if (jLabel14.getX() >= x1 && jLabel14.getX() <= x2 && jLabel14.getY() >= y1 && jLabel14.getY() <= y2) {
                estomago = 1;
            }
            if (jLabel15.getX() >= x1 && jLabel15.getX() <= x2 && jLabel15.getY() >= y1 && jLabel15.getY() <= y2) {
                estomago = 1;
            }
            if (jLabel16.getX() >= x1 && jLabel16.getX() <= x2 && jLabel16.getY() >= y1 && jLabel16.getY() <= y2) {
                estomago = 1;
            }
            if (jLabel17.getX() >= x1 && jLabel17.getX() <= x2 && jLabel17.getY() >= y1 && jLabel17.getY() <= y2) {
                estomago = 1;
            }

            if (jLabel17.getX() >= x1 && jLabel17.getX() <= x2 && jLabel17.getY() >= y1 && jLabel17.getY() <= y2) {
                corazon = 1;
            }
            if (jLabel18.getX() >= x1 && jLabel18.getX() <= x2 && jLabel18.getY() >= y1 && jLabel18.getY() <= y2) {
                corazon = 1;
            }
            if (jLabel19.getX() >= x1 && jLabel19.getX() <= x2 && jLabel19.getY() >= y1 && jLabel19.getY() <= y2) {
                corazon = 1;
            }
            if (jLabel20.getX() >= x1 && jLabel20.getX() <= x2 && jLabel20.getY() >= y1 && jLabel20.getY() <= y2) {
                corazon = 1;
            }
            if (jLabel21.getX() >= x1 && jLabel21.getX() <= x2 && jLabel21.getY() >= y1 && jLabel21.getY() <= y2) {
                corazon = 1;
            }
            if (jLabel22.getX() >= x1 && jLabel22.getX() <= x2 && jLabel22.getY() >= y1 && jLabel22.getY() <= y2) {
                corazon = 1;
            }
            if (jLabel23.getX() >= x1 && jLabel23.getX() <= x2 && jLabel23.getY() >= y1 && jLabel23.getY() <= y2) {
                organo_comodin = 1;
            }

            if (jLabel51.getX() >= x1 && jLabel51.getX() <= x2 && jLabel51.getY() >= y1 && jLabel51.getY() <= y2) {
                virus = virus + 1;
            }
            if (jLabel52.getX() >= x1 && jLabel52.getX() <= x2 && jLabel52.getY() >= y1 && jLabel52.getY() <= y2) {
                virus = virus + 1;
            }
            if (jLabel53.getX() >= x1 && jLabel53.getX() <= x2 && jLabel53.getY() >= y1 && jLabel53.getY() <= y2) {
                virus = virus + 1;
            }
            if (jLabel54.getX() >= x1 && jLabel54.getX() <= x2 && jLabel54.getY() >= y1 && jLabel54.getY() <= y2) {
                virus = virus + 1;
            }
            if (jLabel55.getX() >= x1 && jLabel55.getX() <= x2 && jLabel55.getY() >= y1 && jLabel55.getY() <= y2) {
                virus = virus + 1;
            }
            if (jLabel56.getX() >= x1 && jLabel56.getX() <= x2 && jLabel56.getY() >= y1 && jLabel56.getY() <= y2) {
                virus = virus + 1;
            }
            if (jLabel57.getX() >= x1 && jLabel57.getX() <= x2 && jLabel57.getY() >= y1 && jLabel57.getY() <= y2) {
                virus = virus + 1;
            }
            if (jLabel58.getX() >= x1 && jLabel58.getX() <= x2 && jLabel58.getY() >= y1 && jLabel58.getY() <= y2) {
                virus = virus + 1;
            }
            if (jLabel59.getX() >= x1 && jLabel59.getX() <= x2 && jLabel59.getY() >= y1 && jLabel59.getY() <= y2) {
                virus = virus + 1;
            }
            if (jLabel60.getX() >= x1 && jLabel60.getX() <= x2 && jLabel60.getY() >= y1 && jLabel60.getY() <= y2) {
                virus = virus + 1;
            }
            if (jLabel61.getX() >= x1 && jLabel61.getX() <= x2 && jLabel61.getY() >= y1 && jLabel61.getY() <= y2) {
                virus = virus + 1;
            }
            if (jLabel62.getX() >= x1 && jLabel62.getX() <= x2 && jLabel62.getY() >= y1 && jLabel62.getY() <= y2) {
                virus = virus + 1;
            }
            if (jLabel63.getX() >= x1 && jLabel63.getX() <= x2 && jLabel63.getY() >= y1 && jLabel63.getY() <= y2) {
                virus = virus + 1;
            }
            if (jLabel64.getX() >= x1 && jLabel64.getX() <= x2 && jLabel64.getY() >= y1 && jLabel64.getY() <= y2) {
                virus = virus + 1;
            }
            if (jLabel65.getX() >= x1 && jLabel65.getX() <= x2 && jLabel65.getY() >= y1 && jLabel65.getY() <= y2) {
                virus = virus + 1;
            }
            if (jLabel66.getX() >= x1 && jLabel66.getX() <= x2 && jLabel66.getY() >= y1 && jLabel66.getY() <= y2) {
                virus = virus + 1;
            }
            if (jLabel67.getX() >= x1 && jLabel67.getX() <= x2 && jLabel67.getY() >= y1 && jLabel67.getY() <= y2) {
                virus = virus + 1;
            }
            if (jLabel68.getX() >= x1 && jLabel68.getX() <= x2 && jLabel68.getY() >= y1 && jLabel68.getY() <= y2) {
                virus = virus + 1;
            }
            if (jLabel69.getX() >= x1 && jLabel69.getX() <= x2 && jLabel69.getY() >= y1 && jLabel69.getY() <= y2) {
                virus = virus + 1;
            }
            if (jLabel70.getX() >= x1 && jLabel70.getX() <= x2 && jLabel70.getY() >= y1 && jLabel70.getY() <= y2) {
                virus = virus + 1;
            }
            suma_de_organos = cerebro + hueso + estomago + corazon + organo_comodin;
            if (suma_de_organos == 5 && virus == 1) {
                JOptionPane.showMessageDialog(null, "EL JUGADOR " + i + " HA GANADO!!!!! ", "GANADOR", JOptionPane.INFORMATION_MESSAGE);
                String dato = "EL JUGADOR " + i + " HA GANADO!!!!! ";
                envio_al_servidor(dato);
            }
            if (suma_de_organos == 4 && virus == 0) {
                JOptionPane.showMessageDialog(null, "EL JUGADOR " + i + " HA GANADO!!!!! ", "GANADOR", JOptionPane.INFORMATION_MESSAGE);
                String dato = "EL JUGADOR " + i + " HA GANADO!!!!! ";
                envio_al_servidor(dato);
            }
        }
    }

    /**
     *
     * El método repartir_manos es el encargado de que al inicio de la partida
     * dependiendo de la cantidad de jugadores, reparta aleatoriamente las
     * cartas iniciales a cada uno.
     *
     */
    public void Repartir_manos() {
        int siono;
//        jugador = Integer.parseInt(JOptionPane.showInputDialog("Dígite el número de jugadores que van a jugar:"));
//        if (jugador > 6 || jugador <= 1) {
//            JOptionPane.showMessageDialog(null, "El número de jugadores exedio el limite de 6 jugadores o el minimo de 2 \n"
//                    + "por favor dígite una partida entre 2 o 6 jugadores.", "ADVERTENCIA", JOptionPane.INFORMATION_MESSAGE);
//            Repartir_manos();
//        }
        while (true) {
            jugador = Integer.parseInt(JOptionPane.showInputDialog("Dígite el número de jugadores que van a jugar:"));
            if (jugador > 6 || jugador <= 1) {
                JOptionPane.showMessageDialog(null, "El número de jugadores exedio el limite de 6 jugadores o el minimo de 2 \n"
                        + "por favor dígite una partida entre 2 o 6 jugadores.", "ADVERTENCIA", JOptionPane.INFORMATION_MESSAGE);
            } else {
                break;
            }
        }

        String dato1 = "El número de jugadores de partida es -> " + jugador;
        envio_al_servidor(dato1);
        for (int p = 1; p <= 3 * jugador; p++) {

            while (true) {
                int z = 0;
                int w = 0;
                siono = 0;
                Random rn = new Random();
                int elegir = rn.nextInt(68) + 1;
                //System.out.println("elegir" + elegir);
                for (int i = 0; i < carta.length; i++) {
                    if (carta[i] == elegir) {
                        siono = 1;
                    }
                }

                switch (p) {
                    case 1:
                        z = 312;
                        w = 12;
                        break;
                    case 2:
                        z = 368;
                        w = 12;
                        break;
                    case 3:
                        z = 311;
                        w = 79;
                        break;
                    case 4:
                        z = 941;
                        w = 10;
                        break;
                    case 5:
                        z = 997;
                        w = 10;
                        break;
                    case 6:
                        z = 941;
                        w = 81;
                        break;
                    case 7:
                        z = 311;
                        w = 238;
                        break;
                    case 8:
                        z = 367;
                        w = 237;
                        break;
                    case 9:
                        z = 311;
                        w = 305;
                        break;
                    case 10:
                        z = 940;
                        w = 237;
                        break;
                    case 11:
                        z = 996;
                        w = 237;
                        break;
                    case 12:
                        z = 941;
                        w = 305;
                        break;
                    case 13:
                        z = 311;
                        w = 468;
                        break;
                    case 14:
                        z = 367;
                        w = 468;
                        break;
                    case 15:
                        z = 311;
                        w = 537;
                        break;
                    case 16:
                        z = 940;
                        w = 463;
                        break;
                    case 17:
                        z = 997;
                        w = 466;
                        break;
                    case 18:
                        z = 940;
                        w = 533;
                        break;
                    default:
                        break;
                }

                if (siono == 0) {

                    carta[j] = elegir;
                    j++;
                    //System.out.println(j);
                    switch (elegir) {
                        case 1: {
                            //System.out.println("Carta 1");
                            String dato = "La carta 1 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/1.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_DEFAULT));
                            jLabel3.setIcon(icono1);
                            jLabel3.setLocation(z, w);
                            break;
                        }
                        case 2: {
                            // System.out.println("Carta 2");
                            String dato = "La carta 2 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/1.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT));
                            jLabel4.setIcon(icono1);
                            jLabel4.setLocation(z, w);
                            break;
                        }
                        case 3: {
                            //System.out.println("Carta 3");
                            String dato = "La carta 3 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/1.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_DEFAULT));
                            jLabel5.setIcon(icono1);
                            jLabel5.setLocation(z, w);
                            break;
                        }
                        case 4: {
                            //System.out.println("Carta 4");
                            String dato = "La carta 4 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/1.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_DEFAULT));
                            jLabel6.setIcon(icono1);
                            jLabel6.setLocation(z, w);
                            break;
                        }
                        case 5: {
                            // System.out.println("Carta 5");
                            String dato = "La carta 5 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/1.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_DEFAULT));
                            jLabel7.setIcon(icono1);

                            jLabel7.setLocation(z, w);
                            break;
                        }
                        case 6: {
                            // System.out.println("Carta 6");
                            String dato = "La carta 6 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/2.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel8.getWidth(), jLabel8.getHeight(), Image.SCALE_DEFAULT));
                            jLabel8.setIcon(icono1);
                            jLabel8.setLocation(z, w);
                            break;
                        }
                        case 7: {
                            //  System.out.println("Carta 7");
                            String dato = "La carta 7 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/2.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel9.getWidth(), jLabel9.getHeight(), Image.SCALE_DEFAULT));
                            jLabel9.setIcon(icono1);
                            jLabel9.setLocation(z, w);
                            break;
                        }
                        case 8: {
                            // System.out.println("Carta 8");
                            String dato = "La carta 8 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/2.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(), Image.SCALE_DEFAULT));
                            jLabel10.setIcon(icono1);
                            jLabel10.setLocation(z, w);
                            break;
                        }
                        case 9: {
                            //  System.out.println("Carta 9");
                            String dato = "La carta 9 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/2.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel11.getWidth(), jLabel11.getHeight(), Image.SCALE_DEFAULT));
                            jLabel11.setIcon(icono1);
                            jLabel11.setLocation(z, w);
                            break;
                        }
                        case 10: {
                            //  System.out.println("Carta 10");
                            String dato = "La carta 10 ha sido revelada en la posición-> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/2.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel12.getWidth(), jLabel12.getHeight(), Image.SCALE_DEFAULT));
                            jLabel12.setIcon(icono1);
                            jLabel12.setLocation(z, w);
                            break;
                        }
                        case 11: {
                            //  System.out.println("Carta 11");
                            String dato = "La carta 11 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/3.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel13.getWidth(), jLabel13.getHeight(), Image.SCALE_DEFAULT));
                            jLabel13.setIcon(icono1);
                            jLabel13.setLocation(z, w);
                            break;
                        }
                        case 12: {
                            // System.out.println("Carta 12");
                            String dato = "La carta 12 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/3.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel14.getWidth(), jLabel14.getHeight(), Image.SCALE_DEFAULT));
                            jLabel14.setIcon(icono1);
                            jLabel14.setLocation(z, w);
                            break;
                        }
                        case 13: {
                            //System.out.println("Carta 13");
                            String dato = "La carta 13 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/3.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel15.getWidth(), jLabel15.getHeight(), Image.SCALE_DEFAULT));
                            jLabel15.setIcon(icono1);
                            jLabel15.setLocation(z, w);
                            break;
                        }
                        case 14: {
                            //System.out.println("Carta 14");
                            String dato = "La carta 14 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/3.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel16.getWidth(), jLabel16.getHeight(), Image.SCALE_DEFAULT));
                            jLabel16.setIcon(icono1);
                            jLabel16.setLocation(z, w);
                            break;
                        }
                        case 15: {
                            //System.out.println("Carta 15");
                            String dato = "La carta 15 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/3.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel17.getWidth(), jLabel17.getHeight(), Image.SCALE_DEFAULT));
                            jLabel17.setIcon(icono1);
                            jLabel17.setLocation(z, w);
                            break;
                        }
                        case 16: {
                            //System.out.println("Carta 16");
                            String dato = "La carta 16 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/4.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel18.getWidth(), jLabel18.getHeight(), Image.SCALE_DEFAULT));
                            jLabel18.setIcon(icono1);
                            jLabel18.setLocation(z, w);
                            break;
                        }
                        case 17: {
                            //System.out.println("Carta 17");
                            String dato = "La carta 17 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/4.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel19.getWidth(), jLabel19.getHeight(), Image.SCALE_DEFAULT));
                            jLabel19.setIcon(icono1);
                            jLabel19.setLocation(z, w);
                            break;
                        }
                        case 18: {
                            //System.out.println("Carta 18");
                            String dato = "La carta 18 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/4.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel20.getWidth(), jLabel20.getHeight(), Image.SCALE_DEFAULT));
                            jLabel20.setIcon(icono1);
                            jLabel20.setLocation(z, w);
                            break;
                        }
                        case 19: {
                            //System.out.println("Carta 19");
                            String dato = "La carta 19 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/4.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel21.getWidth(), jLabel21.getHeight(), Image.SCALE_DEFAULT));
                            jLabel21.setIcon(icono1);
                            jLabel21.setLocation(z, w);
                            break;
                        }
                        case 20: {
                            //System.out.println("Carta 20");
                            String dato = "La carta 20 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/4.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel22.getWidth(), jLabel22.getHeight(), Image.SCALE_DEFAULT));
                            jLabel22.setIcon(icono1);
                            jLabel22.setLocation(z, w);
                            break;
                        }
                        case 21: {
                            //System.out.println("Carta 21");
                            String dato = "La carta 21 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/5.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel23.getWidth(), jLabel23.getHeight(), Image.SCALE_DEFAULT));
                            jLabel23.setIcon(icono1);
                            jLabel23.setLocation(z, w);
                            break;
                        }
                        case 22: {
                            //System.out.println("Carta 22");
                            String dato = "La carta 22 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/medicinas/11.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel24.getWidth(), jLabel24.getHeight(), Image.SCALE_DEFAULT));
                            jLabel24.setIcon(icono1);
                            jLabel24.setLocation(z, w);
                            break;
                        }
                        case 23: {
                            //System.out.println("Carta 23");
                            String dato = "La carta 23 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/medicinas/11.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel25.getWidth(), jLabel25.getHeight(), Image.SCALE_DEFAULT));
                            jLabel25.setIcon(icono1);
                            jLabel25.setLocation(z, w);
                            break;
                        }
                        case 24: {
                            //System.out.println("Carta 24");
                            String dato = "La carta 24 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/medicinas/11.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel26.getWidth(), jLabel26.getHeight(), Image.SCALE_DEFAULT));
                            jLabel26.setIcon(icono1);
                            jLabel26.setLocation(z, w);
                            break;
                        }
                        case 25: {
                            //System.out.println("Carta 25");
                            String dato = "La carta 25 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/medicinas/11.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel27.getWidth(), jLabel27.getHeight(), Image.SCALE_DEFAULT));
                            jLabel27.setIcon(icono1);
                            jLabel27.setLocation(z, w);
                            break;
                        }
                        case 26: {
                            //System.out.println("Carta 26");
                            String dato = "La carta 26 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/medicinas/12.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel28.getWidth(), jLabel28.getHeight(), Image.SCALE_DEFAULT));
                            jLabel28.setIcon(icono1);
                            jLabel28.setLocation(z, w);
                            break;
                        }
                        case 27: {
                            // System.out.println("Carta 27");
                            String dato = "La carta 27 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/medicinas/12.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel29.getWidth(), jLabel29.getHeight(), Image.SCALE_DEFAULT));
                            jLabel29.setIcon(icono1);
                            jLabel29.setLocation(z, w);
                            break;
                        }
                        case 28: {
                            //System.out.println("Carta 28");
                            String dato = "La carta 28 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/medicinas/12.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel30.getWidth(), jLabel30.getHeight(), Image.SCALE_DEFAULT));
                            jLabel30.setIcon(icono1);
                            jLabel30.setLocation(z, w);
                            break;
                        }
                        case 29: {
                            //System.out.println("Carta 29");
                            String dato = "La carta 29 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/medicinas/12.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel31.getWidth(), jLabel31.getHeight(), Image.SCALE_DEFAULT));
                            jLabel31.setIcon(icono1);
                            jLabel31.setLocation(z, w);
                            break;
                        }
                        case 30: {
                            //System.out.println("Carta 30");
                            String dato = "La carta 30 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/medicinas/13.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel32.getWidth(), jLabel32.getHeight(), Image.SCALE_DEFAULT));
                            jLabel32.setIcon(icono1);
                            jLabel32.setLocation(z, w);
                            break;
                        }
                        case 31: {
                            //System.out.println("Carta 31");
                            String dato = "La carta 31 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/medicinas/13.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel33.getWidth(), jLabel33.getHeight(), Image.SCALE_DEFAULT));
                            jLabel33.setIcon(icono1);
                            jLabel33.setLocation(z, w);
                            break;
                        }
                        case 32: {
                            //System.out.println("Carta 32");
                            String dato = "La carta 32 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/medicinas/13.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel34.getWidth(), jLabel34.getHeight(), Image.SCALE_DEFAULT));
                            jLabel34.setIcon(icono1);
                            jLabel34.setLocation(z, w);
                            break;
                        }
                        case 33: {
                            //System.out.println("Carta 33");
                            String dato = "La carta 33 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/medicinas/13.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel35.getWidth(), jLabel35.getHeight(), Image.SCALE_DEFAULT));
                            jLabel35.setIcon(icono1);
                            jLabel35.setLocation(z, w);
                            break;
                        }
                        case 34: {
                            //System.out.println("Carta 34");
                            String dato = "La carta 34 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/medicinas/14.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel36.getWidth(), jLabel36.getHeight(), Image.SCALE_DEFAULT));
                            jLabel36.setIcon(icono1);
                            jLabel36.setLocation(z, w);
                            break;
                        }
                        case 35: {
                            //System.out.println("Carta 35");
                            String dato = "La carta 35 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/medicinas/14.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel37.getWidth(), jLabel37.getHeight(), Image.SCALE_DEFAULT));
                            jLabel37.setIcon(icono1);
                            jLabel37.setLocation(z, w);
                            break;
                        }
                        case 36: {
                            //System.out.println("Carta 36");
                            String dato = "La carta 36 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/medicinas/14.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel38.getWidth(), jLabel38.getHeight(), Image.SCALE_DEFAULT));
                            jLabel38.setIcon(icono1);
                            jLabel38.setLocation(z, w);
                            break;
                        }
                        case 37: {
                            //System.out.println("Carta 37");
                            String dato = "La carta 37 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/medicinas/14.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel39.getWidth(), jLabel39.getHeight(), Image.SCALE_DEFAULT));
                            jLabel39.setIcon(icono1);
                            jLabel39.setLocation(z, w);
                            break;
                        }
                        case 38: {
                            //System.out.println("Carta 38");
                            String dato = "La carta 38 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/medicinas/15.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel40.getWidth(), jLabel40.getHeight(), Image.SCALE_DEFAULT));
                            jLabel40.setIcon(icono1);
                            jLabel40.setLocation(z, w);
                            break;
                        }
                        case 39: {
                            //System.out.println("Carta 39");
                            String dato = "La carta 39 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/tratamientos/6.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel41.getWidth(), jLabel41.getHeight(), Image.SCALE_DEFAULT));
                            jLabel41.setIcon(icono1);
                            jLabel41.setLocation(z, w);
                            break;
                        }
                        case 40: {
                            //System.out.println("Carta 40");
                            String dato = "La carta 40 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/tratamientos/7.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel42.getWidth(), jLabel42.getHeight(), Image.SCALE_DEFAULT));
                            jLabel42.setIcon(icono1);
                            jLabel42.setLocation(z, w);
                            break;
                        }
                        case 41: {
                            //System.out.println("Carta 41");
                            String dato = "La carta 41 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/tratamientos/7.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel43.getWidth(), jLabel43.getHeight(), Image.SCALE_DEFAULT));
                            jLabel43.setIcon(icono1);
                            jLabel43.setLocation(z, w);
                            break;
                        }
                        case 42: {
                            //System.out.println("Carta 42");
                            String dato = "La carta 42 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/tratamientos/7.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel44.getWidth(), jLabel44.getHeight(), Image.SCALE_DEFAULT));
                            jLabel44.setIcon(icono1);
                            jLabel44.setLocation(z, w);
                            break;
                        }
                        case 43: {
                            //System.out.println("Carta 43");
                            String dato = "La carta 43 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/tratamientos/8.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel45.getWidth(), jLabel45.getHeight(), Image.SCALE_DEFAULT));
                            jLabel45.setIcon(icono1);
                            jLabel45.setLocation(z, w);
                            break;
                        }
                        case 44: {
                            //System.out.println("Carta 44");
                            String dato = "La carta 44 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/tratamientos/8.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel46.getWidth(), jLabel46.getHeight(), Image.SCALE_DEFAULT));
                            jLabel46.setIcon(icono1);
                            jLabel46.setLocation(z, w);
                            break;
                        }
                        case 45: {
                            //System.out.println("Carta 45");
                            String dato = "La carta 45 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/tratamientos/9.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel47.getWidth(), jLabel47.getHeight(), Image.SCALE_DEFAULT));
                            jLabel47.setIcon(icono1);
                            jLabel47.setLocation(z, w);
                            break;
                        }
                        case 46: {
                            //System.out.println("Carta 46");
                            String dato = "La carta 46 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/tratamientos/9.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel48.getWidth(), jLabel48.getHeight(), Image.SCALE_DEFAULT));
                            jLabel48.setIcon(icono1);
                            jLabel48.setLocation(z, w);
                            break;
                        }
                        case 47: {
                            //System.out.println("Carta 47");
                            String dato = "La carta 47 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/tratamientos/9.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel49.getWidth(), jLabel49.getHeight(), Image.SCALE_DEFAULT));
                            jLabel49.setIcon(icono1);
                            jLabel49.setLocation(z, w);
                            break;
                        }
                        case 48: {
                            //System.out.println("Carta 48");
                            String dato = "La carta 48 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/tratamientos/10.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel50.getWidth(), jLabel50.getHeight(), Image.SCALE_DEFAULT));
                            jLabel50.setIcon(icono1);
                            jLabel50.setLocation(z, w);
                            break;
                        }
                        case 49: {
                            //System.out.println("Carta 49");
                            String dato = "La carta 49 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/virus/16.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel51.getWidth(), jLabel51.getHeight(), Image.SCALE_DEFAULT));
                            jLabel51.setIcon(icono1);
                            jLabel51.setLocation(z, w);
                            break;
                        }
                        case 50: {
                            //System.out.println("Carta 50");
                            String dato = "La carta 50 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/virus/16.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel52.getWidth(), jLabel52.getHeight(), Image.SCALE_DEFAULT));
                            jLabel52.setIcon(icono1);
                            jLabel52.setLocation(z, w);
                            break;
                        }
                        case 51: {
                            //System.out.println("Carta 51");
                            String dato = "La carta 51 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/virus/16.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel53.getWidth(), jLabel53.getHeight(), Image.SCALE_DEFAULT));
                            jLabel53.setIcon(icono1);
                            jLabel53.setLocation(z, w);
                            break;
                        }
                        case 52: {
                            //System.out.println("Carta 52");
                            String dato = "La carta 52 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/virus/16.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel54.getWidth(), jLabel54.getHeight(), Image.SCALE_DEFAULT));
                            jLabel54.setIcon(icono1);
                            jLabel54.setLocation(z, w);
                            break;
                        }
                        case 53: {
                            //System.out.println("Carta 53");
                            String dato = "La carta 53 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/virus/17.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel55.getWidth(), jLabel55.getHeight(), Image.SCALE_DEFAULT));
                            jLabel55.setIcon(icono1);
                            jLabel55.setLocation(z, w);
                            break;
                        }
                        case 54: {
                            //System.out.println("Carta 54");
                            String dato = "La carta 54 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/virus/17.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel56.getWidth(), jLabel56.getHeight(), Image.SCALE_DEFAULT));
                            jLabel56.setIcon(icono1);
                            jLabel56.setLocation(z, w);
                            break;
                        }
                        case 55: {
                            //System.out.println("Carta 55");
                            String dato = "La carta 55 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/virus/17.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel57.getWidth(), jLabel57.getHeight(), Image.SCALE_DEFAULT));
                            jLabel57.setIcon(icono1);
                            jLabel57.setLocation(z, w);
                            break;
                        }
                        case 56: {
                            //System.out.println("Carta 56");
                            String dato = "La carta 56 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/virus/17.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel58.getWidth(), jLabel58.getHeight(), Image.SCALE_DEFAULT));
                            jLabel58.setIcon(icono1);
                            jLabel58.setLocation(z, w);
                            break;
                        }
                        case 57: {
                            //System.out.println("Carta 57");
                            String dato = "La carta 57 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/virus/18.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel59.getWidth(), jLabel59.getHeight(), Image.SCALE_DEFAULT));
                            jLabel59.setIcon(icono1);
                            jLabel59.setLocation(z, w);
                            break;
                        }
                        case 58: {
                            //System.out.println("Carta 58");
                            String dato = "La carta 58 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/virus/18.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel60.getWidth(), jLabel60.getHeight(), Image.SCALE_DEFAULT));
                            jLabel60.setIcon(icono1);
                            jLabel60.setLocation(z, w);
                            break;
                        }
                        case 59: {
                            //System.out.println("Carta 59");
                            String dato = "La carta 59 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/virus/18.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel61.getWidth(), jLabel61.getHeight(), Image.SCALE_DEFAULT));
                            jLabel61.setIcon(icono1);
                            jLabel61.setLocation(z, w);
                            break;
                        }
                        case 60: {
                            // System.out.println("Carta 60");
                            String dato = "La carta 60 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/virus/18.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel62.getWidth(), jLabel62.getHeight(), Image.SCALE_DEFAULT));
                            jLabel62.setIcon(icono1);
                            jLabel62.setLocation(z, w);
                            break;
                        }
                        case 61: {
                            //System.out.println("Carta 61");
                            String dato = "La carta 61 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/virus/19.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel63.getWidth(), jLabel63.getHeight(), Image.SCALE_DEFAULT));
                            jLabel63.setIcon(icono1);
                            jLabel63.setLocation(z, w);
                            break;
                        }
                        case 62: {
                            //System.out.println("Carta 62");
                            String dato = "La carta 62 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/virus/19.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel64.getWidth(), jLabel64.getHeight(), Image.SCALE_DEFAULT));
                            jLabel64.setIcon(icono1);
                            jLabel64.setLocation(z, w);
                            break;
                        }
                        case 63: {
                            //System.out.println("Carta 63");
                            String dato = "La carta 63 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/virus/19.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel65.getWidth(), jLabel65.getHeight(), Image.SCALE_DEFAULT));
                            jLabel65.setIcon(icono1);
                            jLabel65.setLocation(z, w);
                            break;
                        }
                        case 64: {
                            //System.out.println("Carta 64");
                            String dato = "La carta 64 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/virus/19.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel66.getWidth(), jLabel66.getHeight(), Image.SCALE_DEFAULT));
                            jLabel66.setIcon(icono1);
                            jLabel66.setLocation(z, w);
                            break;
                        }
                        case 65: {
                            //System.out.println("Carta 65");
                            String dato = "La carta 65 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/virus/20.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel67.getWidth(), jLabel67.getHeight(), Image.SCALE_DEFAULT));
                            jLabel67.setIcon(icono1);
                            jLabel67.setLocation(z, w);
                            break;
                        }
                        case 66: {
                            // System.out.println("Carta 66");
                            String dato = "La carta 66 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/Medicinas/15.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel68.getWidth(), jLabel68.getHeight(), Image.SCALE_DEFAULT));
                            jLabel68.setIcon(icono1);
                            jLabel68.setLocation(z, w);
                            break;
                        }
                        case 67: {
                            // System.out.println("Carta 67");
                            String dato = "La carta 67 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/Medicinas/15.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel69.getWidth(), jLabel69.getHeight(), Image.SCALE_DEFAULT));
                            jLabel69.setIcon(icono1);
                            jLabel69.setLocation(z, w);
                            break;
                        }
                        case 68: {
                            // System.out.println("Carta 68");
                            String dato = "La carta 68 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/Medicinas/15.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel70.getWidth(), jLabel70.getHeight(), Image.SCALE_DEFAULT));
                            jLabel70.setIcon(icono1);
                            jLabel70.setLocation(z, w);
                            break;
                        }
                        default:
                            break;
                    }
                    break;
                }
                if (j >= 68) {
                    break;
                }
            }
        }
    }

    /**
     *
     * El método pasar_al_basurero es el encargado de que en el momento que una
     * carta ha sido revelada pero el jugador no la quiere, pase al área del
     * basurero.
     *
     */
    void pasar_al_basurero() {

        int x1 = 510, x2 = 527, y1 = 550, y2 = 568;
        int p1 = 808, p2 = 559;

        if (jLabel3.getX() >= x1 && jLabel3.getX() <= x2 && jLabel3.getY() >= y1 && jLabel3.getY() <= y2) {
            jLabel3.setLocation(p1, p2);
            String dato = "La carta 1 ha sido enviada al basurero ";
            envio_al_servidor(dato);
        }

        if (jLabel4.getX() >= x1 && jLabel4.getX() <= x2 && jLabel4.getY() >= y1 && jLabel4.getY() <= y2) {
            jLabel4.setLocation(p1, p2);
            String dato = "La carta 2 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel5.getX() >= x1 && jLabel5.getX() <= x2 && jLabel5.getY() >= y1 && jLabel5.getY() <= y2) {
            jLabel5.setLocation(p1, p2);
            String dato = "La carta 3 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel6.getX() >= x1 && jLabel6.getX() <= x2 && jLabel6.getY() >= y1 && jLabel6.getY() <= y2) {
            jLabel6.setLocation(p1, p2);
            String dato = "La carta 4 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel7.getX() >= x1 && jLabel7.getX() <= x2 && jLabel7.getY() >= y1 && jLabel7.getY() <= y2) {
            jLabel7.setLocation(p1, p2);
            String dato = "La carta 5 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel8.getX() >= x1 && jLabel8.getX() <= x2 && jLabel8.getY() >= y1 && jLabel8.getY() <= y2) {
            jLabel8.setLocation(p1, p2);
            String dato = "La carta 6 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel9.getX() >= x1 && jLabel9.getX() <= x2 && jLabel9.getY() >= y1 && jLabel9.getY() <= y2) {
            jLabel9.setLocation(p1, p2);
            String dato = "La carta 7 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel10.getX() >= x1 && jLabel10.getX() <= x2 && jLabel10.getY() >= y1 && jLabel10.getY() <= y2) {
            jLabel10.setLocation(p1, p2);
            String dato = "La carta 8 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel11.getX() >= x1 && jLabel11.getX() <= x2 && jLabel11.getY() >= y1 && jLabel11.getY() <= y2) {
            jLabel11.setLocation(p1, p2);
            String dato = "La carta 9 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel12.getX() >= x1 && jLabel12.getX() <= x2 && jLabel12.getY() >= y1 && jLabel12.getY() <= y2) {
            jLabel12.setLocation(p1, p2);
            String dato = "La carta 10 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel13.getX() >= x1 && jLabel13.getX() <= x2 && jLabel13.getY() >= y1 && jLabel13.getY() <= y2) {
            jLabel13.setLocation(p1, p2);
            String dato = "La carta 11 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel14.getX() >= x1 && jLabel14.getX() <= x2 && jLabel14.getY() >= y1 && jLabel14.getY() <= y2) {
            jLabel14.setLocation(p1, p2);
            String dato = "La carta 12 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel15.getX() >= x1 && jLabel15.getX() <= x2 && jLabel15.getY() >= y1 && jLabel15.getY() <= y2) {
            jLabel15.setLocation(p1, p2);
            String dato = "La carta 13 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel16.getX() >= x1 && jLabel16.getX() <= x2 && jLabel16.getY() >= y1 && jLabel16.getY() <= y2) {
            jLabel16.setLocation(p1, p2);
            String dato = "La carta 14 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel17.getX() >= x1 && jLabel17.getX() <= x2 && jLabel17.getY() >= y1 && jLabel17.getY() <= y2) {
            jLabel17.setLocation(p1, p2);
            String dato = "La carta 15 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel18.getX() >= x1 && jLabel18.getX() <= x2 && jLabel18.getY() >= y1 && jLabel18.getY() <= y2) {
            jLabel18.setLocation(p1, p2);
            String dato = "La carta 16 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel19.getX() >= x1 && jLabel19.getX() <= x2 && jLabel19.getY() >= y1 && jLabel19.getY() <= y2) {
            jLabel19.setLocation(p1, p2);
            String dato = "La carta 17 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel20.getX() >= x1 && jLabel20.getX() <= x2 && jLabel20.getY() >= y1 && jLabel20.getY() <= y2) {
            jLabel20.setLocation(p1, p2);
            String dato = "La carta 18 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel21.getX() >= x1 && jLabel21.getX() <= x2 && jLabel21.getY() >= y1 && jLabel21.getY() <= y2) {
            jLabel21.setLocation(p1, p2);
            String dato = "La carta 19 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel22.getX() >= x1 && jLabel22.getX() <= x2 && jLabel22.getY() >= y1 && jLabel22.getY() <= y2) {
            jLabel22.setLocation(p1, p2);
            String dato = "La carta 20 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel23.getX() >= x1 && jLabel23.getX() <= x2 && jLabel23.getY() >= y1 && jLabel23.getY() <= y2) {
            jLabel23.setLocation(p1, p2);
            String dato = "La carta 21 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel24.getX() >= x1 && jLabel24.getX() <= x2 && jLabel24.getY() >= y1 && jLabel24.getY() <= y2) {
            jLabel24.setLocation(p1, p2);
            String dato = "La carta 22 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel25.getX() >= x1 && jLabel25.getX() <= x2 && jLabel25.getY() >= y1 && jLabel25.getY() <= y2) {
            jLabel25.setLocation(p1, p2);
            String dato = "La carta 23 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel26.getX() >= x1 && jLabel26.getX() <= x2 && jLabel26.getY() >= y1 && jLabel26.getY() <= y2) {
            jLabel26.setLocation(p1, p2);
            String dato = "La carta 24 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel27.getX() >= x1 && jLabel27.getX() <= x2 && jLabel27.getY() >= y1 && jLabel27.getY() <= y2) {
            jLabel27.setLocation(p1, p2);
            String dato = "La carta 25 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel28.getX() >= x1 && jLabel28.getX() <= x2 && jLabel28.getY() >= y1 && jLabel28.getY() <= y2) {
            jLabel28.setLocation(p1, p2);
            String dato = "La carta 26 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel29.getX() >= x1 && jLabel29.getX() <= x2 && jLabel29.getY() >= y1 && jLabel29.getY() <= y2) {
            jLabel29.setLocation(p1, p2);
            String dato = "La carta 27 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel30.getX() >= x1 && jLabel30.getX() <= x2 && jLabel30.getY() >= y1 && jLabel30.getY() <= y2) {
            jLabel30.setLocation(p1, p2);
            String dato = "La carta 28 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel31.getX() >= x1 && jLabel31.getX() <= x2 && jLabel31.getY() >= y1 && jLabel31.getY() <= y2) {
            jLabel31.setLocation(p1, p2);
            String dato = "La carta 29 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel32.getX() >= x1 && jLabel32.getX() <= x2 && jLabel32.getY() >= y1 && jLabel32.getY() <= y2) {
            jLabel32.setLocation(p1, p2);
            String dato = "La carta 30 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel33.getX() >= x1 && jLabel33.getX() <= x2 && jLabel33.getY() >= y1 && jLabel33.getY() <= y2) {
            jLabel33.setLocation(p1, p2);
            String dato = "La carta 31 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel34.getX() >= x1 && jLabel34.getX() <= x2 && jLabel34.getY() >= y1 && jLabel34.getY() <= y2) {
            jLabel34.setLocation(p1, p2);
            String dato = "La carta 32 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel35.getX() >= x1 && jLabel35.getX() <= x2 && jLabel35.getY() >= y1 && jLabel35.getY() <= y2) {
            jLabel35.setLocation(p1, p2);
            String dato = "La carta 33 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel36.getX() >= x1 && jLabel36.getX() <= x2 && jLabel36.getY() >= y1 && jLabel36.getY() <= y2) {
            jLabel36.setLocation(p1, p2);
            String dato = "La carta 34 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel37.getX() >= x1 && jLabel37.getX() <= x2 && jLabel37.getY() >= y1 && jLabel37.getY() <= y2) {
            jLabel37.setLocation(p1, p2);
            String dato = "La carta 35 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel38.getX() >= x1 && jLabel38.getX() <= x2 && jLabel38.getY() >= y1 && jLabel38.getY() <= y2) {
            jLabel38.setLocation(p1, p2);
            String dato = "La carta 36 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel39.getX() >= x1 && jLabel39.getX() <= x2 && jLabel39.getY() >= y1 && jLabel39.getY() <= y2) {
            jLabel39.setLocation(p1, p2);
            String dato = "La carta 37 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel40.getX() >= x1 && jLabel40.getX() <= x2 && jLabel40.getY() >= y1 && jLabel40.getY() <= y2) {
            jLabel40.setLocation(p1, p2);
            String dato = "La carta 38 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel41.getX() >= x1 && jLabel41.getX() <= x2 && jLabel41.getY() >= y1 && jLabel41.getY() <= y2) {
            jLabel41.setLocation(p1, p2);
            String dato = "La carta 39 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel42.getX() >= x1 && jLabel42.getX() <= x2 && jLabel42.getY() >= y1 && jLabel42.getY() <= y2) {
            jLabel42.setLocation(p1, p2);
            String dato = "La carta 40 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel43.getX() >= x1 && jLabel43.getX() <= x2 && jLabel43.getY() >= y1 && jLabel43.getY() <= y2) {
            jLabel43.setLocation(p1, p2);
            String dato = "La carta 41 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel44.getX() >= x1 && jLabel44.getX() <= x2 && jLabel44.getY() >= y1 && jLabel44.getY() <= y2) {
            jLabel44.setLocation(p1, p2);
            String dato = "La carta 42 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel45.getX() >= x1 && jLabel45.getX() <= x2 && jLabel45.getY() >= y1 && jLabel45.getY() <= y2) {
            jLabel45.setLocation(p1, p2);
            String dato = "La carta 43 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel46.getX() >= x1 && jLabel46.getX() <= x2 && jLabel46.getY() >= y1 && jLabel46.getY() <= y2) {
            jLabel46.setLocation(p1, p2);
            String dato = "La carta 44 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel47.getX() >= x1 && jLabel47.getX() <= x2 && jLabel47.getY() >= y1 && jLabel47.getY() <= y2) {
            jLabel47.setLocation(p1, p2);
            String dato = "La carta 45 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel48.getX() >= x1 && jLabel48.getX() <= x2 && jLabel48.getY() >= y1 && jLabel48.getY() <= y2) {
            jLabel48.setLocation(p1, p2);
            String dato = "La carta 46 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel49.getX() >= x1 && jLabel49.getX() <= x2 && jLabel49.getY() >= y1 && jLabel49.getY() <= y2) {
            jLabel49.setLocation(p1, p2);
            String dato = "La carta 47 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel50.getX() >= x1 && jLabel50.getX() <= x2 && jLabel50.getY() >= y1 && jLabel50.getY() <= y2) {
            jLabel50.setLocation(p1, p2);
            String dato = "La carta 48 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel51.getX() >= x1 && jLabel51.getX() <= x2 && jLabel51.getY() >= y1 && jLabel51.getY() <= y2) {
            jLabel51.setLocation(p1, p2);
            String dato = "La carta 49 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel52.getX() >= x1 && jLabel52.getX() <= x2 && jLabel52.getY() >= y1 && jLabel52.getY() <= y2) {
            jLabel52.setLocation(p1, p2);
            String dato = "La carta 50 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel53.getX() >= x1 && jLabel53.getX() <= x2 && jLabel53.getY() >= y1 && jLabel53.getY() <= y2) {
            jLabel53.setLocation(p1, p2);
            String dato = "La carta 51 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel54.getX() >= x1 && jLabel54.getX() <= x2 && jLabel54.getY() >= y1 && jLabel54.getY() <= y2) {
            jLabel54.setLocation(p1, p2);
            String dato = "La carta 52 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel55.getX() >= x1 && jLabel55.getX() <= x2 && jLabel55.getY() >= y1 && jLabel55.getY() <= y2) {
            jLabel55.setLocation(p1, p2);
            String dato = "La carta 53 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel56.getX() >= x1 && jLabel56.getX() <= x2 && jLabel56.getY() >= y1 && jLabel56.getY() <= y2) {
            jLabel56.setLocation(p1, p2);
            String dato = "La carta 54 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel57.getX() >= x1 && jLabel57.getX() <= x2 && jLabel57.getY() >= y1 && jLabel57.getY() <= y2) {
            jLabel57.setLocation(p1, p2);
            String dato = "La carta 55 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel58.getX() >= x1 && jLabel58.getX() <= x2 && jLabel58.getY() >= y1 && jLabel58.getY() <= y2) {
            jLabel58.setLocation(p1, p2);
            String dato = "La carta 56 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel59.getX() >= x1 && jLabel59.getX() <= x2 && jLabel59.getY() >= y1 && jLabel59.getY() <= y2) {
            jLabel59.setLocation(p1, p2);
            String dato = "La carta 57 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel60.getX() >= x1 && jLabel60.getX() <= x2 && jLabel60.getY() >= y1 && jLabel60.getY() <= y2) {
            jLabel60.setLocation(p1, p2);
            String dato = "La carta 58 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel61.getX() >= x1 && jLabel61.getX() <= x2 && jLabel61.getY() >= y1 && jLabel61.getY() <= y2) {
            jLabel61.setLocation(p1, p2);
            String dato = "La carta 59 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel62.getX() >= x1 && jLabel62.getX() <= x2 && jLabel62.getY() >= y1 && jLabel62.getY() <= y2) {
            jLabel62.setLocation(p1, p2);
            String dato = "La carta 60 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel63.getX() >= x1 && jLabel63.getX() <= x2 && jLabel63.getY() >= y1 && jLabel63.getY() <= y2) {
            jLabel63.setLocation(p1, p2);
            String dato = "La carta 61 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel64.getX() >= x1 && jLabel64.getX() <= x2 && jLabel64.getY() >= y1 && jLabel64.getY() <= y2) {
            jLabel64.setLocation(p1, p2);
            String dato = "La carta 62 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel65.getX() >= x1 && jLabel65.getX() <= x2 && jLabel65.getY() >= y1 && jLabel65.getY() <= y2) {
            jLabel65.setLocation(p1, p2);
            String dato = "La carta 63 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel66.getX() >= x1 && jLabel66.getX() <= x2 && jLabel66.getY() >= y1 && jLabel66.getY() <= y2) {
            jLabel66.setLocation(p1, p2);
            String dato = "La carta 64 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel67.getX() >= x1 && jLabel67.getX() <= x2 && jLabel67.getY() >= y1 && jLabel67.getY() <= y2) {
            jLabel67.setLocation(p1, p2);
            String dato = "La carta 65 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel68.getX() >= x1 && jLabel68.getX() <= x2 && jLabel68.getY() >= y1 && jLabel68.getY() <= y2) {
            jLabel68.setLocation(p1, p2);
            String dato = "La carta 66 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel69.getX() >= x1 && jLabel69.getX() <= x2 && jLabel69.getY() >= y1 && jLabel69.getY() <= y2) {
            jLabel69.setLocation(p1, p2);
            String dato = "La carta 67 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }

        if (jLabel70.getX() >= x1 && jLabel70.getX() <= x2 && jLabel70.getY() >= y1 && jLabel70.getY() <= y2) {
            jLabel70.setLocation(p1, p2);
            String dato = "La carta 68 ha sido enviada al basurero";
            envio_al_servidor(dato);
        }
    }

    /**
     *
     * El método paso_de_turno es el encargado de mostrar que jugador es el que
     * debe de jugar.
     *
     */
    void paso_de_turno() {
        String dato1;
        switch (jugador) {
            case 2:
                switch (turno) {
                    case 1:
                        turno++;
                        jLabel2.setLocation(75, 5);
                        dato1 = "Es turno del jugador #" + turno;
                        envio_al_servidor(dato1);
                        break;
                    case 2:
                        turno = 1;
                        jLabel2.setLocation(1132, 5);
                        dato1 = "Es turno del jugador #" + turno;
                        envio_al_servidor(dato1);
                        break;
                    default:
                        break;
                }
                break;
            case 3:
                switch (turno) {
                    case 1:
                        turno++;
                        jLabel2.setLocation(75, 5);
                        dato1 = "Es turno del jugador #" + turno;
                        envio_al_servidor(dato1);
                        break;
                    case 2:
                        turno++;
                        jLabel2.setLocation(1132, 5);
                        dato1 = "Es turno del jugador #" + turno;
                        envio_al_servidor(dato1);
                        break;
                    case 3:
                        turno = 1;
                        jLabel2.setLocation(75, 228);
                        dato1 = "Es turno del jugador #" + turno;
                        envio_al_servidor(dato1);
                        break;
                    default:
                        break;
                }
                break;
            case 4:
                switch (turno) {
                    case 1:
                        turno++;
                        jLabel2.setLocation(75, 5);
                        dato1 = "Es turno del jugador #" + turno;
                        envio_al_servidor(dato1);
                        break;
                    case 2:
                        turno++;
                        jLabel2.setLocation(1132, 5);
                        dato1 = "Es turno del jugador #" + turno;
                        envio_al_servidor(dato1);
                        break;
                    case 3:
                        turno++;
                        jLabel2.setLocation(75, 228);
                        dato1 = "Es turno del jugador #" + turno;
                        envio_al_servidor(dato1);
                        break;
                    case 4:
                        turno = 1;
                        jLabel2.setLocation(1132, 231);
                        dato1 = "Es turno del jugador #" + turno;
                        envio_al_servidor(dato1);
                        break;
                    default:
                        break;
                }
                break;
            case 5:
                switch (turno) {
                    case 1:
                        turno++;
                        jLabel2.setLocation(75, 5);
                        dato1 = "Es turno del jugador #" + turno;
                        envio_al_servidor(dato1);
                        break;
                    case 2:
                        turno++;
                        jLabel2.setLocation(1132, 5);
                        dato1 = "Es turno del jugador #" + turno;
                        envio_al_servidor(dato1);
                        break;
                    case 3:
                        turno++;
                        jLabel2.setLocation(75, 228);
                        dato1 = "Es turno del jugador #" + turno;
                        envio_al_servidor(dato1);
                        break;
                    case 4:
                        turno++;
                        jLabel2.setLocation(1132, 231);
                        dato1 = "Es turno del jugador #" + turno;
                        envio_al_servidor(dato1);
                        break;
                    case 5:
                        turno = 1;
                        jLabel2.setLocation(75, 460);
                        dato1 = "Es turno del jugador #" + turno;
                        envio_al_servidor(dato1);
                        break;
                    default:
                        break;
                }
                break;
            case 6:
                switch (turno) {
                    case 1:
                        turno++;
                        jLabel2.setLocation(75, 5);
                        dato1 = "Es turno del jugador #" + turno;
                        envio_al_servidor(dato1);
                        break;
                    case 2:
                        turno++;
                        jLabel2.setLocation(1132, 5);
                        dato1 = "Es turno del jugador #" + turno;
                        envio_al_servidor(dato1);
                        break;
                    case 3:
                        turno++;
                        jLabel2.setLocation(75, 228);
                        dato1 = "Es turno del jugador #" + turno;
                        envio_al_servidor(dato1);
                        break;
                    case 4:
                        turno++;
                        jLabel2.setLocation(1132, 231);
                        dato1 = "Es turno del jugador #" + turno;
                        envio_al_servidor(dato1);
                        break;
                    case 5:
                        turno++;
                        jLabel2.setLocation(75, 460);
                        dato1 = "Es turno del jugador #" + turno;
                        envio_al_servidor(dato1);
                        break;
                    case 6:
                        turno = 1;
                        jLabel2.setLocation(1132, 458);
                        dato1 = "Es turno del jugador #" + turno;
                        envio_al_servidor(dato1);
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
    }

    /**
     *
     * El método sacar_carta es el encargado de sacar y revelar las cartas del
     * mazo cada vez que a el jugador le toque el turno.
     *
     */
    void sacar_carta() {
        pasar_al_basurero();
        Ganador();

        if (b >= 1) {
            int siono;

            while (true) {

                siono = 0;
                Random rn = new Random();
                int elegir = rn.nextInt(68) + 1;
                //System.out.println("elegir" + elegir);
                for (int i = 0; i < carta.length; i++) {
                    if (carta[i] == elegir) {
                        siono = 1;
                    }
                }

                if (siono == 0) {

                    carta[j] = elegir;
                    j++;
                    //System.out.println(j);
                    switch (elegir) {
                        case 1: {
                            //System.out.println("Carta 1");
                            String dato = "La carta 1 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/1.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_DEFAULT));
                            jLabel3.setIcon(icono1);
                            jLabel3.setLocation(z, w);
                            break;
                        }
                        case 2: {
                            // System.out.println("Carta 2");
                            String dato = "La carta 2 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/1.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT));
                            jLabel4.setIcon(icono1);
                            jLabel4.setLocation(z, w);
                            break;
                        }
                        case 3: {
                            //System.out.println("Carta 3");
                            String dato = "La carta 3 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/1.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_DEFAULT));
                            jLabel5.setIcon(icono1);
                            jLabel5.setLocation(z, w);
                            break;
                        }
                        case 4: {
                            //System.out.println("Carta 4");
                            String dato = "La carta 4 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/1.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_DEFAULT));
                            jLabel6.setIcon(icono1);
                            jLabel6.setLocation(z, w);
                            break;
                        }
                        case 5: {
                            // System.out.println("Carta 5");
                            String dato = "La carta 5 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/1.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_DEFAULT));
                            jLabel7.setIcon(icono1);

                            jLabel7.setLocation(z, w);
                            break;
                        }
                        case 6: {
                            // System.out.println("Carta 6");
                            String dato = "La carta 6 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/2.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel8.getWidth(), jLabel8.getHeight(), Image.SCALE_DEFAULT));
                            jLabel8.setIcon(icono1);
                            jLabel8.setLocation(z, w);
                            break;
                        }
                        case 7: {
                            //  System.out.println("Carta 7");
                            String dato = "La carta 7 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/2.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel9.getWidth(), jLabel9.getHeight(), Image.SCALE_DEFAULT));
                            jLabel9.setIcon(icono1);
                            jLabel9.setLocation(z, w);
                            break;
                        }
                        case 8: {
                            // System.out.println("Carta 8");
                            String dato = "La carta 8 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/2.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(), Image.SCALE_DEFAULT));
                            jLabel10.setIcon(icono1);
                            jLabel10.setLocation(z, w);
                            break;
                        }
                        case 9: {
                            //  System.out.println("Carta 9");
                            String dato = "La carta 9 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/2.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel11.getWidth(), jLabel11.getHeight(), Image.SCALE_DEFAULT));
                            jLabel11.setIcon(icono1);
                            jLabel11.setLocation(z, w);
                            break;
                        }
                        case 10: {
                            //  System.out.println("Carta 10");
                            String dato = "La carta 10 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/2.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel12.getWidth(), jLabel12.getHeight(), Image.SCALE_DEFAULT));
                            jLabel12.setIcon(icono1);
                            jLabel12.setLocation(z, w);
                            break;
                        }
                        case 11: {
                            //  System.out.println("Carta 11");
                            String dato = "La carta 11 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/3.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel13.getWidth(), jLabel13.getHeight(), Image.SCALE_DEFAULT));
                            jLabel13.setIcon(icono1);
                            jLabel13.setLocation(z, w);
                            break;
                        }
                        case 12: {
                            // System.out.println("Carta 12");
                            String dato = "La carta 12 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/3.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel14.getWidth(), jLabel14.getHeight(), Image.SCALE_DEFAULT));
                            jLabel14.setIcon(icono1);
                            jLabel14.setLocation(z, w);
                            break;
                        }
                        case 13: {
                            //System.out.println("Carta 13");
                            String dato = "La carta 13 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/3.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel15.getWidth(), jLabel15.getHeight(), Image.SCALE_DEFAULT));
                            jLabel15.setIcon(icono1);
                            jLabel15.setLocation(z, w);
                            break;
                        }
                        case 14: {
                            //System.out.println("Carta 14");
                            String dato = "La carta 14 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/3.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel16.getWidth(), jLabel16.getHeight(), Image.SCALE_DEFAULT));
                            jLabel16.setIcon(icono1);
                            jLabel16.setLocation(z, w);
                            break;
                        }
                        case 15: {
                            //System.out.println("Carta 15");
                            String dato = "La carta 15 ha sido revelada en la posición-> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/3.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel17.getWidth(), jLabel17.getHeight(), Image.SCALE_DEFAULT));
                            jLabel17.setIcon(icono1);
                            jLabel17.setLocation(z, w);
                            break;
                        }
                        case 16: {
                            //System.out.println("Carta 16");
                            String dato = "La carta 16 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/4.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel18.getWidth(), jLabel18.getHeight(), Image.SCALE_DEFAULT));
                            jLabel18.setIcon(icono1);
                            jLabel18.setLocation(z, w);
                            break;
                        }
                        case 17: {
                            //System.out.println("Carta 17");
                            String dato = "La carta 17 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/4.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel19.getWidth(), jLabel19.getHeight(), Image.SCALE_DEFAULT));
                            jLabel19.setIcon(icono1);
                            jLabel19.setLocation(z, w);
                            break;
                        }
                        case 18: {
                            //System.out.println("Carta 18");
                            String dato = "La carta 18 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/4.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel20.getWidth(), jLabel20.getHeight(), Image.SCALE_DEFAULT));
                            jLabel20.setIcon(icono1);
                            jLabel20.setLocation(z, w);
                            break;
                        }
                        case 19: {
                            //System.out.println("Carta 19");
                            String dato = "La carta 19 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/4.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel21.getWidth(), jLabel21.getHeight(), Image.SCALE_DEFAULT));
                            jLabel21.setIcon(icono1);
                            jLabel21.setLocation(z, w);
                            break;
                        }
                        case 20: {
                            //System.out.println("Carta 20");
                            String dato = "La carta 20 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/4.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel22.getWidth(), jLabel22.getHeight(), Image.SCALE_DEFAULT));
                            jLabel22.setIcon(icono1);
                            jLabel22.setLocation(z, w);
                            break;
                        }
                        case 21: {
                            //System.out.println("Carta 21");
                            String dato = "La carta 21 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/organos/5.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel23.getWidth(), jLabel23.getHeight(), Image.SCALE_DEFAULT));
                            jLabel23.setIcon(icono1);
                            jLabel23.setLocation(z, w);

                            break;
                        }
                        case 22: {
                            //System.out.println("Carta 22");
                            String dato = "La carta 22 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/medicinas/11.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel24.getWidth(), jLabel24.getHeight(), Image.SCALE_DEFAULT));
                            jLabel24.setIcon(icono1);
                            jLabel24.setLocation(z, w);
                            break;
                        }
                        case 23: {
                            //System.out.println("Carta 23");
                            String dato = "La carta 23 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/medicinas/11.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel25.getWidth(), jLabel25.getHeight(), Image.SCALE_DEFAULT));
                            jLabel25.setIcon(icono1);
                            jLabel25.setLocation(z, w);
                            break;
                        }
                        case 24: {
                            //System.out.println("Carta 24");
                            String dato = "La carta 24 ha sido revelada en la posición  -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/medicinas/11.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel26.getWidth(), jLabel26.getHeight(), Image.SCALE_DEFAULT));
                            jLabel26.setIcon(icono1);
                            jLabel26.setLocation(z, w);
                            break;
                        }
                        case 25: {
                            //System.out.println("Carta 25");
                            String dato = "La carta 25 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/medicinas/11.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel27.getWidth(), jLabel27.getHeight(), Image.SCALE_DEFAULT));
                            jLabel27.setIcon(icono1);
                            jLabel27.setLocation(z, w);
                            break;
                        }
                        case 26: {
                            //System.out.println("Carta 26");
                            String dato = "La carta 26 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/medicinas/12.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel28.getWidth(), jLabel28.getHeight(), Image.SCALE_DEFAULT));
                            jLabel28.setIcon(icono1);
                            jLabel28.setLocation(z, w);
                            break;
                        }
                        case 27: {
                            // System.out.println("Carta 27");
                            String dato = "La carta 27 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/medicinas/12.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel29.getWidth(), jLabel29.getHeight(), Image.SCALE_DEFAULT));
                            jLabel29.setIcon(icono1);
                            jLabel29.setLocation(z, w);
                            break;
                        }
                        case 28: {
                            //System.out.println("Carta 28");
                            String dato = "La carta 28 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/medicinas/12.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel30.getWidth(), jLabel30.getHeight(), Image.SCALE_DEFAULT));
                            jLabel30.setIcon(icono1);
                            jLabel30.setLocation(z, w);
                            break;
                        }
                        case 29: {
                            //System.out.println("Carta 29");
                            String dato = "La carta 29 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/medicinas/12.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel31.getWidth(), jLabel31.getHeight(), Image.SCALE_DEFAULT));
                            jLabel31.setIcon(icono1);
                            jLabel31.setLocation(z, w);
                            break;
                        }
                        case 30: {
                            //System.out.println("Carta 30");
                            String dato = "La carta 30 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/medicinas/13.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel32.getWidth(), jLabel32.getHeight(), Image.SCALE_DEFAULT));
                            jLabel32.setIcon(icono1);
                            jLabel32.setLocation(z, w);
                            break;
                        }
                        case 31: {
                            //System.out.println("Carta 31");
                            String dato = "La carta 31 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/medicinas/13.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel33.getWidth(), jLabel33.getHeight(), Image.SCALE_DEFAULT));
                            jLabel33.setIcon(icono1);
                            jLabel33.setLocation(z, w);
                            break;
                        }
                        case 32: {
                            //System.out.println("Carta 32");
                            String dato = "La carta 32 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/medicinas/13.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel34.getWidth(), jLabel34.getHeight(), Image.SCALE_DEFAULT));
                            jLabel34.setIcon(icono1);
                            jLabel34.setLocation(z, w);
                            break;
                        }
                        case 33: {
                            //System.out.println("Carta 33");
                            String dato = "La carta 33 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/medicinas/13.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel35.getWidth(), jLabel35.getHeight(), Image.SCALE_DEFAULT));
                            jLabel35.setIcon(icono1);
                            jLabel35.setLocation(z, w);
                            break;
                        }
                        case 34: {
                            //System.out.println("Carta 34");
                            String dato = "La carta 34 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/medicinas/14.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel36.getWidth(), jLabel36.getHeight(), Image.SCALE_DEFAULT));
                            jLabel36.setIcon(icono1);
                            jLabel36.setLocation(z, w);
                            break;
                        }
                        case 35: {
                            //System.out.println("Carta 35");
                            String dato = "La carta 35 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/medicinas/14.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel37.getWidth(), jLabel37.getHeight(), Image.SCALE_DEFAULT));
                            jLabel37.setIcon(icono1);
                            jLabel37.setLocation(z, w);
                            break;
                        }
                        case 36: {
                            //System.out.println("Carta 36");
                            String dato = "La carta 36 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/medicinas/14.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel38.getWidth(), jLabel38.getHeight(), Image.SCALE_DEFAULT));
                            jLabel38.setIcon(icono1);
                            jLabel38.setLocation(z, w);
                            break;
                        }
                        case 37: {
                            //System.out.println("Carta 37");
                            String dato = "La carta 37 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/medicinas/14.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel39.getWidth(), jLabel39.getHeight(), Image.SCALE_DEFAULT));
                            jLabel39.setIcon(icono1);
                            jLabel39.setLocation(z, w);
                            break;
                        }
                        case 38: {
                            //System.out.println("Carta 38");
                            String dato = "La carta 38 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/medicinas/15.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel40.getWidth(), jLabel40.getHeight(), Image.SCALE_DEFAULT));
                            jLabel40.setIcon(icono1);
                            jLabel40.setLocation(z, w);
                            break;
                        }
                        case 39: {
                            //System.out.println("Carta 39");
                            String dato = "La carta 39 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/tratamientos/6.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel41.getWidth(), jLabel41.getHeight(), Image.SCALE_DEFAULT));
                            jLabel41.setIcon(icono1);
                            jLabel41.setLocation(z, w);
                            break;
                        }
                        case 40: {
                            //System.out.println("Carta 40");
                            String dato = "La carta 40 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/tratamientos/7.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel42.getWidth(), jLabel42.getHeight(), Image.SCALE_DEFAULT));
                            jLabel42.setIcon(icono1);
                            jLabel42.setLocation(z, w);
                            break;
                        }
                        case 41: {
                            //System.out.println("Carta 41");
                            String dato = "La carta 41 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/tratamientos/7.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel43.getWidth(), jLabel43.getHeight(), Image.SCALE_DEFAULT));
                            jLabel43.setIcon(icono1);
                            jLabel43.setLocation(z, w);
                            break;
                        }
                        case 42: {
                            //System.out.println("Carta 42");
                            String dato = "La carta 42 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/tratamientos/7.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel44.getWidth(), jLabel44.getHeight(), Image.SCALE_DEFAULT));
                            jLabel44.setIcon(icono1);
                            jLabel44.setLocation(z, w);
                            break;
                        }
                        case 43: {
                            //System.out.println("Carta 43");
                            String dato = "La carta 43 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/tratamientos/8.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel45.getWidth(), jLabel45.getHeight(), Image.SCALE_DEFAULT));
                            jLabel45.setIcon(icono1);
                            jLabel45.setLocation(z, w);
                            break;
                        }
                        case 44: {
                            //System.out.println("Carta 44");
                            String dato = "La carta 44 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/tratamientos/8.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel46.getWidth(), jLabel46.getHeight(), Image.SCALE_DEFAULT));
                            jLabel46.setIcon(icono1);
                            jLabel46.setLocation(z, w);
                            break;
                        }
                        case 45: {
                            //System.out.println("Carta 45");
                            String dato = "La carta 45 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/tratamientos/9.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel47.getWidth(), jLabel47.getHeight(), Image.SCALE_DEFAULT));
                            jLabel47.setIcon(icono1);
                            jLabel47.setLocation(z, w);
                            break;
                        }
                        case 46: {
                            //System.out.println("Carta 46");
                            String dato = "La carta 46 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/tratamientos/9.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel48.getWidth(), jLabel48.getHeight(), Image.SCALE_DEFAULT));
                            jLabel48.setIcon(icono1);
                            jLabel48.setLocation(z, w);
                            break;
                        }
                        case 47: {
                            //System.out.println("Carta 47");
                            String dato = "La carta 47 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/tratamientos/9.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel49.getWidth(), jLabel49.getHeight(), Image.SCALE_DEFAULT));
                            jLabel49.setIcon(icono1);
                            jLabel49.setLocation(z, w);
                            break;
                        }
                        case 48: {
                            //System.out.println("Carta 48");
                            String dato = "La carta 48 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/tratamientos/10.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel50.getWidth(), jLabel50.getHeight(), Image.SCALE_DEFAULT));
                            jLabel50.setIcon(icono1);
                            jLabel50.setLocation(z, w);
                            break;
                        }
                        case 49: {
                            //System.out.println("Carta 49");
                            String dato = "La carta 49 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/virus/16.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel51.getWidth(), jLabel51.getHeight(), Image.SCALE_DEFAULT));
                            jLabel51.setIcon(icono1);
                            jLabel51.setLocation(z, w);
                            break;
                        }
                        case 50: {
                            //System.out.println("Carta 50");
                            String dato = "La carta 50 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/virus/16.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel52.getWidth(), jLabel52.getHeight(), Image.SCALE_DEFAULT));
                            jLabel52.setIcon(icono1);
                            jLabel52.setLocation(z, w);
                            break;
                        }
                        case 51: {
                            //System.out.println("Carta 51");
                            String dato = "La carta 51 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/virus/16.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel53.getWidth(), jLabel53.getHeight(), Image.SCALE_DEFAULT));
                            jLabel53.setIcon(icono1);
                            jLabel53.setLocation(z, w);
                            break;
                        }
                        case 52: {
                            //System.out.println("Carta 52");
                            String dato = "La carta 52 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/virus/16.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel54.getWidth(), jLabel54.getHeight(), Image.SCALE_DEFAULT));
                            jLabel54.setIcon(icono1);
                            jLabel54.setLocation(z, w);
                            break;
                        }
                        case 53: {
                            //System.out.println("Carta 53");
                            String dato = "La carta 53 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/virus/17.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel55.getWidth(), jLabel55.getHeight(), Image.SCALE_DEFAULT));
                            jLabel55.setIcon(icono1);
                            jLabel55.setLocation(z, w);
                            break;
                        }
                        case 54: {
                            //System.out.println("Carta 54");
                            String dato = "La carta 54 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/virus/17.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel56.getWidth(), jLabel56.getHeight(), Image.SCALE_DEFAULT));
                            jLabel56.setIcon(icono1);
                            jLabel56.setLocation(z, w);
                            break;
                        }
                        case 55: {
                            //System.out.println("Carta 55");
                            String dato = "La carta 55 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/virus/17.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel57.getWidth(), jLabel57.getHeight(), Image.SCALE_DEFAULT));
                            jLabel57.setIcon(icono1);
                            jLabel57.setLocation(z, w);
                            break;
                        }
                        case 56: {
                            //System.out.println("Carta 56");
                            String dato = "La carta 56 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/virus/17.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel58.getWidth(), jLabel58.getHeight(), Image.SCALE_DEFAULT));
                            jLabel58.setIcon(icono1);
                            jLabel58.setLocation(z, w);
                            break;
                        }
                        case 57: {
                            //System.out.println("Carta 57");
                            String dato = "La carta 57 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/virus/18.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel59.getWidth(), jLabel59.getHeight(), Image.SCALE_DEFAULT));
                            jLabel59.setIcon(icono1);
                            jLabel59.setLocation(z, w);
                            break;
                        }
                        case 58: {
                            //System.out.println("Carta 58");
                            String dato = "La carta 58 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/virus/18.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel60.getWidth(), jLabel60.getHeight(), Image.SCALE_DEFAULT));
                            jLabel60.setIcon(icono1);
                            jLabel60.setLocation(z, w);
                            break;
                        }
                        case 59: {
                            //System.out.println("Carta 59");
                            String dato = "La carta 59 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/virus/18.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel61.getWidth(), jLabel61.getHeight(), Image.SCALE_DEFAULT));
                            jLabel61.setIcon(icono1);
                            jLabel61.setLocation(z, w);
                            break;
                        }
                        case 60: {
                            // System.out.println("Carta 60");
                            String dato = "La carta 60 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/virus/18.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel62.getWidth(), jLabel62.getHeight(), Image.SCALE_DEFAULT));
                            jLabel62.setIcon(icono1);
                            jLabel62.setLocation(z, w);
                            break;
                        }
                        case 61: {
                            //System.out.println("Carta 61");
                            String dato = "La carta 61 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/virus/19.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel63.getWidth(), jLabel63.getHeight(), Image.SCALE_DEFAULT));
                            jLabel63.setIcon(icono1);
                            jLabel63.setLocation(z, w);
                            break;
                        }
                        case 62: {
                            //System.out.println("Carta 62");
                            String dato = "La carta 62 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/virus/19.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel64.getWidth(), jLabel64.getHeight(), Image.SCALE_DEFAULT));
                            jLabel64.setIcon(icono1);
                            jLabel64.setLocation(z, w);
                            break;
                        }
                        case 63: {
                            //System.out.println("Carta 63");
                            String dato = "La carta 63 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/virus/19.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel65.getWidth(), jLabel65.getHeight(), Image.SCALE_DEFAULT));
                            jLabel65.setIcon(icono1);
                            jLabel65.setLocation(z, w);
                            break;
                        }
                        case 64: {
                            //System.out.println("Carta 64");
                            String dato = "La carta 64 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/virus/19.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel66.getWidth(), jLabel66.getHeight(), Image.SCALE_DEFAULT));
                            jLabel66.setIcon(icono1);
                            jLabel66.setLocation(z, w);
                            break;
                        }
                        case 65: {
                            //System.out.println("Carta 65");
                            String dato = "La carta 65 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/virus/20.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel67.getWidth(), jLabel67.getHeight(), Image.SCALE_DEFAULT));
                            jLabel67.setIcon(icono1);
                            jLabel67.setLocation(z, w);
                            break;
                        }
                        case 66: {
                            // System.out.println("Carta 66");
                            String dato = "La carta 66 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/Medicinas/15.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel68.getWidth(), jLabel68.getHeight(), Image.SCALE_DEFAULT));
                            jLabel68.setIcon(icono1);
                            jLabel68.setLocation(z, w);
                            break;
                        }
                        case 67: {
                            // System.out.println("Carta 67");
                            String dato = "La carta 67 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/Medicinas/15.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel69.getWidth(), jLabel69.getHeight(), Image.SCALE_DEFAULT));
                            jLabel69.setIcon(icono1);
                            jLabel69.setLocation(z, w);
                            break;
                        }
                        case 68: {
                            // System.out.println("Carta 68");
                            String dato = "La carta 68 ha sido revelada en la posición -> X=" + z + "Y=" + w + ". ";
                            envio_al_servidor(dato);
                            ImageIcon imagen1 = new ImageIcon(getClass().getResource("/Medicinas/15.png"));
                            ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel70.getWidth(), jLabel70.getHeight(), Image.SCALE_DEFAULT));
                            jLabel70.setIcon(icono1);
                            jLabel70.setLocation(z, w);
                            break;
                        }
                        default:
                            break;
                    }
                    break;
                }
                if (j >= 68) {
                    break;
                }
            }
        }
    }

    /**
     *
     * El método barajar es el encargado de que en el momento en el que todas
     * las cartas estene en el área del basurero, las baraje y las coleque
     * nuevamente en el área del mazo.
     *
     */
    void barajar() {
        b = 1;
        ImageIcon imagen = new ImageIcon(getClass().getResource("/organos/fondo.png"));
        int x1 = 790, x2 = 829, y1 = 527, y2 = 575;
        int p1 = 449, p2 = 559;

        if (jLabel3.getX() >= x1 && jLabel3.getX() <= x2 && jLabel3.getY() >= y1 && jLabel3.getY() <= y2) {
            jLabel3.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_DEFAULT));
            jLabel3.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 1) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel4.getX() >= x1 && jLabel4.getX() <= x2 && jLabel4.getY() >= y1 && jLabel4.getY() <= y2) {
            jLabel4.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT));
            jLabel4.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 2) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel5.getX() >= x1 && jLabel5.getX() <= x2 && jLabel5.getY() >= y1 && jLabel5.getY() <= y2) {
            jLabel5.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_DEFAULT));
            jLabel5.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 3) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel6.getX() >= x1 && jLabel6.getX() <= x2 && jLabel6.getY() >= y1 && jLabel6.getY() <= y2) {
            jLabel6.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_DEFAULT));
            jLabel6.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 4) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel7.getX() >= x1 && jLabel7.getX() <= x2 && jLabel7.getY() >= y1 && jLabel7.getY() <= y2) {
            jLabel7.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_DEFAULT));
            jLabel7.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 5) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel8.getX() >= x1 && jLabel8.getX() <= x2 && jLabel8.getY() >= y1 && jLabel8.getY() <= y2) {
            jLabel8.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel8.getWidth(), jLabel8.getHeight(), Image.SCALE_DEFAULT));
            jLabel8.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 6) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel9.getX() >= x1 && jLabel9.getX() <= x2 && jLabel9.getY() >= y1 && jLabel9.getY() <= y2) {
            jLabel9.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel9.getWidth(), jLabel9.getHeight(), Image.SCALE_DEFAULT));
            jLabel9.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 7) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel10.getX() >= x1 && jLabel10.getX() <= x2 && jLabel10.getY() >= y1 && jLabel10.getY() <= y2) {
            jLabel10.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(), Image.SCALE_DEFAULT));
            jLabel10.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 8) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel11.getX() >= x1 && jLabel11.getX() <= x2 && jLabel11.getY() >= y1 && jLabel11.getY() <= y2) {
            jLabel11.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel11.getWidth(), jLabel11.getHeight(), Image.SCALE_DEFAULT));
            jLabel11.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 9) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel12.getX() >= x1 && jLabel12.getX() <= x2 && jLabel12.getY() >= y1 && jLabel12.getY() <= y2) {
            jLabel12.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel12.getWidth(), jLabel12.getHeight(), Image.SCALE_DEFAULT));
            jLabel12.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 10) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel13.getX() >= x1 && jLabel13.getX() <= x2 && jLabel13.getY() >= y1 && jLabel13.getY() <= y2) {
            jLabel13.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel13.getWidth(), jLabel13.getHeight(), Image.SCALE_DEFAULT));
            jLabel13.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 11) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel14.getX() >= x1 && jLabel14.getX() <= x2 && jLabel14.getY() >= y1 && jLabel14.getY() <= y2) {
            jLabel14.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel14.getWidth(), jLabel14.getHeight(), Image.SCALE_DEFAULT));
            jLabel14.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 12) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel15.getX() >= x1 && jLabel15.getX() <= x2 && jLabel15.getY() >= y1 && jLabel15.getY() <= y2) {
            jLabel15.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel15.getWidth(), jLabel15.getHeight(), Image.SCALE_DEFAULT));
            jLabel15.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 13) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel16.getX() >= x1 && jLabel16.getX() <= x2 && jLabel16.getY() >= y1 && jLabel16.getY() <= y2) {
            jLabel16.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel16.getWidth(), jLabel16.getHeight(), Image.SCALE_DEFAULT));
            jLabel16.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 14) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel17.getX() >= x1 && jLabel17.getX() <= x2 && jLabel17.getY() >= y1 && jLabel17.getY() <= y2) {
            jLabel17.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel17.getWidth(), jLabel17.getHeight(), Image.SCALE_DEFAULT));
            jLabel17.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 15) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel18.getX() >= x1 && jLabel18.getX() <= x2 && jLabel18.getY() >= y1 && jLabel18.getY() <= y2) {
            jLabel18.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel18.getWidth(), jLabel18.getHeight(), Image.SCALE_DEFAULT));
            jLabel18.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 16) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel19.getX() >= x1 && jLabel19.getX() <= x2 && jLabel19.getY() >= y1 && jLabel19.getY() <= y2) {
            jLabel19.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel19.getWidth(), jLabel19.getHeight(), Image.SCALE_DEFAULT));
            jLabel19.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 17) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel20.getX() >= x1 && jLabel20.getX() <= x2 && jLabel20.getY() >= y1 && jLabel20.getY() <= y2) {
            jLabel20.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel20.getWidth(), jLabel20.getHeight(), Image.SCALE_DEFAULT));
            jLabel20.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 18) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel21.getX() >= x1 && jLabel21.getX() <= x2 && jLabel21.getY() >= y1 && jLabel21.getY() <= y2) {
            jLabel21.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel21.getWidth(), jLabel21.getHeight(), Image.SCALE_DEFAULT));
            jLabel21.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 19) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel22.getX() >= x1 && jLabel22.getX() <= x2 && jLabel22.getY() >= y1 && jLabel22.getY() <= y2) {
            jLabel22.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel22.getWidth(), jLabel22.getHeight(), Image.SCALE_DEFAULT));
            jLabel22.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 20) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel23.getX() >= x1 && jLabel23.getX() <= x2 && jLabel23.getY() >= y1 && jLabel23.getY() <= y2) {
            jLabel23.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel23.getWidth(), jLabel23.getHeight(), Image.SCALE_DEFAULT));
            jLabel23.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 21) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel24.getX() >= x1 && jLabel24.getX() <= x2 && jLabel24.getY() >= y1 && jLabel24.getY() <= y2) {
            jLabel24.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel24.getWidth(), jLabel24.getHeight(), Image.SCALE_DEFAULT));
            jLabel24.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 22) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel25.getX() >= x1 && jLabel25.getX() <= x2 && jLabel25.getY() >= y1 && jLabel25.getY() <= y2) {
            jLabel25.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel25.getWidth(), jLabel25.getHeight(), Image.SCALE_DEFAULT));
            jLabel25.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 23) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel26.getX() >= x1 && jLabel26.getX() <= x2 && jLabel26.getY() >= y1 && jLabel26.getY() <= y2) {
            jLabel26.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel26.getWidth(), jLabel26.getHeight(), Image.SCALE_DEFAULT));
            jLabel26.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 24) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel27.getX() >= x1 && jLabel27.getX() <= x2 && jLabel27.getY() >= y1 && jLabel27.getY() <= y2) {
            jLabel27.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel27.getWidth(), jLabel27.getHeight(), Image.SCALE_DEFAULT));
            jLabel27.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 25) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel28.getX() >= x1 && jLabel28.getX() <= x2 && jLabel28.getY() >= y1 && jLabel28.getY() <= y2) {
            jLabel28.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel28.getWidth(), jLabel28.getHeight(), Image.SCALE_DEFAULT));
            jLabel28.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 26) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel29.getX() >= x1 && jLabel29.getX() <= x2 && jLabel29.getY() >= y1 && jLabel29.getY() <= y2) {
            jLabel29.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel29.getWidth(), jLabel29.getHeight(), Image.SCALE_DEFAULT));
            jLabel29.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 27) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel30.getX() >= x1 && jLabel30.getX() <= x2 && jLabel30.getY() >= y1 && jLabel30.getY() <= y2) {
            jLabel30.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel30.getWidth(), jLabel30.getHeight(), Image.SCALE_DEFAULT));
            jLabel30.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 28) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel31.getX() >= x1 && jLabel31.getX() <= x2 && jLabel31.getY() >= y1 && jLabel31.getY() <= y2) {
            jLabel31.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel31.getWidth(), jLabel31.getHeight(), Image.SCALE_DEFAULT));
            jLabel31.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 29) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel32.getX() >= x1 && jLabel32.getX() <= x2 && jLabel32.getY() >= y1 && jLabel32.getY() <= y2) {
            jLabel32.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel32.getWidth(), jLabel32.getHeight(), Image.SCALE_DEFAULT));
            jLabel32.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 30) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel33.getX() >= x1 && jLabel33.getX() <= x2 && jLabel33.getY() >= y1 && jLabel33.getY() <= y2) {
            jLabel33.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel33.getWidth(), jLabel33.getHeight(), Image.SCALE_DEFAULT));
            jLabel33.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 31) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel34.getX() >= x1 && jLabel34.getX() <= x2 && jLabel34.getY() >= y1 && jLabel34.getY() <= y2) {
            jLabel34.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel34.getWidth(), jLabel34.getHeight(), Image.SCALE_DEFAULT));
            jLabel34.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 32) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel35.getX() >= x1 && jLabel35.getX() <= x2 && jLabel35.getY() >= y1 && jLabel35.getY() <= y2) {
            jLabel35.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel35.getWidth(), jLabel35.getHeight(), Image.SCALE_DEFAULT));
            jLabel35.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 33) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel36.getX() >= x1 && jLabel36.getX() <= x2 && jLabel36.getY() >= y1 && jLabel36.getY() <= y2) {
            jLabel36.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel36.getWidth(), jLabel36.getHeight(), Image.SCALE_DEFAULT));
            jLabel36.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 34) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel37.getX() >= x1 && jLabel37.getX() <= x2 && jLabel37.getY() >= y1 && jLabel37.getY() <= y2) {
            jLabel37.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel37.getWidth(), jLabel37.getHeight(), Image.SCALE_DEFAULT));
            jLabel37.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 35) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel38.getX() >= x1 && jLabel38.getX() <= x2 && jLabel38.getY() >= y1 && jLabel38.getY() <= y2) {
            jLabel38.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel38.getWidth(), jLabel38.getHeight(), Image.SCALE_DEFAULT));
            jLabel38.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 36) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel39.getX() >= x1 && jLabel39.getX() <= x2 && jLabel39.getY() >= y1 && jLabel39.getY() <= y2) {
            jLabel39.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel39.getWidth(), jLabel39.getHeight(), Image.SCALE_DEFAULT));
            jLabel39.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 37) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel40.getX() >= x1 && jLabel40.getX() <= x2 && jLabel40.getY() >= y1 && jLabel40.getY() <= y2) {
            jLabel40.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel40.getWidth(), jLabel40.getHeight(), Image.SCALE_DEFAULT));
            jLabel40.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 38) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel41.getX() >= x1 && jLabel41.getX() <= x2 && jLabel41.getY() >= y1 && jLabel41.getY() <= y2) {
            jLabel41.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel41.getWidth(), jLabel41.getHeight(), Image.SCALE_DEFAULT));
            jLabel41.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 39) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel42.getX() >= x1 && jLabel42.getX() <= x2 && jLabel42.getY() >= y1 && jLabel42.getY() <= y2) {
            jLabel42.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel42.getWidth(), jLabel42.getHeight(), Image.SCALE_DEFAULT));
            jLabel42.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 40) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel43.getX() >= x1 && jLabel43.getX() <= x2 && jLabel43.getY() >= y1 && jLabel43.getY() <= y2) {
            jLabel43.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel43.getWidth(), jLabel43.getHeight(), Image.SCALE_DEFAULT));
            jLabel43.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 41) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel44.getX() >= x1 && jLabel44.getX() <= x2 && jLabel44.getY() >= y1 && jLabel44.getY() <= y2) {
            jLabel44.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel44.getWidth(), jLabel44.getHeight(), Image.SCALE_DEFAULT));
            jLabel44.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 42) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel45.getX() >= x1 && jLabel45.getX() <= x2 && jLabel45.getY() >= y1 && jLabel45.getY() <= y2) {
            jLabel45.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel45.getWidth(), jLabel45.getHeight(), Image.SCALE_DEFAULT));
            jLabel45.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 43) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel46.getX() >= x1 && jLabel46.getX() <= x2 && jLabel46.getY() >= y1 && jLabel46.getY() <= y2) {
            jLabel46.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel46.getWidth(), jLabel46.getHeight(), Image.SCALE_DEFAULT));
            jLabel46.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 44) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel47.getX() >= x1 && jLabel47.getX() <= x2 && jLabel47.getY() >= y1 && jLabel47.getY() <= y2) {
            jLabel47.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel47.getWidth(), jLabel47.getHeight(), Image.SCALE_DEFAULT));
            jLabel47.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 45) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel48.getX() >= x1 && jLabel48.getX() <= x2 && jLabel48.getY() >= y1 && jLabel48.getY() <= y2) {
            jLabel48.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel48.getWidth(), jLabel48.getHeight(), Image.SCALE_DEFAULT));
            jLabel48.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 46) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel49.getX() >= x1 && jLabel49.getX() <= x2 && jLabel49.getY() >= y1 && jLabel49.getY() <= y2) {
            jLabel49.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel49.getWidth(), jLabel49.getHeight(), Image.SCALE_DEFAULT));
            jLabel49.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 47) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel50.getX() >= x1 && jLabel50.getX() <= x2 && jLabel50.getY() >= y1 && jLabel50.getY() <= y2) {
            jLabel50.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel50.getWidth(), jLabel50.getHeight(), Image.SCALE_DEFAULT));
            jLabel50.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 48) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel51.getX() >= x1 && jLabel51.getX() <= x2 && jLabel51.getY() >= y1 && jLabel51.getY() <= y2) {
            jLabel51.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel51.getWidth(), jLabel51.getHeight(), Image.SCALE_DEFAULT));
            jLabel51.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 49) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel52.getX() >= x1 && jLabel52.getX() <= x2 && jLabel52.getY() >= y1 && jLabel52.getY() <= y2) {
            jLabel52.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel52.getWidth(), jLabel52.getHeight(), Image.SCALE_DEFAULT));
            jLabel52.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 50) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel53.getX() >= x1 && jLabel53.getX() <= x2 && jLabel53.getY() >= y1 && jLabel53.getY() <= y2) {
            jLabel53.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel53.getWidth(), jLabel53.getHeight(), Image.SCALE_DEFAULT));
            jLabel53.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 51) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel54.getX() >= x1 && jLabel54.getX() <= x2 && jLabel54.getY() >= y1 && jLabel54.getY() <= y2) {
            jLabel54.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel54.getWidth(), jLabel54.getHeight(), Image.SCALE_DEFAULT));
            jLabel54.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 52) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel55.getX() >= x1 && jLabel55.getX() <= x2 && jLabel55.getY() >= y1 && jLabel55.getY() <= y2) {
            jLabel55.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel55.getWidth(), jLabel55.getHeight(), Image.SCALE_DEFAULT));
            jLabel55.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 53) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel56.getX() >= x1 && jLabel56.getX() <= x2 && jLabel56.getY() >= y1 && jLabel56.getY() <= y2) {
            jLabel56.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel56.getWidth(), jLabel56.getHeight(), Image.SCALE_DEFAULT));
            jLabel56.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 54) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel57.getX() >= x1 && jLabel57.getX() <= x2 && jLabel57.getY() >= y1 && jLabel57.getY() <= y2) {
            jLabel57.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel57.getWidth(), jLabel57.getHeight(), Image.SCALE_DEFAULT));
            jLabel57.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 55) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel58.getX() >= x1 && jLabel58.getX() <= x2 && jLabel58.getY() >= y1 && jLabel58.getY() <= y2) {
            jLabel58.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel58.getWidth(), jLabel58.getHeight(), Image.SCALE_DEFAULT));
            jLabel58.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 56) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel59.getX() >= x1 && jLabel59.getX() <= x2 && jLabel59.getY() >= y1 && jLabel59.getY() <= y2) {
            jLabel59.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel59.getWidth(), jLabel59.getHeight(), Image.SCALE_DEFAULT));
            jLabel59.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 57) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel60.getX() >= x1 && jLabel60.getX() <= x2 && jLabel60.getY() >= y1 && jLabel60.getY() <= y2) {
            jLabel60.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel60.getWidth(), jLabel60.getHeight(), Image.SCALE_DEFAULT));
            jLabel60.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 58) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel61.getX() >= x1 && jLabel61.getX() <= x2 && jLabel61.getY() >= y1 && jLabel61.getY() <= y2) {
            jLabel61.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel61.getWidth(), jLabel61.getHeight(), Image.SCALE_DEFAULT));
            jLabel61.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 59) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel62.getX() >= x1 && jLabel62.getX() <= x2 && jLabel62.getY() >= y1 && jLabel62.getY() <= y2) {
            jLabel62.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel62.getWidth(), jLabel62.getHeight(), Image.SCALE_DEFAULT));
            jLabel62.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 60) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel63.getX() >= x1 && jLabel63.getX() <= x2 && jLabel63.getY() >= y1 && jLabel63.getY() <= y2) {
            jLabel63.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel63.getWidth(), jLabel63.getHeight(), Image.SCALE_DEFAULT));
            jLabel63.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 61) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel64.getX() >= x1 && jLabel64.getX() <= x2 && jLabel64.getY() >= y1 && jLabel64.getY() <= y2) {
            jLabel64.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel64.getWidth(), jLabel64.getHeight(), Image.SCALE_DEFAULT));
            jLabel64.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 62) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel65.getX() >= x1 && jLabel65.getX() <= x2 && jLabel65.getY() >= y1 && jLabel65.getY() <= y2) {
            jLabel65.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel65.getWidth(), jLabel65.getHeight(), Image.SCALE_DEFAULT));
            jLabel65.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 63) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel66.getX() >= x1 && jLabel66.getX() <= x2 && jLabel66.getY() >= y1 && jLabel66.getY() <= y2) {
            jLabel66.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel66.getWidth(), jLabel66.getHeight(), Image.SCALE_DEFAULT));
            jLabel66.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 64) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel67.getX() >= x1 && jLabel67.getX() <= x2 && jLabel67.getY() >= y1 && jLabel67.getY() <= y2) {
            jLabel67.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel67.getWidth(), jLabel67.getHeight(), Image.SCALE_DEFAULT));
            jLabel67.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 65) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel68.getX() >= x1 && jLabel68.getX() <= x2 && jLabel68.getY() >= y1 && jLabel68.getY() <= y2) {
            jLabel68.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel68.getWidth(), jLabel68.getHeight(), Image.SCALE_DEFAULT));
            jLabel68.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 66) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel69.getX() >= x1 && jLabel69.getX() <= x2 && jLabel69.getY() >= y1 && jLabel69.getY() <= y2) {
            jLabel69.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel69.getWidth(), jLabel69.getHeight(), Image.SCALE_DEFAULT));
            jLabel69.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 67) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (jLabel70.getX() >= x1 && jLabel70.getX() <= x2 && jLabel70.getY() >= y1 && jLabel70.getY() <= y2) {
            jLabel70.setLocation(p1, p2);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel70.getWidth(), jLabel70.getHeight(), Image.SCALE_DEFAULT));
            jLabel70.setIcon(icono);
            for (int i = 0; i < carta.length; i++) {
                if (carta[i] == 68) {
                    String dato = "La carta " + carta[i] + " ha sido barajada y enviada al mazo ";
                    envio_al_servidor(dato);
                    carta[i] = 0;
                    p = p + 1;
                }
            }
        }

        if (j >= 68) {
            j = 67;
        }
        j = j - p;
        p = 0;

        jButton3.setText("BARAJAR");
//        j = 0;
//        for (int i = 0; i < carta.length; i++) {
//            carta[i] = 0;
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        jButton1.setText("SACAR CARTA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(550, 10, 115, 60);

        jLabel3.setText("  CARTA");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel3MouseDragged(evt);
            }
        });
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(950, 10, 50, 50);

        jLabel4.setText("  CARTA");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel4MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(950, 70, 50, 50);

        jLabel5.setText("  CARTA");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel5MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(950, 130, 50, 50);

        jLabel6.setText("  CARTA");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel6MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(950, 190, 50, 50);

        jLabel7.setText("  CARTA");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel7MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(950, 250, 50, 50);

        jLabel8.setText("  CARTA");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel8MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel8);
        jLabel8.setBounds(950, 310, 50, 50);

        jLabel9.setText("  CARTA");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel9MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel9);
        jLabel9.setBounds(950, 370, 50, 50);

        jLabel10.setText("  CARTA");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel10MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel10);
        jLabel10.setBounds(950, 430, 50, 50);

        jLabel11.setText("  CARTA");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel11.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel11MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel11);
        jLabel11.setBounds(950, 490, 50, 50);

        jLabel12.setText("  CARTA");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel12.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel12MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel12);
        jLabel12.setBounds(950, 550, 50, 50);

        jLabel13.setText("  CARTA");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel13.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel13MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel13);
        jLabel13.setBounds(1010, 10, 50, 50);

        jLabel14.setText("  CARTA");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel14.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel14MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel14);
        jLabel14.setBounds(1010, 70, 50, 50);

        jLabel15.setText("  CARTA");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel15.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel15MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel15);
        jLabel15.setBounds(1010, 130, 50, 50);

        jLabel16.setText("  CARTA");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel16.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel16MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel16);
        jLabel16.setBounds(1010, 190, 50, 50);

        jLabel17.setText("  CARTA");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel17.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel17MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel17);
        jLabel17.setBounds(1010, 250, 50, 50);

        jLabel18.setText("  CARTA");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel18.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel18MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel18);
        jLabel18.setBounds(1010, 310, 50, 50);

        jLabel19.setText("  CARTA");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel19.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel19MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel19);
        jLabel19.setBounds(1010, 370, 50, 50);

        jLabel20.setText("  CARTA");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel20.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel20MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel20);
        jLabel20.setBounds(1010, 430, 50, 50);

        jLabel21.setText("  CARTA");
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel21.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel21MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel21);
        jLabel21.setBounds(1010, 490, 50, 50);

        jLabel22.setText("  CARTA");
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel22.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel22MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel22);
        jLabel22.setBounds(1010, 550, 50, 50);

        jLabel23.setText("  CARTA");
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel23.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel23MouseDragged(evt);
            }
        });
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel23);
        jLabel23.setBounds(1070, 10, 50, 50);

        jLabel24.setText("  CARTA");
        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel24.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel24MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel24);
        jLabel24.setBounds(1070, 70, 50, 50);

        jLabel25.setText("  CARTA");
        jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel25.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel25MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel25);
        jLabel25.setBounds(1070, 130, 50, 50);

        jLabel26.setText("  CARTA");
        jLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel26.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel26MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel26);
        jLabel26.setBounds(1070, 190, 50, 50);

        jLabel27.setText("  CARTA");
        jLabel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel27.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel27MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel27);
        jLabel27.setBounds(1070, 250, 50, 50);

        jLabel28.setText("  CARTA");
        jLabel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel28.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel28MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel28);
        jLabel28.setBounds(1070, 310, 50, 50);

        jLabel29.setText("  CARTA");
        jLabel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel29.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel29MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel29);
        jLabel29.setBounds(1070, 370, 50, 50);

        jLabel30.setText("  CARTA");
        jLabel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel30.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel30MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel30);
        jLabel30.setBounds(1070, 430, 50, 50);

        jLabel31.setText("  CARTA");
        jLabel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel31.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel31MouseDragged(evt);
            }
        });
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel31);
        jLabel31.setBounds(1070, 490, 50, 50);

        jLabel32.setText("  CARTA");
        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel32.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel32MouseDragged(evt);
            }
        });
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel32);
        jLabel32.setBounds(1070, 550, 50, 50);

        jLabel33.setText("  CARTA");
        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel33.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel33MouseDragged(evt);
            }
        });
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel33);
        jLabel33.setBounds(1130, 10, 50, 50);

        jLabel34.setText("  CARTA");
        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel34.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel34MouseDragged(evt);
            }
        });
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel34);
        jLabel34.setBounds(1130, 70, 50, 50);

        jLabel35.setText("  CARTA");
        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel35.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel35MouseDragged(evt);
            }
        });
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel35);
        jLabel35.setBounds(1130, 130, 50, 50);

        jLabel36.setText("  CARTA");
        jLabel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel36.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel36MouseDragged(evt);
            }
        });
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel36);
        jLabel36.setBounds(1130, 190, 50, 50);

        jLabel37.setText("  CARTA");
        jLabel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel37.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel37MouseDragged(evt);
            }
        });
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel37MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel37);
        jLabel37.setBounds(1130, 250, 50, 50);

        jLabel38.setText("  CARTA");
        jLabel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel38.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel38MouseDragged(evt);
            }
        });
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel38);
        jLabel38.setBounds(1130, 310, 50, 50);

        jLabel39.setText("  CARTA");
        jLabel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel39.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel39MouseDragged(evt);
            }
        });
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel39MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel39);
        jLabel39.setBounds(1130, 370, 50, 50);

        jLabel40.setText("  CARTA");
        jLabel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel40.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel40MouseDragged(evt);
            }
        });
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel40MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel40);
        jLabel40.setBounds(1130, 430, 50, 50);

        jLabel41.setText("  CARTA");
        jLabel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel41.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel41MouseDragged(evt);
            }
        });
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel41MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel41);
        jLabel41.setBounds(1130, 490, 50, 50);

        jLabel42.setText("  CARTA");
        jLabel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel42.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel42MouseDragged(evt);
            }
        });
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel42MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel42);
        jLabel42.setBounds(1130, 550, 50, 50);

        jLabel43.setText("  CARTA");
        jLabel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel43.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel43MouseDragged(evt);
            }
        });
        jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel43MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel43);
        jLabel43.setBounds(1190, 10, 50, 50);

        jLabel44.setText("  CARTA");
        jLabel44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel44.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel44MouseDragged(evt);
            }
        });
        jLabel44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel44MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel44);
        jLabel44.setBounds(1190, 70, 50, 50);

        jLabel45.setText("  CARTA");
        jLabel45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel45.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel45MouseDragged(evt);
            }
        });
        jLabel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel45MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel45);
        jLabel45.setBounds(1190, 130, 50, 50);

        jLabel46.setText("  CARTA");
        jLabel46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel46.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel46MouseDragged(evt);
            }
        });
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel46MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel46);
        jLabel46.setBounds(1190, 190, 50, 50);

        jLabel47.setText("  CARTA");
        jLabel47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel47.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel47MouseDragged(evt);
            }
        });
        jLabel47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel47MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel47);
        jLabel47.setBounds(1190, 250, 50, 50);

        jLabel48.setText("  CARTA");
        jLabel48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel48.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel48MouseDragged(evt);
            }
        });
        jLabel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel48MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel48);
        jLabel48.setBounds(1190, 310, 50, 50);

        jLabel49.setText("  CARTA");
        jLabel49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel49.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel49MouseDragged(evt);
            }
        });
        jLabel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel49MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel49);
        jLabel49.setBounds(1190, 370, 50, 50);

        jLabel50.setText("  CARTA");
        jLabel50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel50.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel50MouseDragged(evt);
            }
        });
        jLabel50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel50MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel50);
        jLabel50.setBounds(1190, 430, 50, 50);

        jLabel51.setText("  CARTA");
        jLabel51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel51.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel51MouseDragged(evt);
            }
        });
        jLabel51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel51MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel51);
        jLabel51.setBounds(1190, 490, 50, 50);

        jLabel52.setText("  CARTA");
        jLabel52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel52.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel52MouseDragged(evt);
            }
        });
        jLabel52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel52MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel52);
        jLabel52.setBounds(1190, 550, 50, 50);

        jLabel53.setText("  CARTA");
        jLabel53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel53.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel53MouseDragged(evt);
            }
        });
        jLabel53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel53MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel53);
        jLabel53.setBounds(1250, 10, 50, 50);

        jLabel54.setText("  CARTA");
        jLabel54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel54.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel54MouseDragged(evt);
            }
        });
        jLabel54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel54MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel54);
        jLabel54.setBounds(1250, 70, 50, 50);

        jLabel55.setText("  CARTA");
        jLabel55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel55.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel55MouseDragged(evt);
            }
        });
        jLabel55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel55MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel55);
        jLabel55.setBounds(1250, 130, 50, 50);

        jLabel56.setText("  CARTA");
        jLabel56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel56.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel56MouseDragged(evt);
            }
        });
        jLabel56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel56MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel56);
        jLabel56.setBounds(1250, 190, 50, 50);

        jLabel57.setText("  CARTA");
        jLabel57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel57.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel57MouseDragged(evt);
            }
        });
        jLabel57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel57MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel57);
        jLabel57.setBounds(1250, 250, 50, 50);

        jLabel58.setText("  CARTA");
        jLabel58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel58.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel58MouseDragged(evt);
            }
        });
        jLabel58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel58MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel58);
        jLabel58.setBounds(1250, 310, 50, 50);

        jLabel59.setText("  CARTA");
        jLabel59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel59.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel59MouseDragged(evt);
            }
        });
        jLabel59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel59MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel59);
        jLabel59.setBounds(1250, 370, 50, 50);

        jLabel60.setText("  CARTA");
        jLabel60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel60.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel60MouseDragged(evt);
            }
        });
        jLabel60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel60MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel60);
        jLabel60.setBounds(1250, 430, 50, 50);

        jLabel61.setText("  CARTA");
        jLabel61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel61.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel61MouseDragged(evt);
            }
        });
        jLabel61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel61MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel61);
        jLabel61.setBounds(1250, 490, 50, 50);

        jLabel62.setText("  CARTA");
        jLabel62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel62.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel62MouseDragged(evt);
            }
        });
        jLabel62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel62MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel62);
        jLabel62.setBounds(1250, 550, 50, 50);

        jLabel63.setText("  CARTA");
        jLabel63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel63.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel63MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel63);
        jLabel63.setBounds(1310, 10, 50, 50);

        jLabel64.setText("  CARTA");
        jLabel64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel64.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel64MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel64);
        jLabel64.setBounds(1310, 70, 50, 50);

        jLabel65.setText("  CARTA");
        jLabel65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel65.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel65MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel65);
        jLabel65.setBounds(1310, 130, 50, 50);

        jLabel66.setText("  CARTA");
        jLabel66.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel66.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel66MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel66);
        jLabel66.setBounds(1310, 190, 50, 50);

        jLabel67.setText("  CARTA");
        jLabel67.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel67.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel67MouseDragged(evt);
            }
        });
        jLabel67.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel67MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel67);
        jLabel67.setBounds(1310, 250, 50, 50);

        jLabel68.setText("  CARTA");
        jLabel68.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel68.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel68MouseDragged(evt);
            }
        });
        jLabel68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel68MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel68);
        jLabel68.setBounds(1310, 310, 50, 50);

        jLabel69.setText("  CARTA");
        jLabel69.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel69.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel69MouseDragged(evt);
            }
        });
        jLabel69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel69MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel69);
        jLabel69.setBounds(1310, 370, 50, 50);

        jLabel70.setText("  CARTA");
        jLabel70.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel70.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel70MouseDragged(evt);
            }
        });
        jLabel70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel70MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel70);
        jLabel70.setBounds(1310, 430, 50, 50);

        jButton3.setText("INICIAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(670, 10, 115, 60);

        jButton2.setText("COMO JUGAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(790, 10, 130, 60);

        jLabel2.setText("jLabel2");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(75, 5, 30, 30);

        jButton4.setText("SACAR X DESCARTE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(430, 10, 115, 60);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1360, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     *
     * Hace el llamdo de los métodos sacar_carta y paso_de_turno.
     *
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        sacar_carta();
        paso_de_turno();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Los jLabel8MouseDragged de los botones se encargan de dar movimiento a
     * las cartas de los jugadores.
     *
     * @param evt
     */
    private void jLabel8MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseDragged
        jLabel8.setLocation(jLabel8.getLocation().x + evt.getX() - jLabel8.getWidth() / 2, jLabel8.getLocation().y + evt.getY() - jLabel8.getHeight() / 2);
    }//GEN-LAST:event_jLabel8MouseDragged

    private void jLabel9MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseDragged
        jLabel9.setLocation(jLabel9.getLocation().x + evt.getX() - jLabel9.getWidth() / 2, jLabel9.getLocation().y + evt.getY() - jLabel9.getHeight() / 2);
    }//GEN-LAST:event_jLabel9MouseDragged

    private void jLabel10MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseDragged
        jLabel10.setLocation(jLabel10.getLocation().x + evt.getX() - jLabel10.getWidth() / 2, jLabel10.getLocation().y + evt.getY() - jLabel10.getHeight() / 2);
    }//GEN-LAST:event_jLabel10MouseDragged

    private void jLabel11MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseDragged
        jLabel11.setLocation(jLabel11.getLocation().x + evt.getX() - jLabel11.getWidth() / 2, jLabel11.getLocation().y + evt.getY() - jLabel11.getHeight() / 2);
    }//GEN-LAST:event_jLabel11MouseDragged

    private void jLabel12MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseDragged
        jLabel12.setLocation(jLabel12.getLocation().x + evt.getX() - jLabel12.getWidth() / 2, jLabel12.getLocation().y + evt.getY() - jLabel12.getHeight() / 2);
    }//GEN-LAST:event_jLabel12MouseDragged

    private void jLabel18MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseDragged
        jLabel18.setLocation(jLabel18.getLocation().x + evt.getX() - jLabel18.getWidth() / 2, jLabel18.getLocation().y + evt.getY() - jLabel18.getHeight() / 2);
    }//GEN-LAST:event_jLabel18MouseDragged

    private void jLabel19MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseDragged
        jLabel19.setLocation(jLabel19.getLocation().x + evt.getX() - jLabel19.getWidth() / 2, jLabel19.getLocation().y + evt.getY() - jLabel19.getHeight() / 2);
    }//GEN-LAST:event_jLabel19MouseDragged

    private void jLabel20MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseDragged
        jLabel20.setLocation(jLabel20.getLocation().x + evt.getX() - jLabel20.getWidth() / 2, jLabel20.getLocation().y + evt.getY() - jLabel20.getHeight() / 2);
    }//GEN-LAST:event_jLabel20MouseDragged

    private void jLabel21MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseDragged
        jLabel21.setLocation(jLabel21.getLocation().x + evt.getX() - jLabel21.getWidth() / 2, jLabel21.getLocation().y + evt.getY() - jLabel21.getHeight() / 2);
    }//GEN-LAST:event_jLabel21MouseDragged

    private void jLabel22MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseDragged
        jLabel22.setLocation(jLabel22.getLocation().x + evt.getX() - jLabel22.getWidth() / 2, jLabel22.getLocation().y + evt.getY() - jLabel22.getHeight() / 2);
    }//GEN-LAST:event_jLabel22MouseDragged

    private void jLabel28MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseDragged
        jLabel28.setLocation(jLabel28.getLocation().x + evt.getX() - jLabel28.getWidth() / 2, jLabel28.getLocation().y + evt.getY() - jLabel28.getHeight() / 2);
    }//GEN-LAST:event_jLabel28MouseDragged

    private void jLabel29MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseDragged
        jLabel29.setLocation(jLabel29.getLocation().x + evt.getX() - jLabel29.getWidth() / 2, jLabel29.getLocation().y + evt.getY() - jLabel29.getHeight() / 2);
    }//GEN-LAST:event_jLabel29MouseDragged

    private void jLabel30MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseDragged
        jLabel30.setLocation(jLabel30.getLocation().x + evt.getX() - jLabel30.getWidth() / 2, jLabel30.getLocation().y + evt.getY() - jLabel30.getHeight() / 2);
    }//GEN-LAST:event_jLabel30MouseDragged

    private void jLabel31MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseDragged
        jLabel31.setLocation(jLabel31.getLocation().x + evt.getX() - jLabel31.getWidth() / 2, jLabel31.getLocation().y + evt.getY() - jLabel31.getHeight() / 2);
    }//GEN-LAST:event_jLabel31MouseDragged

    private void jLabel32MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseDragged
        jLabel32.setLocation(jLabel32.getLocation().x + evt.getX() - jLabel32.getWidth() / 2, jLabel32.getLocation().y + evt.getY() - jLabel32.getHeight() / 2);
    }//GEN-LAST:event_jLabel32MouseDragged

    private void jLabel38MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseDragged
        jLabel38.setLocation(jLabel38.getLocation().x + evt.getX() - jLabel38.getWidth() / 2, jLabel38.getLocation().y + evt.getY() - jLabel38.getHeight() / 2);
    }//GEN-LAST:event_jLabel38MouseDragged

    private void jLabel39MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseDragged
        jLabel39.setLocation(jLabel39.getLocation().x + evt.getX() - jLabel39.getWidth() / 2, jLabel39.getLocation().y + evt.getY() - jLabel39.getHeight() / 2);
    }//GEN-LAST:event_jLabel39MouseDragged

    private void jLabel40MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseDragged
        jLabel40.setLocation(jLabel40.getLocation().x + evt.getX() - jLabel40.getWidth() / 2, jLabel40.getLocation().y + evt.getY() - jLabel40.getHeight() / 2);
    }//GEN-LAST:event_jLabel40MouseDragged

    private void jLabel41MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseDragged
        jLabel41.setLocation(jLabel41.getLocation().x + evt.getX() - jLabel41.getWidth() / 2, jLabel41.getLocation().y + evt.getY() - jLabel41.getHeight() / 2);
    }//GEN-LAST:event_jLabel41MouseDragged

    private void jLabel42MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseDragged
        jLabel42.setLocation(jLabel42.getLocation().x + evt.getX() - jLabel42.getWidth() / 2, jLabel42.getLocation().y + evt.getY() - jLabel42.getHeight() / 2);
    }//GEN-LAST:event_jLabel42MouseDragged

    private void jLabel48MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseDragged
        jLabel48.setLocation(jLabel48.getLocation().x + evt.getX() - jLabel48.getWidth() / 2, jLabel48.getLocation().y + evt.getY() - jLabel48.getHeight() / 2);
    }//GEN-LAST:event_jLabel48MouseDragged

    private void jLabel49MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseDragged
        jLabel49.setLocation(jLabel49.getLocation().x + evt.getX() - jLabel49.getWidth() / 2, jLabel49.getLocation().y + evt.getY() - jLabel49.getHeight() / 2);
    }//GEN-LAST:event_jLabel49MouseDragged

    private void jLabel50MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseDragged
        jLabel50.setLocation(jLabel50.getLocation().x + evt.getX() - jLabel50.getWidth() / 2, jLabel50.getLocation().y + evt.getY() - jLabel50.getHeight() / 2);
    }//GEN-LAST:event_jLabel50MouseDragged

    private void jLabel51MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseDragged
        jLabel51.setLocation(jLabel51.getLocation().x + evt.getX() - jLabel51.getWidth() / 2, jLabel51.getLocation().y + evt.getY() - jLabel51.getHeight() / 2);
    }//GEN-LAST:event_jLabel51MouseDragged

    private void jLabel52MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseDragged
        jLabel52.setLocation(jLabel52.getLocation().x + evt.getX() - jLabel52.getWidth() / 2, jLabel52.getLocation().y + evt.getY() - jLabel52.getHeight() / 2);
    }//GEN-LAST:event_jLabel52MouseDragged

    private void jLabel58MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel58MouseDragged
        jLabel58.setLocation(jLabel58.getLocation().x + evt.getX() - jLabel58.getWidth() / 2, jLabel58.getLocation().y + evt.getY() - jLabel58.getHeight() / 2);
    }//GEN-LAST:event_jLabel58MouseDragged

    private void jLabel59MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel59MouseDragged
        jLabel59.setLocation(jLabel59.getLocation().x + evt.getX() - jLabel59.getWidth() / 2, jLabel59.getLocation().y + evt.getY() - jLabel59.getHeight() / 2);
    }//GEN-LAST:event_jLabel59MouseDragged

    private void jLabel60MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel60MouseDragged
        jLabel60.setLocation(jLabel60.getLocation().x + evt.getX() - jLabel60.getWidth() / 2, jLabel60.getLocation().y + evt.getY() - jLabel60.getHeight() / 2);
    }//GEN-LAST:event_jLabel60MouseDragged

    private void jLabel61MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel61MouseDragged
        jLabel61.setLocation(jLabel61.getLocation().x + evt.getX() - jLabel61.getWidth() / 2, jLabel61.getLocation().y + evt.getY() - jLabel61.getHeight() / 2);
    }//GEN-LAST:event_jLabel61MouseDragged

    private void jLabel62MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel62MouseDragged
        jLabel62.setLocation(jLabel62.getLocation().x + evt.getX() - jLabel62.getWidth() / 2, jLabel62.getLocation().y + evt.getY() - jLabel62.getHeight() / 2);
    }//GEN-LAST:event_jLabel62MouseDragged

    private void jLabel68MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel68MouseDragged
        jLabel68.setLocation(jLabel68.getLocation().x + evt.getX() - jLabel68.getWidth() / 2, jLabel68.getLocation().y + evt.getY() - jLabel68.getHeight() / 2);
    }//GEN-LAST:event_jLabel68MouseDragged

    private void jLabel69MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel69MouseDragged
        jLabel69.setLocation(jLabel69.getLocation().x + evt.getX() - jLabel69.getWidth() / 2, jLabel69.getLocation().y + evt.getY() - jLabel69.getHeight() / 2);
    }//GEN-LAST:event_jLabel69MouseDragged

    private void jLabel70MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseDragged
        jLabel70.setLocation(jLabel70.getLocation().x + evt.getX() - jLabel70.getWidth() / 2, jLabel70.getLocation().y + evt.getY() - jLabel70.getHeight() / 2);
    }//GEN-LAST:event_jLabel70MouseDragged

    private void jLabel67MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel67MouseDragged
        jLabel67.setLocation(jLabel67.getLocation().x + evt.getX() - jLabel67.getWidth() / 2, jLabel67.getLocation().y + evt.getY() - jLabel67.getHeight() / 2);
    }//GEN-LAST:event_jLabel67MouseDragged

    private void jLabel66MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel66MouseDragged
        jLabel66.setLocation(jLabel66.getLocation().x + evt.getX() - jLabel66.getWidth() / 2, jLabel66.getLocation().y + evt.getY() - jLabel66.getHeight() / 2);
    }//GEN-LAST:event_jLabel66MouseDragged

    private void jLabel65MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel65MouseDragged
        jLabel65.setLocation(jLabel65.getLocation().x + evt.getX() - jLabel65.getWidth() / 2, jLabel65.getLocation().y + evt.getY() - jLabel65.getHeight() / 2);
    }//GEN-LAST:event_jLabel65MouseDragged

    private void jLabel64MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel64MouseDragged
        jLabel64.setLocation(jLabel64.getLocation().x + evt.getX() - jLabel64.getWidth() / 2, jLabel64.getLocation().y + evt.getY() - jLabel64.getHeight() / 2);
    }//GEN-LAST:event_jLabel64MouseDragged

    private void jLabel37MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseDragged
        jLabel37.setLocation(jLabel37.getLocation().x + evt.getX() - jLabel37.getWidth() / 2, jLabel37.getLocation().y + evt.getY() - jLabel37.getHeight() / 2);
    }//GEN-LAST:event_jLabel37MouseDragged

    private void jLabel36MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseDragged
        jLabel36.setLocation(jLabel36.getLocation().x + evt.getX() - jLabel36.getWidth() / 2, jLabel36.getLocation().y + evt.getY() - jLabel36.getHeight() / 2);
    }//GEN-LAST:event_jLabel36MouseDragged

    private void jLabel35MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseDragged
        jLabel35.setLocation(jLabel35.getLocation().x + evt.getX() - jLabel35.getWidth() / 2, jLabel35.getLocation().y + evt.getY() - jLabel35.getHeight() / 2);
    }//GEN-LAST:event_jLabel35MouseDragged

    private void jLabel34MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseDragged
        jLabel34.setLocation(jLabel34.getLocation().x + evt.getX() - jLabel34.getWidth() / 2, jLabel34.getLocation().y + evt.getY() - jLabel34.getHeight() / 2);
    }//GEN-LAST:event_jLabel34MouseDragged

    private void jLabel27MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseDragged
        jLabel27.setLocation(jLabel27.getLocation().x + evt.getX() - jLabel27.getWidth() / 2, jLabel27.getLocation().y + evt.getY() - jLabel27.getHeight() / 2);
    }//GEN-LAST:event_jLabel27MouseDragged

    private void jLabel26MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseDragged
        jLabel26.setLocation(jLabel26.getLocation().x + evt.getX() - jLabel26.getWidth() / 2, jLabel26.getLocation().y + evt.getY() - jLabel26.getHeight() / 2);
    }//GEN-LAST:event_jLabel26MouseDragged

    private void jLabel25MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseDragged
        jLabel25.setLocation(jLabel25.getLocation().x + evt.getX() - jLabel25.getWidth() / 2, jLabel25.getLocation().y + evt.getY() - jLabel25.getHeight() / 2);
    }//GEN-LAST:event_jLabel25MouseDragged

    private void jLabel24MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseDragged
        jLabel24.setLocation(jLabel24.getLocation().x + evt.getX() - jLabel24.getWidth() / 2, jLabel24.getLocation().y + evt.getY() - jLabel24.getHeight() / 2);
    }//GEN-LAST:event_jLabel24MouseDragged

    private void jLabel7MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseDragged
        jLabel7.setLocation(jLabel7.getLocation().x + evt.getX() - jLabel7.getWidth() / 2, jLabel7.getLocation().y + evt.getY() - jLabel7.getHeight() / 2);
    }//GEN-LAST:event_jLabel7MouseDragged

    private void jLabel6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseDragged
        jLabel6.setLocation(jLabel6.getLocation().x + evt.getX() - jLabel6.getWidth() / 2, jLabel6.getLocation().y + evt.getY() - jLabel6.getHeight() / 2);
    }//GEN-LAST:event_jLabel6MouseDragged

    private void jLabel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseDragged
        jLabel5.setLocation(jLabel5.getLocation().x + evt.getX() - jLabel5.getWidth() / 2, jLabel5.getLocation().y + evt.getY() - jLabel5.getHeight() / 2);
    }//GEN-LAST:event_jLabel5MouseDragged

    private void jLabel17MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseDragged
        jLabel17.setLocation(jLabel17.getLocation().x + evt.getX() - jLabel17.getWidth() / 2, jLabel17.getLocation().y + evt.getY() - jLabel17.getHeight() / 2);
    }//GEN-LAST:event_jLabel17MouseDragged

    private void jLabel16MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseDragged
        jLabel16.setLocation(jLabel16.getLocation().x + evt.getX() - jLabel16.getWidth() / 2, jLabel16.getLocation().y + evt.getY() - jLabel16.getHeight() / 2);
    }//GEN-LAST:event_jLabel16MouseDragged

    private void jLabel15MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseDragged
        jLabel15.setLocation(jLabel15.getLocation().x + evt.getX() - jLabel15.getWidth() / 2, jLabel15.getLocation().y + evt.getY() - jLabel15.getHeight() / 2);
    }//GEN-LAST:event_jLabel15MouseDragged

    private void jLabel14MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseDragged
        jLabel14.setLocation(jLabel14.getLocation().x + evt.getX() - jLabel14.getWidth() / 2, jLabel14.getLocation().y + evt.getY() - jLabel14.getHeight() / 2);
    }//GEN-LAST:event_jLabel14MouseDragged

    private void jLabel57MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel57MouseDragged
        jLabel57.setLocation(jLabel57.getLocation().x + evt.getX() - jLabel57.getWidth() / 2, jLabel57.getLocation().y + evt.getY() - jLabel57.getHeight() / 2);
    }//GEN-LAST:event_jLabel57MouseDragged

    private void jLabel56MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel56MouseDragged
        jLabel56.setLocation(jLabel56.getLocation().x + evt.getX() - jLabel56.getWidth() / 2, jLabel56.getLocation().y + evt.getY() - jLabel56.getHeight() / 2);
    }//GEN-LAST:event_jLabel56MouseDragged

    private void jLabel55MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel55MouseDragged
        jLabel55.setLocation(jLabel55.getLocation().x + evt.getX() - jLabel55.getWidth() / 2, jLabel55.getLocation().y + evt.getY() - jLabel55.getHeight() / 2);
    }//GEN-LAST:event_jLabel55MouseDragged

    private void jLabel54MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseDragged
        jLabel54.setLocation(jLabel54.getLocation().x + evt.getX() - jLabel54.getWidth() / 2, jLabel54.getLocation().y + evt.getY() - jLabel54.getHeight() / 2);
    }//GEN-LAST:event_jLabel54MouseDragged

    private void jLabel47MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseDragged
        jLabel47.setLocation(jLabel47.getLocation().x + evt.getX() - jLabel47.getWidth() / 2, jLabel47.getLocation().y + evt.getY() - jLabel47.getHeight() / 2);
    }//GEN-LAST:event_jLabel47MouseDragged

    private void jLabel46MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseDragged
        jLabel46.setLocation(jLabel46.getLocation().x + evt.getX() - jLabel46.getWidth() / 2, jLabel46.getLocation().y + evt.getY() - jLabel46.getHeight() / 2);
    }//GEN-LAST:event_jLabel46MouseDragged

    private void jLabel45MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MouseDragged
        jLabel45.setLocation(jLabel45.getLocation().x + evt.getX() - jLabel45.getWidth() / 2, jLabel45.getLocation().y + evt.getY() - jLabel45.getHeight() / 2);
    }//GEN-LAST:event_jLabel45MouseDragged

    private void jLabel44MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel44MouseDragged
        jLabel44.setLocation(jLabel44.getLocation().x + evt.getX() - jLabel44.getWidth() / 2, jLabel44.getLocation().y + evt.getY() - jLabel44.getHeight() / 2);
    }//GEN-LAST:event_jLabel44MouseDragged

    private void jLabel43MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseDragged
        jLabel43.setLocation(jLabel43.getLocation().x + evt.getX() - jLabel43.getWidth() / 2, jLabel43.getLocation().y + evt.getY() - jLabel43.getHeight() / 2);
    }//GEN-LAST:event_jLabel43MouseDragged

    private void jLabel33MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseDragged
        jLabel33.setLocation(jLabel33.getLocation().x + evt.getX() - jLabel33.getWidth() / 2, jLabel33.getLocation().y + evt.getY() - jLabel33.getHeight() / 2);
    }//GEN-LAST:event_jLabel33MouseDragged

    private void jLabel23MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseDragged
        jLabel23.setLocation(jLabel23.getLocation().x + evt.getX() - jLabel23.getWidth() / 2, jLabel23.getLocation().y + evt.getY() - jLabel23.getHeight() / 2);
    }//GEN-LAST:event_jLabel23MouseDragged

    private void jLabel63MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel63MouseDragged
        jLabel63.setLocation(jLabel63.getLocation().x + evt.getX() - jLabel63.getWidth() / 2, jLabel63.getLocation().y + evt.getY() - jLabel63.getHeight() / 2);
    }//GEN-LAST:event_jLabel63MouseDragged

    private void jLabel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseDragged
        jLabel3.setLocation(jLabel3.getLocation().x + evt.getX() - jLabel3.getWidth() / 2, jLabel3.getLocation().y + evt.getY() - jLabel3.getHeight() / 2);
    }//GEN-LAST:event_jLabel3MouseDragged

    private void jLabel13MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseDragged
        jLabel13.setLocation(jLabel13.getLocation().x + evt.getX() - jLabel13.getWidth() / 2, jLabel13.getLocation().y + evt.getY() - jLabel13.getHeight() / 2);
    }//GEN-LAST:event_jLabel13MouseDragged

    private void jLabel53MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel53MouseDragged
        jLabel53.setLocation(jLabel53.getLocation().x + evt.getX() - jLabel53.getWidth() / 2, jLabel53.getLocation().y + evt.getY() - jLabel53.getHeight() / 2);
    }//GEN-LAST:event_jLabel53MouseDragged

    /**
     *
     * Hacel el llamado de los métodos reparti_manos y barajar.
     *
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (s == 1) {
            Repartir_manos();
            s++;
        }
        barajar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked

    }//GEN-LAST:event_jLabel33MouseClicked

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked

    }//GEN-LAST:event_jLabel35MouseClicked

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked

    }//GEN-LAST:event_jLabel34MouseClicked

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked

    }//GEN-LAST:event_jLabel36MouseClicked

    private void jLabel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseClicked

    }//GEN-LAST:event_jLabel37MouseClicked

    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked

    }//GEN-LAST:event_jLabel38MouseClicked

    private void jLabel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseClicked

    }//GEN-LAST:event_jLabel39MouseClicked

    /**
     * Los jLabel40MouseClicked de los botones se encargan de dar un mensaje al
     * jugador para que realize una acción del juego.
     *
     * @param evt
     */
    private void jLabel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseClicked
        JOptionPane.showMessageDialog(null, "Medicina multicolor.\n"
                + "Puedes curar virus o vacunar órganos de cualquier color.", "Instrucciones de carta", JOptionPane.INFORMATION_MESSAGE);
        //jLabel40.setLocation(p1, p2);
    }//GEN-LAST:event_jLabel40MouseClicked

    private void jLabel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseClicked
        JOptionPane.showMessageDialog(null, "Error medico.\n"
                + "Puedes intercambiar tu cuerpo por el de otro jugador.", "Instrucciones de carta", JOptionPane.INFORMATION_MESSAGE);
        cambio_de_mazo();
        jLabel41.setLocation(p1, p2);
    }//GEN-LAST:event_jLabel41MouseClicked

    private void jLabel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseClicked
        JOptionPane.showMessageDialog(null, "Contagio.\n"
                + "Puedes trasladar tantos virus como se pueda de tus "
                + "órganos infectados a los órganos de los demás jugadores,\n "
                + "pero no se puede utilizar el contagio sobre órganos vacunados\n"
                + " o infectados, sólo se podrá contagiar órganos libres. ", "Instrucciones de carta", JOptionPane.INFORMATION_MESSAGE);
        jLabel42.setLocation(p1, p2);
    }//GEN-LAST:event_jLabel42MouseClicked

    private void jLabel43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseClicked
        JOptionPane.showMessageDialog(null, "Contagio.\n"
                + "Puedes trasladar tantos virus como se pueda de tus "
                + "órganos infectados a los órganos de los demás jugadores,\n "
                + "pero no se puede utilizar el contagio sobre órganos vacunados\n"
                + " o infectados, sólo se podrá contagiar órganos libres. ", "Instrucciones de carta", JOptionPane.INFORMATION_MESSAGE);
        jLabel43.setLocation(p1, p2);
    }//GEN-LAST:event_jLabel43MouseClicked

    private void jLabel44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel44MouseClicked
        JOptionPane.showMessageDialog(null, "Contagio.\n"
                + "Puedes trasladar tantos virus como se pueda de tus "
                + "órganos infectados a los órganos de los demás jugadores,\n "
                + "pero no se puede utilizar el contagio sobre órganos vacunados\n"
                + " o infectados, sólo se podrá contagiar órganos libres. ", "Instrucciones de carta", JOptionPane.INFORMATION_MESSAGE);
        jLabel44.setLocation(p1, p2);
    }//GEN-LAST:event_jLabel44MouseClicked

    private void jLabel45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MouseClicked
        JOptionPane.showMessageDialog(null, "Transplante.\n"
                + "Te permite intercambiar un órgano con otro jugador. \n "
                + "No importa si el color de estos órganos es diferente,"
                + " ni si están sanos, infectados o vacunados.", "Instrucciones de carta", JOptionPane.INFORMATION_MESSAGE);
        jLabel45.setLocation(p1, p2);
    }//GEN-LAST:event_jLabel45MouseClicked

    private void jLabel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseClicked
        JOptionPane.showMessageDialog(null, "Transplante.\n"
                + "Te permite intercambiar un órgano con otro jugador. \n "
                + "No importa si el color de estos órganos es diferente,"
                + " ni si están sanos, infectados o vacunados.", "Instrucciones de carta", JOptionPane.INFORMATION_MESSAGE);
        jLabel46.setLocation(p1, p2);
    }//GEN-LAST:event_jLabel46MouseClicked

    private void jLabel47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseClicked
        JOptionPane.showMessageDialog(null, "Ladron de organos.\n"
                + " Permite robar un órgano de otro jugador y añadirlo a su propio\n "
                + "cuerpo. Puedes robar órganos sanos, vacunados o infectados,\n "
                + "pero no inmunes. No se pueden tener dos órganos del mismo color. ", "Instrucciones de carta", JOptionPane.INFORMATION_MESSAGE);
        jLabel47.setLocation(p1, p2);
    }//GEN-LAST:event_jLabel47MouseClicked

    private void jLabel48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseClicked
        JOptionPane.showMessageDialog(null, "Ladron de organos.\n"
                + " Permite robar un órgano de otro jugador y añadirlo a su propio\n "
                + "cuerpo. Puedes robar órganos sanos, vacunados o infectados,\n "
                + "pero no inmunes. No se pueden tener dos órganos del mismo color. ", "Instrucciones de carta", JOptionPane.INFORMATION_MESSAGE);
        jLabel48.setLocation(p1, p2);
    }//GEN-LAST:event_jLabel48MouseClicked

    private void jLabel49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseClicked
        JOptionPane.showMessageDialog(null, "Ladron de organos.\n"
                + " Permite robar un órgano de otro jugador y añadirlo a su propio\n "
                + "cuerpo. Puedes robar órganos sanos, vacunados o infectados,\n "
                + "pero no inmunes. No se pueden tener dos órganos del mismo color. ", "Instrucciones de carta", JOptionPane.INFORMATION_MESSAGE);
        jLabel49.setLocation(p1, p2);
    }//GEN-LAST:event_jLabel49MouseClicked

    private void jLabel50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseClicked
        JOptionPane.showMessageDialog(null, "Guante de latex.\n"
                + "Permite que todos los jugadores, excepto el que utiliza el guante, descarten su mano.\n "
                + "Al comienzo de su siguiente turno, al no tener cartas, estos jugadores tan solo podrán robar\n "
                + "una nueva mano, perdiendo así un turno de juego. ", "Instrucciones de carta", JOptionPane.INFORMATION_MESSAGE);
        Retirar_manos();
        jLabel50.setLocation(p1, p2);
    }//GEN-LAST:event_jLabel50MouseClicked

    private void jLabel51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseClicked

    }//GEN-LAST:event_jLabel51MouseClicked

    private void jLabel52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseClicked

    }//GEN-LAST:event_jLabel52MouseClicked

    private void jLabel53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel53MouseClicked

    }//GEN-LAST:event_jLabel53MouseClicked

    private void jLabel54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseClicked

    }//GEN-LAST:event_jLabel54MouseClicked

    private void jLabel55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel55MouseClicked

    }//GEN-LAST:event_jLabel55MouseClicked

    private void jLabel56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel56MouseClicked

    }//GEN-LAST:event_jLabel56MouseClicked

    private void jLabel57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel57MouseClicked

    }//GEN-LAST:event_jLabel57MouseClicked

    private void jLabel58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel58MouseClicked

    }//GEN-LAST:event_jLabel58MouseClicked

    private void jLabel59MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel59MouseClicked

    }//GEN-LAST:event_jLabel59MouseClicked

    private void jLabel60MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel60MouseClicked

    }//GEN-LAST:event_jLabel60MouseClicked

    private void jLabel61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel61MouseClicked

    }//GEN-LAST:event_jLabel61MouseClicked

    private void jLabel62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel62MouseClicked

    }//GEN-LAST:event_jLabel62MouseClicked

    /**
     *
     * El boton2 hace un despliegue de las instrucciones de como jugar.
     *
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(null, "Instrucciones:\n"
                + "1- En el tablero tenemos 4 botones, iniciar, sacar carta, como jugar y sacar x descarte.\n"
                + "2- El botón iniciar, nos despliega una ventana en la cual debemos de indicar cuantos jugadores\n "
                + " van a jugar en la partida.\n"
                + "3- El botón sacar carta, este lo que hace es que saca una carta del mazo para el jugador que tiene \n"
                + " el turno. Nota: el turno se indica con un cuadrito verde a la par del nombre.\n"
                + "4- El botón sacar x descarte, este se usa cuando el jugador desea descartar cartas que no necesita \n"
                + " las mueve al basurero, solo se puede deshacer de 1, 2 o 3 como máximo. \n"
                + "5- Las cartas de tratamientos, si les dan click en ellas les mostrara su función y automáticamente\n"
                + " se irán al basurero, ya que contara como si hubiese sido usada.\n"
                + "6- Error médico, esta carta al darle click abre una ventana en la cual se digita el número de jugador\n"
                + " que va hacer el cambio de cartas y luego digita al jugador con el que va a cambiar sus cartas.\n"
                + "7- Guantes de látex, esta carta al darle click abre una ventana en la cual se digita el número\n"
                + " del jugador que tiene la carta, y retirará las cartas en mano de los demás jugadores excepto al\n"
                + " que posee la carta.\n"
                + "8- Ladrón de órganos, con esta el jugador que posee la carta podrá robar un órgano de cualquiera\n"
                + " de los demás jugadores, ya sea un órgano sano, vacunado o infectado, pero no inmunizado, después\n"
                + " de robar la carta que desea le da click a la carta para que se vaya al basurero, porque ya ha sido\n"
                + " utilizada.\n"
                + "9- Trasplante de órganos, con esta podrá cambiar una carta de órgano con otro jugador, después de\n"
                + " cambiar la carta que desea le da click a la carta para que se vaya al basurero, porque ya ha sido utilizada.\n"
                + "10- Contagio, con esta carta se puede pasar los virus que tengan los órganos de un jugador a otro,\n"
                + " el que posea la carta decide a que jugar le pasa sus virus, después de pasar los virus le da click\n"
                + " a la carta para que se vaya al basurero, porque ya ha sido utilizada.", "INSTRUCCIONES DE  JUEGO.", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        JOptionPane.showMessageDialog(null, "eje X" + jLabel3.getX() + "\neje Y" + jLabel3.getY(), "INSTRUCCIONES", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseDragged
        jLabel4.setLocation(jLabel4.getLocation().x + evt.getX() - jLabel4.getWidth() / 2, jLabel4.getLocation().y + evt.getY() - jLabel4.getHeight() / 2);
    }//GEN-LAST:event_jLabel4MouseDragged

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked

    }//GEN-LAST:event_jLabel32MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked

    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        JOptionPane.showMessageDialog(null, "Organo multicolor.\n"
                + "Actúa como comodín para ayudar a completar un cuerpo y\n"
                + "cuenta como órgano a todos sus efectos. ", "Instrucciones de carta", JOptionPane.INFORMATION_MESSAGE);
        //jLabel23.setLocation(p1, p2);
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel67MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel67MouseClicked
        JOptionPane.showMessageDialog(null, "Virus multicolor.\n"
                + "Puedes infectar un órgano o destruir una medicina de cualquier color.", "Instrucciones de carta", JOptionPane.INFORMATION_MESSAGE);
        //jLabel67.setLocation(p1, p2);
    }//GEN-LAST:event_jLabel67MouseClicked

    private void jLabel68MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel68MouseClicked
        JOptionPane.showMessageDialog(null, "Medicina multicolor.\n"
                + "Puedes curar virus o vacunar órganos de cualquier color.", "Instrucciones de carta", JOptionPane.INFORMATION_MESSAGE);
        //jLabel68.setLocation(p1, p2);
    }//GEN-LAST:event_jLabel68MouseClicked

    private void jLabel69MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel69MouseClicked
        JOptionPane.showMessageDialog(null, "Medicina multicolor.\n"
                + "Puedes curar virus o vacunar órganos de cualquier color.", "Instrucciones de carta", JOptionPane.INFORMATION_MESSAGE);
        //jLabel69.setLocation(p1, p2);
    }//GEN-LAST:event_jLabel69MouseClicked

    private void jLabel70MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseClicked
        JOptionPane.showMessageDialog(null, "Medicina multicolor.\n"
                + "Puedes curar virus o vacunar órganos de cualquier color.", "Instrucciones de carta", JOptionPane.INFORMATION_MESSAGE);
        //jLabel70.setLocation(p1, p2);
    }//GEN-LAST:event_jLabel70MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        sacar_carta();
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     *
     * El método main es el encargado de la funcionabilidad de todo el programa
     * adquieriendo todos los datos requeridos por el administrador.
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Juego().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
