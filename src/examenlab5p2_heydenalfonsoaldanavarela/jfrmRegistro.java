/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab5p2_heydenalfonsoaldanavarela;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author heyde
 */
public class jfrmRegistro extends javax.swing.JFrame {

    private static g_admin a;
    private static g_comprador c;
    private static g_vendedor v;
    /**
     * Creates new form jfrmRegistro
     */
    public jfrmRegistro() {
        initComponents();
        
        jLabel1.setForeground(Color.LIGHT_GRAY);
        jLabel2.setForeground(Color.LIGHT_GRAY);
        jLabel3.setForeground(Color.LIGHT_GRAY);
        jLabel4.setForeground(Color.LIGHT_GRAY);
        jLabel5.setForeground(Color.LIGHT_GRAY);
        jLabel6.setForeground(Color.LIGHT_GRAY);
        tusuario.setForeground(Color.LIGHT_GRAY);
        tcontra.setForeground(Color.LIGHT_GRAY);
        tedad.setForeground(Color.LIGHT_GRAY);
        tcuentabancaria.setForeground(Color.LIGHT_GRAY);
        tpersonajefav.setForeground(Color.LIGHT_GRAY);
        tnombre.setForeground(Color.LIGHT_GRAY);
        bcrear.setForeground(Color.LIGHT_GRAY);
        bregresar.setForeground(Color.LIGHT_GRAY);
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
        jLabel1 = new javax.swing.JLabel();
        tnombre = new javax.swing.JTextField();
        jrbadmin = new javax.swing.JRadioButton();
        bregresar = new javax.swing.JButton();
        bcrear = new javax.swing.JButton();
        jrbcompra = new javax.swing.JRadioButton();
        jrbventa = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        tusuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tcontra = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tedad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tpersonajefav = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tcuentabancaria = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Nombre Real");

        tnombre.setBackground(new java.awt.Color(0, 102, 102));
        tnombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jrbadmin.setBackground(new java.awt.Color(0, 153, 153));
        jrbadmin.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jrbadmin.setText("Administrador");
        jrbadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbadminActionPerformed(evt);
            }
        });

        bregresar.setBackground(new java.awt.Color(0, 102, 153));
        bregresar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        bregresar.setText("Regresar a Login");
        bregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bregresarActionPerformed(evt);
            }
        });

        bcrear.setBackground(new java.awt.Color(0, 102, 153));
        bcrear.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        bcrear.setText("Crear usuario");
        bcrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcrearActionPerformed(evt);
            }
        });

        jrbcompra.setBackground(new java.awt.Color(0, 153, 153));
        jrbcompra.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jrbcompra.setText("Comprador");
        jrbcompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbcompraActionPerformed(evt);
            }
        });

        jrbventa.setBackground(new java.awt.Color(0, 153, 153));
        jrbventa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jrbventa.setText("Vendedor");
        jrbventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbventaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Nombre de Usuario");

        tusuario.setBackground(new java.awt.Color(0, 102, 102));
        tusuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Contraseña");

        tcontra.setBackground(new java.awt.Color(0, 102, 102));
        tcontra.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Edad");

        tedad.setBackground(new java.awt.Color(0, 102, 102));
        tedad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Personaje favorito");

        tpersonajefav.setBackground(new java.awt.Color(0, 102, 102));
        tpersonajefav.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Cuenta Bancaria (7 digitos)");

        tcuentabancaria.setBackground(new java.awt.Color(0, 102, 102));
        tcuentabancaria.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jrbadmin)
                    .addComponent(jrbcompra)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(tcuentabancaria, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tcontra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                        .addComponent(tnombre, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jrbventa))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(tpersonajefav, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(tusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(tedad, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bcrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(bregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tcontra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tpersonajefav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tcuentabancaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bcrear, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jrbadmin)
                        .addGap(18, 18, 18)
                        .addComponent(jrbcompra)
                        .addGap(18, 18, 18)
                        .addComponent(jrbventa)))
                .addGap(33, 33, 33))
        );

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jrbadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbadminActionPerformed
        // TODO add your handling code here:
        jrbcompra.setSelected(false);
        jrbventa.setSelected(false);
    }//GEN-LAST:event_jrbadminActionPerformed

    private void jrbcompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbcompraActionPerformed
        // TODO add your handling code here:
        jrbadmin.setSelected(false);
        jrbventa.setSelected(false);
    }//GEN-LAST:event_jrbcompraActionPerformed

    private void jrbventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbventaActionPerformed
        // TODO add your handling code here:
        jrbadmin.setSelected(false);
        jrbcompra.setSelected(false);
    }//GEN-LAST:event_jrbventaActionPerformed

    private void bregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bregresarActionPerformed
        // TODO add your handling code here:
        jfrmlogin login = new jfrmlogin();
        this.hide();
        login.show();
    }//GEN-LAST:event_bregresarActionPerformed

    private void bcrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcrearActionPerformed
        // TODO add your handling code here:
        
        try
        {
            int edad = Integer.parseInt(tedad.getText());
            if(tcuentabancaria.getText().length() != 7)
            {
                JOptionPane.showMessageDialog(null, "ADVERTENCIA: La cuenta bancaria debe ser de 7 digitos");
                return;
            }

            // agrega segun sol
            if(jrbadmin.isSelected())
                a.crearUsuarioAdmin(tnombre.getText(), tusuario.getText(), tcontra.getText(), edad);
            else if(jrbcompra.isSelected())
                a.crearUsuarioCompra(tnombre.getText(), tusuario.getText(), tcontra.getText(), edad, tcuentabancaria.getText());
            else if(jrbventa.isSelected())
                a.crearUsuarioVenta(tnombre.getText(), tusuario.getText(), tcontra.getText(), edad, tcuentabancaria.getText(), tpersonajefav.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR DEL SISTEMA: no se puede agregar los datos\n" + "¿Escribio los datos correctamente?");
        }
        
    }//GEN-LAST:event_bcrearActionPerformed

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
            java.util.logging.Logger.getLogger(jfrmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrmRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcrear;
    private javax.swing.JButton bregresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrbadmin;
    private javax.swing.JRadioButton jrbcompra;
    private javax.swing.JRadioButton jrbventa;
    private javax.swing.JTextField tcontra;
    private javax.swing.JTextField tcuentabancaria;
    private javax.swing.JTextField tedad;
    private javax.swing.JTextField tnombre;
    private javax.swing.JTextField tpersonajefav;
    private javax.swing.JTextField tusuario;
    // End of variables declaration//GEN-END:variables
}