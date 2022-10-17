package demo.d5;

import java.io.OutputStream;
import java.io.PrintStream;

/**
 * @author Esa Kesti
 * @version 17.10.2022
 *
 */
public class LinjaAuto {
    
    private int paikat = 60;
    private int vapaitaPaikkoja;
    
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
     * muodostaja
     * @param paikat paikkojen maara
     */
    public LinjaAuto(int paikat) {
        this.paikat = paikat;
        //this.vapaitaPaikkoja = vapaitaPaikkoja;
    }

    /**
     * @return paikat paikkojen maaran
     */
    //public int getPaikat() {
      //  return paikat;
    //}
    
    /**
     * @return vapaiden paikkojen maaaran
     */
    public int getTilaa() {
        return vapaitaPaikkoja;
       }
    
    public boolean Tilaa() {
        return vapaitaPaikkoja >0;
    }
    
    /**
     * Tulostus metodi
     * @param os outputstream
     */
    public void tulosta(OutputStream os) {
        PrintStream out = new PrintStream(os);
        int matkustajat = paikat-vapaitaPaikkoja;
        out.println("Linja-autoon mahtuu" + paikat + "matkustajia talla hetkella: " + matkustajat + "vapaita paikkoja jaljella: " + vapaitaPaikkoja);
    }
    
    /**
     * @param lisaaMatkustajia lisätään matkustajia
     * @return palauttaa montako matkustajaa on liikaa tai 0 jos ehto ei toteudu
     */
    public int lisaa(int lisaaMatkustajia) {
       if (lisaaMatkustajia > vapaitaPaikkoja) {
           int liikaaMatkustajia = vapaitaPaikkoja - lisaaMatkustajia;
           return liikaaMatkustajia;
       }
    vapaitaPaikkoja -= lisaaMatkustajia;
       
       return 0;
    }
    
    /**
     * @param vahennaMatkustajia vähennetään matkustajia
     * @return palauttaa paljonko matkustajia poistui kyydista 
     * paivittaa myos vapaiden paikkojen maaran
     */
    public int vahenna(int vahennaMatkustajia) {
        int matkustajat = paikat - vahennaMatkustajia;
        if ( matkustajat > paikat) {
           return matkustajat - paikat;
            
        }
        vapaitaPaikkoja += vahennaMatkustajia;
        return 0;
    }

   
    
    
    /**
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        LinjaAuto pikkubussi = new LinjaAuto(10);
        LinjaAuto isobussi = new LinjaAuto(45);
        pikkubussi.lisaa(4);    pikkubussi.tulosta(System.out); // 10,4,6
        isobussi.lisaa(30);     isobussi.tulosta(System.out);   // 45,30,15
        int yli = pikkubussi.lisaa(15);
        isobussi.lisaa(yli);
        pikkubussi.tulosta(System.out);                         // 10,10,0
        isobussi.tulosta(System.out);                           // 45,39,6
        if ( pikkubussi.getTilaa() > 0 )
            System.out.println("Pieneen bussiin mahtuu!");   // ei tulosta
        if ( isobussi.getTilaa() )
            System.out.println("Isoon bussiin mahtuu!");     // tulostaa
        int vajaa = pikkubussi.vahenna(12);                  // vajaa = -2
        if ( vajaa < 0 )
            System.out.println("Pikkubussissa ei edes ole näin montaa!");
        pikkubussi.tulosta(System.out);
    }

  

}
