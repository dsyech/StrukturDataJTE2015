
/**
 * Write a description of class Pasien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pasien
{
   Pemeriksaan [] pemeriksaan;
   String nama;
   
   public Pasien (String nama) {
    this.nama=nama;
    }
    
   public Pemeriksaan[] daftarPemeriksaan (){
    return pemeriksaan;
    }
}
