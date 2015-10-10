
/**
 * Write a description of class Makanan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Makanan
{
   String nama;
   int harga;
   JenisMakanan [] jenisMakanan;
   
   public Makanan (String nama){
    this.nama = nama;
   }
   
   public int getHarga(){
    return harga;
    }
    
   public JenisMakanan[] daftarJenisMakanan (){
       return jenisMakanan;
    }
    
 
}
