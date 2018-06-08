package Controlador;

import static Controlador.Alumnos.txtApepat;
import static Controlador.Alumnos.txtRol;
import Datos.Drol;
import Datos.Dusuario;
import Logica.Lusuario;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public  class Alumnos1 extends javax.swing.JInternalFrame {
    //boolean modificar = false;
    
    Dusuario dusuario = new Dusuario();
    Lusuario lusuario = new Lusuario();
    
    
    public Alumnos1() {
        initComponents();
        
        tbtabla.getTableHeader().setReorderingAllowed(false);
        tbtabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tbtabla.doLayout();
                     
                     
       mostraralumno("", nomusu);
        inhabilitar();
        Rol();
        
        
        
    }
    
    String nomusu="nomusu";
    private String accion="guardar";
    

     void inhabilitar(){
         
        txtApemat.setEnabled(false);
        txtApepat.setEnabled(false);
        txtNombre.setEnabled(false);
        txtEdad.setEnabled(false);
        cbxGenero.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtEmail.setEnabled(false);
        txtTelefono.setEnabled(false);
        
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
       // btnEliminar.setEnabled(false);
     
     }
     
    void habilitar(){
        
        txtApemat.setEnabled(true);
        txtApepat.setEnabled(true);
        txtNombre.setEnabled(true);
        txtEdad.setEnabled(true);
        cbxGenero.setEnabled(true);
        txtDireccion.setEnabled(true);
        txtEmail.setEnabled(true);
        txtTelefono.setEnabled(true);
       
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnEliminar.setEnabled(true);
             
    }
    
    void limpiar(){
        
        txtApemat.setText("");
        txtApepat.setText("");
        txtNombre.setText("");
        txtEdad.setText("");
        cbxGenero.setSelectedIndex(0);
        txtDireccion.setText("");
        txtEmail.setText("");
        txtTelefono.setText("");   

    }
    
    
  
    

//      void ocultar_clumnas(){
//        tbtabla.getColumnModel().getColumn(0).setMaxWidth(0);
//        tbtabla.getColumnModel().getColumn(0).setMinWidth(0);
//        tbtabla.getColumnModel().getColumn(0).setPreferredWidth(0);  
//        
//        tbtabla.getColumnModel().getColumn(2).setMaxWidth(150);
//        tbtabla.getColumnModel().getColumn(2).setMinWidth(150);
//        tbtabla.getColumnModel().getColumn(2).setPreferredWidth(0);
//        
//        tbtabla.getColumnModel().getColumn(3).setMaxWidth(150);
//        tbtabla.getColumnModel().getColumn(3).setMinWidth(150);
//        tbtabla.getColumnModel().getColumn(3).setPreferredWidth(0);
//
//        
//    } 
    
   
      
   
      void mostraralumno(String buscar, String nomusu){
        try {
            DefaultTableModel modelo;
          
           modelo = lusuario.mostraralumno(buscar, nomusu);
           tbtabla.setModel(modelo);
      //    ocultar_clumnas();
          lbltotalregistros.setText("Total de Registros: "+Integer.toString(lusuario.totalregistros));
            
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }
    
   
    
    public void cargarCombo(){
        cbxBuscar.addItem("Nombre");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbCodigio = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblApepat = new javax.swing.JLabel();
        txtApepat = new javax.swing.JTextField();
        txtApemat = new javax.swing.JTextField();
        lblApemat = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        lblGenero = new javax.swing.JLabel();
        cbxGenero = new javax.swing.JComboBox<>();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblRol = new javax.swing.JLabel();
        txtRol = new javax.swing.JTextField();
        lblClave = new javax.swing.JLabel();
        txtClave = new javax.swing.JPasswordField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        cbxBuscar = new javax.swing.JComboBox<>();
        lbltotalregistros = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbtabla = tbtabla = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        txtid = new javax.swing.JTextField();

        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/sistema.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbCodigio.setText("Código");

        txtCodigo.setEnabled(true);

        lblApepat.setText("Apellido Paterno:");

        lblApemat.setText("Apellido Materno:");

        lblNombre.setText("Nombre:");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });

        lblEdad.setText("Edad:");

        lblGenero.setText("Genero:");

        cbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione ....", "Masculino ", "Femenino" }));

        lblDireccion.setText("Direccion:");

        lblEmail.setText("Email:");

        lblTelefono.setText("Telefono:");

        lblUsuario.setText("Usuario:");

        txtUsuario.setEnabled(false);

        lblRol.setText("Rol:");

        txtRol.setEnabled(false);

        lblClave.setText("Clave:");

        txtClave.setEnabled(false);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblApemat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtApemat))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblApepat)
                            .addComponent(lbCodigio))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApepat)
                            .addComponent(txtCodigo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbxGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblRol, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtRol, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblClave, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtClave)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigio)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblApepat)
                    .addComponent(txtApepat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblApemat)
                    .addComponent(txtApemat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdad)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGenero)
                    .addComponent(cbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRol)
                    .addComponent(txtRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblClave)
                        .addGap(404, 404, 404))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnCancelar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblBuscar.setText("Buscar");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        cbxBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "nomusu" }));

        lbltotalregistros.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbltotalregistros.setText("Registros");
        lbltotalregistros.setToolTipText("");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tbtabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbtabla);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbltotalregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnNuevo)
                        .addGap(42, 42, 42)
                        .addComponent(btnModificar)
                        .addGap(111, 111, 111)
                        .addComponent(btnEliminar)
                        .addGap(85, 85, 85)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(cbxBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar)))
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(cbxBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltotalregistros)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo)
                            .addComponent(btnModificar))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar)
                            .addComponent(btnSalir))
                        .addGap(30, 30, 30))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        inhabilitar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            
        
