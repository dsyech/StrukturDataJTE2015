
/**
 * Write a description of class SepedaMotor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SepedaMotor implements Kendaraan
{
  String plat;
  
  public SepedaMotor (String plat){
  this.plat=plat;  
  }
    
  public String plat(){
  return plat;  
  }
  
  public String tipe(){
  return "SepedaMotor";  
  }
}
