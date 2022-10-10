package demo.dd4;

/**
 * @author Esa Kesti
 * @version 10.10.2022
 *
 */
public class Tarkkuus {

    /**
     * @param args ei käytössä
     */
    public static void main(String[] args) {
       double lampo = 37.7 - 37.3;
       double epsilon = 0.3;
       
       
       System.out.println(etumerkki(lampo,epsilon));

    }
    
    
    /**
     * @param x verrattava luku
     * @param eps virheraja, eps aina >= 0
     * @return -1, jos x < -eps \n
     *          0, jos -eps <= x <= eps \n
     *          1, jos x > eps
     *  @example
     * <pre name="test">
     * etumerkki(0,0)  ~~~ 0;
     * etumerkki(1,0)  ~~~ 1;
     * etumerkki(2,0)  ~~~ 1;

     * etumerkki(-1,0) ~~~ -1;
     * etumerkki(-0.51, 0.5) ~~~ -1;
     * </pre>
     */
    public static int etumerkki(double x, double eps) {
        if (x < -eps) return -1;
        if (x >  eps) return 1;
        return 0;
    }

}