//            if(JOptionPane.showConfirmDialog(null, "¿Desea Registrar al Alumno "+txtApepat.getText().trim().toUpperCase()+" "+txtApemat.getText().trim().toUpperCase()+" "+txtNombre.getText().trim().toUpperCase()+"?","Mensaje del sistema",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
//                if(txtApepat.getText().toUpperCase().trim().isEmpty()){
//                    JOptionPane.showMessageDialog(null, "Debe ingresar Apellido Paterno del "+txtRol.getText().toUpperCase().trim()+"","Mensaje del Sistema",JOptionPane.WARNING_MESSAGE);
//                    txtApepat.requestFocus();
//                    return;
//                }
//                if(txtApemat.getText().toUpperCase().trim().isEmpty()){
//                    JOptionPane.showMessageDialog(null, "Debe ingresar Apellido Paterno del "+txtRol.getText().toUpperCase().trim()+"","Mensaje del Sistema",JOptionPane.WARNING_MESSAGE);
//                    txtApemat.requestFocus();
//                    return;
//                }
//                if(txtNombre.getText().toUpperCase().trim().isEmpty()){
//                    JOptionPane.showMessageDialog(null, "Debe ingresar Apellido Paterno del "+txtRol.getText().toUpperCase().trim()+"","Mensaje del Sistema",JOptionPane.WARNING_MESSAGE);
//                    txtNombre.requestFocus();
//                    return;
//                }
//                if(txtEdad.getText().toUpperCase().trim().isEmpty()){
//                    JOptionPane.showMessageDialog(null, "Debe ingresar la Edad del "+txtRol.getText().toUpperCase().trim()+"","Mensaje del Sistema",JOptionPane.WARNING_MESSAGE);
//                    txtEdad.requestFocus();
//                    return;
//                }
//                if(cbxGenero.getSelectedItem().toString()==""){
//                    JOptionPane.showMessageDialog(null, "Debe seleccionar el Genero del  "+txtRol.getText().toUpperCase().trim()+"","Mensaje del Sistema",JOptionPane.WARNING_MESSAGE);
//                    cbxGenero.requestFocus();
//                    return;
//                }
//                if(txtDireccion.getText().toUpperCase().trim().isEmpty()){
//                    JOptionPane.showMessageDialog(null, "Debe la Direccion del "+txtRol.getText().toUpperCase().trim()+"","Mensaje del Sistema",JOptionPane.WARNING_MESSAGE);
//                    txtDireccion.requestFocus();
//                    return;
//                }
//                if(txtUsuario.getText().trim().toUpperCase().isEmpty()){
//                    JOptionPane.showMessageDialog(null,"Debe ingresar el usuario del "+txtRol.getText()+"","Mensaje del Sistema",JOptionPane.WARNING_MESSAGE);
//                    txtUsuario.requestFocus();
//                    return;
//                }
//                if(txtClave.getText().trim().toUpperCase().isEmpty()){
//                    JOptionPane.showMessageDialog(null,"Debe ingresar la clave del "+txtRol.getText()+"","Mensaje del Sistema",JOptionPane.WARNING_MESSAGE);
//                    txtClave.requestFocus();                    
//                    return;
//                }



                dusuario.setIdusu(Integer.parseInt(txtid.getText())); 
                dusuario.setCodigo(txtCodigo.getText());
                dusuario.setApepatusu(txtApepat.getText().trim().toUpperCase());
                dusuario.setApematusu(txtApemat.getText().trim().toUpperCase());
                dusuario.setNomusu(txtNombre.getText().trim().toUpperCase());
                dusuario.setEdadusu(Integer.parseInt(txtEdad.getText().trim().toUpperCase()));
                dusuario.setGenusu(cbxGenero.getSelectedItem().toString());
                dusuario.setDirusu(txtDireccion.getText().trim().toUpperCase());
                dusuario.setEmailusu(txtEmail.getText().trim().toUpperCase());
                dusuario.setTelfusu(txtTelefono.getText().trim().toUpperCase());
                dusuario.setOdrol(new Drol(Integer.parseInt(txtRol.getText().trim().toUpperCase())));
                dusuario.setUsuario_idusu(txtUsuario.getText());
                dusuario.setPassusu(txtClave.getText());
               
                
               lusuario.insertarAlumno(dusuario);
               mostraralumno("", nomusu);
