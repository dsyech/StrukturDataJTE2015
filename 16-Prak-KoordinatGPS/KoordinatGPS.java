import java.math.BigDecimal;
import java.lang.Double;
/**
 * Write a description of class KoordinatGPS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KoordinatGPS
{
  private BigDecimal lintang;
  private BigDecimal bujur;
  
  public KoordinatGPS(){
    this.lintang = new BigDecimal(0.0);
    this.bujur = new BigDecimal (0.0);
    }
    
  public KoordinatGPS(double bujur, double lintang){
    this.bujur=new BigDecimal (Double.toString(bujur));
    this.lintang =new BigDecimal (Double.toString(lintang));
    }
    
  public KoordinatGPS(String bujur, String lintang){
    this.bujur= new BigDecimal (bujur);
    this.lintang= new BigDecimal (lintang);
    }
   
    public KoordinatGPS(BigDecimal bujur, BigDecimal lintang){
    this.bujur= bujur;
    this.lintang= lintang;
    }
    
    public String lintangStr(){
    return lintang.toString();
    }
    
  public BigDecimal lintang(){
    return lintang;
    }
  
    
  public BigDecimal bujur(){
    return bujur;
    }
    
    public String bujurStr(){
    return bujur.toString();
    }
}
