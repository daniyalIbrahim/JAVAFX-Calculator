/**
 * THIS IS THE MAIN CLASS OF THE APP CALCULATOR
 */
package javafxcalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author DANIYAL IBRAHIM
 */
public class MainCalculator extends Application {
   /**
    * THIS IS THE STAGE START METHOD
    * @param stage THE STAGE
    * @throws Exception 
    */
    @Override
    public void start(Stage stage) throws Exception {
        try{
        
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        
        } catch(Exception e) {
		e.printStackTrace();
	}
    }

    /**
     * THIS IS THE MAIN METHOD OF THE CALCULATOR APP
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
