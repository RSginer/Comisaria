/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Datos.JDBC;
import Datos.ManejadorDeImagenes;
import Datos.SelectorDeArchivo;
import Modelo.Multa;
import Modelo.Policia;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author daw1
 */
public class PoliciasMantenimiento extends javax.swing.JDialog {

    /**
     * Ventana de gestion de policias
     * @param parent
     * @param modal
     */
    public PoliciasMantenimiento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setUndecorated(true);
        this.setLocation(400, 100);
        initComponents();
    }

    /**
     * @param datos
     */
    public void setConexion(JDBC datos) {
        this.datos = datos;
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
        cerrar = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        panelPestañas = new javax.swing.JTabbedPane();
        panelPerfil = new javax.swing.JPanel();
        NumeroPlacaL = new javax.swing.JLabel();
        textoNumeroPlaca = new javax.swing.JTextField();
        NombreL = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        textoEdad = new javax.swing.JTextField();
        edadL = new javax.swing.JLabel();
        departamentoL = new javax.swing.JLabel();
        textoDepartamento = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        ImagenL = new javax.swing.JLabel();
        labelIdPolicia = new javax.swing.JLabel();
        idPoliciaL = new javax.swing.JLabel();
        botonImagen = new javax.swing.JButton();
        botonInsert = new javax.swing.JButton();
        rutaArchivo = new javax.swing.JLabel();
        panelpestañamultas = new javax.swing.JPanel();
        panelTablaMulta = new javax.swing.JScrollPane();
        tablaMultas = new javax.swing.JTable();
        ordenL = new javax.swing.JLabel();
        orden = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.png"))); // NOI18N
        cerrar.setToolTipText("Cerrar");
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.setFocusable(false);
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });

        titulo.setBackground(new java.awt.Color(255, 255, 255));
        titulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 102, 204));
        titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/policia.png"))); // NOI18N
        titulo.setText("Gestión policia");

        panelPestañas.setBackground(new java.awt.Color(255, 255, 255));
        panelPestañas.setForeground(new java.awt.Color(0, 51, 204));
        panelPestañas.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N

        panelPerfil.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        NumeroPlacaL.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NumeroPlacaL.setForeground(new java.awt.Color(0, 102, 204));
        NumeroPlacaL.setText("Nº Placa");

        textoNumeroPlaca.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textoNumeroPlaca.setForeground(new java.awt.Color(0, 0, 0));
        textoNumeroPlaca.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        textoNumeroPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNumeroPlacaActionPerformed(evt);
            }
        });

        NombreL.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NombreL.setForeground(new java.awt.Color(0, 102, 204));
        NombreL.setText("Nombre");

        textNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textNombre.setForeground(new java.awt.Color(0, 0, 0));
        textNombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        textoEdad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textoEdad.setForeground(new java.awt.Color(0, 0, 0));
        textoEdad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        textoEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoEdadActionPerformed(evt);
            }
        });

        edadL.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        edadL.setForeground(new java.awt.Color(0, 102, 204));
        edadL.setText("Edad");

        departamentoL.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        departamentoL.setForeground(new java.awt.Color(0, 102, 204));
        departamentoL.setText("Departamento");

        textoDepartamento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textoDepartamento.setForeground(new java.awt.Color(0, 0, 0));
        textoDepartamento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        ImagenL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoanonimo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(ImagenL)
                .addGap(0, 35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImagenL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        );

        labelIdPolicia.setBackground(new java.awt.Color(0, 102, 204));
        labelIdPolicia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelIdPolicia.setForeground(new java.awt.Color(0, 102, 204));
        labelIdPolicia.setText("idPolicia");

        idPoliciaL.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        idPoliciaL.setForeground(new java.awt.Color(0, 0, 0));

        botonImagen.setBackground(new java.awt.Color(0, 102, 204));
        botonImagen.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        botonImagen.setForeground(new java.awt.Color(255, 255, 255));
        botonImagen.setText("Seleccionar foto...");
        botonImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonImagenActionPerformed(evt);
            }
        });

        botonInsert.setBackground(new java.awt.Color(0, 102, 204));
        botonInsert.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        botonInsert.setForeground(new java.awt.Color(255, 255, 255));
        botonInsert.setText("Insertar/Actualizar");
        botonInsert.setBorder(null);
        botonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPerfilLayout = new javax.swing.GroupLayout(panelPerfil);
        panelPerfil.setLayout(panelPerfilLayout);
        panelPerfilLayout.setHorizontalGroup(
            panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPerfilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPerfilLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(botonInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelPerfilLayout.createSequentialGroup()
                        .addGroup(panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPerfilLayout.createSequentialGroup()
                                .addGroup(panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NombreL, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edadL, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NumeroPlacaL, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelIdPolicia))
                                .addGap(57, 57, 57)
                                .addGroup(panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textoEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                    .addComponent(idPoliciaL, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textoNumeroPlaca)))
                            .addGroup(panelPerfilLayout.createSequentialGroup()
                                .addComponent(departamentoL, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textoDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                        .addGroup(panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPerfilLayout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPerfilLayout.createSequentialGroup()
                                .addComponent(botonImagen)
                                .addGap(30, 30, 30))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPerfilLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rutaArchivo)
                .addGap(101, 101, 101))
        );
        panelPerfilLayout.setVerticalGroup(
            panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPerfilLayout.createSequentialGroup()
                .addGroup(panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPerfilLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(panelPerfilLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelIdPolicia)
                            .addComponent(idPoliciaL, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NumeroPlacaL)
                            .addComponent(textoNumeroPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edadL, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departamentoL)
                    .addComponent(textoDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonImagen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rutaArchivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        panelPestañas.addTab("Perfil", panelPerfil);

        tablaMultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "descripcion", "fecha", "importe", "idpolicia", "nifidentificador", "idtipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        panelTablaMulta.setViewportView(tablaMultas);

        ordenL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ordenL.setForeground(new java.awt.Color(0, 51, 204));
        ordenL.setText("Ordenar por:");

        orden.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        orden.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "id", "descripcion", "fecha", "importe", "idpolicia", "nifidentificador", "idtipo" }));
        orden.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ordenItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panelpestañamultasLayout = new javax.swing.GroupLayout(panelpestañamultas);
        panelpestañamultas.setLayout(panelpestañamultasLayout);
        panelpestañamultasLayout.setHorizontalGroup(
            panelpestañamultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelpestañamultasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelpestañamultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelTablaMulta, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
                    .addGroup(panelpestañamultasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ordenL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addContainerGap())
        );
        panelpestañamultasLayout.setVerticalGroup(
            panelpestañamultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelpestañamultasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelpestañamultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ordenL)
                    .addComponent(orden, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addComponent(panelTablaMulta, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
        );

        panelPestañas.addTab("Multas asociadas", panelpestañamultas);

        javax.swing.GroupLayout menuCerrarLayout = new javax.swing.GroupLayout(menuCerrar);
        menuCerrar.setLayout(menuCerrarLayout);
        menuCerrarLayout.setHorizontalGroup(
            menuCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuCerrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuCerrarLayout.createSequentialGroup()
                        .addComponent(panelPestañas)
                        .addContainerGap())
                    .addGroup(menuCerrarLayout.createSequentialGroup()
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163)
                        .addComponent(cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        menuCerrarLayout.setVerticalGroup(
            menuCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuCerrarLayout.createSequentialGroup()
                .addGroup(menuCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelPestañas, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        panelPestañas.getAccessibleContext().setAccessibleName("Perfil");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCerrarMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_menuCerrarMousePressed

    private void menuCerrarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCerrarMouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
    }//GEN-LAST:event_menuCerrarMouseDragged

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_cerrarMouseClicked

    private void textoEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoEdadActionPerformed

    private void textoNumeroPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNumeroPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNumeroPlacaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if (this.policia != null) {
            this.botonInsert.setText("Modificar");
            this.textNombre.setText(this.policia.getNombre());
            this.textoNumeroPlaca.setText(this.policia.getNumPlaca());
            this.textoDepartamento.setText(this.policia.getDepartamento());
            this.textoEdad.setText(this.policia.getEdad().toString());
            this.rellenarTablaMultas(this.orden.getSelectedItem().toString());
            try {
                Image i = Toolkit.getDefaultToolkit().getImage(getClass().getResource(this.policia.getFoto().toString()));
                ImageIcon fotoPerfil = new ImageIcon(i);
                this.ImagenL.setIcon(fotoPerfil);
            } catch (NullPointerException ex) {
            }
            this.idPoliciaL.setText(this.policia.getIdPolicia().toString());
            
        } else {
            this.panelPestañas.removeTabAt(1);
            this.botonInsert.setText("Insertar");
            this.labelIdPolicia.setVisible(false);
        }
    }//GEN-LAST:event_formWindowOpened
    /**
     * Carga una imagen, la redimensiona, la copia al package Imagenes.policias y obtiene su ruta absoluta en el disco duro para despues
     * asignarle esa ruta al atributo foto de un objeto Policia y muestra una previsualización en el label imagenL
     *
     * @param evt
     */
    private void botonImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonImagenActionPerformed
        SelectorDeArchivo fileChoose = new SelectorDeArchivo();
        String rutaSeleccionado = fileChoose.seleccionar();
        File archivo = new File(".");
        if (rutaSeleccionado.length() > 1) {
            try {
                this.rutaArchivo.setVisible(false);
                this.rutaArchivo.setText(rutaSeleccionado);
                Path ruta = Paths.get(this.rutaArchivo.getText());
                Path rutaCopiado = null;
                int calculaNombreArchivo = this.datos.getMaxIdPolicia() + 1;
                try {
                    rutaCopiado = Paths.get(ManejadorDeImagenes.copyImage(ruta.toString(), archivo.getCanonicalPath() + "/src/Imagenes/policias/"  + calculaNombreArchivo + ".jpg"));
                } catch (IOException ex) {
                    Logger.getLogger(PoliciasMantenimiento.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (this.policia == null) {
                    this.policia = new Policia();
                    this.policia.setIdPolicia(this.datos.getMaxIdPolicia()+1);
                    try {
                        rutaCopiado = Paths.get(ManejadorDeImagenes.copyImage(ruta.toString(), archivo.getCanonicalPath() + "/src/Imagenes/policias/" + this.policia.getIdPolicia() + ".jpg"));
                    } catch (IOException ex) {
                        Logger.getLogger(PoliciasMantenimiento.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    this.policia.setFoto(rutaCopiado);
                } else {
                    this.policia.setFoto(rutaCopiado);
                }
                try {
                    Image i = Toolkit.getDefaultToolkit().getImage(rutaCopiado.toString());
                    ImageIcon fotoPerfil = new ImageIcon(i);
                    this.ImagenL.setIcon(fotoPerfil);
                } catch (NullPointerException ex) {
                    this.ImagenL.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("/Imagenes/iconoanonimo.jpg")));
                }
            } catch (SQLException ex) {
                Logger.getLogger(PoliciasMantenimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_botonImagenActionPerformed

    private void ordenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ordenItemStateChanged
        this.rellenarTablaMultas(this.orden.getSelectedItem().toString());
    }//GEN-LAST:event_ordenItemStateChanged

    private void botonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertActionPerformed
        if (this.NombreL.toString()!=null && this.NumeroPlacaL.toString()!=null) {
            
        }
    }//GEN-LAST:event_botonInsertActionPerformed

    /**
     * Coloca un objeto policia en la ventana de gestion de policias
     *
     * @param policia Policia seleccionado en tabla de ventana principal.
     */
    public void setPolicia(Policia policia) {
        this.policia = policia;
    }
    
    private void rellenarTablaMultas(String orden) {
        try {
            String[] filas = new String[7];
            String[] titulos = {"id", "descripcion", "fecha", "importe", "idPolicia", "nifinfractor", "idtipo"};
            tableModelMultas = new DefaultTableModel(null, titulos);
            
            for (Multa m : this.datos.obtenerMultasPolicia(policia, orden)) {
                filas[0] = m.getId().toString();
                filas[1] = m.getDescripcion();
                SimpleDateFormat sf = new SimpleDateFormat("yyyy.MM.dd -- HH:mm");
                filas[2] = sf.format(Timestamp.valueOf(m.getFecha()));
                filas[3] = m.getImporte().toString();
                filas[4] = m.getIdPolicia().toString();
                filas[5] = m.getNifInfractor();
                filas[6] = m.getIdTipo().toString();
                this.tableModelMultas.addRow(filas);
            }
            this.tablaMultas.setModel(tableModelMultas);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getErrorCode() + " " + ex.getMessage() + " " + ex.getSQLState() + "Ha habido un problema al intentar rellenar la tabla, comprueba la conexión", "Error conectando a la base de datos", JOptionPane.ERROR_MESSAGE);
        }
    }
    private DefaultTableModel tableModelMultas;
    private Policia policia;
    private JDBC datos;
    private int x;
    private int y;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagenL;
    private javax.swing.JLabel NombreL;
    private javax.swing.JLabel NumeroPlacaL;
    private javax.swing.JButton botonImagen;
    private javax.swing.JButton botonInsert;
    private javax.swing.JLabel cerrar;
    private javax.swing.JLabel departamentoL;
    private javax.swing.JLabel edadL;
    private javax.swing.JLabel idPoliciaL;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelIdPolicia;
    private javax.swing.JPanel menuCerrar;
    private javax.swing.JComboBox orden;
    private javax.swing.JLabel ordenL;
    private javax.swing.JPanel panelPerfil;
    private javax.swing.JTabbedPane panelPestañas;
    private javax.swing.JScrollPane panelTablaMulta;
    private javax.swing.JPanel panelpestañamultas;
    private javax.swing.JLabel rutaArchivo;
    private javax.swing.JTable tablaMultas;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textoDepartamento;
    private javax.swing.JTextField textoEdad;
    private javax.swing.JTextField textoNumeroPlaca;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
