package demo.d5;

import java.io.OutputStream;
import java.io.PrintStream;

/**
 * @author lange
 * @version 17.10.2022
 *
 */
public class LinjaAuto {
    
    private int paikat = 60;
    private int vapaitaPaikkoja = 10;
    
    /**
     * Muodostaja LinjaAuto luokalle
     * @param paikat kuinka monta paikkaa linjautossa on
     * @param vapaitaPaikkoja paljonko linjaautossa on vapaita paikkoja
     */
    public LinjaAuto(int paikat, int vapaitaPaikkoja) {
        this.paikat = paikat;
        this.vapaitaPaikkoja = vapaitaPaikkoja;
        
    }
    
    /**
     * Tulostus metodi
     * @param os outputstream
     */
    public void tulosta(OutputStream os) {
        PrintStream out = new PrintStream(os);
        out.println();
    }
    
    public void lisaa(int lisaaMatkustajia) {
        
    }
    
    public void vahenna(int vahennaMatkustajia) {
        
    }

    /**
     * @return paikat paikkojen maaran
     */
    public int getPaikat() {
        return paikat;
    }
    
    /**
     * @return vapaiden paikkojen maaaran
     */
    public int getvapaitaPaikkoja() {
        return vapaitaPaikkoja;
    }
    /**
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
