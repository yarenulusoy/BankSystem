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
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author Pelin
 */
public class musteriBankaTransfer extends javax.swing.JFrame {
    int musteri_id;
    boolean guncelle=false;
    /**
     * Creates new form musteriBankaTransfer
     */
    public musteriBankaTransfer() {
        initComponents();
    }
   
    public musteriBankaTransfer(int musteri_id){
        this.musteri_id=musteri_id;
        initComponents();
         try {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankasistemi", "root", "123");
	        PreparedStatement st = (PreparedStatement) connection
	        .prepareStatement("Select h.* from hesaplar h inner join borclar b ON h.HesapId=b.HesapId where h.MusteriId = ? and h.HesapOnay=1");
	        st.setInt(1, musteri_id);
	        ResultSet rs = st.executeQuery();
	        while (rs.next()) {
	        String hesaplar = rs.getString("HesapAd");
	        hesapad.addItem(hesaplar);
	          }
	      } catch (SQLException sqlException) {
	          sqlException.printStackTrace();
	      }
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        borcpanel = new javax.swing.JPanel();
        iptal = new javax.swing.JToggleButton();
        Onayla = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        miktar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        hesapad = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        musteriaylikborc = new javax.swing.JLabel();
        musteritoplamborc = new javax.swing.JLabel();
        toplamode = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(423, 130));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(905, 650));

        borcpanel.setPreferredSize(new java.awt.Dimension(640, 380));

        iptal.setBackground(new java.awt.Color(51, 0, 0));
        iptal.setForeground(new java.awt.Color(204, 204, 204));
        iptal.setText("VAZGEÇ");
        iptal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iptal(evt);
            }
        });

        Onayla.setBackground(new java.awt.Color(0, 0, 51));
        Onayla.setForeground(new java.awt.Color(204, 204, 204));
        Onayla.setText("Onayla");
        Onayla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OnaylaMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Miktar :");

        miktar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miktarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Hesap Ad:");

        hesapad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hesapadActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Aylık Borç :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Toplam Borç :");

        musteriaylikborc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        musteritoplamborc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        toplamode.setBackground(new java.awt.Color(255, 153, 102));
        toplamode.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        toplamode.setForeground(new java.awt.Color(255, 255, 255));
        toplamode.setText("ÖDE");
        toplamode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toplamodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout borcpanelLayout = new javax.swing.GroupLayout(borcpanel);
        borcpanel.setLayout(borcpanelLayout);
        borcpanelLayout.setHorizontalGroup(
            borcpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borcpanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(borcpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(borcpanelLayout.createSequentialGroup()
                        .addGroup(borcpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(borcpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borcpanelLayout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(27, 27, 27)
                                    .addComponent(miktar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borcpanelLayout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hesapad, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(borcpanelLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(185, 185, 185)))
                        .addGap(166, 166, 166)
                        .addGroup(borcpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Onayla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(iptal, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(toplamode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(88, 88, 88))
                    .addGroup(borcpanelLayout.createSequentialGroup()
                        .addGroup(borcpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(borcpanelLayout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(musteritoplamborc, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(borcpanelLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(musteriaylikborc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(12, 12, 12)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        borcpanelLayout.setVerticalGroup(
            borcpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borcpanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(borcpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(toplamode, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(musteritoplamborc, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(borcpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(borcpanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(borcpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(miktar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(borcpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(musteriaylikborc, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(borcpanelLayout.createSequentialGroup()
                        .addGroup(borcpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hesapad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Onayla, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(iptal, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(138, 138, 138))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(borcpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(borcpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iptal(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iptal
       dispose();
       new MusteriSecenek(this.musteri_id).setVisible(true);
    }//GEN-LAST:event_iptal

    private void OnaylaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnaylaMouseClicked
String kaynakhesapAd=String.valueOf(hesapad.getSelectedItem());
        String hedefhesapAd="Banka";
        String islem="Borç Ödeme";
        double gecikme_faiz=0;
        double bakiye=0;
        int hesapid=0;
        Calendar cal = Calendar.getInstance(Locale.getDefault());
        int odeme_ay = cal.get(Calendar.MONTH)+1 ;
        LocalDate tarih = LocalDate.now(); 
        try {
		            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankasistemi", "root", "123");
		            PreparedStatement st = connection.prepareStatement("select * from hesaplar where HesapAd=? and MusteriId = ? and HesapOnay=1");
		            st.setString(1, String.valueOf(hesapad.getSelectedItem()));
		            st.setInt(2, musteri_id);
		            
		            ResultSet rs = st.executeQuery();
                    if (rs.next()) {
                        bakiye = rs.getDouble("Bakiye");
                        hesapid=rs.getInt("HesapId");
                        PreparedStatement preparedStmt = connection.prepareStatement("update hesaplar set Bakiye = ? where HesapAd=? and MusteriId = ? and HesapOnay=1");
                        preparedStmt.setDouble(1, (bakiye-Double.parseDouble(miktar.getText())));
    		        preparedStmt.setString(2, String.valueOf(hesapad.getSelectedItem()));
    		        preparedStmt.setInt(3, musteri_id);
    		        preparedStmt.executeUpdate();

                    } 
                 
		         
		        } catch (Exception exception) {
		            exception.printStackTrace();
		        }
        
                       try{
                            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankasistemi", "root", "123");
                            PreparedStatement s = connection.prepareStatement("select * from Banka where BankaId=1");
		            ResultSet rst = s.executeQuery();
                            if(rst.next()){
                                double banka_bakiye=rst.getDouble("Bakiye");
                                double banka_gelir=rst.getDouble("Gelir");
                                double banka_gider=rst.getDouble("Gider");
                                double banka_kar=rst.getDouble("Kar");
                                 PreparedStatement stm = connection.prepareStatement("update banka set Bakiye = ?, Gelir=? ,Kar=? where BankaId=1 ");
                                 stm.setDouble(1, (banka_bakiye+Double.parseDouble(miktar.getText())));
    		                 stm.setDouble(2, (banka_gelir+Double.parseDouble(miktar.getText()))); 
                                 stm.setDouble(3, ((banka_gelir+Double.parseDouble(miktar.getText()))-banka_gider));
    		                 stm.executeUpdate();
                                 
                                 String query="INSERT INTO islemler(KaynakHesap,HedefHesap,IslemAd,Tutar,KaynakBakiye,Tarih,HesapId) values('"+kaynakhesapAd+"','"+hedefhesapAd+"','"+islem+"','"+miktar.getText()+"','"+(bakiye-Double.parseDouble(miktar.getText()))+"' ,'"+tarih+"','"+hesapid+"' )";
                                 Statement sta = connection.createStatement();
                                 int x = sta.executeUpdate(query);
                                  connection.close();
    	                         JOptionPane.showMessageDialog(null, "Kredi Borcu Gonderildi");
    	                         GeneldurumGoruntule(true);                            }
                        }catch(Exception ex){
                            ex.printStackTrace();
                        }
                       
                       
                       
                       try{
                           int month=0;
                           double aylik_borc=0.0;
                             double toplam_borc=0.0;      
                            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankasistemi", "root", "123");
                            PreparedStatement s2 = connection.prepareStatement("select * from borclar where HesapId=? ");
                            s2.setInt(1, hesapid);
		            ResultSet rst2 = s2.executeQuery();
                            while(rst2.next()){
                                Calendar ay = Calendar.getInstance();
                               aylik_borc=rst2.getDouble("AylikBorc");
                                 toplam_borc=rst2.getDouble("ToplamBorc");
                                Date  borctarih=  rst2.getDate("Tarih");
                                 ay.setTime(borctarih);
                                  month = ay.get(Calendar.MONTH) + 1; // Note: zero based!
                                 System.out.println(odeme_ay);
                            }
                            if(Double.parseDouble(miktar.getText())==aylik_borc){
                                PreparedStatement stm = connection.prepareStatement("update borclar set ToplamBorc=?  where HesapId=? ");
                                   //   stm.setDouble(1, (aylik_borc-Double.parseDouble(miktar.getText())));
                                      stm.setDouble(1, (toplam_borc-Double.parseDouble(miktar.getText())));
                                      stm.setInt(2, hesapid);
                                      stm.executeUpdate();
                            }else{
                               PreparedStatement stm = connection.prepareStatement("update borclar set AylikBorc=?,ToplamBorc=?  where HesapId=? ");
                                      stm.setDouble(1, (aylik_borc-Double.parseDouble(miktar.getText())));
                                      stm.setDouble(2, (toplam_borc-Double.parseDouble(miktar.getText())));
                                      stm.setInt(3, hesapid);
                                      stm.executeUpdate();  
                            }
                               
                                     
                               if((toplam_borc-Double.parseDouble(miktar.getText()))==0 ){
                                    PreparedStatement st = connection.prepareStatement("delete * from borclar  where HesapId = ?");
                                      st.setInt(1, hesapid);
                                     st.execute();
                                     PreparedStatement st2 = connection.prepareStatement("delete * from kredi_talep  where HesapId = ?");
                                      st2.setInt(1, hesapid);
                                     st2.execute();
                               }
                            
                            connection.close();
                       }catch(Exception ex){
                                         
                                         }
    }//GEN-LAST:event_OnaylaMouseClicked

    private void miktarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miktarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miktarActionPerformed

    private void hesapadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hesapadActionPerformed
       int month=0;
  double aylik_borc=0.0;
   double toplam_borc=0.0;      
        String hedefhesapAd="Banka";
        String islem="Borç Ödeme";
        double gecikme_faiz=0;
        double bakiye=0;
        int hesapid=0;
        Calendar cal = Calendar.getInstance(Locale.getDefault());
        int odeme_ay = cal.get(Calendar.MONTH)+1 ;
        LocalDate tarih = LocalDate.now(); 
        //LocalDate tarih = LocalDate.now(); 
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankasistemi", "root", "123");
            PreparedStatement stm = connection.prepareStatement("Select b.* from borclar b inner join hesaplar h ON b.HesapId=h.HesapId where h.HesapAd=? and h.MusteriId = ?");
            stm.setString(1, String.valueOf(hesapad.getSelectedItem()));
            stm.setString(2, String.valueOf(this.musteri_id));
            ResultSet rst=stm.executeQuery();
             while(rst.next()){
              Calendar ay = Calendar.getInstance();
                               aylik_borc=rst.getDouble("AylikBorc");
                                 toplam_borc=rst.getDouble("ToplamBorc");
                                Date  borctarih=  rst.getDate("Tarih");
                                 ay.setTime(borctarih);
                                  month = ay.get(Calendar.MONTH) + 1; // Note: zero based!
                                 System.out.println(odeme_ay);
                            }
                            if(month==odeme_ay){
                               musteriaylikborc.setText(String.valueOf(aylik_borc));
                               musteritoplamborc.setText(String.valueOf(toplam_borc));
                                 }else{
                                PreparedStatement stm2 = connection.prepareStatement("select * from faiz");
                                ResultSet rst3 = stm2.executeQuery();
                                 if(rst3.next()){
                                     gecikme_faiz=rst3.getDouble("GecikmeMiktar");
                                     toplam_borc=(toplam_borc+((toplam_borc*gecikme_faiz)/100));
                                     PreparedStatement stm3 = connection.prepareStatement("select * from kredi_onay where Hesapid=");
                                        ResultSet rst4 = stm3.executeQuery();
                                        while(rst4.next()){
                                         int vade=rst4.getInt("Vade");
                                         aylik_borc=(toplam_borc/vade);
                                         musteriaylikborc.setText(String.valueOf(aylik_borc));
                                         musteritoplamborc.setText(String.valueOf(toplam_borc));
                                        }
                                     }
                                 String query="update borclar set AylikBorc = '"+(aylik_borc)+"', ToplamBorc='"+(toplam_borc)+"', Tarih='"+tarih+"'  where HesapId='"+hesapid+"'";
                                PreparedStatement stm3 = connection.prepareStatement(query);
                                      stm3.executeUpdate();
                               
                            }
                            connection.close();
        }catch(Exception ex){
                   ex.printStackTrace();
               }
    }//GEN-LAST:event_hesapadActionPerformed

    private void toplamodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toplamodeActionPerformed
        String kaynakhesapAd=String.valueOf(hesapad.getSelectedItem());
        String hedefhesapAd="Banka";
        String islem="Borc Odeme";
        double gecikme_faiz=0;
        double bakiye=0;
        int hesapid=0;
        Calendar cal = Calendar.getInstance(Locale.getDefault());
        int odeme_ay = cal.get(Calendar.MONTH)+1 ;
        LocalDate tarih = LocalDate.now(); 
        try {
		            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankasistemi", "root", "123");
		            PreparedStatement st = connection.prepareStatement("select * from hesaplar where HesapAd=? and MusteriId = ? and HesapOnay=1");
		            st.setString(1, String.valueOf(hesapad.getSelectedItem()));
		            st.setInt(2, musteri_id);
		            
		            ResultSet rs = st.executeQuery();
                    if (rs.next()) {
                        bakiye = rs.getDouble("Bakiye");
                        hesapid=rs.getInt("HesapId");
                        PreparedStatement preparedStmt = connection.prepareStatement("update hesaplar set Bakiye = ? where HesapAd=? and MusteriId = ? and HesapOnay=1");
                        preparedStmt.setDouble(1, (bakiye-Double.parseDouble(musteritoplamborc.getText())));
    		        preparedStmt.setString(2, String.valueOf(hesapad.getSelectedItem()));
    		        preparedStmt.setInt(3, this.musteri_id);
    		        preparedStmt.executeUpdate();

                    } 
                 
		         
		        } catch (Exception exception) {
		            exception.printStackTrace();
		        }
        
                       try{
                            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankasistemi", "root", "123");
                            PreparedStatement s = connection.prepareStatement("select * from Banka where BankaId=1");
		            ResultSet rst = s.executeQuery();
                            if(rst.next()){
                                double banka_bakiye=rst.getDouble("Bakiye");
                                double banka_gelir=rst.getDouble("Gelir");
                                double banka_gider=rst.getDouble("Gider");
                                double banka_kar=rst.getDouble("Kar");
                                 PreparedStatement stm = connection.prepareStatement("update banka set Bakiye = ?, Gelir=? ,Kar=? where BankaId=1 ");
                                 stm.setDouble(1, (banka_bakiye+Double.parseDouble(musteritoplamborc.getText())));
    		                 stm.setDouble(2, (banka_gelir+Double.parseDouble(musteritoplamborc.getText()))); 
                                 stm.setDouble(3, ((banka_gelir+Double.parseDouble(musteritoplamborc.getText()))-banka_gider));
    		                 stm.executeUpdate();
                                 
                                 String query="INSERT INTO islemler(KaynakHesap,HedefHesap,IslemAd,Tutar,KaynakBakiye,Tarih,HesapId) values('"+kaynakhesapAd+"','"+hedefhesapAd+"','"+islem+"','"+musteritoplamborc.getText()+"','"+(bakiye-Double.parseDouble(musteritoplamborc.getText()))+"' ,'"+tarih+"','"+hesapid+"' )";
                                 Statement sta = connection.createStatement();
                                 int x = sta.executeUpdate(query);
                                 
                                 try{
                             
                            
                                  PreparedStatement st = connection.prepareStatement("delete b.* from borclar b where b.HesapId = ?");
                                      st.setInt(1, hesapid);
                                       st.execute();
                                      PreparedStatement st2 = connection.prepareStatement("delete k.* from kredi_talep k where k.HesapId = ?");
                                      st2.setInt(1, hesapid);
                                     st2.execute();
                                 
                                     
                                
                              
                            
                            connection.close();
                       }catch(Exception ex){
                                         
  }
                                 
                                 
                                 
                                  connection.close();
    	                         JOptionPane.showMessageDialog(null, "Kredi Borcu Gonderildi");
    	                         GeneldurumGoruntule(true);                            }
                        }catch(Exception ex){
                            ex.printStackTrace();
                        }
                       
                       
                       
                       
    }//GEN-LAST:event_toplamodeActionPerformed
    
    
    private void GeneldurumGoruntule(boolean guncelle){
        if(guncelle==true){
            try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankasistemi", "root", "123");
            PreparedStatement stm = connection.prepareStatement("select * from hesaplar where HesapAd=? and MusteriId = ?");
            stm.setString(1, String.valueOf(hesapad.getSelectedItem()));
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
                   smt.setDouble(1, gider+Double.parseDouble(miktar.getText()));
                   smt.setDouble(2, hesap_bakiye);
                   smt.setInt(3, hesapid);
                   smt.executeUpdate();
    	           connection.close();
    	           dispose();
                   
                   new musteriBankaTransfer(this.musteri_id).setVisible(true);
                 
                  
                      
                          
                   
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
            java.util.logging.Logger.getLogger(musteriBankaTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(musteriBankaTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(musteriBankaTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(musteriBankaTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new musteriBankaTransfer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Onayla;
    private javax.swing.JPanel borcpanel;
    private javax.swing.JComboBox<String> hesapad;
    private javax.swing.JToggleButton iptal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField miktar;
    private javax.swing.JLabel musteriaylikborc;
    private javax.swing.JLabel musteritoplamborc;
    private javax.swing.JToggleButton toplamode;
    // End of variables declaration//GEN-END:variables
}
