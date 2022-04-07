/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping;

/**
 *
 * @author Ashwini K. Singh
 */
public class OS_Menz extends javax.swing.JFrame {

    /**
     * Creates new form OS_Menz
     */
    public OS_Menz() {
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

        TopWear = new javax.swing.JButton();
        BottomWear = new javax.swing.JButton();
        Shoes = new javax.swing.JButton();
        Accessories = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TopWear.setBackground(new java.awt.Color(0, 0, 51));
        TopWear.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        TopWear.setForeground(new java.awt.Color(255, 255, 255));
        TopWear.setText("TOP  WEAR");
        TopWear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TopWear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TopWearActionPerformed(evt);
            }
        });
        getContentPane().add(TopWear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 70));

        BottomWear.setBackground(new java.awt.Color(0, 0, 51));
        BottomWear.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        BottomWear.setForeground(new java.awt.Color(255, 255, 255));
        BottomWear.setText("BOTTOM   WEAR");
        BottomWear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BottomWear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottomWearActionPerformed(evt);
            }
        });
        getContentPane().add(BottomWear, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 240, 70));

        Shoes.setBackground(new java.awt.Color(0, 0, 51));
        Shoes.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        Shoes.setForeground(new java.awt.Color(255, 255, 255));
        Shoes.setText("SHOES");
        Shoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Shoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShoesActionPerformed(evt);
            }
        });
        getContentPane().add(Shoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 240, 70));

        Accessories.setBackground(new java.awt.Color(0, 0, 51));
        Accessories.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        Accessories.setForeground(new java.awt.Color(255, 255, 255));
        Accessories.setText("ACCESSORIES");
        Accessories.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Accessories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccessoriesActionPerformed(evt);
            }
        });
        getContentPane().add(Accessories, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 240, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/shopping/(img)images (12).jpg"))); // NOI18N
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 240, 390));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/shopping/(img)images (16).jpg"))); // NOI18N
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 240, 390));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/shopping/(img)images (11).jpg"))); // NOI18N
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 80, 240, 390));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/shopping/(img)menshoes.jpg"))); // NOI18N
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 240, 390));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/shopping/(img)Aqua Tube.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TopWearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TopWearActionPerformed
        // TODO add your handling code here:
        new OS_Menz_Topwear().setVisible(true);
    }//GEN-LAST:event_TopWearActionPerformed

    private void BottomWearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottomWearActionPerformed
        // TODO add your handling code here:
        new OS_Menz_Jeans().setVisible(true);
    }//GEN-LAST:event_BottomWearActionPerformed

    private void ShoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShoesActionPerformed
        // TODO add your handling code here:
        new OS_Menz_Shoes().setVisible(true);
    }//GEN-LAST:event_ShoesActionPerformed

    private void AccessoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccessoriesActionPerformed
        // TODO add your handling code here:
        new OS_Menz_Accessories().setVisible(true);
    }//GEN-LAST:event_AccessoriesActionPerformed

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
            java.util.logging.Logger.getLogger(OS_Menz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OS_Menz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OS_Menz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OS_Menz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OS_Menz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accessories;
    private javax.swing.JButton BottomWear;
    private javax.swing.JButton Shoes;
    private javax.swing.JButton TopWear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}