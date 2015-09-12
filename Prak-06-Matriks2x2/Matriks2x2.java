
/**
 * Write a description of class Matriks2x2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Matriks2x2
{
    private int a11;
    private int a12;
    private int a21;
    private int a22;
    private int baris;
    private int kolom;
    
   public Matriks2x2(){
    a11=0;
    a12=0;
    a21=0;
    a22=0;
    baris=0;
    kolom=0;
   }
   
   public Matriks2x2(int a, int b, int c, int d){
   a=a11;
   b=a12;
   c=a21;
   d=a22;
   }
   
   public void elemen (int baris, int kolom){
      this.baris=baris;
      this.kolom=kolom;
    }
   
   public void tambah (int a11, int a12, int a21, int a22){
   this.a11=a11;
   this.a12=a12;
   this.a21=a21;
   this.a22=a22;
   }
   
   public void kurang (int a11, int a12, int a21, int a22){
   this.a11=a11;
   this.a12=a12;
   this.a21=a21;
   this.a22=a22;
   }
   
   public void kali (int a11, int a12, int a21, int a22){
   this.a11=a11;
   this.a12=a12;
   this.a21=a21;
   this.a22=a22;
   }
}
