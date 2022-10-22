package demo.d6;

import fi.jyu.mit.ohj2.*;

/**
 * @author Esa Kesti
 * @version 22.10.2022
 *
 */
public class Taulukonkasittely {
    
    /**
     * Aliohjelma joka palauttaa taulukon pieninmmän alkion indeksin
     * @param pienin taulukko
     * @return palauttaa pienimmän alkion
     * <pre name="test">   
     * int t[] = {3,2,1,2,3};
     * pienimmanPaikka(t) === 2;
     * </pre>
     * 
     */
    public static int pienimmanPaikka(int [] pienin) {
     
        int pieninAlkio = 0;
        int pieni = pienin[pieninAlkio];

        for (int i = 1; i < pienin.length; i++){
            if (pienin[i] <= pieni){
            pieni = pienin[i];
            pieninAlkio = i;
            }
        }
        return pieninAlkio;
    }

    /**
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        
    int kPituudet[] = {31,7,28,31,30,31,30,31,31,30,31,30,31};
    
    System.out.println("Taulukon pienimmän alkion indeksi on: " + pienimmanPaikka(kPituudet));
    }
    
}