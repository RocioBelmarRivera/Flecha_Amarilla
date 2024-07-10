/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author rocio
 */
public class JFVistaPrincipal extends javax.swing.JFrame {

    
    public JFVistaPrincipal() {
          
        initComponents();
        
     
     this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jBConductor = new javax.swing.JButton();
        jBBoleto = new javax.swing.JButton();
        jBRutas = new javax.swing.JButton();
        jBPasajero = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jBBoleto1 = new javax.swing.JButton();
        jBRutas1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GRUPO FLECHA AMARILLA");

        jBConductor.setBackground(new java.awt.Color(255, 204, 204));
        jBConductor.setText("CONDUCTOR");
        jBConductor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBConductorMouseClicked(evt);
            }
        });
        jBConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConductorActionPerformed(evt);
            }
        });

        jBBoleto.setBackground(new java.awt.Color(255, 204, 204));
        jBBoleto.setText("BOLETO");
        jBBoleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBoletoActionPerformed(evt);
            }
        });

        jBRutas.setBackground(new java.awt.Color(255, 204, 204));
        jBRutas.setText("RUTAS");

        jBPasajero.setBackground(new java.awt.Color(255, 204, 204));
        jBPasajero.setText("PASAJERO");
        jBPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPasajeroActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setText("SALIR");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jBBoleto1.setBackground(new java.awt.Color(255, 204, 204));
        jBBoleto1.setText("MARCA");
        jBBoleto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBoleto1ActionPerformed(evt);
            }
        });

        jBRutas1.setBackground(new java.awt.Color(255, 204, 204));
        jBRutas1.setText("ESTADO");
        jBRutas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRutas1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setText("Tipo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jBBoleto))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBBoleto1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBConductor))))
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBPasajero, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBRutas, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBRutas1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(39, 39, 39))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBBoleto, jBConductor, jBPasajero, jBRutas, jBRutas1, jButton1, jButton2});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBPasajero)
                            .addComponent(jButton2))
                        .addGap(31, 31, 31)
                        .addComponent(jBRutas)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBRutas1)
                            .addComponent(jBBoleto1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jBBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBConductor)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBBoleto, jBConductor, jBPasajero, jBRutas, jBRutas1, jButton1, jButton2});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPasajeroActionPerformed
        // TODO add your handling code here:
        JFPasajero cliente = new JFPasajero();
        cliente.setVisible(true);
        cliente.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jBPasajeroActionPerformed

    private void jBConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConductorActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jBConductorActionPerformed

    private void jBConductorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBConductorMouseClicked
     // TODO add your handling code here:
       JFConductor cliente = new JFConductor();
        cliente.setVisible(true);
        cliente.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jBConductorMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jBBoleto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBoleto1ActionPerformed
        // TODO add your handling code here:
        JFMarca cliente = new JFMarca();
        cliente.setVisible(true);
        cliente.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jBBoleto1ActionPerformed

    private void jBRutas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRutas1ActionPerformed
        // TODO add your handling code here:
        JFEstado cliente = new JFEstado();
        cliente.setVisible(true);
        cliente.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jBRutas1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JFTipo cliente = new JFTipo();
        cliente.setVisible(true);
        cliente.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jBBoletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBoletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBBoletoActionPerformed

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
            java.util.logging.Logger.getLogger(JFVistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFVistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFVistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFVistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFVistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBoleto;
    private javax.swing.JButton jBBoleto1;
    private javax.swing.JButton jBConductor;
    private javax.swing.JButton jBPasajero;
    private javax.swing.JButton jBRutas;
    private javax.swing.JButton jBRutas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