//               
//        if (accion.equals("guardar")) {
//            if (lusuario.insertarAlumno(dusuario)) {
//                JOptionPane.showMessageDialog(rootPane, "El usuario fue registrado correctamente.");
//                mostraralumno("",nomusu);
//                inhabilitar();
//                
//            } 
//        }else if(accion.equals("editar")){
//            dusuario.setIdusu(Integer.parseInt(txtCodigo.getText()));
//            if (lusuario.editarAlumno(dusuario)) {
//                JOptionPane.showMessageDialog(rootPane, "El usuario fue editado correctamente.");
//                mostraralumno("",nomusu);
//                inhabilitar();
//               
//            }
//        }
                        
        
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Mensaje del Sistema", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    
    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        if(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE){
            txtNombre.setText(" ");
            if(txtNombre.getText().toUpperCase().indexOf(" ")==-1){
                txtUsuario.setText(" ");
                txtClave.setText(" ");            
            }
        }else{
            txtUsuario.setText(GenerarUserAndPass());
            txtClave.setText(GenerarUserAndPass());
        }
        
    }//GEN-LAST:event_txtNombreKeyPressed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
         if (!txtid.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Estas seguro de eliminar el usuario..?");
            if (confirmacion==0) {
                
                dusuario.setIdusu(Integer.parseInt(txtid.getText()));
                lusuario.eliminar(dusuario);
                mostraralumno("",nomusu);
                inhabilitar();
            }
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiar();
        habilitar();
      //  btnEliminar.setEnabled(false);
        btnGuardar.setText("Guardar");
        accion="guardar";
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
         int seleccionado=cbxBuscar.getSelectedIndex();
        nomusu=(String.valueOf(seleccionado));
        switch(seleccionado){
            case 0:
            nomusu="nomusu";
            break;

        }
        mostraralumno(txtBuscar.getText(), nomusu);
        txtBuscar.requestFocus();
    }//GEN-LAST:event_btnBuscarActionPerformed

    
    public String GenerarUserAndPass(){
        try {
            String apellidos = txtApepat.getText().toUpperCase().trim().substring(0,1)+""+txtApemat.getText().toUpperCase().trim().substring(0,1);
            String pnombre = "";
            String snombre = "";
           if(txtNombre.getText().toUpperCase().indexOf(" ")!=-1){
                pnombre = txtNombre.getText().substring(0,txtNombre.getText().indexOf(" "));
                snombre = txtNombre.getText().substring(txtNombre.getText().lastIndexOf(" "));
                snombre = snombre.trim().substring(0,2);
            }
           
            String nick = apellidos+ pnombre.toUpperCase() + snombre.toUpperCase();
            return  nick;                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Mensaje del Sistema", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
    }

    public void Rol(){
        txtRol.setText("ALUMNO");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxBuscar;
    private javax.swing.JComboBox<String> cbxGenero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCodigio;
    private javax.swing.JLabel lblApemat;
    private javax.swing.JLabel lblApepat;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblClave;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRol;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lbltotalregistros;
    private javax.swing.JTable tbtabla;
    private javax.swing.JTextField txtApemat;
    public static javax.swing.JTextField txtApepat;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRol;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
