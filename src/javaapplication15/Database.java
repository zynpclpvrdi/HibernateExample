
package JavaApplication15;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


public class Database{
    

        public static List<Kisiler> getKisiDetails(int kisiId){
         
         List<Kisiler> emp=null;
         Session session=HibernateUtil.getSessionFactory().openSession();
         Transaction tx=null;
         try{
             tx = session.beginTransaction();
             Criteria cr=session.createCriteria(Kisiler.class);
             cr.add(Restrictions.eq("kullaniciId",kisiId));
             emp=cr.list();
             tx.commit();
         }catch(HibernateException ex){
             System.out.println(ex.getMessage());
             if(tx !=null){
                 tx.rollback();
             }
         }finally{ 
             session.close();
         }
        return emp;
     }
          public static boolean kisiEkle(String kullaniciAdi, String kullaniciSoyadi){
    
        int kisiId=0;
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction tx= null;
            tx=session.beginTransaction();
            Kisiler kullanici = new Kisiler(kullaniciAdi,kullaniciSoyadi);
            kisiId=(int)session.save(kullanici);
            tx.commit();
            session.close();
         return kisiId > 0;
         
    }
     public void guncelle(Kisiler kullaniciId){
        
         
         Transaction tx=null;
         Session session=HibernateUtil.getSessionFactory().openSession();
         try{
         tx=session.beginTransaction();
         session.update(kullaniciId);
         session.getTransaction().commit();
         }catch(Exception ex){
             if(tx != null){
                 System.out.println(ex.getMessage());
                 tx.rollback();
             }
             
         }finally{
             session.close();
         }
     }
     public void sil(Kisiler kullaniciId){
          Transaction tx=null;
         Session session=HibernateUtil.getSessionFactory().openSession();
         try{
         tx=session.beginTransaction();
         session.delete(kullaniciId);
         session.getTransaction().commit();
         }catch(Exception ex){
             if(tx != null){
                 System.out.println(ex.getMessage());
                 tx.rollback();
             }
             
         }finally{
             session.close();
         }
         
     }

}

