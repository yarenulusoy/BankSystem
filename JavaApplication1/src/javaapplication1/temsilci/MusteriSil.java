/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1.temsilci;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javaapplication1.TemsilciSecenek;
import javaapplication1.musteriHesapSil;
import javax.swing.JOptionPane;

/**
 *
 * @author Pelin
 */
public class MusteriSil extends javax.swing.JFrame {
     int temsilci_id;
    /**
     * Creates new form MusteriSil
     */
    public MusteriSil() {
       
       // initComponents();
    }
     public MusteriSil(int temsilci_id) {
        this.temsilci_id=temsilci_id;
        initComponents();
         try {
	 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankasistemi", "root", "123");
	          PreparedStatement st = (PreparedStatement) connection
	        		    .prepareStatement("Select *from musteriler where TemsilciId=?");
	            st.setString(1, String.valueOf(temsilci_id));
	            ResultSet rs = st.executeQuery();
	          while (rs.next()) {
	          	int musteri = rs.getInt("MusteriId");
	          	musteri_id.addItem(String.valueOf(musteri));
                        
	          }
                  connection.close();
	      } catch (SQLException sqlException) {
	          sqlException.printStackTrace();
	      }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        iptal = new javax.swing.JToggleButton();
        silbtn = new javax.swing.JToggleButton();
        musteri_id = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        ad = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(423, 130));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(905, 650));

        panel.setPreferredSize(new java.awt.Dimension(640, 380));

        label1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label1.setText("Müsteri ID :");

        iptal.setBackground(new java.awt.Color(51, 0, 0));
        iptal.setForeground(new java.awt.Color(204, 204, 204));
        iptal.setText("İPTAL");
        iptal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iptal(evt);
            }
        });

        silbtn.setBackground(new java.awt.Color(0, 0, 51));
        silbtn.setForeground(new java.awt.Color(204, 204, 204));
        silbtn.setText("SİL");
        silbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                silbtnMouseClicked(evt);
            }
        });

        musteri_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musteri_idActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Musteri Ad Soyad :");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(iptal, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(240, 240, 240)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(musteri_id, 0, 125, Short.MAX_VALUE)
                    .addComponent(silbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ad))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(musteri_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iptal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(silbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        label1.getAccessibleContext().setAccessibleName("");

        jSeparator5.setForeground(new java.awt.Color(51, 0, 0));

        jSeparator6.setForeground(new java.awt.Color(51, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 939, Short.MAX_VALUE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.DEFAULT_SIZE, 939, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iptal(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iptal
       dispose();
       new TemsilciSecenek(this.temsilci_id).setVisible(true);
       
    }//GEN-LAST:event_iptal

    private void silbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_silbtnMouseClicked
     
        try
        {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankasistemi", "root", "123");
            PreparedStatement st = connection.prepareStatement("Select * from hesaplar where MusteriId=?");
            st.setInt(1, Integer.parseInt(String.valueOf(musteri_id.getSelectedItem())));
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
               // double bakiye = rs.getDouble("Bakiye");
                int hesapid=rs.getInt("HesapId");
                
                     PreparedStatement st3 = connection.prepareStatement("delete k.* from kredi_talep  k inner join hesaplar h ON  k.HesapId=h.HesapId where h. HesapId = ?");
                    st3.setInt(1, hesapid);
                    st3.execute();
                    
                    PreparedStatement st4 = connection.prepareStatement("delete g.* from geneldurum g inner join hesaplar  h  ON g.HesapId=h.HesapId  where h. HesapId = ?  ");
                    st4.setInt(1, hesapid);
                    st4.execute();
                    
                    
                    
                    
                    PreparedStatement st2 = connection.prepareStatement("delete h from hesaplar h where h. HesapId = ? and h.MusteriId=?");
                    st2.setInt(1, hesapid);
                    st2.setInt(2, Integer.parseInt(String.valueOf(musteri_id.getSelectedItem())));
                    st2.execute();
                    
                    PreparedStatement st1 = connection.prepareStatement("delete m from musteriler m where m.MusteriId=?");
                    st1.setInt(1, Integer.parseInt(String.valueOf(musteri_id.getSelectedItem())));
                    st1.execute();
                    
                

                
               
               
            }
            connection.close();
            JOptionPane.showMessageDialog(null, "Hesap Silindi");
                dispose();
                new MusteriSil(this.temsilci_id).setVisible(true);
        }
        catch (SQLException  ex) {
            System.out.print(ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_silbtnMouseClicked

    private void musteri_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musteri_idActionPerformed
       try {
	 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankasistemi", "root", "123");
	          PreparedStatement st = (PreparedStatement) connection
	        		    .prepareStatement("Select *from musteriler where MusteriId=?");
	            st.setString(1, String.valueOf(musteri_id.getSelectedItem()));
	            ResultSet rs = st.executeQuery();
	          while (rs.next()) {
	          	String musteriAd = rs.getString("AdSoyad");
	          	ad.setText(musteriAd);
                        
	          }
                  connection.close();
	      } catch (SQLException sqlException) {
	          sqlException.printStackTrace();
	      }
    }//GEN-LAST:event_musteri_idActionPerformed

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
            java.util.logging.Logger.getLogger(MusteriSil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusteriSil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusteriSil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusteriSil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusteriSil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad;
    private javax.swing.JToggleButton iptal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private java.awt.Label label1;
    private javax.swing.JComboBox<String> musteri_id;
    private javax.swing.JPanel panel;
    private javax.swing.JToggleButton silbtn;
    // End of variables declaration//GEN-END:variables
}
