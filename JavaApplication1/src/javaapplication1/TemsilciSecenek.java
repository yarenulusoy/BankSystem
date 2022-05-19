/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

import java.awt.Color;
import java.awt.Font;
import javaapplication1.temsilci.MusteriGenelDurumGoruntule;
import javaapplication1.temsilci.MusteriGuncelle;
import javaapplication1.temsilci.MusteriIslemGoruntule;
import javaapplication1.temsilci.MusteriSil;
import javaapplication1.temsilci.Talepler;
import javaapplication1.temsilci.TemsilciMusteriEkle;

/**
 *
 * @author Pelin
 */
public class TemsilciSecenek extends javax.swing.JFrame {
   Color custom=new Color(204,204,204);
   Color changefont=Color.DARK_GRAY;
   Color changeback=Color.LIGHT_GRAY;
   Color fontcolor=new Color(51,51,51);
   Color exitcolor=new Color(255,153,0);
   Font newfont=new Font("Segoe UI ", Font.BOLD, 19);
   Font oldfont=new Font("Segoe UI ", Font.PLAIN, 18);
    int temsilci_id;
    /**
     * Creates new form TemsilciSecenek
     */
    public TemsilciSecenek() {
       // initComponents();
    }
    public TemsilciSecenek(int temsilci_id) {
        this.temsilci_id=temsilci_id;
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        musteriIslem = new java.awt.Panel();
        jLabel17 = new javax.swing.JLabel();
        talepGoruntule = new java.awt.Panel();
        jLabel18 = new javax.swing.JLabel();
        musteriGenelDurum = new java.awt.Panel();
        jLabel19 = new javax.swing.JLabel();
        musteriGuncelle = new java.awt.Panel();
        jLabel20 = new javax.swing.JLabel();
        musteriSil = new java.awt.Panel();
        jLabel21 = new javax.swing.JLabel();
        musteriEkle = new java.awt.Panel();
        jLabel22 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(423, 130));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(905, 650));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(905, 650));

        musteriIslem.setBackground(new java.awt.Color(204, 204, 204));
        musteriIslem.setPreferredSize(new java.awt.Dimension(905, 80));
        musteriIslem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                musteriIslemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                musteriIslemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                musteriIslemMouseExited(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/images/right-arrow.png"))); // NOI18N
        jLabel17.setText("  Müşteri İşlemlerini Görüntüle");

        javax.swing.GroupLayout musteriIslemLayout = new javax.swing.GroupLayout(musteriIslem);
        musteriIslem.setLayout(musteriIslemLayout);
        musteriIslemLayout.setHorizontalGroup(
            musteriIslemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(musteriIslemLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel17)
                .addContainerGap(665, Short.MAX_VALUE))
        );
        musteriIslemLayout.setVerticalGroup(
            musteriIslemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(musteriIslemLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel17)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        talepGoruntule.setBackground(new java.awt.Color(204, 204, 204));
        talepGoruntule.setPreferredSize(new java.awt.Dimension(905, 80));
        talepGoruntule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                talepGoruntuleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                talepGoruntuleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                talepGoruntuleMouseExited(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/images/right-arrow.png"))); // NOI18N
        jLabel18.setText("  Talep Görüntüleme ve Onaylama");

        javax.swing.GroupLayout talepGoruntuleLayout = new javax.swing.GroupLayout(talepGoruntule);
        talepGoruntule.setLayout(talepGoruntuleLayout);
        talepGoruntuleLayout.setHorizontalGroup(
            talepGoruntuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(talepGoruntuleLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        talepGoruntuleLayout.setVerticalGroup(
            talepGoruntuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(talepGoruntuleLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel18)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        musteriGenelDurum.setBackground(new java.awt.Color(204, 204, 204));
        musteriGenelDurum.setPreferredSize(new java.awt.Dimension(905, 80));
        musteriGenelDurum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                musteriGenelDurumMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                musteriGenelDurumMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                musteriGenelDurumMouseExited(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/images/right-arrow.png"))); // NOI18N
        jLabel19.setText("  Müşteri Genel Durum Görüntüle");
        jLabel19.setToolTipText("");

        javax.swing.GroupLayout musteriGenelDurumLayout = new javax.swing.GroupLayout(musteriGenelDurum);
        musteriGenelDurum.setLayout(musteriGenelDurumLayout);
        musteriGenelDurumLayout.setHorizontalGroup(
            musteriGenelDurumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(musteriGenelDurumLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        musteriGenelDurumLayout.setVerticalGroup(
            musteriGenelDurumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(musteriGenelDurumLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        musteriGuncelle.setBackground(new java.awt.Color(204, 204, 204));
        musteriGuncelle.setPreferredSize(new java.awt.Dimension(905, 80));
        musteriGuncelle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                musteriGuncelleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                musteriGuncelleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                musteriGuncelleMouseExited(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/images/right-arrow.png"))); // NOI18N
        jLabel20.setText("  Müşteri Güncelle");

        javax.swing.GroupLayout musteriGuncelleLayout = new javax.swing.GroupLayout(musteriGuncelle);
        musteriGuncelle.setLayout(musteriGuncelleLayout);
        musteriGuncelleLayout.setHorizontalGroup(
            musteriGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(musteriGuncelleLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        musteriGuncelleLayout.setVerticalGroup(
            musteriGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(musteriGuncelleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );

        musteriSil.setBackground(new java.awt.Color(204, 204, 204));
        musteriSil.setPreferredSize(new java.awt.Dimension(905, 80));
        musteriSil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                musteriSilMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                musteriSilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                musteriSilMouseExited(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/images/right-arrow.png"))); // NOI18N
        jLabel21.setText("  Müşteri Sil");

        javax.swing.GroupLayout musteriSilLayout = new javax.swing.GroupLayout(musteriSil);
        musteriSil.setLayout(musteriSilLayout);
        musteriSilLayout.setHorizontalGroup(
            musteriSilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(musteriSilLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        musteriSilLayout.setVerticalGroup(
            musteriSilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(musteriSilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );

        musteriEkle.setBackground(new java.awt.Color(204, 204, 204));
        musteriEkle.setPreferredSize(new java.awt.Dimension(905, 80));
        musteriEkle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                musteriEkleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                musteriEkleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                musteriEkleMouseExited(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/images/right-arrow.png"))); // NOI18N
        jLabel22.setText("  Müşteri Ekle");

        javax.swing.GroupLayout musteriEkleLayout = new javax.swing.GroupLayout(musteriEkle);
        musteriEkle.setLayout(musteriEkleLayout);
        musteriEkleLayout.setHorizontalGroup(
            musteriEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(musteriEkleLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        musteriEkleLayout.setVerticalGroup(
            musteriEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, musteriEkleLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        exit.setBackground(new java.awt.Color(51, 51, 255));
        exit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 153, 0));
        exit.setText("X");
        exit.setToolTipText("");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(musteriEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(musteriSil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(musteriGuncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(musteriGenelDurum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(talepGoruntule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(musteriIslem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(exit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(musteriEkle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(musteriSil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(musteriGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(musteriGenelDurum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(talepGoruntule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(musteriIslem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        this.exit.setForeground(exitcolor);
    }//GEN-LAST:event_exitMouseExited

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered

        this.exit.setForeground(Color.getHSBColor(54, 54, 54));
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void musteriEkleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musteriEkleMouseExited
        this.musteriEkle.setBackground(custom);
        this.jLabel22.setForeground(fontcolor);
        this.jLabel22.setFont(oldfont);
    }//GEN-LAST:event_musteriEkleMouseExited

    private void musteriEkleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musteriEkleMouseEntered
        this.musteriEkle.setBackground(changeback);
        this.jLabel22.setForeground(changefont);
        this.jLabel22.setFont(newfont);
    }//GEN-LAST:event_musteriEkleMouseEntered

    private void musteriEkleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musteriEkleMouseClicked
        dispose();
        new TemsilciMusteriEkle(this.temsilci_id).setVisible(true);
    }//GEN-LAST:event_musteriEkleMouseClicked

    private void musteriSilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musteriSilMouseExited
        this.musteriSil.setBackground(custom);
        this.jLabel21.setForeground(fontcolor);
        this.jLabel21.setFont(oldfont);
    }//GEN-LAST:event_musteriSilMouseExited

    private void musteriSilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musteriSilMouseEntered
        this.musteriSil.setBackground(changeback);
        this.jLabel21.setForeground(changefont);
        this.jLabel21.setFont(newfont);
    }//GEN-LAST:event_musteriSilMouseEntered

    private void musteriSilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musteriSilMouseClicked
        dispose();
        new MusteriSil(this.temsilci_id).setVisible(true);
    }//GEN-LAST:event_musteriSilMouseClicked

    private void musteriGuncelleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musteriGuncelleMouseExited
        this.musteriGuncelle.setBackground(custom);
        this.jLabel20.setForeground(fontcolor);
        this.jLabel20.setFont(oldfont);
    }//GEN-LAST:event_musteriGuncelleMouseExited

    private void musteriGuncelleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musteriGuncelleMouseEntered
        this.musteriGuncelle.setBackground(changeback);
        this.jLabel20.setForeground(changefont);
        this.jLabel20.setFont(newfont);
    }//GEN-LAST:event_musteriGuncelleMouseEntered

    private void musteriGuncelleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musteriGuncelleMouseClicked
        dispose();
        new MusteriGuncelle(this.temsilci_id).setVisible(true);
    }//GEN-LAST:event_musteriGuncelleMouseClicked

    private void musteriGenelDurumMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musteriGenelDurumMouseExited
        this.musteriGenelDurum.setBackground(custom);
        this.jLabel19.setForeground(fontcolor);
        this.jLabel19.setFont(oldfont);
    }//GEN-LAST:event_musteriGenelDurumMouseExited

    private void musteriGenelDurumMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musteriGenelDurumMouseEntered
        this.musteriGenelDurum.setBackground(changeback);
        this.jLabel19.setForeground(changefont);
        this.jLabel19.setFont(newfont);
    }//GEN-LAST:event_musteriGenelDurumMouseEntered

    private void musteriGenelDurumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musteriGenelDurumMouseClicked
       dispose();
       new MusteriGenelDurumGoruntule(this.temsilci_id).setVisible(true); 
    }//GEN-LAST:event_musteriGenelDurumMouseClicked

    private void talepGoruntuleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_talepGoruntuleMouseExited
        this.talepGoruntule.setBackground(custom);
        this.jLabel18.setForeground(fontcolor);
        this.jLabel18.setFont(oldfont);
    }//GEN-LAST:event_talepGoruntuleMouseExited

    private void talepGoruntuleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_talepGoruntuleMouseEntered
        this.talepGoruntule.setBackground(changeback);
        this.jLabel18.setForeground(changefont);
        this.jLabel18.setFont(newfont);
    }//GEN-LAST:event_talepGoruntuleMouseEntered

    private void talepGoruntuleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_talepGoruntuleMouseClicked
        dispose();
        new Talepler(this.temsilci_id).setVisible(true);
    }//GEN-LAST:event_talepGoruntuleMouseClicked

    private void musteriIslemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musteriIslemMouseExited
        this.musteriIslem.setBackground(custom);
        this.jLabel17.setForeground(fontcolor);
        this.jLabel17.setFont(oldfont);
    }//GEN-LAST:event_musteriIslemMouseExited

    private void musteriIslemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musteriIslemMouseEntered
        this.musteriIslem.setBackground(changeback);
        this.jLabel17.setForeground(changefont);
        this.jLabel17.setFont(newfont);
    }//GEN-LAST:event_musteriIslemMouseEntered

    private void musteriIslemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musteriIslemMouseClicked
        dispose();
        new MusteriIslemGoruntule(this.temsilci_id).setVisible(true);
            
    }//GEN-LAST:event_musteriIslemMouseClicked
    
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
            java.util.logging.Logger.getLogger(TemsilciSecenek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TemsilciSecenek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TemsilciSecenek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TemsilciSecenek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TemsilciSecenek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel3;
    private java.awt.Panel musteriEkle;
    private java.awt.Panel musteriGenelDurum;
    private java.awt.Panel musteriGuncelle;
    private java.awt.Panel musteriIslem;
    private java.awt.Panel musteriSil;
    private java.awt.Panel talepGoruntule;
    // End of variables declaration//GEN-END:variables
}
