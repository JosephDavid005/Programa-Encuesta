/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOSEPH
 */
public class Login extends javax.swing.JFrame {
    public String usuario="";
    
    public Login() {
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

        jPanel2 = new javax.swing.JPanel();
        lbimg = new javax.swing.JLabel();
        lbbienvenida = new javax.swing.JLabel();
        lbnombre = new javax.swing.JLabel();
        lbcedula = new javax.swing.JLabel();
        txcedula = new javax.swing.JTextField();
        txnombre = new javax.swing.JTextField();
        btentrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(102, 102, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pp.png"))); // NOI18N
        jPanel2.add(lbimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 240, 150));

        lbbienvenida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Captura de pantalla 2024-11-15 201530.png"))); // NOI18N
        lbbienvenida.setText("jLabel3");
        jPanel2.add(lbbienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        lbnombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Captura de pantalla 2024-11-15 201826.png"))); // NOI18N
        jPanel2.add(lbnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        lbcedula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Captura de pantalla 2024-11-15 202209.png"))); // NOI18N
        jPanel2.add(lbcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        txcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txcedulaActionPerformed(evt);
            }
        });
        jPanel2.add(txcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 280, 30));
        jPanel2.add(txnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 280, 30));

        btentrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Captura de pantalla 2024-11-15 202430.png"))); // NOI18N
        btentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btentrarActionPerformed(evt);
            }
        });
        jPanel2.add(btentrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 130, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Captura de pantalla 2024-11-15 203719.png"))); // NOI18N
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 210, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txcedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txcedulaActionPerformed

    private void btentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btentrarActionPerformed
        String nom="", ced="";
        boolean vot=false;
        nom=txnombre.getText();
        ced=txcedula.getText();
        Usuarios objS=new Usuarios(nom, ced, vot);
    }//GEN-LAST:event_btentrarActionPerformed

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
    private javax.swing.JButton btentrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbbienvenida;
    private javax.swing.JLabel lbcedula;
    private javax.swing.JLabel lbimg;
    private javax.swing.JLabel lbnombre;
    private javax.swing.JTextField txcedula;
    private javax.swing.JTextField txnombre;
    // End of variables declaration//GEN-END:variables
}
