package yhdista;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 * @author lange
 * @version 20.9.2022
 *
 */
public class YhdistaGUIController {

    @FXML
    private TextField editEtu;

    @FXML
    private TextField editKoko;

    @FXML
    private TextField editSuku;

    @FXML
    void handleYhdista() {
        String nimi = editEtu.getText() + " " + editSuku.getText();
        editKoko.setText(nimi);
    }

}
