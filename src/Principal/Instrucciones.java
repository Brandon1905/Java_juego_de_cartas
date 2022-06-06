package Principal;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * La clase Instrucciones es la que muetra las instruuciones y todas las cartas
 * que contiene el juego.
 *
 * @author Brandon
 * @author Axel
 */
public final class Instrucciones extends javax.swing.JFrame {

    /**
     * El método Instrucciones es el encargado de desplegar la ventana de las intrucciones.
     * 
     */
    public Instrucciones() {
        this.setResizable(false);//no me deja modificarle el tamaño con el cuadro
        initComponents();
        setSize(new java.awt.Dimension(1000, 650));
        imagenes();
        this.setLocationRelativeTo(null);//me centra la pestaña
    }

      /**
     * 
     * El método imagenes es el encargado de mostrar las imagenes de las cartas.
     * 
     */
    void imagenes() {
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/Organos/1.png"));
        ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
        jLabel1.setIcon(icono1);

        ImageIcon imagen2 = new ImageIcon(getClass().getResource("/Organos/2.png"));
        ImageIcon icono2 = new ImageIcon(imagen2.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_DEFAULT));
        jLabel2.setIcon(icono2);

        ImageIcon imagen3 = new ImageIcon(getClass().getResource("/Organos/3.png"));
        ImageIcon icono3 = new ImageIcon(imagen3.getImage().getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_DEFAULT));
        jLabel3.setIcon(icono3);

        ImageIcon imagen4 = new ImageIcon(getClass().getResource("/Organos/4.png"));
        ImageIcon icono4 = new ImageIcon(imagen4.getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT));
        jLabel4.setIcon(icono4);

        ImageIcon imagen5 = new ImageIcon(getClass().getResource("/Organos/5.png"));
        ImageIcon icono5 = new ImageIcon(imagen5.getImage().getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_DEFAULT));
        jLabel5.setIcon(icono5);

        ImageIcon imagen6 = new ImageIcon(getClass().getResource("/Medicinas/11.png"));
        ImageIcon icono6 = new ImageIcon(imagen6.getImage().getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_DEFAULT));
        jLabel6.setIcon(icono6);

        ImageIcon imagen7 = new ImageIcon(getClass().getResource("/Medicinas/12.png"));
        ImageIcon icono7 = new ImageIcon(imagen7.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_DEFAULT));
        jLabel7.setIcon(icono7);

        ImageIcon imagen8 = new ImageIcon(getClass().getResource("/Medicinas/13.png"));
        ImageIcon icono8 = new ImageIcon(imagen8.getImage().getScaledInstance(jLabel8.getWidth(), jLabel8.getHeight(), Image.SCALE_DEFAULT));
        jLabel8.setIcon(icono8);

        ImageIcon imagen9 = new ImageIcon(getClass().getResource("/Medicinas/14.png"));
        ImageIcon icono9 = new ImageIcon(imagen9.getImage().getScaledInstance(jLabel9.getWidth(), jLabel9.getHeight(), Image.SCALE_DEFAULT));
        jLabel9.setIcon(icono9);

        ImageIcon imagen10 = new ImageIcon(getClass().getResource("/Medicinas/15.png"));
        ImageIcon icono10 = new ImageIcon(imagen10.getImage().getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(), Image.SCALE_DEFAULT));
        jLabel10.setIcon(icono10);

        ImageIcon imagen11 = new ImageIcon(getClass().getResource("/Tratamientos/6.png"));
        ImageIcon icono11 = new ImageIcon(imagen11.getImage().getScaledInstance(jLabel11.getWidth(), jLabel11.getHeight(), Image.SCALE_DEFAULT));
        jLabel11.setIcon(icono11);

        ImageIcon imagen12 = new ImageIcon(getClass().getResource("/Tratamientos/7.png"));
        ImageIcon icono12 = new ImageIcon(imagen12.getImage().getScaledInstance(jLabel12.getWidth(), jLabel12.getHeight(), Image.SCALE_DEFAULT));
        jLabel12.setIcon(icono12);

        ImageIcon imagen13 = new ImageIcon(getClass().getResource("/Tratamientos/8.png"));
        ImageIcon icono13 = new ImageIcon(imagen13.getImage().getScaledInstance(jLabel13.getWidth(), jLabel13.getHeight(), Image.SCALE_DEFAULT));
        jLabel13.setIcon(icono13);

        ImageIcon imagen14 = new ImageIcon(getClass().getResource("/Tratamientos/9.png"));
        ImageIcon icono14 = new ImageIcon(imagen14.getImage().getScaledInstance(jLabel14.getWidth(), jLabel14.getHeight(), Image.SCALE_DEFAULT));
        jLabel14.setIcon(icono14);

        ImageIcon imagen15 = new ImageIcon(getClass().getResource("/Tratamientos/10.png"));
        ImageIcon icono15 = new ImageIcon(imagen15.getImage().getScaledInstance(jLabel15.getWidth(), jLabel15.getHeight(), Image.SCALE_DEFAULT));
        jLabel15.setIcon(icono15);

        ImageIcon imagen16 = new ImageIcon(getClass().getResource("/virus/16.png"));
        ImageIcon icono16 = new ImageIcon(imagen16.getImage().getScaledInstance(jLabel16.getWidth(), jLabel16.getHeight(), Image.SCALE_DEFAULT));
        jLabel16.setIcon(icono16);

        ImageIcon imagen17 = new ImageIcon(getClass().getResource("/virus/17.png"));
        ImageIcon icono17 = new ImageIcon(imagen17.getImage().getScaledInstance(jLabel17.getWidth(), jLabel17.getHeight(), Image.SCALE_DEFAULT));
        jLabel17.setIcon(icono17);

        ImageIcon imagen18 = new ImageIcon(getClass().getResource("/virus/18.png"));
        ImageIcon icono18 = new ImageIcon(imagen18.getImage().getScaledInstance(jLabel18.getWidth(), jLabel18.getHeight(), Image.SCALE_DEFAULT));
        jLabel18.setIcon(icono18);

        ImageIcon imagen19 = new ImageIcon(getClass().getResource("/virus/19.png"));
        ImageIcon icono19 = new ImageIcon(imagen19.getImage().getScaledInstance(jLabel19.getWidth(), jLabel19.getHeight(), Image.SCALE_DEFAULT));
        jLabel19.setIcon(icono19);

        ImageIcon imagen20 = new ImageIcon(getClass().getResource("/virus/20.png"));
        ImageIcon icono20 = new ImageIcon(imagen20.getImage().getScaledInstance(jLabel20.getWidth(), jLabel20.getHeight(), Image.SCALE_DEFAULT));
        jLabel20.setIcon(icono20);

        ImageIcon imagen = new ImageIcon(getClass().getResource("/Principal/fondo_instrucciones.jpg"));
        ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel37.getWidth(), jLabel37.getHeight(), Image.SCALE_DEFAULT));
        jLabel37.setIcon(icono);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        instrucciones = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("MODO DE JUEGO \nAntes de comenzar \n1. Se baraja el mazo de cartas y se reparten 3 cartas a\n cada jugador. Hasta un máximo de 6 jugadores. \n\n2. Se coloca el mazo restante boca abajo para que todos los\njugadores puedan coger cartas para jugar.\n\n3. A la par del mazo se colocará la pila de descarte \n(cartas que ya se hayan jugado). \n\n4. Cuando el mazo se haya agotado, se tomará las cartas \nde la pila de descarte, se barajará y ahora formará el\nnuevo mazo. \n\nDESARROLLO DEL JUEGO \n\n1. Cada jugador debe tener siempre al comienzo de su turno \n3 cartas en mano y tan sólo podrá realizar una acción por \nturno.\n\n2. Cada jugador podrá usar una de las 3 cartas que tenga \nen su mano. \n\n3. Después de haber realizado alguna acción, tomará cartas \ndel mazo para volver a tener su mano completa. \n4. En cada turno del jugador se juega cualquiera de los \ndistintos tipos de carta que tenga en su mano, colocándose \nsobre la mesa, si: \n4.1. Es un Órgano, la carta se colocada enfrente del \njugador hasta completar 4 órganos, pero no se puede tener\n en su cuerpo dos órganos iguales en ningún momento. Nota: \nUn cuerpo podrá tener cinco órganos distintos si uno de \nellos es el multicolor (comodín), y se puede ganar la \npartida si cuatro de ellos están sanos. \n4.2. Es una Medicina, la carta se coloca enfrente del jugador\nsobre un órgano, aquí ocurren 3 situaciones: \n4.2.1. Curar → si sobre el órgano hay una carta de virus del \nmismo color a la medicina, entonces el virus se destruye y \nambas cartas se envían a la pila de descarte.\n4.2.2. Vacunar → si el órgano del mismo color a la medicina \nno posee ningún virus sobre él, el órgano se protege, ahora \nlos demás jugadores requerirán 2 virus para poder infectar el \nórgano. \n4.2.3. Inmunizar → si ya el órgano cuenta con una medicina, \nesta segunda medicina logrará proteger para siempre contra \nel ataque de cualquier virus y no podrá ser destruido ni \nafectado por cartas de tratamiento. Cuando el órgano se \ninmuniza las cartas de medicina se giran 90 grados sobre el \nórgano para indicar que está inmune. \n4.3. Es un Virus, la carta se coloca sobre los cuerpos de \nlos demás jugadores, se dan 3 situaciones: \n4.3.1. Infectar → si se encuentra un órgano libre de virus \ny que corresponde con el color de la carta de virus a utilizar\n, este órgano se infectará. \n4.3.2. Extirpar → si un segundo virus es colocado sobre un \nórgano ya infectado, este órgano será destruido y las tres \ncartas (el órgano y los 2 virus) serán enviadas a la pila de \ndescarte. \n4.3.3.  Destruir vacuna → si sobre un órgano se encuentra \nuna carta de medicina y se le aplica un virus del mismo color, \nambas cartas (la medicina y el virus) serán enviadas a la \npila de descarte. \n4.4. Es un Tratamiento, la carta utilizada podrá desempeñar \nuna acción de ataque hacia los demás jugadores, esta carta \npodrá desempeñar cualquiera de las siguientes funciones:\n4.4.1. Trasplante: Permite intercambiar un órgano por otro \nentre 2 jugadores cualesquiera. No importa si el color de \nestos órganos es diferente, ni si están sanos, infectados o \nvacunados. Sencillamente el jugador cambia el órgano escogido \npor otro, siempre y cuando ninguno de los dos jugadores \ntenga dos órganos del mismo color ni éstos estén inmunizados. \n4.4.2. Ladrón de órganos: Permite robar un órgano de otro \njugador y añadirlo a su propio cuerpo. Se puede robar órganos \nsanos, vacunados o infectados, pero no inmunes. No se pueden \ntener dos órganos del mismo color. \n4.4.3. Contagio: Permite trasladar tantos virus como se pueda\nde sus órganos infectados a los órganos de los demás jugadores.\nNo se puede utilizar el contagio sobre órganos vacunados o \ninfectados, sólo se podrá contagiar órganos libres. \n4.4.4. Guante de látex: Permite que todos los jugadores, \nexcepto el que utiliza el guante, descarten su mano. Al \ncomienzo de su siguiente turno, al no tener cartas, estos \njugadores tan solo podrán robar una nueva mano, perdiendo \nasí un turno de juego. \n4.4.5. Error médico: Permite intercambiar todo su cuerpo \npor el de otro jugador, incluyendo órganos, virus y vacunas. \nNo importa el número de cartas que cada uno tenga en mesa. \nCuando se utiliza esta carta, los órganos inmunizados también\n son intercambiados. \n5. Si el jugador en turno no puede realizar ninguna de las \nacciones anteriores o simplemente desea descartar algunas o \ntodas las cartas de su mano, entonces descartará en la pila \nde descarte tantas cartas desee (1, 2 o las 3 cartas), luego \ndeberá sustituirlas por la misma cantidad de cartas tomadas \ndel mazo y finalmente pasar de turno. \n\nFINALIZACIÓN DEL JUEGO\n 1. El primer jugador que tenga delante de él, en su cuerpo \n4 órganos sanos será automáticamente el ganador.\n");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(460, 50, 540, 530);

        instrucciones.setBackground(new java.awt.Color(0, 0, 255));
        instrucciones.setText("             INTRUCCIONES ");
        instrucciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(instrucciones);
        instrucciones.setBounds(640, 20, 150, 25);

        jLabel1.setText("jLabel1");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 80, 80, 80);

        jLabel2.setText("jLabel2");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 80, 80, 80);

        jLabel3.setText("jLabel3");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 80, 80, 80);

        jLabel4.setText("jLabel4");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(280, 80, 80, 80);

        jLabel5.setText("jLabel5");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(370, 80, 80, 80);

        jLabel6.setText("jLabel6");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 200, 80, 80);

        jLabel7.setText("jLabel7");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(100, 200, 80, 80);

        jLabel8.setText("jLabel8");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(190, 200, 80, 80);

        jLabel9.setText("jLabel9");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel9);
        jLabel9.setBounds(280, 200, 80, 80);

        jLabel10.setText("jLabel10");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel10);
        jLabel10.setBounds(370, 200, 80, 80);

        jLabel11.setText("jLabel11");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 320, 80, 80);

        jLabel12.setText("jLabel12");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel12);
        jLabel12.setBounds(100, 320, 80, 80);

        jLabel13.setText("jLabel13");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel13);
        jLabel13.setBounds(190, 320, 80, 80);

        jLabel14.setText("jLabel14");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel14);
        jLabel14.setBounds(280, 320, 80, 80);

        jLabel15.setText("jLabel15");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel15);
        jLabel15.setBounds(370, 320, 80, 80);

        jLabel16.setText("jLabel16");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel16);
        jLabel16.setBounds(10, 440, 80, 80);

        jLabel17.setText("jLabel17");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel17);
        jLabel17.setBounds(100, 440, 80, 80);

        jLabel18.setText("jLabel18");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel18);
        jLabel18.setBounds(190, 440, 80, 80);

        jLabel19.setText("jLabel19");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel19);
        jLabel19.setBounds(280, 440, 80, 80);

        jLabel20.setText("jLabel20");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel20);
        jLabel20.setBounds(370, 440, 80, 80);

        jLabel21.setText("       CARTAS");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(170, 30, 80, 14);

        jLabel22.setText("ÓRGANOS:");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(10, 60, 90, 14);

        jLabel23.setText("TRATAMIENTOS:");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(10, 300, 90, 14);

        jLabel24.setText("Guante ");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(380, 400, 50, 20);

        jLabel25.setText("MEDICINAS:");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(10, 180, 120, 14);

        jLabel26.setText("VIRUS:");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(10, 420, 80, 20);

        jLabel27.setText("  Error médico");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(10, 400, 80, 20);

        jLabel28.setText("  Contagio");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(110, 400, 80, 20);

        jLabel29.setText("látex");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(400, 410, 30, 20);

        jLabel30.setText("Ladrón");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(290, 400, 50, 20);

        jLabel31.setText(" Trasplante");
        getContentPane().add(jLabel31);
        jLabel31.setBounds(190, 400, 70, 20);

        jLabel32.setText("de");
        getContentPane().add(jLabel32);
        jLabel32.setBounds(330, 400, 20, 20);

        jLabel33.setText("de");
        getContentPane().add(jLabel33);
        jLabel33.setBounds(430, 400, 20, 20);

        jLabel34.setText("órganos");
        getContentPane().add(jLabel34);
        jLabel34.setBounds(210, 410, 50, 20);

        jLabel35.setText("de");
        getContentPane().add(jLabel35);
        jLabel35.setBounds(260, 400, 20, 20);

        jLabel36.setText("órganos");
        getContentPane().add(jLabel36);
        jLabel36.setBounds(300, 410, 50, 20);

        jLabel37.setText("Label37");
        getContentPane().add(jLabel37);
        jLabel37.setBounds(0, 0, 1000, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

      /**
     * 
     * El método main es el encargado de la funcionabilidad de todo el programa
     * adquieriendo todos los datos requeridos por el administrador
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
            java.util.logging.Logger.getLogger(Instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Instrucciones().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel instrucciones;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
