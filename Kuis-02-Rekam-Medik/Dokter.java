
/**
 * Write a description of class Dokter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dokter
{
   String nama;
   String catatan;
   Pasien [] pasien;
   
   public Dokter (String nama){
    this.nama=nama;
    }
    
   public String getCatatan(){
    return catatan;
    }
    
   public Pasien[] daftarPasien() {
    return pasien;
    }
   
}
