import java.util.Date;
/**
 * Write a description of class Pemeriksaan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pemeriksaan
{
   Catatan [] catatan;
   String nama;
   Date tanggalPemeriksaan;
   
   public Pemeriksaan (String nama){
    this.nama=nama;
    }
    
   public Catatan [] daftarCatatan (){
    return catatan;
    }
    
   public Date getTanggalPemeriksaan() {
        return tanggalPemeriksaan;
    }
    
    
}
