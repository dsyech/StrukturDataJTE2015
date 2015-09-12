import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test untuk class Komples
 */
public class KompleksUnitTest {
    @Before
    public void setUp() { }
    
    @After
    public void tearDown() { }
    
    @Test
    public void constructorKosong() {
        Kompleks kompleks = new Kompleks();
        assertEquals(kompleks.real(), 0, 0.01);
        assertEquals(kompleks.imajiner(), 0, 0.01);
    }
    
    @Test
    public void constructorNilaiAwal() {
        Kompleks kompleks = new Kompleks(real, imajiner);
        assertEquals(kompleks.real(), real, 0.01);
        assertEquals(kompleks.imajiner(), imajiner, 0.01);
    }
    
    @Test
    public void constructorKompleksLain() {
        Kompleks sumber = new Kompleks(real, imajiner);
        Kompleks kompleks = new Kompleks(sumber);
        assertEquals(kompleks.real(), sumber.real(), 0.01);
        assertEquals(kompleks.imajiner(), sumber.imajiner(), 0.01);
    }
    
    @Test
    public void real() {
        Kompleks kompleks = new Kompleks(real, imajiner);
        // Getter
        assertEquals(kompleks.real(), real, 0.01);
        // Setter
        double realBaru = 9.8;
        assertEquals(kompleks.real(realBaru), realBaru, 0.01);
        assertEquals(kompleks.real(), realBaru, 0.01);
    }
    
    @Test
    public void imajiner() {
        Kompleks kompleks = new Kompleks(real, imajiner);
        // Getter
        assertEquals(kompleks.imajiner(), imajiner, 0.01);
        // Setter
        double imajinerBaru = 9.8;
        assertEquals(kompleks.imajiner(imajinerBaru), imajinerBaru, 0.01);
        assertEquals(kompleks.imajiner(), imajinerBaru, 0.01);
    }
    
    @Test
    public void tambah() {
        Kompleks kiri = new Kompleks(real, imajiner);
        Kompleks kanan = new Kompleks(realKanan, imajinerKanan);
        Kompleks hasil = kiri.tambah(kanan);
        assertEquals(hasil.real(), kiri.real() + kanan.real(), 0.01);
        assertEquals(hasil.imajiner(), kiri.imajiner() + kanan.imajiner(), 0.01);
    }
    
    @Test
    public void kurang() {
        Kompleks kiri = new Kompleks(real, imajiner);
        Kompleks kanan = new Kompleks(realKanan, imajinerKanan);
        Kompleks hasil = kiri.kurang(kanan);
        assertEquals(hasil.real(), kiri.real() - kanan.real(), 0.01);
        assertEquals(hasil.imajiner(), kiri.imajiner() - kanan.imajiner(), 0.01);
    }
    
    @Test
    public void kali() {
        Kompleks kiri = new Kompleks(real, imajiner);
        Kompleks kanan = new Kompleks(realKanan, imajinerKanan);
        Kompleks hasil = kiri.kali(kanan);
        assertEquals(hasil.real(), kiri.real() * kiri.real() - kanan.real() * kanan.real(), 0.01);
        assertEquals(hasil.imajiner(), kiri.real() * kanan.imajiner() + kiri.imajiner() * kanan.real(), 0.01);
    }
    
    private double real = 3.0;
    private double imajiner = 4.3;
    private double realKanan = 9.0;
    private double imajinerKanan = 8.7;
}