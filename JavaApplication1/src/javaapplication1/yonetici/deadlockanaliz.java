/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.yonetici;

import java.sql.Date;

/**
 *
 * @author Pelin
 */
public class deadlockanaliz {
    
   String kaynakhesap;
    String hedefhesap;
    String islemad;
   int tutar;
  int kaynakbakiye;
   int hedefbakiye;
  Date tarih;
    int hesapid;


    public deadlockanaliz(String kaynakhesap,String hedefhesap,String islemad,int tutar,int kaynakbakiye,int hedefbakiye,Date tarih,int hesapid){
   this.kaynakhesap=kaynakhesap;
    this.hedefhesap=hedefhesap;
    this.islemad=islemad;
   this.tutar=tutar;
  this.kaynakbakiye=kaynakbakiye;
  this.hedefbakiye=hedefbakiye;
  this.tarih=tarih;
   this.hesapid=hesapid;

    }
    
    
   public String getkaynakhesap(){return this.kaynakhesap;}
   public String gethedefhesap(){return this.hedefhesap;}
   public String getislemad(){return this.islemad;}
  public int gettutar(){return this.tutar;}
  public int getkaynakbakiye(){return this.kaynakbakiye;}
  public int gethedefbakiye(){return this.hedefbakiye;}
  public Date gettarih(){return this.tarih;}
  public  int gethesapid(){return this.hesapid;}
    
}
