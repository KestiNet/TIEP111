package demo.dd4;
/**
 * @author lange
 * @version 8.10.2022
 *
 */
public class Henkilo {

    private String etuNimi;
    private String sukuNimi;
    private int syntymaVuosi;
    
    /**
     * Muodostaja luokalle
     * @param etuNimi etunimi
     * @param sukuNimi sukunimi
     * @param syntymaVuosi syntymavuosi
     */
    public Henkilo(String etuNimi, String sukuNimi, int syntymaVuosi) {
        this.etuNimi = etuNimi;
        this.sukuNimi = sukuNimi;
        this.syntymaVuosi = syntymaVuosi;
    }
    
    /**
     * @return palauttaa syntymavuoden
     */
    public  int getSyntymavuosi() {
        return syntymaVuosi;
        
    }
    /**
    
     * @return palauttaa nimen
     */
    public  String getNimi() {
        return etuNimi+" " + sukuNimi;
    }
    
    @Override
    public String toString() {
        return String.format(etuNimi+"|"+sukuNimi+"|"+ "%02d", syntymaVuosi);
    }
    
    
    /**
     * @param args ei kaytossa
     */
    public static void main(String[] args) {
        Henkilo aku = new Henkilo("Aku", "Ankka", 1934);
        System.out.println(aku.getNimi());  // tulostaa Aku Ankka
        System.out.println(aku.getSyntymavuosi());  // tulostaa 1934
        System.out.println(aku.toString()); // tulostaa Aku|Ankka|1934
    }

   
}