package demo.d3;
//import fi.jyu.mit.ohj2.Mjonot;


/**
 * @author Esa Kesti
 * @version 27.9.2022
 *
 */
public class Pvm {
    
    private int p, m, y;
    
    /**
     * @param p paiva
     * @param m kuukausi
     * @param y vuosi
     * @example
     * <pre name="test">
     * new Pvm(07,03,1985).toString() === "07,03,1985";
     * </pre>
     */
     
    public  Pvm(int p, int m, int y) {
        this.p= p;
        this.m=m;
        this.y=y;
        
    }
    
    @Override
    public String toString() {
        return String.format("%02d,%02d,%02d", p, m, y);
    }
    
    
   /**
 * @param args ei kaytossa
 */
public static void main(String[] args) {
       Pvm p1 = new Pvm(21, 1,  2015);
       Pvm p2 = new Pvm(12, 12, 2012);
       Pvm p3 = new Pvm(19, 8,  1990);
       System.out.println(p1);
       System.out.println(p2);
       System.out.println(p3);
   }


}