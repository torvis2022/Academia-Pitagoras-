
package principalAcademy;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import conectarbd.Metodos_sql;

import conectarbd.conexionMysql;
import informacionAcademy.informacion;
import informacionAcademy.intranetEstudiante;
import javax.swing.JOptionPane;
import java.sql.ResultSet;




public class frmlogin extends javax.swing.JDialog {

   public static loginPersonalAcademy log; //objeto de login de personal Academia
   
 
    
   conexionMysql con=new conexionMysql(); //conexion a mySql
   Connection cn=con.conectar();
   
   
    public frmlogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null); //centrado de ventana principal
    }
    
    Metodos_sql metodos = new Metodos_sql(); //instanciamos  clase Metodos_sql

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtimagen = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        terminousuario = new javax.swing.JLabel();
        terminopassword = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(195, 196, 201));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jButton1.setText("Realizar Pago");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 427, 168, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("ACADEMIA PITÁGORAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 490, 56));

        jButton3.setText("Administrador");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 28, 130, -1));

        jButton4.setText("Mas Información");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 28, 122, -1));

        jButton5.setText("Ayuda");
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 28, -1, -1));

        jLabel2.setText("Para iniciar matrícula, primero realizar pago correspondiente");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 395, 418, 26));

        jPanel2.setBackground(new java.awt.Color(207, 180, 180));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/loginIMA.PNG"))); // NOI18N
        txtimagen.setText("jLabel1");
        jPanel2.add(txtimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 33, 122, 109));

        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        jPanel2.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 123, 32));

        terminousuario.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        terminousuario.setText("USUARIO");
        jPanel2.add(terminousuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        terminopassword.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        terminopassword.setText("PASSWORD");
        jPanel2.add(terminopassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));
        jPanel2.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 123, 30));

        jButton2.setBackground(new java.awt.Color(102, 102, 255));
        jButton2.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jButton2.setText("Iniciar Matrícula");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 246, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 240, 280));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inicio3.PNG"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 500, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      dispose();  // la ventana anterior se cierra
        informacion pg=new informacion(); //realiza llamado de ventana
        pg.setVisible(true); //el llamado ventana se visualiza
        
       // in=new informacion(null,true); //realiza llamado de ventana
       // in.setVisible(true); //el llamado ventana se visualiza
    
    }//GEN-LAST:event_jButton1ActionPerformed

    
  
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String usuario=txtusuario.getText();
        String pass=txtpassword.getText();
        if(!usuario.equals("") || !pass.equals("")){
            
            try {
              PreparedStatement ps=(PreparedStatement) cn.prepareStatement("SELECT password  FROM tusuario WHERE u_dni='"+usuario+"' AND password='"+pass+"'");
              ResultSet rs = ps.executeQuery();
              if(rs.next()){
                  
                  String contrasenia=rs.getString("password");
                  if(contrasenia.equalsIgnoreCase(pass)){
                    
                      
                      dispose();  // la ventana anterior se cierra
                      String busqueda_nombre =metodos.buscarNombre(usuario);
                        intranetEstudiante pg=new intranetEstudiante(); //realiza llamado de ventana
                        pg.activoUsuario.setText(busqueda_nombre);  // muestra el nombre de navegador
                         pg.setVisible(true); // Hace visible la ventana
                         
                         pg.DNIusuarioLog=txtusuario.getText(); //se da el valor de usuario
                         
                        
                  }
              }else{
                  JOptionPane.showMessageDialog(null,"USUARIO O CONTRASEÑA INCORRECTA");
              
              }
              
            }catch (Exception e){  
            }
          
        }else{
            JOptionPane.showMessageDialog(null,"DEBE COMPLETAR LOS DATOS");
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       dispose();  // la ventana anterior se cierra
                         log=new loginPersonalAcademy(null,true); //realiza llamado de ventana
                        log.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmlogin dialog = new frmlogin(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel terminopassword;
    private javax.swing.JLabel terminousuario;
    private javax.swing.JLabel txtimagen;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables

}
