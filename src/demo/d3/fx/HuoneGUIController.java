package demo.d3.fx;

import fi.jyu.mit.ohj2.Mjonot;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 * @author Esa Kesti
 * @version 2.10.2022
 *
 */
public class HuoneGUIController {

    @FXML private TextField texKorkeus;

    @FXML private TextField texLeveys;

    @FXML private TextField texPintaala;

    @FXML private TextField texPituus;

    @FXML private TextField texTilavuus;

    @FXML void keyReleased() {
        laske();
    }
    
    private static double haeLuvut(TextField teksti, double arvo) {
        double luku = Mjonot.erotaDouble(teksti.getText(), arvo);
        return luku;
    }
    
    /**
     * @param text tekstikettan mihin luku asetetaan
     * @param luku laskettavaa luku
     */
    public static void asetaTulos(TextField text, double luku) {
        String summa = String.format("%5.2f",luku);
        summa = summa.replace(',', '.');
        text.setText(summa);
    } 
    
    private void laske() {
        double leveys = haeLuvut(texLeveys, 0) / 100;
        double pituus = haeLuvut(texPituus, 0) / 100;
        double korkeus  = haeLuvut(texKorkeus, 0) / 100;
        double pintaAla = leveys * pituus;
        double tilavuus = leveys * pituus *korkeus;
        asetaTulos(texPintaala, pintaAla);        
        asetaTulos(texTilavuus, tilavuus);
}
}