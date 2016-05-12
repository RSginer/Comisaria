/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.MouseInfo;
import java.awt.Point;

/**
 *
 * @author daw1
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        this.setUndecorated(true);
        this.setLocation(500, 500);
        initComponents();
        
//        if (this.estadoConexion.getText().equalsIgnoreCase("sin conexión")) {
//            this.gestionarMultas.setEnabled(false);
//            this.gestionarPolicias.setEnabled(false);
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

        menuCerrar = new javax.swing.JPanel();
        minimizar = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();
        panelMain = new javax.swing.JPanel();
        gestionarPolicias = new javax.swing.JButton();
        gestionarMultas = new javax.swing.JButton();
        panelDerecha = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelConexion = new java.awt.Panel();
        estadoConexion = new javax.swing.JLabel();
        BD = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

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

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/policia-logo.png"))); // NOI18N
        jLabel1.setText(" ");
        jLabel1.setToolTipText("Cuerpo Nacional de Policia");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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

        javax.swing.GroupLayout panelConexionLayout = new javax.swing.GroupLayout(panelConexion);
        panelConexion.setLayout(panelConexionLayout);
        panelConexionLayout.setHorizontalGroup(
            panelConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConexionLayout.createSequentialGroup()
                .addComponent(BD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(estadoConexion)
                .addContainerGap())
        );
        panelConexionLayout.setVerticalGroup(
            panelConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConexionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estadoConexion)
                    .addComponent(BD))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelDerechaLayout = new javax.swing.GroupLayout(panelDerecha);
        panelDerecha.setLayout(panelDerechaLayout);
        panelDerechaLayout.setHorizontalGroup(
            panelDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDerechaLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(panelDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelConexion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );
        panelDerechaLayout.setVerticalGroup(
            panelDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDerechaLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelConexion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gestionarMultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(gestionarPolicias, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(gestionarPolicias, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(gestionarMultas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout menuCerrarLayout = new javax.swing.GroupLayout(menuCerrar);
        menuCerrar.setLayout(menuCerrarLayout);
        menuCerrarLayout.setHorizontalGroup(
            menuCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuCerrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuCerrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cerrar)
                .addContainerGap())
        );
        menuCerrarLayout.setVerticalGroup(
            menuCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuCerrarLayout.createSequentialGroup()
                .addGroup(menuCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(minimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gestionarPoliciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionarPoliciasActionPerformed
        PoliciasMantenimiento ventanaPolicias = new PoliciasMantenimiento(this,true);
        ventanaPolicias.setVisible(true);
    }//GEN-LAST:event_gestionarPoliciasActionPerformed

    private void gestionarMultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionarMultasActionPerformed
         MultasListado ventanaMultas = new MultasListado(this,true);
        ventanaMultas.setVisible(true);
    }//GEN-LAST:event_gestionarMultasActionPerformed

    private void menuCerrarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCerrarMouseDragged
        
 Point point = MouseInfo.getPointerInfo().getLocation()   ; 
    setLocation(point.x - x, point.y - y)   ; 
    }//GEN-LAST:event_menuCerrarMouseDragged

    private void menuCerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCerrarMousePressed
            this.x = evt.getX  ()  ; 
        this.y = evt.getY ()  ; 
    }//GEN-LAST:event_menuCerrarMousePressed

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
       System.exit(0);
    }//GEN-LAST:event_cerrarMouseClicked

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
        this.setExtendedState(ICONIFIED); 
    }//GEN-LAST:event_minimizarMouseClicked

    /**
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }
int x=0;
int y=0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BD;
    private javax.swing.JLabel cerrar;
    private javax.swing.JLabel estadoConexion;
    private javax.swing.JButton gestionarMultas;
    private javax.swing.JButton gestionarPolicias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel menuCerrar;
    private javax.swing.JLabel minimizar;
    private java.awt.Panel panelConexion;
    private javax.swing.JPanel panelDerecha;
    private javax.swing.JPanel panelMain;
    // End of variables declaration//GEN-END:variables
}
