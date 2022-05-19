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
import javax.swing.JOptionPane;
/**
 *
 * @author Pelin
 */
public class MusteriGuncelle extends javax.swing.JFrame {
    int temsilci_id;

    /**
     * Creates new form MusteriGuncelle
     */
    public MusteriGuncelle() {
        //initComponents();
    }
    public MusteriGuncelle(int temsilci_id) {
        this.temsilci_id=temsilci_id;
        
        initComponents();
        try {
	 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankasistemi", "root", "123");
	          PreparedStatement st = (PreparedStatement) connection
	        		    .prepareStatement("Select *from musteriler where TemsilciId=?");
	            st.setString(1, String.valueOf(temsilci_id));
	            ResultSet rs = st.executeQuery();
	          while (rs.next()) {
	          	String musteri = rs.getString("MusteriId");
	          	musteri_id.addItem(musteri);
                        
	          }
	      } catch (SQLException sqlException) {
	          sqlException.printStackTrace();
	      }
       

      
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guncelpanel = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        iptal = new javax.swing.JToggleButton();
        label2 = new java.awt.Label();
        guncelle = new javax.swing.JToggleButton();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        txttc = new javax.swing.JTextField();
        txtadres = new javax.swing.JTextField();
        txteposta = new javax.swing.JTextField();
        txtadsoyad = new javax.swing.JTextField();
        txttelefon = new javax.swing.JTextField();
        label6 = new java.awt.Label();
        musteri_id = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(423, 130));
        setUndecorated(true);

        guncelpanel.setPreferredSize(new java.awt.Dimension(640, 380));

        label1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label1.setText("Ad Soyad :");

        iptal.setBackground(new java.awt.Color(51, 0, 0));
        iptal.setForeground(new java.awt.Color(204, 204, 204));
        iptal.setText("VAZGEÇ");
        iptal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iptal(evt);
            }
        });

        label2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label2.setText("Telefon :");

        guncelle.setBackground(new java.awt.Color(0, 0, 51));
        guncelle.setForeground(new java.awt.Color(204, 204, 204));
        guncelle.setText("GÜNCELLE");
        guncelle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guncelleMouseClicked(evt);
            }
        });

        label3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label3.setText("TC  :");

        label4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label4.setText("Adres :");

        label5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label5.setText("E-posta  :");

        label6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label6.setText("Musteri ID :");

        javax.swing.GroupLayout guncelpanelLayout = new javax.swing.GroupLayout(guncelpanel);
        guncelpanel.setLayout(guncelpanelLayout);
        guncelpanelLayout.setHorizontalGroup(
            guncelpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guncelpanelLayout.createSequentialGroup()
                .addGroup(guncelpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(guncelpanelLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(guncelpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(guncelpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttc)
                            .addComponent(txtadres)
                            .addComponent(txteposta, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guncelpanelLayout.createSequentialGroup()
                        .addGroup(guncelpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(guncelpanelLayout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(guncelpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(guncelpanelLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(iptal, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8)
                        .addGroup(guncelpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(guncelpanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 241, Short.MAX_VALUE)
                                .addComponent(guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(guncelpanelLayout.createSequentialGroup()
                                .addGap(241, 241, 241)
                                .addGroup(guncelpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtadsoyad)
                                    .addComponent(txttelefon, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(musteri_id, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(108, 108, 108))
        );
        guncelpanelLayout.setVerticalGroup(
            guncelpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guncelpanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(guncelpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(musteri_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(guncelpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtadsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(guncelpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guncelpanelLayout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guncelpanelLayout.createSequentialGroup()
                        .addComponent(txttelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txttc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(guncelpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtadres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(guncelpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txteposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(guncelpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iptal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );

        jSeparator4.setForeground(new java.awt.Color(51, 0, 0));

        jSeparator5.setForeground(new java.awt.Color(51, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 905, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(guncelpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(guncelpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iptal(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iptal
        dispose();
        new TemsilciSecenek(this.temsilci_id).setVisible(true);
    }//GEN-LAST:event_iptal
    
    private void guncelleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guncelleMouseClicked
       
          try {
		 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankasistemi", "root", "123");
	          PreparedStatement st = (PreparedStatement) connection
	        		    .prepareStatement("Select *from musteriler where MusteriId=?");
	            st.setInt(1, Integer.parseInt((String) musteri_id.getSelectedItem()));
	            ResultSet rs2 = st.executeQuery();
	          while (rs2.next()) {
                       
		            //Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankasistemi", "root", "123");
		            String query = "update musteriler set AdSoyad = ?,Telefon=?,Tc=?,Adres=?,Eposta=? where MusteriId = ?";
		            PreparedStatement preparedStmt = connection.prepareStatement(query);
		            preparedStmt.setString(1, txtadsoyad.getText());
		            preparedStmt.setString(2, txttelefon.getText());
		            preparedStmt.setString(3, txttc.getText());
		            preparedStmt.setString(4, txtadres.getText());
		            preparedStmt.setString(5, txteposta.getText());
		            preparedStmt.setInt(6, Integer.parseInt((String) musteri_id.getSelectedItem()));
		            preparedStmt.executeUpdate();
	                   
	          }
                   connection.close();
                   JOptionPane.showMessageDialog(null, "Güncellendi");
	           dispose();
                   new MusteriGuncelle(this.temsilci_id).setVisible(true);
	      } catch (SQLException sqlException) {
	          sqlException.printStackTrace();
	      }
    
              
    }//GEN-LAST:event_guncelleMouseClicked

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
            java.util.logging.Logger.getLogger(MusteriGuncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusteriGuncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusteriGuncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusteriGuncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusteriGuncelle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton guncelle;
    private javax.swing.JPanel guncelpanel;
    private javax.swing.JToggleButton iptal;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private javax.swing.JComboBox<String> musteri_id;
    private javax.swing.JTextField txtadres;
    private javax.swing.JTextField txtadsoyad;
    private javax.swing.JTextField txteposta;
    private javax.swing.JTextField txttc;
    private javax.swing.JTextField txttelefon;
    // End of variables declaration//GEN-END:variables
}
