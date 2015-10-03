
/**
 * Write a description of class Lingkaran here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lingkaran extends BendaBulat
{
    private double radius;
    
    public String tipe(){
    return "Lingkaran";}
    
    public Lingkaran (double radius){
    this.radius = radius;
    }
    
    public double radius(){
    return radius;}
}
