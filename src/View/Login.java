package View;

import Controller.LoginController;
import Model.DAO.Banco;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author SrTrojan
 */
public class Login extends javax.swing.JFrame {

    private final LoginController controller;
    public Login() {
        initComponents();
        controller = new LoginController(this);
        Banco.inicia();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonEntrar = new javax.swing.JButton();
        LabelSenha = new javax.swing.JLabel();
        CampoSenha = new javax.swing.JPasswordField();
        LabelUsuario = new javax.swing.JLabel();
        CampoUsuario = new javax.swing.JTextField();
        LabelLogin = new javax.swing.JLabel();
        PainelLogin = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonEntrar.setBackground(new java.awt.Color(0, 102, 0));
        ButtonEntrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ButtonEntrar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonEntrar.setText("Entrar");
        ButtonEntrar.setActionCommand("ButtonEntrar");
        ButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 700, 230, 30));

        LabelSenha.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LabelSenha.setForeground(new java.awt.Color(255, 255, 255));
        LabelSenha.setText("Senha");
        getContentPane().add(LabelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 570, -1, 20));

        CampoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(CampoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 610, 230, 30));

        LabelUsuario.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        LabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LabelUsuario.setText("Usuário");
        getContentPane().add(LabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, -1, 30));

        CampoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(CampoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 520, 230, 30));

        LabelLogin.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        LabelLogin.setForeground(new java.awt.Color(255, 255, 255));
        LabelLogin.setText("Login");
        getContentPane().add(LabelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 170, -1));

        PainelLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/painel-login.png"))); // NOI18N
        getContentPane().add(PainelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 490, 430));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Logo2.jpg"))); // NOI18N
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoUsuarioActionPerformed

    private void CampoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoSenhaActionPerformed

    private void ButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEntrarActionPerformed
        // TODO add your handling code here:
       //this.controller.fizTarefa();
       this.controller.entrarNoSistema();
       
       //System.out.println(CampoUsuario.getText());//usuario
       //System.out.println(CampoSenha.getText());//senha
    }//GEN-LAST:event_ButtonEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEntrar;
    private javax.swing.JPasswordField CampoSenha;
    private javax.swing.JTextField CampoUsuario;
    private javax.swing.JLabel LabelLogin;
    private javax.swing.JLabel LabelSenha;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel PainelLogin;
    // End of variables declaration//GEN-END:variables

    public void exibeMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
        
    }

    public JPasswordField getCampoSenha() {
        return CampoSenha;
    }

    public void setCampoSenha(JPasswordField CampoSenha) {
        this.CampoSenha = CampoSenha;
    }

    public JTextField getCampoUsuario() {
        return CampoUsuario;
    }

    public void setCampoUsuario(JTextField CampoUsuario) {
        this.CampoUsuario = CampoUsuario;
    }
    
    
}
