package Vista;

import Datos.JDBC;
import Modelo.Policia;
import java.awt.Color;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Rubén Soler;
 * 
 * Ventana Grafica que se abre al arrancar el programa, desde esta se puede seleccionar un policia y borrarlo.
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Genera la ventan principal.
     * La coloca en el medio.
     * Deshabilita los botones hasta recibir conexion.
     * Inicia los componentes.
     */
    public Principal() {
        this.setIconImage(i);
        this.setUndecorated(true);
        this.setLocation(400, 100);
        initComponents();
        this.gestionarMultas.setEnabled(false);
        this.gestionarPolicias.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * 
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuCerrar = new javax.swing.JPanel();
        minimizar = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();
        autores = new javax.swing.JLabel();
        panelMain = new javax.swing.JPanel();
        gestionarPolicias = new javax.swing.JButton();
        gestionarMultas = new javax.swing.JButton();
        panelDerecha = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        panelConexion = new java.awt.Panel();
        estadoConexion = new javax.swing.JLabel();
        BD = new javax.swing.JLabel();
        panelOrden = new javax.swing.JPanel();
        ordenarPor = new javax.swing.JLabel();
        listaPolicias = new javax.swing.JLabel();
        orden = new javax.swing.JComboBox<String>();
        panelTabla = new javax.swing.JScrollPane();
        tablaPolicias = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Comisaria Rubén & Christian");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        menuCerrar.setBackground(new java.awt.Color(255, 255, 255));
        menuCerrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                menuCerrarMouseDragged(evt);
            }
        });
        menuCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuCerrarMousePressed(evt);
            }
        });

        minimizar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        minimizar.setForeground(new java.awt.Color(153, 153, 153));
        minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/minimizar.png"))); // NOI18N
        minimizar.setToolTipText("Minimizar");
        minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizar.setFocusable(false);
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
        });

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/cerrar.png"))); // NOI18N
        cerrar.setToolTipText("Cerrar");
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.setFocusable(false);
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });

        autores.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        autores.setForeground(new java.awt.Color(0, 51, 255));
        autores.setText("Comisaria  Rubén & Christian");
        autores.setToolTipText("Autores");
        autores.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                autoresMouseDragged(evt);
            }
        });
        autores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                autoresMousePressed(evt);
            }
        });

        panelMain.setBackground(new java.awt.Color(255, 255, 255));

        gestionarPolicias.setBackground(new java.awt.Color(0, 102, 204));
        gestionarPolicias.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        gestionarPolicias.setForeground(new java.awt.Color(255, 255, 255));
        gestionarPolicias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/policia.png"))); // NOI18N
        gestionarPolicias.setText("Gestionar Policias");
        gestionarPolicias.setToolTipText("Abrir ventana de gestión de policias");
        gestionarPolicias.setBorder(null);
        gestionarPolicias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gestionarPolicias.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        gestionarPolicias.setMaximumSize(new java.awt.Dimension(90, 25));
        gestionarPolicias.setMinimumSize(new java.awt.Dimension(90, 25));
        gestionarPolicias.setSelected(true);
        gestionarPolicias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionarPoliciasActionPerformed(evt);
            }
        });

        gestionarMultas.setBackground(new java.awt.Color(0, 102, 204));
        gestionarMultas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        gestionarMultas.setForeground(new java.awt.Color(255, 255, 255));
        gestionarMultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/multa.png"))); // NOI18N
        gestionarMultas.setText("Gestionar Multas");
        gestionarMultas.setToolTipText("Abrir ventana de gestión de multas");
        gestionarMultas.setBorder(null);
        gestionarMultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gestionarMultas.setMaximumSize(new java.awt.Dimension(90, 25));
        gestionarMultas.setMinimumSize(new java.awt.Dimension(90, 25));
        gestionarMultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionarMultasActionPerformed(evt);
            }
        });

        panelDerecha.setBackground(new java.awt.Color(255, 255, 255));

        org.jdesktop.layout.GroupLayout panelDerechaLayout = new org.jdesktop.layout.GroupLayout(panelDerecha);
        panelDerecha.setLayout(panelDerechaLayout);
        panelDerechaLayout.setHorizontalGroup(
            panelDerechaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 0, Short.MAX_VALUE)
        );
        panelDerechaLayout.setVerticalGroup(
            panelDerechaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 273, Short.MAX_VALUE)
        );

        logo.setBackground(new java.awt.Color(255, 255, 255));
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/policia.jpg"))); // NOI18N
        logo.setText(" ");
        logo.setToolTipText("Cuerpo Nacional de Policia");
        logo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        org.jdesktop.layout.GroupLayout panelMainLayout = new org.jdesktop.layout.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .add(panelMainLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(gestionarMultas, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 343, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(gestionarPolicias, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 343, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(23, 23, 23)
                .add(panelDerecha, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(logo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 269, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, panelMainLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(panelMainLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(panelDerecha, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, panelMainLayout.createSequentialGroup()
                        .add(16, 16, 16)
                        .add(gestionarPolicias, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 90, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(26, 26, 26)
                        .add(gestionarMultas, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 90, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(298, 298, 298))
            .add(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .add(logo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .add(363, 363, 363))
        );

        panelConexion.setBackground(new java.awt.Color(255, 255, 255));

        estadoConexion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        estadoConexion.setForeground(new java.awt.Color(255, 0, 0));
        estadoConexion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estadoConexion.setText("Sin conexión");
        estadoConexion.setToolTipText("Estado de la base de datos");
        estadoConexion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        estadoConexion.setFocusable(false);

        BD.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BD.setText("BD:");

        org.jdesktop.layout.GroupLayout panelConexionLayout = new org.jdesktop.layout.GroupLayout(panelConexion);
        panelConexion.setLayout(panelConexionLayout);
        panelConexionLayout.setHorizontalGroup(
            panelConexionLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, panelConexionLayout.createSequentialGroup()
                .add(BD)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(estadoConexion)
                .addContainerGap())
        );
        panelConexionLayout.setVerticalGroup(
            panelConexionLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelConexionLayout.createSequentialGroup()
                .addContainerGap()
                .add(panelConexionLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(estadoConexion)
                    .add(BD))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelOrden.setBackground(new java.awt.Color(255, 255, 255));

        ordenarPor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ordenarPor.setForeground(new java.awt.Color(0, 51, 204));
        ordenarPor.setText("Ordenar por:");

        listaPolicias.setBackground(new java.awt.Color(255, 255, 255));
        listaPolicias.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        listaPolicias.setForeground(new java.awt.Color(0, 102, 204));
        listaPolicias.setText("POLICIAS");

        orden.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "idPolicia", "nombre", "numPlaca", "edad", "departamento" }));

        org.jdesktop.layout.GroupLayout panelOrdenLayout = new org.jdesktop.layout.GroupLayout(panelOrden);
        panelOrden.setLayout(panelOrdenLayout);
        panelOrdenLayout.setHorizontalGroup(
            panelOrdenLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelOrdenLayout.createSequentialGroup()
                .add(listaPolicias, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 239, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 140, Short.MAX_VALUE)
                .add(ordenarPor)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(orden, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 148, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        panelOrdenLayout.setVerticalGroup(
            panelOrdenLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelOrdenLayout.createSequentialGroup()
                .add(panelOrdenLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(listaPolicias, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(ordenarPor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(orden, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelTabla.setBackground(new java.awt.Color(255, 255, 255));

        tablaPolicias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "idPolicia", "nombre", "numPlaca", "edad", "departamento", "foto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        panelTabla.setViewportView(tablaPolicias);

        org.jdesktop.layout.GroupLayout menuCerrarLayout = new org.jdesktop.layout.GroupLayout(menuCerrar);
        menuCerrar.setLayout(menuCerrarLayout);
        menuCerrarLayout.setHorizontalGroup(
            menuCerrarLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(menuCerrarLayout.createSequentialGroup()
                .addContainerGap()
                .add(menuCerrarLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(menuCerrarLayout.createSequentialGroup()
                        .add(menuCerrarLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(panelMain, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 658, Short.MAX_VALUE)
                            .add(menuCerrarLayout.createSequentialGroup()
                                .add(12, 12, 12)
                                .add(menuCerrarLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(panelConexion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(menuCerrarLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                        .add(panelTabla)
                                        .add(panelOrden, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .add(0, 4, Short.MAX_VALUE)))
                        .addContainerGap())
                    .add(menuCerrarLayout.createSequentialGroup()
                        .add(minimizar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(autores, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(31, 31, 31)
                        .add(cerrar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
            .add(jSeparator1)
        );
        menuCerrarLayout.setVerticalGroup(
            menuCerrarLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(menuCerrarLayout.createSequentialGroup()
                .add(menuCerrarLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, cerrar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, autores, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(minimizar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(panelMain, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 235, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(panelOrden, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(panelTabla, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 169, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(panelConexion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(menuCerrar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(menuCerrar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gestionarPoliciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionarPoliciasActionPerformed
        PoliciasMantenimiento ventanaPolicias = new PoliciasMantenimiento(this, true);
        ventanaPolicias.setConexion(this.datos);
        ventanaPolicias.setVisible(true);

    }//GEN-LAST:event_gestionarPoliciasActionPerformed

    private void gestionarMultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionarMultasActionPerformed
        MultasListinPorPolicia ventanaMultas = new MultasListinPorPolicia(this, true);
        ventanaMultas.setConexion(this.datos);
        ventanaMultas.setVisible(true);
    }//GEN-LAST:event_gestionarMultasActionPerformed

    private void menuCerrarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCerrarMouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
    }//GEN-LAST:event_menuCerrarMouseDragged

    private void menuCerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCerrarMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_menuCerrarMousePressed

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrarMouseClicked
    /**
     * Minimizar
     * @param evt evento click para minimizar la ventana
     */
    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizarMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.datos = new JDBC();
        String[]filas=new String[6];
        String[]titulos={"IdPolicia","Nombre","NumPlaca","Edad","Departamento","Foto"};
        tabla = new DefaultTableModel(null,titulos);
        try {
            this.datos.nuevaConexion();
            this.gestionarMultas.setEnabled(true);
            this.gestionarPolicias.setEnabled(true);
            this.estadoConexion.setText("Conectada");
            this.estadoConexion.setForeground(Color.green);
            for(Policia p: this.datos.obtenerPolicias()){
              filas[0] = p.getIdPolicia().toString();
              filas[1] = p.getNombre();
              filas[2] = p.getNumPlaca();
              filas[3] = p.getEdad().toString();
              filas[4] = p.getDepartamento();
              //filas[5] = p.getFoto().toString();
             this.tabla.addRow(filas);
            }
            this.tablaPolicias.setModel(tabla);
       
        } catch (SQLException ex) {
            this.gestionarMultas.setToolTipText("Sin conexión");
            this.gestionarPolicias.setToolTipText("Sin conexión");
            this.estadoConexion.setToolTipText("Comprueba tu conexión a la BD");
            JOptionPane.showMessageDialog(null,ex.getErrorCode()+ex.getMessage()+ex.getSQLState()+ "Ha habido un problema al intentar conectar con la base de datos, comprueba la conexión", "Error conectando a la base de datos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_formWindowOpened

    private void autoresMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_autoresMouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
    }//GEN-LAST:event_autoresMouseDragged

    private void autoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_autoresMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_autoresMousePressed

    private DefaultTableModel tabla;
    private JDBC datos;
    private final Image i = Toolkit.getDefaultToolkit().getImage(getClass().getResource("icono.png"));
    private int x = 0;
    private int y = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BD;
    private javax.swing.JLabel autores;
    private javax.swing.JLabel cerrar;
    private javax.swing.JLabel estadoConexion;
    private javax.swing.JButton gestionarMultas;
    private javax.swing.JButton gestionarPolicias;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel listaPolicias;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel menuCerrar;
    private javax.swing.JLabel minimizar;
    private javax.swing.JComboBox<String> orden;
    private javax.swing.JLabel ordenarPor;
    private java.awt.Panel panelConexion;
    private javax.swing.JPanel panelDerecha;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelOrden;
    private javax.swing.JScrollPane panelTabla;
    private javax.swing.JTable tablaPolicias;
    // End of variables declaration//GEN-END:variables
}
