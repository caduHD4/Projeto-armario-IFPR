/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifpr.paranavai.armarios.view;

import br.edu.ifpr.paranavai.armarios.controller.LoginController;
import java.awt.Color;

/**
 *
 * @author Leonardo
 */
public class BibliotecarioIndex extends javax.swing.JFrame {

    /**
     * Creates new form BibliotecarioIndex
     */
    public BibliotecarioIndex() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AcessarButton = new javax.swing.JButton();
        passFieldSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        MostrarSenhaToggleButton = new javax.swing.JToggleButton();
        txtFieldEmail = new javax.swing.JTextField();
        lblResposta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);

        AcessarButton.setText("Entrar");
        AcessarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AcessarButtonMouseClicked(evt);
            }
        });
        AcessarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcessarButtonActionPerformed(evt);
            }
        });

        passFieldSenha.setForeground(new java.awt.Color(204, 204, 204));
        passFieldSenha.setText("Digite a senha");
        passFieldSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passFieldSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passFieldSenhaFocusLost(evt);
            }
        });
        passFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passFieldSenhaActionPerformed(evt);
            }
        });

        jLabel1.setText("E-mail");

        MostrarSenhaToggleButton.setText("Mostrar senha");
        MostrarSenhaToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarSenhaToggleButtonActionPerformed(evt);
            }
        });

        txtFieldEmail.setForeground(new java.awt.Color(204, 204, 204));
        txtFieldEmail.setText("Digite o E-mail"); // NOI18N
        txtFieldEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldEmailFocusLost(evt);
            }
        });
        txtFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldEmailActionPerformed(evt);
            }
        });

        lblResposta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Senha");

        jButton2.setText("Para alunos");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Biblioteca IFPR - Campus Paranavaí");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MostrarSenhaToggleButton)
                            .addComponent(passFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblResposta))
                            .addComponent(AcessarButton))))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passFieldSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(MostrarSenhaToggleButton)
                .addGap(18, 18, 18)
                .addComponent(AcessarButton)
                .addGap(5, 5, 5)
                .addComponent(lblResposta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AcessarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcessarButtonMouseClicked
        LoginController controle = new LoginController();
        String email = this.txtFieldEmail.getText();
        String senha = String.copyValueOf(this.passFieldSenha.getPassword());
        String resposta = controle.verifica(email, senha);
        lblResposta.setText(resposta);
    }//GEN-LAST:event_AcessarButtonMouseClicked

    private void AcessarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcessarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AcessarButtonActionPerformed

    private void passFieldSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFieldSenhaFocusGained
        if(passFieldSenha.getText().equals("Digite a senha")) {
            passFieldSenha.setEchoChar('*');
            passFieldSenha.setText("");
            passFieldSenha.setForeground(Color.black);
        }
    }//GEN-LAST:event_passFieldSenhaFocusGained

    private void passFieldSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFieldSenhaFocusLost
        if(passFieldSenha.getText().equals("")) {
            passFieldSenha.setEchoChar((char) 0);
            passFieldSenha.setText("Digite a senha");
            passFieldSenha.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_passFieldSenhaFocusLost

    private void passFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passFieldSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passFieldSenhaActionPerformed

    private void MostrarSenhaToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarSenhaToggleButtonActionPerformed
        if(MostrarSenhaToggleButton.isSelected()) {
            passFieldSenha.setEchoChar((char)0);
        } else {
            passFieldSenha.setEchoChar('*');
        }
    }//GEN-LAST:event_MostrarSenhaToggleButtonActionPerformed

    private void txtFieldEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldEmailFocusGained
        if(txtFieldEmail.getText().equals("Digite o E-mail")) {
            txtFieldEmail.setText("");
            txtFieldEmail.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtFieldEmailFocusGained

    private void txtFieldEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldEmailFocusLost
        if(txtFieldEmail.getText().equals("")) {
            txtFieldEmail.setText("Digite o E-mail");
            txtFieldEmail.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtFieldEmailFocusLost

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        ArmarioIndex armarioIndex = new ArmarioIndex();

        armarioIndex.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldEmailActionPerformed

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
            java.util.logging.Logger.getLogger(BibliotecarioIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BibliotecarioIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BibliotecarioIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BibliotecarioIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BibliotecarioIndex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcessarButton;
    private javax.swing.JToggleButton MostrarSenhaToggleButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblResposta;
    private javax.swing.JPasswordField passFieldSenha;
    private javax.swing.JTextField txtFieldEmail;
    // End of variables declaration//GEN-END:variables
}
