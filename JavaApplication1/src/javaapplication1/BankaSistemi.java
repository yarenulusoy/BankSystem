/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

import java.awt.Color;

/**
 *
 * @author Pelin
 */
public class BankaSistemi extends javax.swing.JFrame {
    Color defaultcolor=new Color(0, 51, 51);
    /**
     * Creates new form BankaSistemi
     */
    public BankaSistemi() {
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

        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        mudur = new javax.swing.JPanel();
        mudurlbl = new javax.swing.JLabel();
        temsilci = new javax.swing.JPanel();
        temsilcilbl = new javax.swing.JLabel();
        musteri = new javax.swing.JPanel();
        musterilbl = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setLocation(new java.awt.Point(130, 80));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1200, 700));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setForeground(new java.awt.Color(0, 0, 102));
        jPanel4.setPreferredSize(new java.awt.Dimension(1200, 700));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(350, 700));
        jPanel2.setRequestFocusEnabled(false);

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Banka Yönetim Sistemi");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(51, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        mudur.setBackground(new java.awt.Color(0, 51, 51));
        mudur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mudurMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mudurMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mudurMouseExited(evt);
            }
        });

        mudurlbl.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        mudurlbl.setForeground(new java.awt.Color(204, 204, 204));
        mudurlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/images/manager.png"))); // NOI18N
        mudurlbl.setText("        Yönetici  Girişi");
        mudurlbl.setToolTipText("");

        javax.swing.GroupLayout mudurLayout = new javax.swing.GroupLayout(mudur);
        mudur.setLayout(mudurLayout);
        mudurLayout.setHorizontalGroup(
            mudurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mudurLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(mudurlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mudurLayout.setVerticalGroup(
            mudurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mudurlbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        temsilci.setBackground(new java.awt.Color(0, 51, 51));
        temsilci.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                temsilciMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                temsilciMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                temsilciMouseExited(evt);
            }
        });

        temsilcilbl.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        temsilcilbl.setForeground(new java.awt.Color(204, 204, 204));
        temsilcilbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/images/support.png"))); // NOI18N
        temsilcilbl.setText("        Temsilci  Girişi");
        temsilcilbl.setToolTipText("");
        temsilcilbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                move(evt);
            }
        });

        javax.swing.GroupLayout temsilciLayout = new javax.swing.GroupLayout(temsilci);
        temsilci.setLayout(temsilciLayout);
        temsilciLayout.setHorizontalGroup(
            temsilciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(temsilciLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(temsilcilbl, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        temsilciLayout.setVerticalGroup(
            temsilciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, temsilciLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(temsilcilbl, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        musteri.setBackground(new java.awt.Color(0, 51, 51));
        musteri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                musteriMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                musterimouseEnter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                musterimouseExit(evt);
            }
        });

        musterilbl.setBackground(new java.awt.Color(255, 255, 255));
        musterilbl.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        musterilbl.setForeground(new java.awt.Color(204, 204, 204));
        musterilbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/images/people.png"))); // NOI18N
        musterilbl.setText("        Müşteri  Girişi");

        javax.swing.GroupLayout musteriLayout = new javax.swing.GroupLayout(musteri);
        musteri.setLayout(musteriLayout);
        musteriLayout.setHorizontalGroup(
            musteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(musteriLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(musterilbl, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        musteriLayout.setVerticalGroup(
            musteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(musteriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(musterilbl, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(musteri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mudur, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(temsilci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(mudur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(temsilci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(musteri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 51, 51));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/images/logout.png"))); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(846, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_exitMouseClicked

    private void move(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_move
      this.musterilbl.setBackground(Color.BLACK);
    }//GEN-LAST:event_move

    private void mudurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mudurMouseClicked
        
        new YoneticiLogin().setVisible(true);
    }//GEN-LAST:event_mudurMouseClicked

    private void temsilciMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_temsilciMouseClicked
        new TemsilciLogin().setVisible(true);
    }//GEN-LAST:event_temsilciMouseClicked

    private void musteriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musteriMouseClicked
        new MusteriLogin().setVisible(true);
    }//GEN-LAST:event_musteriMouseClicked

    private void musterimouseEnter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musterimouseEnter
        this.musteri.setBackground(Color.LIGHT_GRAY);
        this.musterilbl.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_musterimouseEnter

    private void musterimouseExit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musterimouseExit
        this.musteri.setBackground(defaultcolor);
        this.musterilbl.setForeground(Color.getHSBColor(204,204,204));
    }//GEN-LAST:event_musterimouseExit

    private void temsilciMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_temsilciMouseEntered
        this.temsilci.setBackground(Color.LIGHT_GRAY);
        this.temsilcilbl.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_temsilciMouseEntered

    private void temsilciMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_temsilciMouseExited
        this.temsilci.setBackground(defaultcolor);
        this.temsilcilbl.setForeground(Color.getHSBColor(204,204,204));
    }//GEN-LAST:event_temsilciMouseExited

    private void mudurMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mudurMouseEntered
        this.mudur.setBackground(Color.LIGHT_GRAY);
        this.mudurlbl.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_mudurMouseEntered

    private void mudurMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mudurMouseExited
        this.mudur.setBackground(defaultcolor);
        this.mudurlbl.setForeground(Color.getHSBColor(204,204,204));
    }//GEN-LAST:event_mudurMouseExited
    
    
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
            java.util.logging.Logger.getLogger(BankaSistemi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankaSistemi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankaSistemi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankaSistemi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankaSistemi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel mudur;
    private javax.swing.JLabel mudurlbl;
    private javax.swing.JPanel musteri;
    private javax.swing.JLabel musterilbl;
    private javax.swing.JPanel temsilci;
    private javax.swing.JLabel temsilcilbl;
    // End of variables declaration//GEN-END:variables
}
