package demo.d2;

/**
 * @author Esa Kesti
 * @version 25.9.2022
 *
 */
public class KertomaWhile{
    
    // BYCODEBEGIN
    /**
     * Aliohjelma, joka laskee luvun kertoman
     * @param n luku, jonka kertoma lasketaan
     * @return kertoma
     * @example
     * <pre name="test">
     *  kertoma(3) === 6;
     *  kertoma(5) === 120;
     *  kertoma(0) === 1;
     * </pre>
     */
    public static int kertoma(int n) {
        if(n == 0) return 1;
        int kertoma = 1;
     
        while (n != 1){
            kertoma = kertoma * n;
            n--;
        } return kertoma;
        
        
    }        
        
    
    // BYCODEEND
    /**
     * @param args ei käytössä
     */
    public static void main(String[] args)
    {
        System.out.printf("Luvun 5 kertoma on: %d\n", kertoma(5));
        System.out.printf("Luvun 10 kertoma on: %d\n", kertoma(10));
    }


}

