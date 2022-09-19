package demo.d1;

/**
 * @author Esa Kesti
 * @version 19.9.2022
 *
 */
public class Neliojuuret {

    /**
     * @param args ei kaytossa
     */
    public static void main(String[] args) {
        
        for(int i = 1; i <= 1000; i++) {
            double x = Math.sqrt(i);
            if (x % 2 == 1) {
                System.out.println(i);          }
        }
    }

}