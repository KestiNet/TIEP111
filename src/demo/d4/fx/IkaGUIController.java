package demo.d4.fx;

import fi.jyu.mit.ohj2.Mjonot;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 * @author lange
 * @version 5.10.2022
 *
 */
public class IkaGUIController {

    @FXML private TextField texSyntyma;

    @FXML private TextField texVanha;
    
    @FXML void keyReleased() {
        laske();
    }

    private static int haeLuvut(TextField teksti, int arvo) {
        int luku = Mjonot.erotaInt(teksti.getText(), arvo);
        return luku;
    }
    
    /**
     * @param text mihin tekstikenttaan luku sijoitetaan
     * @param luku mika vastaa ikaa
     */
    public static void asetaTulos(TextField text, int luku) {
        String summa = String.format("%2d",luku);
        //summa = summa.replace(',', '.');
        text.setText(summa);
    } 
    
    private void laske() {
        int syntymaVuosi = haeLuvut(texSyntyma, 0);
        int ika = 2022 - syntymaVuosi;
        
        
      
        asetaTulos(texVanha, ika);
}
    
}
