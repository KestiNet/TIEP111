package demo.dd4;

/**
 * @author Esa Kesti
 * @version 10.10.2022
 *
 */
public class Tarkkuus {
    
    
    
    /**
     * @param x verrattava luku
     * @param eps virheraja, eps aina >= 0
     * @return 1 tai -1 riippuen kumpi on suurempi
     *  @example
     * <pre name="test">
     * etumerkki(0,0)  ~~~ 0;
     * etumerkki(1,0)  ~~~ 1;
     * etumerkki(0.4,0.3)  ~~~ 1;
     * etumerkki(-1,0) ~~~ -1;
     * etumerkki(0.5, 0.2) ~~~ 1;
     * </pre>
     */
    public static int etumerkki(double x, double eps) {
        if (x < -eps) return -1;
        if (x >  eps) return 1;
        return 0;
    }

    /**
     * @param args ei käytössä
     */
    public static void main(String[] args) {
       double lampo = 37.7 - 37.3;
       double epsilon = 0.3;
       
       
       System.out.println(etumerkki(lampo,epsilon));

    }
    
 

}