/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Pelin
 */
public class musteriHesabaTransfer extends javax.swing.JFrame {
    int musteri_id;
    boolean guncelle=false;
    int gonderen_hesapid;
    int gonderilen_hesapid;
    /**
     * Creates new form musteriParaTransfer
     */
    public musteriHesabaTransfer() {
        initComponents();
        
    }
    public musteriHesabaTransfer(int musteri_id) {
        initComponents();
        this.musteri_id=musteri_id;
         try {
	          Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankasistemi", "root", "123");
	          PreparedStatement st = (PreparedStatement) connection
	              .prepareStatement("Select *from Musteriler where MusteriId = ?");
	          st.setInt(1, this.musteri_id);
	          ResultSet rs = st.executeQuery();
	          while (rs.next()) {
	          	String gonderen_kisi = rs.getString("AdSoyad");
	          	gonderenAd.setText(gonderen_kisi);
	          }
                   PreparedStatement st3 = (PreparedStatement) connection
		   .prepareStatement("Select *from hesaplar where MusteriId = ? and HesapOnay=1");
		     st3.setInt(1, this.musteri_id);
		   ResultSet rs3 = st3.executeQuery();
		      while (rs3.next()) {
		       String hesaplar = rs3.getString("HesapAd");
		         gonderenHesap.addItem(hesaplar);
		          }
	          
	          PreparedStatement st2 = (PreparedStatement) connection
		              .prepareStatement("Select *from musteriler where MusteriId !=?  ");
	          st2.setInt(1, this.musteri_id);
	          ResultSet rs2 = st2.executeQuery();
	          while (rs2.next()) {
	          	String gonderilen_Ad = rs2.getString("AdSoyad");
	          	gonderilenAd.addItem(String.valueOf(gonderilen_Ad)); 
                        
	          }
	          
	         
	          connection.close();
	      } catch (SQLException sqlException) {
	          sqlException.printStackTrace();
	      } 
            
    }

   
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        transfer = new javax.swing.JPanel();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        gonderenAd = new java.awt.TextField();
        iptal = new javax.swing.JToggleButton();
        transfer_onayla = new javax.swing.JToggleButton();
        label6 = new java.awt.Label();
        tutar = new java.awt.TextField();
        label7 = new java.awt.Label();
        gonderenHesap = new javax.swing.JComboBox<>();
        gonderilenHesap = new javax.swing.JComboBox<>();
        gonderilenAd = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(423, 130));
        setUndecorated(true);

        transfer.setPreferredSize(new java.awt.Dimension(640, 380));

        label3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label3.setText("Gönderen Kişi  :");

        label4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label4.setText("Gönderilen Kişi  :");

        label5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label5.setText("Gönderilen Kişi Hesap Ad :");

        iptal.setBackground(new java.awt.Color(51, 0, 0));
        iptal.setForeground(new java.awt.Color(204, 204, 204));
        iptal.setText("İPTAL");
        iptal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iptal(evt);
            }
        });

        transfer_onayla.setBackground(new java.awt.Color(0, 0, 51));
        transfer_onayla.setForeground(new java.awt.Color(204, 204, 204));
        transfer_onayla.setText("ONAYLA");
        transfer_onayla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transfer_onaylaMouseClicked(evt);
            }
        });

        label6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label6.setText("Miktar");

        label7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label7.setText("Gönderen Kişi Hesap Adı :");

        gonderenHesap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gonderenHesapActionPerformed(evt);
            }
        });

        gonderilenHesap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gonderilenHesapActionPerformed(evt);
            }
        });

        gonderilenAd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gonderilenAdMouseClicked(evt);
            }
        });
        gonderilenAd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gonderilenAdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout transferLayout = new javax.swing.GroupLayout(transfer);
        transfer.setLayout(transferLayout);
        transferLayout.setHorizontalGroup(
            transferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transferLayout.createSequentialGroup()
                .addGroup(transferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transferLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(transferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(transferLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(iptal, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(transferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transferLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(transferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gonderenAd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gonderenHesap, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tutar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gonderilenHesap, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gonderilenAd, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transferLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transfer_onayla, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        transferLayout.setVerticalGroup(
            transferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transferLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(transferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gonderenAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(transferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gonderenHesap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(transferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gonderilenAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(transferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gonderilenHesap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(transferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tutar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(transferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transfer_onayla, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iptal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addComponent(transfer, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(transfer, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iptal(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iptal
     dispose();
     new MusteriSecenek(this.musteri_id).setVisible(true);
    }//GEN-LAST:event_iptal

    private void transfer_onaylaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transfer_onaylaMouseClicked
        LocalDate tarih = LocalDate.now(); 
        if(String.valueOf(tutar.getText())==null){
            JOptionPane.showMessageDialog(null, "Lütfen Gönderilecek Para Miktarını Giriniz"); 
        }else{
            try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankasistemi", "root", "123");
            PreparedStatement st = connection.prepareStatement("select *from hesaplar where HesapAd=? and MusteriId = ?");
            st.setString(1, String.valueOf(gonderenHesap.getSelectedItem()));
            st.setInt(2, musteri_id);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                double bakiye = rs.getDouble("Bakiye");
                int hesapid = rs.getInt("HesapId");
                int hesapTurId = rs.getInt("HesapTurId");
                String kaynakhesapAd = String.valueOf(gonderenHesap.getSelectedItem()); 
                PreparedStatement st2 = connection.prepareStatement("update hesaplar set Bakiye = ? where HesapAd=? and MusteriId = ?");
                st2.setDouble(1, (bakiye-Double.parseDouble(tutar.getText())));
                st2.setString(2, String.valueOf(gonderenHesap.getSelectedItem()));
                st2.setInt(3, musteri_id);

                st2.executeUpdate();

                PreparedStatement st3 = connection.prepareStatement("select *from hesap_turu where HesapTurId=?");
                st3.setInt(1, hesapTurId);
                ResultSet rs3 = st3.executeQuery();
                if (rs3.next()) {
                    double kur = rs3.getDouble("KurMiktar");

                    PreparedStatement st4 = connection.prepareStatement("select *from hesaplar where HesapAd=? and MusteriId =  (select MusteriId from musteriler where AdSoyad=?)");
                    st4.setString(1, String.valueOf(gonderilenHesap.getSelectedItem()));
                    st4.setString(2, String.valueOf(gonderilenAd.getSelectedItem()));

                    ResultSet rs4 = st4.executeQuery();
                    if (rs4.next()) {
                        double bakiye2 = rs4.getDouble("Bakiye");
                        int hesapTurId2 = rs4.getInt("HesapTurId");
                        int gonderilenMusteriId=rs4.getInt("MusteriId");
                        String hedefhesapAd=rs4.getString("HesapAd");
                        PreparedStatement st5 = connection.prepareStatement("select *from hesap_turu where HesapTurId=?");
                        st5.setInt(1, hesapTurId2);
                        ResultSet rs5 = st5.executeQuery();
                        if (rs5.next()) {
                            double kur2 = rs5.getDouble("KurMiktar");
                            PreparedStatement st6 = connection.prepareStatement("update hesaplar set Bakiye = ? where HesapAd=? and MusteriId =  (select MusteriId from musteriler where AdSoyad=?)");
                            double kurHesapla=((kur*(Double.parseDouble(tutar.getText())))/kur2);
                            st6.setDouble(1, (bakiye2+(kur*(Double.parseDouble(tutar.getText())))/kur2));
                            st6.setString(2, String.valueOf(gonderilenHesap.getSelectedItem()));
                            st6.setString(3, String.valueOf(gonderilenAd.getSelectedItem()));
                            st6.executeUpdate();
                            PreparedStatement st7 = connection.prepareStatement("select AdSoyad from musteriler where  MusteriId = ? ");
		            st7.setInt(1, gonderilenMusteriId);
		            ResultSet rs7 = st7.executeQuery();
                            if(rs7.next()) {
                            String islem="Para Gonderme";
                            String query="INSERT INTO islemler(KaynakHesap,HedefHesap,IslemAd,Tutar,KaynakBakiye,HedefBakiye,Tarih,HesapId) values('"+kaynakhesapAd+"','"+hedefhesapAd+"','"+islem+"','"+tutar.getText()+"','"+(bakiye-Double.parseDouble(tutar.getText()))+"' ,'"+(bakiye2+(kur*(Double.parseDouble(tutar.getText())))/kur2)+"','"+tarih+"','"+hesapid+"' )";
                            Statement sta = connection.createStatement();
                            int x = sta.executeUpdate(query);
                        
                            }
                       
                             
                        

                        }
                    }

                }
            }
            connection.close();
            JOptionPane.showMessageDialog(null, "Para Gönderildi");
            GeneldurumGoruntule(true);
            
            
            //dispose();

        } catch (Exception exception) {
            exception.printStackTrace();
        }
            
        }
        
        
        
        
        
        
    }//GEN-LAST:event_transfer_onaylaMouseClicked

    private void gonderilenHesapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gonderilenHesapActionPerformed

        
          
    }//GEN-LAST:event_gonderilenHesapActionPerformed

    private void gonderilenAdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gonderilenAdMouseClicked
        gonderilenHesap.removeAllItems();
    }//GEN-LAST:event_gonderilenAdMouseClicked

    private void gonderilenAdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gonderilenAdActionPerformed
         gonderilenHesap.removeAllItems();
        try{
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankasistemi", "root", "123");
                             PreparedStatement st4 = (PreparedStatement) connection
		              .prepareStatement("Select * from hesaplar h inner join musteriler m where m.AdSoyad=? and h.MusteriId=m.MusteriId and m.MusteriId != ? and h.HesapOnay=1");
	                     st4.setString(1,(String.valueOf(gonderilenAd.getSelectedItem())));
                             st4.setInt(2,this.musteri_id);
	                     ResultSet rs4 = st4.executeQuery();
                             while(rs4.next()){
                                 String ad=rs4.getString("HesapAd");
                                 gonderilenHesap.addItem(ad);
                             }
                          connection.close();
                      }catch(SQLException sqlException){
                         sqlException.printStackTrace(); 
                      }
    }//GEN-LAST:event_gonderilenAdActionPerformed

    private void gonderenHesapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gonderenHesapActionPerformed

    }//GEN-LAST:event_gonderenHesapActionPerformed
  
    
    
    private void GeneldurumGoruntule(boolean guncelle){
        if(guncelle==true){
            try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankasistemi", "root", "123");
            PreparedStatement stm = connection.prepareStatement("select * from hesaplar where HesapAd=? and MusteriId = ?");
            stm.setString(1, String.valueOf(gonderenHesap.getSelectedItem()));
            stm.setString(2, String.valueOf(this.musteri_id));
            ResultSet rst=stm.executeQuery();
             if(rst.next()){
               int hesapid=rst.getInt("HesapId");
               
               double hesap_bakiye=rst.getInt("Bakiye");
           
               try{
               PreparedStatement pstm = connection.prepareStatement("select * from geneldurum where HesapId=?");
               pstm.setInt(1, hesapid);
               System.out.println(hesapid);
              ResultSet rs=pstm.executeQuery(); 
              if(rs.next()){
                   double gider=rs.getDouble("Gider");
                   
                   System.out.println(gider);
                   PreparedStatement smt = connection.prepareStatement("update geneldurum set Gider=?,bakiye=? where HesapId=? ");
                   smt.setDouble(1, gider+Double.parseDouble(tutar.getText()));
                   smt.setDouble(2, hesap_bakiye);
                   smt.setInt(3, hesapid);
                   smt.executeUpdate();
    	           connection.close();
    	           dispose();
                   
                   new musteriHesabaTransfer(this.musteri_id).setVisible(true);
                 
                  
                      
                          
                   
              }
                   
               }catch(Exception ex){
                   ex.printStackTrace();
               }
             
                
                                                   
			               
          }
             
          
               
         }catch (Exception exception) {
         exception.printStackTrace();
         }
        }else{
            JOptionPane.showMessageDialog(null, "hata");
            dispose();
           
	                    
        }
    }
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
            java.util.logging.Logger.getLogger(musteriHesabaTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(musteriHesabaTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(musteriHesabaTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(musteriHesabaTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new musteriHesabaTransfer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField gonderenAd;
    private javax.swing.JComboBox<String> gonderenHesap;
    private javax.swing.JComboBox<String> gonderilenAd;
    private javax.swing.JComboBox<String> gonderilenHesap;
    private javax.swing.JToggleButton iptal;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private javax.swing.JPanel transfer;
    private javax.swing.JToggleButton transfer_onayla;
    private java.awt.TextField tutar;
    // End of variables declaration//GEN-END:variables

  
}
