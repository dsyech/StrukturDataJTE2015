
/**
 * Write a description of class KeranjangBendaBulat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KeranjangBendaBulat
{
   private BendaBulat[] bendaBulat;
   
   public KeranjangBendaBulat(BendaBulat[] bendaBulat){
    this.bendaBulat = bendaBulat;
    this.bendaBulat = bendaBulat;
        if (this.bendaBulat == null)
            this.bendaBulat = new BendaBulat[0];  
    }
    
   public int jumlah(){
    return bendaBulat.length;
   }
   
   public BendaBulat[] isi (){
    return bendaBulat;}
}
