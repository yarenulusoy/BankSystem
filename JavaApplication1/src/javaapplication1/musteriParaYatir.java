/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;
//import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Pelin
 */
public class musteriParaYatir extends javax.swing.JFrame {
    int musteri_id;
    boolean guncelle=false;
    /**
     * Creates new form musteriParaCek
     */
    public musteriParaYatir() {
        initComponents();
    }
     public musteriParaYatir(int musteri_id) {
         this.musteri_id=musteri_id;
        initComponents();
        try {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankasistemi", "root", "123");
	        PreparedStatement st = (PreparedStatement) connection
	        .prepareStatement("Select *from hesaplar where MusteriId = ? and HesapOnay=1");
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

        parayatir = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        iptal = new javax.swing.JToggleButton();
        label2 = new java.awt.Label();
        tamam = new javax.swing.JToggleButton();
        miktar = new javax.swing.JTextField();
        hesapad = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(423, 130));
        setUndecorated(true);

        parayatir.setPreferredSize(new java.awt.Dimension(640, 380));

        label1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label1.setText("Hesap Ad :");

        iptal.setBackground(new java.awt.Color(51, 0, 0));
        iptal.setForeground(new java.awt.Color(204, 204, 204));
        iptal.setText("İPTAL");
        iptal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iptal(evt);
            }
        });

        label2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label2.setText("Miktar  :");

        tamam.setBackground(new java.awt.Color(0, 0, 51));
        tamam.setForeground(new java.awt.Color(204, 204, 204));
        tamam.setText("YATIR");
        tamam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tamamMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout parayatirLayout = new javax.swing.GroupLayout(parayatir);
        parayatir.setLayout(parayatirLayout);
        parayatirLayout.setHorizontalGroup(
            parayatirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parayatirLayout.createSequentialGroup()
                .addGroup(parayatirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(parayatirLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(parayatirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(parayatirLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(iptal, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(240, 240, 240)
                .addGroup(parayatirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hesapad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(parayatirLayout.createSequentialGroup()
                        .addComponent(tamam, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addComponent(miktar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(108, 108, 108))
        );
        parayatirLayout.setVerticalGroup(
            parayatirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parayatirLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(parayatirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hesapad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(parayatirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(miktar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, parayatirLayout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addGroup(parayatirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(iptal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tamam, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        jSeparator3.setForeground(new java.awt.Color(51, 0, 0));

        jSeparator4.setForeground(new java.awt.Color(51, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(parayatir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
            .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 905, Short.MAX_VALUE)
            .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 905, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(parayatir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iptal(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iptal
       dispose();
        new MusteriSecenek(this.musteri_id).setVisible(true);
    }//GEN-LAST:event_iptal

    private void tamamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tamamMouseClicked
        LocalDate tarih = LocalDate.now(); 
      
        try {
		            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankasistemi", "root", "123");
		            PreparedStatement st = connection.prepareStatement("select * from hesaplar where HesapAd=? and MusteriId = ? and HesapOnay=1");
		            st.setString(1, String.valueOf(hesapad.getSelectedItem()));
		            st.setInt(2, musteri_id);
		            
		            ResultSet rs = st.executeQuery();
                    if (rs.next()) {
                         double bakiye = rs.getDouble("Bakiye");
                         int hesapid = rs.getInt("HesapId");
                         String hedefhesapAd = String.valueOf(hesapad.getSelectedItem());   
                         PreparedStatement preparedStmt = connection.prepareStatement("update hesaplar set Bakiye = ? where HesapAd=? and MusteriId = ?");
                         preparedStmt.setDouble(1, (bakiye+Double.parseDouble(miktar.getText())));
    		         preparedStmt.setString(2, String.valueOf(hesapad.getSelectedItem()));
    		         preparedStmt.setInt(3, musteri_id);
    		         preparedStmt.executeUpdate();
                         try{
                              PreparedStatement st5 = connection.prepareStatement("select AdSoyad from musteriler where  MusteriId = ? ");
		              st5.setInt(1, musteri_id);
                              System.out.print(musteri_id);
		              ResultSet rs2 = st5.executeQuery();
                             if(rs2.next()) {
                              String  musteriAd=rs2.getString("AdSoyad");
                              System.out.print(musteriAd);
                              String islem="Para Yatirma";
                                 String query="INSERT INTO islemler(KaynakHesap,HedefHesap,IslemAd,Tutar,HedefBakiye,Tarih,HesapId) values('"+musteriAd+"','"+hedefhesapAd+"','"+islem+"','"+miktar.getText()+"','"+(bakiye+Double.parseDouble(miktar.getText()))+"','"+tarih+"','"+hesapid+"' )";
                                  Statement sta = connection.createStatement();
                                  int x = sta.executeUpdate(query);
                        
                              }
                         }catch(Exception exception){
                            exception.printStackTrace(); 
                         }
                         
                         
    	                 connection.close();
    	                 JOptionPane.showMessageDialog(null, "Para Yatırıldı");
                         guncelle=true;
                         GeneldurumGuncelle(guncelle);
    	                    //dispose();
                    } 
                    
	 } catch (Exception exception) {
	 exception.printStackTrace();
	}
          
        
        
       

				
    }//GEN-LAST:event_tamamMouseClicked
   private void GeneldurumGuncelle(boolean guncelle){
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
              ResultSet rs=pstm.executeQuery(); 
              if(rs.next()){
                   double gelir=rs.getDouble("Gelir");
                   PreparedStatement smt = connection.prepareStatement("update geneldurum set Gelir=?,bakiye=? where HesapId=? ");
                   smt.setDouble(1, gelir+Double.parseDouble(miktar.getText()));
                   smt.setDouble(2, hesap_bakiye);
                   smt.setInt(3, hesapid);
                   smt.executeUpdate();
    	           connection.close();
    	           dispose();
                          
                   
              }
                   
               }catch(Exception ex){
                   ex.printStackTrace();
               }
             
                
                                                   
			               
          }
             connection.close();
             dispose();
             new musteriParaYatir(this.musteri_id).setVisible(false);
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
            java.util.logging.Logger.getLogger(musteriParaYatir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(musteriParaYatir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(musteriParaYatir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(musteriParaYatir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new musteriParaYatir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> hesapad;
    private javax.swing.JToggleButton iptal;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JTextField miktar;
    private javax.swing.JPanel parayatir;
    private javax.swing.JToggleButton tamam;
    // End of variables declaration//GEN-END:variables
}
