
/**
 * Write a description of class Kompleks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kompleks
{
    private double real;
    private double imajiner;
    
   public void Kompleks(){
    double real=0;
    double imajiner=0;
   }
   
   public void Kompleks(double real, double imajiner){
    this.real=real;
    this.imajiner=imajiner;
    }
    
    
   public void real (double r){
   real=r; 
   }
   
   public double real(){
    return real;
   }
   
   
   public void imajiner (double i){
   imajiner=i; 
   }
   
   public double imajiner (){
   return imajiner; 
   }
   
   public void tambah(Kompleks kiri, Kompleks kanan){
    real(kiri.real()+kanan.real());
    imajiner(kiri.imajiner()+kanan.imajiner());
    }
    
    public void kurang(Kompleks kiri, Kompleks kanan){
    real(kiri.real()-kanan.real());
    imajiner(kiri.imajiner()-kanan.imajiner());
    }
    
     public void kali(Kompleks kiri, Kompleks kanan){
    real(kiri.real()*kanan.real());
    imajiner(kiri.imajiner()*kanan.imajiner());
    }
}
