package yhdista;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;


/**
 * @author lange
 * @version 20.9.2022
 *
 */
public class YhdistaMain extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader ldr = new FXMLLoader(getClass().getResource("YhdistaView.fxml"));
            final Pane root = ldr.load();
            //final YhdistaGUIController yhdistaCtrl = (YhdistaGUIController) ldr.getController();
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("yhdista.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.setTitle("Yhdista");
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param args Ei käytössä
     */
    public static void main(String[] args) {
        launch(args);
    }
}