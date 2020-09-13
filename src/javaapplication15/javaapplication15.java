/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication15;

import java.util.List;

/**
 *
 * @author Asus
 */
public class javaapplication15 {

    public static void main(String[] args) {
        
        String kullaniciAdi="Zeynep";
        String kullaniciSoyadi="Çalapverdi";
        
        if(Database.kisiEkle(kullaniciAdi, kullaniciSoyadi)){
            System.out.println("Kişi eklendi.");
        }else{
            System.out.println("Ekleme başarısız.");
        }

//        int kisiId = 1;
//        List<Kisiler> emp = Database.getKisiDetails(kisiId);
//       for(Kisiler kisiler: emp) {
//            System.out.println(kisiler.getKullaniciSoyadi());

            
//        }

        
        Database dt=new Database();
        Kisiler kisi=new Kisiler();
        kisi.setKullaniciAdi("Ahmet");
        kisi.setKullaniciSoyadi("Çalapverdi");
        kisi.setKullaniciId(2);
        dt.guncelle(kisi);
        System.out.println("Kullanıcı güncellendi.");
        //kisi.setKullaniciId(3);
        //dt.sil(kisi);
        //System.out.println("Kullanıcı silindi.");
        
    }
  
    
}
