package JavaApplication15;
// Generated 16.Tem.2019 11:46:08 by Hibernate Tools 4.3.1
import org.hibernate.PersistentObjectException;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="kisiler",catalog="ornek")

public class Kisiler implements Serializable{
 
     private int kullaniciId;
     private String kullaniciAdi;
     private String kullaniciSoyadi;

    public Kisiler() {
    }

    
    public Kisiler(String kullaniciAdi, String kullaniciSoyadi) {
       this.kullaniciAdi = kullaniciAdi;
       this.kullaniciSoyadi = kullaniciSoyadi;
    }
   
     @Id 
     @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="kullaniciId", unique=true, nullable=false)
    public int getKullaniciId() {
        return this.kullaniciId;
    }
    
    public void setKullaniciId(int kullaniciId) {
        this.kullaniciId = kullaniciId;
    }

    
    @Column(name="kullaniciAdi", nullable=false, length=50)
    public String getKullaniciAdi() {
        return this.kullaniciAdi;
    }
    
    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }
    
    @Column(name="kullaniciSoyadi", nullable=false, length=50)
    public String getKullaniciSoyadi() {
        return this.kullaniciSoyadi;
    }
    
    public void setKullaniciSoyadi(String kullaniciSoyadi) {
        this.kullaniciSoyadi = kullaniciSoyadi;
    }

} 
