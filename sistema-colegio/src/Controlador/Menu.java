package Controlador;

import java.awt.Toolkit;
import Util.Util;
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setMinimumSize(Toolkit.getDefaultToolkit().getScreenSize());
//      
//        Util.AplicarIcono(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JDesktopPane();
        jPanel3 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblFechayHora = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuAlumnos = new javax.swing.JMenuItem();
        mnuProfesores = new javax.swing.JMenuItem();
        mnuSecretaria = new javax.swing.JMenuItem();
        mnuDirector = new javax.swing.JMenuItem();
        mnuSession = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuAnioAcademico = new javax.swing.JMenuItem();
        mnuMatricula = new javax.swing.JMenuItem();
        mnuHorario = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SISTEMA ESCOLAR");

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setToolTipText("SISTEMA DE COLEGIO");
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(1066, 106));
        pnlPrincipal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlPrincipalMouseMoved(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1066, Short.MAX_VALUE)
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 661, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("Usuario: ");

        lblFechayHora.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFechayHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechayHora.setText("FECHAY  HORA: ");

        lblRol.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRol.setText("Rol:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRol, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151)
                .addComponent(lblFechayHora, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechayHora, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRol, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jMenu1.setText("Mantenimiento");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenu1KeyPressed(evt);
            }
        });

        mnuAlumnos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        mnuAlumnos.setText("Alumnos");
        mnuAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAlumnosActionPerformed(evt);
            }
        });
        jMenu1.add(mnuAlumnos);

        mnuProfesores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        mnuProfesores.setText("Profesores");
        mnuProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProfesoresActionPerformed(evt);
            }
        });
        jMenu1.add(mnuProfesores);

        mnuSecretaria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        mnuSecretaria.setText("Secretaria");
        mnuSecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSecretariaActionPerformed(evt);
            }
        });
        jMenu1.add(mnuSecretaria);

        mnuDirector.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        mnuDirector.setText("Director");
        mnuDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDirectorActionPerformed(evt);
            }
        });
        jMenu1.add(mnuDirector);

        mnuSession.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        mnuSession.setText("CerrarSesión");
        mnuSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSessionActionPerformed(evt);
            }
        });
        jMenu1.add(mnuSession);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Operaciones");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        mnuAnioAcademico.setText("Año Academico");
        mnuAnioAcademico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAnioAcademicoActionPerformed(evt);
            }
        });
        jMenu2.add(mnuAnioAcademico);

        mnuMatricula.setText("Matricula");
        mnuMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMatriculaActionPerformed(evt);
            }
        });
        jMenu2.add(mnuMatricula);

        mnuHorario.setText("Horario");
        jMenu2.add(mnuHorario);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Consultas");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Reportes");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Utilitarios");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu5);

        jMenu6.setText("Aceca de..");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAlumnosActionPerformed
        Alumnos oAlumnos = new Alumnos();
        oAlumnos.setVisible(true);
        oAlumnos.setTitle("[MANTENIMIENTO]-REGISTRO DE ALUMNOS");
        pnlPrincipal.add(oAlumnos);
        oAlumnos.show();
//        oAlumnos.Rol();
    }//GEN-LAST:event_mnuAlumnosActionPerformed

    private void mnuProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProfesoresActionPerformed
        
    }//GEN-LAST:event_mnuProfesoresActionPerformed

    private void mnuSecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSecretariaActionPerformed
        
    }//GEN-LAST:event_mnuSecretariaActionPerformed

    private void mnuDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDirectorActionPerformed
        
    }//GEN-LAST:event_mnuDirectorActionPerformed

    private void mnuSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSessionActionPerformed
        this.dispose();
        Acceso oAcceso = new Acceso();
        oAcceso.setVisible(true);
    }//GEN-LAST:event_mnuSessionActionPerformed

    private void jMenu1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenu1KeyPressed

    }//GEN-LAST:event_jMenu1KeyPressed

    private void mnuAnioAcademicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAnioAcademicoActionPerformed
        
    }//GEN-LAST:event_mnuAnioAcademicoActionPerformed

    private void mnuMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMatriculaActionPerformed
        
    }//GEN-LAST:event_mnuMatriculaActionPerformed

    private void pnlPrincipalMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPrincipalMouseMoved
        
    }//GEN-LAST:event_pnlPrincipalMouseMoved

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblFechayHora;
    public static javax.swing.JLabel lblRol;
    private javax.swing.JLabel lblUsuario;
    public static javax.swing.JMenuItem mnuAlumnos;
    public static javax.swing.JMenuItem mnuAnioAcademico;
    public static javax.swing.JMenuItem mnuDirector;
    public static javax.swing.JMenuItem mnuHorario;
    public static javax.swing.JMenuItem mnuMatricula;
    public static javax.swing.JMenuItem mnuProfesores;
    public static javax.swing.JMenuItem mnuSecretaria;
    public static javax.swing.JMenuItem mnuSession;
    private javax.swing.JDesktopPane pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
