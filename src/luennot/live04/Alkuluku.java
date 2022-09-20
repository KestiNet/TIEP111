package luennot.live04;

/**
 * Tutkitaan alkulukuja
 * @author Esa Kesti
 * @version 20.9.2022
 *
 */
public class Alkuluku {
    
    /**
     * @param luku tutkittava luku
     * @return palauttaa 1 jos alkuluku, muuten milla jaollinen
     * @example
     * <pre name="test">
     *   millaJaollinen(25)  === 5;
     *   millaJaollinen(2)   === 1;
     *   millaJaollinen(4)   === 2;
     *   millaJaollinen(123) === 3;
     *   millaJaollinen(7)   === 1;
     * </pre>
     */
    public static int millaJaollinen(int luku) {
        
        return luku;
    }

    /**
     * @param args ei kaytossa
     */
    public static void main(String[] args) {
        int luku = 25;
        int jaollinen;
        
        jaollinen = millaJaollinen(luku);
        if (jaollinen == 1 )
            System.out.println("alkuluku");
        else {
            System.out.println("jaollinen luvulla " + jaollinen);
            
        }
        }



}
