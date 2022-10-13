package demo.d5;

import java.io.*;
import fi.jyu.mit.ohj2.*;


/**
 * @author Esa Kesti
 * @version 12.10.2022
 *
 */
public class Henkio {
    private String etunimi;
    private String sukunimi;
    private int syntymavuosi;


    /**
     * Alustetaan henkilön tiedot annetuilla arvoilla
     * @param etunimi henkilön uusi etunimi
     * @param sukunimi henkilön uusi sukunimi
     * @param syntymavuosi henkilön uusi syntymävuosi
     */
    public Henkio(String etunimi, String sukunimi, int syntymavuosi) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.syntymavuosi = syntymavuosi;
    }
    
   

    /**
     * @return tiedot | erotetussa muodossa
     * @example
     * <pre name="test">
     *   Henkilo aku = new Henkilo("Aku","Ankka",1934);
     *   aku.toString() === "Aku|Ankka|1934";
     *   Henkilo pele = new Henkilo("Pele","",1940);
     *   pele.toString() === "Pele||1940";
     * </pre>
     */
    @Override
    public String toString() {
        return etunimi + "|" + sukunimi + "|" + syntymavuosi;
    }


    /**
     * Palautetaan henkilön koko nimi
     * @return henkilön nimi muodossa etunimi sukunimi
     * @example
     * <pre name="test">
     *   Henkilo aku = new Henkilo("Aku","Ankka",1934);
     *   aku.getNimi() === "Aku Ankka";
     *   Henkilo pele = new Henkilo("Pele","",1940);
     *   pele.getNimi() === "Pele";
     * </pre>
     */
    public String getNimi() {
        return (etunimi + " " + sukunimi).trim();
    }


    /**
     * @return henkilön syntymävuosi
     * @example
     * <pre name="test">
     *   Henkilo aku = new Henkilo("Aku","Ankka",1934);
     *   aku.getSyntymavuosi() === 1934;
     * </pre>
     */
    public int getSyntymavuosi() {
        return syntymavuosi;
    }


    /**
     * Tulostetaan henkilön tiedot paramterina tuotuu tietovirtaan
     * @param os tietovirta johon tiedot tulostetaan
     * @example
     * <pre name="test">
     * #import java.io.*;
     * ByteArrayOutputStream byteoutput = new ByteArrayOutputStream();
     * Henkilo hlo = new Henkilo("Aku","Ankka",1934);
     * hlo.tulosta(byteoutput);
     * byteoutput.toString() =R= "Aku Ankka 1934\\s*"
     * </pre>
     */
    public void tulosta(OutputStream os) {
        PrintStream out = new PrintStream(os);
        out.println(etunimi + " " + sukunimi + " " + syntymavuosi);
    }

    // BYCODEBEGIN
    /**
     * tyhja muodostaja
     */
    public Henkio() {
        etunimi = "";
        sukunimi = "";
        syntymavuosi = 0;
    }
    /**
     * @param parsittavaJono jono mista parsitaan
     */
    public Henkio(String parsittavaJono) {
        parse(parsittavaJono);
    }
    /**
     * @param parsittava merkkijono
     * @example
     * <pre name="test">
     *   Henkilo roope = new Henkilo("Roope","Ankka",1904);
     *   roope.parse ("Roope|ankka|1904") === "Roope Ankka 1904";
     */
    public void parse(String parsittava) {
        StringBuilder parsittavaJono = new StringBuilder(parsittava);
        etunimi = Mjonot.erota(parsittavaJono, '|', "|");
        sukunimi = Mjonot.erota(parsittavaJono, '|', "|");
        syntymavuosi = Mjonot.erotaInt(parsittavaJono, syntymavuosi);
        
    }
    
    // BYCODEEND

    /**
     * Testataan henkilöluokkaa
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        Henkio hlo = new Henkio();
        Henkio aku = new Henkio("Aku", "Ankka", 1934);
        System.out.println(hlo);
        hlo.parse("Sepe|Susi|1933");
        hlo.tulosta(System.out);
        aku.tulosta(System.out);
        Henkio mikki = new Henkio("Mikki|Hiiri");
        System.out.println(mikki);
    }
}


