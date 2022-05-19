/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1.temsilci;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javaapplication1.TemsilciSecenek;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pelin
 */
public class MusteriIslemGoruntule extends javax.swing.JFrame {
    int temsilci_id;
    DefaultTableModel tblModel;
    /**
     * Creates new form MusteriIslemGoruntule
     */
    public MusteriIslemGoruntule() {
       // initComponents();
    }
    public MusteriIslemGoruntule(int temsilci_id) {
        this.temsilci_id=temsilci_id;
        initComponents();
        
        this.tblModel=(DefaultTableModel)tableModel.getModel();
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
	      } catch (SQLException sqlException) {
	          sqlException.printStackTrace();
	      }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guncelpanel = new javax.swing.JPanel();
        label6 = new java.awt.Label();
        musteri_id = new javax.swing.JComboBox<>();
        geneldurumtable = new javax.swing.JScrollPane();
        tableModel = new javax.swing.JTable();
        goster = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        musteriAd = new javax.swing.JTextField();
        kapat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(423, 130));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(905, 650));

        guncelpanel.setPreferredSize(new java.awt.Dimension(640, 380));

        label6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label6.setForeground(new java.awt.Color(255, 153, 102));
        label6.setText("Musteri ID :");

        musteri_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musteri_idActionPerformed(evt);
            }
        });

        tableModel.setAutoCreateRowSorter(true);
        tableModel.setBackground(new java.awt.Color(228, 228, 250));
        tableModel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tableModel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "İşlem Ad", "Kaynak Hesap", "Hedef Hesap", "Tutar", "Kaynak Bakiye", "Hedef Bakiye", "Tarih", "Hesap ID "
            }
        ));
        tableModel.setRowHeight(40);
        geneldurumtable.setViewportView(tableModel);

        goster.setBackground(new java.awt.Color(255, 204, 153));
        goster.setForeground(new java.awt.Color(255, 51, 0));
        goster.setText("Göster");
        goster.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gosterMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 102));
        jLabel1.setText("Musteri Ad Soyad :");

        javax.swing.GroupLayout guncelpanelLayout = new javax.swing.GroupLayout(guncelpanel);
        guncelpanel.setLayout(guncelpanelLayout);
        guncelpanelLayout.setHorizontalGroup(
            guncelpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guncelpanelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(guncelpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(269, 269, 269)
                .addGroup(guncelpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(musteriAd)
                    .addComponent(musteri_id, 0, 324, Short.MAX_VALUE))
                .addGap(100, 100, 100))
            .addGroup(guncelpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(geneldurumtable, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guncelpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(goster, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        guncelpanelLayout.setVerticalGroup(
            guncelpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guncelpanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(guncelpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(musteri_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(guncelpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(guncelpanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1))
                    .addGroup(guncelpanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(musteriAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(geneldurumtable, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(goster, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        kapat.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        kapat.setForeground(new java.awt.Color(255, 153, 102));
        kapat.setText("X");
        kapat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kapatMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kapat, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(guncelpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kapat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(guncelpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void musteri_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musteri_idActionPerformed

        for(int i=0;i<tblModel.getRowCount();i++){
            tblModel.removeRow(i);
        }

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankasistemi", "root", "123");
            PreparedStatement st = (PreparedStatement) connection
            .prepareStatement("Select *from musteriler where MusteriId=?");
            st.setInt(1, Integer.parseInt((String) musteri_id.getSelectedItem()));
            ResultSet rs2 = st.executeQuery();
            while (rs2.next()) {
                String ad=rs2.getString("AdSoyad");
                musteriAd.setText(ad);

            }

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

    }//GEN-LAST:event_musteri_idActionPerformed

    private void gosterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gosterMouseClicked
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankasistemi", "root", "123");
            PreparedStatement st = (PreparedStatement) connection
            .prepareStatement("Select *from islemler i inner join  hesaplar h ON i.HesapId=h.HesapId where h.MusteriId=?");
            st.setInt(1, Integer.parseInt(String.valueOf(musteri_id.getSelectedItem())));
            ResultSet rs2 = st.executeQuery();
            while (rs2.next()) {
                String kaynakhesap=rs2.getString("KaynakHesap");
                String hedefhesap=rs2.getString("HedefHesap");
                String islemad=rs2.getString("IslemAd");
                int tutar=rs2.getInt("Tutar");
                int kaynakbakiye=rs2.getInt("KaynakBakiye");
                int hedefbakiye=rs2.getInt("HedefBakiye");
                Date tarih=rs2.getDate("Tarih");
                int hesapid=rs2.getInt("HesapId");
                
                

                String data[]={String.valueOf(islemad),String.valueOf(kaynakhesap),String.valueOf(hedefhesap),
                    String.valueOf(tutar),String.valueOf(kaynakbakiye),String.valueOf(hedefbakiye),String.valueOf(tarih),String.valueOf(hesapid)};
                DefaultTableModel tblModel=(DefaultTableModel)tableModel.getModel();
                tblModel.addRow(data);

            }
        
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }//GEN-LAST:event_gosterMouseClicked

    private void kapatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kapatMouseClicked
        dispose();
        new TemsilciSecenek(this.temsilci_id).setVisible(true);
    }//GEN-LAST:event_kapatMouseClicked

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
            java.util.logging.Logger.getLogger(MusteriIslemGoruntule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusteriIslemGoruntule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusteriIslemGoruntule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusteriIslemGoruntule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusteriIslemGoruntule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane geneldurumtable;
    private javax.swing.JButton goster;
    private javax.swing.JPanel guncelpanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel kapat;
    private java.awt.Label label6;
    private javax.swing.JTextField musteriAd;
    private javax.swing.JComboBox<String> musteri_id;
    private javax.swing.JTable tableModel;
    // End of variables declaration//GEN-END:variables
}
