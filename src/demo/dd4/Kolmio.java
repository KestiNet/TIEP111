package demo.dd4;

/**
 * @author lange
 * @version 6.10.2022
 *
 */
public class Kolmio {
    
    /**
     * @param kateetti1 
     * @param kateetti2 
     * @param hypotenuusa 
     * @return 
     * @example
     * <pre name="test">
     * TODO:testit
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
     * TODO:testit
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
        
        
        System.out.println("hypotenuusan pituus on: " + hypotenuusa(kateetti1, kateetti2)+ " cm");
        
        System.out.println("Kolmion pinta-ala on: " + kolmionAla(kateetti1, kateetti2) + " cm2");
    }

}
