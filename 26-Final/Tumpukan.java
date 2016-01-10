import java.math.BigInteger;
import java.util.Stack;
/**
 * Write a description of class Tumpukan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tumpukan{
    private Node atas;
    private Node bawah;
    Stack <BigInteger> st = new Stack <BigInteger> ();

 public Tumpukan(){
    atas=null;
    }
    
public void tumpuk(BigInteger data){
    Node nodeBaru = new Node(data);
    
    if(atas==null){
    atas = nodeBaru;
    }
    else{
    while (atas.berikut != null)
    atas = atas.berikut;
    atas.berikut = nodeBaru; //gagal tumpuk nilai atas
    }
        }
    
    public BigInteger ambil(){
    if (atas==null){
      return null;
    }
    else{
    return st.pop(); //gagal mengambil nilai atas
    }
}

public BigInteger atas(){
    return null;
    }
    
public BigInteger bawah(){
    return null;
    }
}
