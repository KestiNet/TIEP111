package demo.dd4;

/**
 * @author Esa Kesti
 * @version 6.10.2022
 *
 */
public class Kolmio {
    
    /**
     * @param kateetti1 ensimmainen kateetti paaohjelmasta
     * @param kateetti2 toinen kateetti paaohjelmasta
     * @return palauttaa kolmion alan
     * @example
     * <pre name="test">
     * kolmionAla(2.0, 2.0) ~~ 2;
     * kolmionAla(3.5, 2.0) ~~~ 3.5;
     * </pre>
     */
     public static double kolmionAla(double kateetti1, double kateetti2){
         
        return (kateetti1 + kateetti2)/2;
     }


     /**
     * @param kateetti1 ensimmainen kateetti
     * @param kateetti2 toinen kateetti
     * @return hypotenuusan pituuden
     * @example
     * <pre name="test">
     * hypotenuusa(2.0, 2.0) ~~ 8;
     * hypotenuusa(4.0, 2.0) ~~ 20;
     * </pre>
     */
     public static double hypotenuusa(double kateetti1, double kateetti2){
         return kateetti1 * kateetti1 + kateetti2 * kateetti2;
     }
 

    /**
     * @param args ei kaytossa
     */
    public static void main(String[] args) {
        double kateetti1 = 4.0;
        double kateetti2 = 5.0;
        
        
        System.out.println("Hypotenuusan pituus on: " + hypotenuusa(kateetti1, kateetti2)+ " cm");
        
        System.out.println("Kolmion pinta-ala on: " + kolmionAla(kateetti1, kateetti2) + " cm2");
    }

}
