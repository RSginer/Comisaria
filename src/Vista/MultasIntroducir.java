/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Datos.JDBC;
import Modelo.Multa;
import Modelo.TipoMulta;
import java.awt.Component;
import java.awt.MouseInfo;
import java.awt.Point;
import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author daw1
 */
public class MultasIntroducir extends javax.swing.JDialog {

    /**
     * Creates new form MultasIntroducir
     */
    public MultasIntroducir(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setLocation(400, 100);
        this.setUndecorated(true);
        initComponents();
        
        
    }

    /**
     * @param datos 
     */
    public void setConexion(JDBC datos) {
        this.datos=datos;
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
        panelMain = new javax.swing.JPanel();
        cabecera = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelId = new javax.swing.JLabel();
        textoNifInfractor = new javax.swing.JTextField();
        lIdPolicia = new javax.swing.JLabel();
        textIdPolicia = new javax.swing.JTextField();
        lFecha = new javax.swing.JLabel();
        textoImporte = new javax.swing.JTextField();
        lTipo = new javax.swing.JLabel();
        comboTipoMulta = new javax.swing.JComboBox();
        lDescripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaDescripcion = new javax.swing.JTextArea();
        lNifInfractor = new javax.swing.JLabel();
        botonInsertar = new javax.swing.JButton();
        labelNumeroId = new javax.swing.JLabel();
        lImporte = new javax.swing.JLabel();
        calendario = new com.toedter.calendar.JCalendar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        menuCerrar.setBackground(new java.awt.Color(255, 255, 255));
        menuCerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        panelMain.setBackground(new java.awt.Color(255, 255, 255));

        cabecera.setBackground(new java.awt.Color(255, 255, 255));
        cabecera.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        cabecera.setForeground(new java.awt.Color(0, 102, 204));
        cabecera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/multa.png"))); // NOI18N
        cabecera.setText("NUEVA MULTA");

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.png"))); // NOI18N
        cerrar.setToolTipText("Cerrar");
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.setFocusable(false);
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });

        labelId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelId.setForeground(new java.awt.Color(0, 102, 204));
        labelId.setText("Id Multa");

        textoNifInfractor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textoNifInfractor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        textoNifInfractor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNifInfractorActionPerformed(evt);
            }
        });

        lIdPolicia.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lIdPolicia.setForeground(new java.awt.Color(0, 102, 204));
        lIdPolicia.setText("IdPolicia ");

        textIdPolicia.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textIdPolicia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lFecha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lFecha.setForeground(new java.awt.Color(0, 102, 204));
        lFecha.setText("fecha");

        textoImporte.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textoImporte.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lTipo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lTipo.setForeground(new java.awt.Color(0, 102, 204));
        lTipo.setText("Tipo Multa");

        comboTipoMulta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        comboTipoMulta.setForeground(new java.awt.Color(0, 102, 204));
        comboTipoMulta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboTipoMultaItemStateChanged(evt);
            }
        });
        comboTipoMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoMultaActionPerformed(evt);
            }
        });

        lDescripcion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lDescripcion.setForeground(new java.awt.Color(0, 102, 204));
        lDescripcion.setText("Descripcion");

        areaDescripcion.setColumns(20);
        areaDescripcion.setRows(5);
        jScrollPane1.setViewportView(areaDescripcion);

        lNifInfractor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lNifInfractor.setForeground(new java.awt.Color(0, 102, 204));
        lNifInfractor.setText("Nif Infractor");

        botonInsertar.setBackground(new java.awt.Color(0, 102, 204));
        botonInsertar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonInsertar.setForeground(new java.awt.Color(255, 255, 255));
        botonInsertar.setText("INSERTAR");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        labelNumeroId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNumeroId.setText("---");

        lImporte.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lImporte.setForeground(new java.awt.Color(0, 102, 204));
        lImporte.setText("Importe");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelId, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labelNumeroId, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(comboTipoMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lIdPolicia, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textIdPolicia))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lNifInfractor, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textoNifInfractor, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(194, 194, 194))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonInsertar)
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNumeroId, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoNifInfractor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lNifInfractor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textIdPolicia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lIdPolicia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboTipoMulta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(botonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cabecera, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(cerrar))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cabecera)
                    .addComponent(cerrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout menuCerrarLayout = new javax.swing.GroupLayout(menuCerrar);
        menuCerrar.setLayout(menuCerrarLayout);
        menuCerrarLayout.setHorizontalGroup(
            menuCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuCerrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        menuCerrarLayout.setVerticalGroup(
            menuCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuCerrarLayout.createSequentialGroup()
                .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(menuCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_cerrarMouseClicked

    private void menuCerrarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCerrarMouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
    }//GEN-LAST:event_menuCerrarMouseDragged

    private void menuCerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCerrarMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_menuCerrarMousePressed

    private void comboTipoMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoMultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoMultaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        TipoMulta tm=new TipoMulta();        
        try {         
            for( TipoMulta m :this.datos.obtenerTiposMulta()){
                this.comboTipoMulta.addItem(m);
                tm=this.datos.obtenerTiposMulta().get(0);
            }
            this.textoImporte.setText(tm.getImporte().toString());
            
        } catch (SQLException ex) {
            Logger.getLogger(MultasIntroducir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void textoNifInfractorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNifInfractorActionPerformed
        
        
    }//GEN-LAST:event_textoNifInfractorActionPerformed

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
       Multa m= new Multa() ;
       TipoMulta tm = (TipoMulta)this.comboTipoMulta.getSelectedItem();
       if(!this.textIdPolicia.getText().isEmpty() && !this.areaDescripcion.getText().isEmpty()){
         Date fecha= this.calendario.getDate();
         m.setDescripcion(this.areaDescripcion.getText());
         m.setFecha(new Timestamp(fecha.getTime()).toLocalDateTime());
         m.setIdPolicia(Integer.valueOf(this.textIdPolicia.getText()));
         m.setImporte(Double.valueOf(this.textoImporte.getText()));
         m.setNifInfractor(this.textoNifInfractor.getText());
         m.setIdTipo(tm.getId());
         
           try {
               int rows = this.datos.insertarMultas(m);
                    if (rows > 0) {
                        JOptionPane.showMessageDialog(null, "Multa insertado", "Multa " + this.datos.getMaxIdPolicia() + " insertado", JOptionPane.INFORMATION_MESSAGE);
                    }
           } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Multa NO  insertado"+ex.getMessage() ,"Multa No insertado", JOptionPane.INFORMATION_MESSAGE);
           }
         
         
       }else if(this.textIdPolicia.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Campo Idpolicia vacio","Campo Vacio" ,JOptionPane.INFORMATION_MESSAGE);
       } else {
            JOptionPane.showMessageDialog(null, "Campo Descripcion vacio","Campo Vacio" ,JOptionPane.INFORMATION_MESSAGE);

       }
           
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void comboTipoMultaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboTipoMultaItemStateChanged
       TipoMulta tm;
       tm=(TipoMulta)this.comboTipoMulta.getSelectedItem();
       this.textoImporte.setText(tm.getImporte().toString());
    }//GEN-LAST:event_comboTipoMultaItemStateChanged

    private JDBC datos;
    private int x;
    private int y;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaDescripcion;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JLabel cabecera;
    private com.toedter.calendar.JCalendar calendario;
    private javax.swing.JLabel cerrar;
    private javax.swing.JComboBox comboTipoMulta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lDescripcion;
    private javax.swing.JLabel lFecha;
    private javax.swing.JLabel lIdPolicia;
    private javax.swing.JLabel lImporte;
    private javax.swing.JLabel lNifInfractor;
    private javax.swing.JLabel lTipo;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelNumeroId;
    private javax.swing.JPanel menuCerrar;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTextField textIdPolicia;
    private javax.swing.JTextField textoImporte;
    private javax.swing.JTextField textoNifInfractor;
    // End of variables declaration//GEN-END:variables
}
