/*
 * THIS CLASS IS FXML CONTROLLER FOR THE CALCULATOR
 */
package javafxcalculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author DANIYAL IBRAHIM
 */
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;

public class FXMLDocumentController implements Initializable {
    
    //FXML TAGS ARE HERE DEFINED
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField TEXTAREA;

    @FXML
    private Button RSBRACE;

    @FXML
    private Button NUM2;

    @FXML
    private Button NUM3;

    @FXML
    private Button DIVIDE;

    @FXML
    private Button FCBRACE;

    @FXML
    private Button NUM4;

    @FXML
    private Button NUM7;

    @FXML
    private Button PERIOD;

    @FXML
    private Button CALCULATE;

    @FXML
    private Button NUM5;

    @FXML
    private Button NUM8;

    @FXML
    private Button NUM0;

    @FXML
    private Button CLEAR;

    @FXML
    private Button NUM6;

    @FXML
    private Button NUM9;

    @FXML
    private Button PERCENTAGE;

    @FXML
    private Button MULTIPLY;

    @FXML
    private Button ADD;

    @FXML
    private Button RCBRACE;

    @FXML
    private Button FFBRACE;

    @FXML
    private Button FSBRACE;

    @FXML
    private Button SUB;

    @FXML
    private Button SQUARE;

    @FXML
    private Button RFBRACE;

    @FXML
    private Button NUM1;

    @FXML
    private MenuItem closeButton;
    
    
    @FXML
    private MenuItem COPY;
    
   
    // SOME CHAR ARRAY'S TO HOLD THE VALUES
    String[] digits = {"0", "1"," 2", "3"," 4", "5"," 6"," 7"," 8", "9"};
    char[] OPERATORS = {'+','-','/','*','%','^','(',')','[',']','{','}'};
    char[] BRACES = {'(',')','[',']','{','}'};
    char[] NONBRACES = {'+','-','/','*','%','^'};
    
    @FXML
    void onClickCopy(){
        TEXTAREA.copy();
    }
    @FXML
    void OnClickNum5(ActionEvent event) {
        TEXTAREA.setText(TEXTAREA.getText() + "" + digits[5]);
    }

    @FXML
    void OnClickPercentage(ActionEvent event) {
        TEXTAREA.setText(TEXTAREA.getText() + "" + NONBRACES[4]);
    }

    @FXML
    void onClickAdd(ActionEvent event) {
        TEXTAREA.setText(TEXTAREA.getText() + "" + NONBRACES[0]);
    }

    @FXML
    void onClickCBracesClose(ActionEvent event) {
           TEXTAREA.setText(TEXTAREA.getText() + "" + BRACES[1]);
        
    }
    
    @FXML
    void onClickCBracesOpen(ActionEvent event){
        TEXTAREA.setText(TEXTAREA.getText() + "" + BRACES[0]);
    
    }
    
    @FXML
    
    void onClickClose(ActionEvent event){
         // GET A HANDLE TO STAGE
        Stage stage = (Stage) closeButton.getParentPopup().getScene().getWindow();
        // CLOSE THE STAGE
        stage.close();
    }

    /**
     * THIS METHOD ADDS A NEW STAGE WITH ABOUT
     * @param event 
     */
    @FXML    
    void onClickAbout(ActionEvent event){
        
        Stage stage = new Stage();
        HBox hb = new HBox();
        Text tf = new Text() ;
        
        hb.setPadding(new Insets(10,10,10,10));
        hb.setAlignment(Pos.TOP_CENTER);
        tf.setText("*************   Calculator 1.0   ****************** \n This Calculator is Created Using Java jdk-1.8.0_221 \n Scene Builder  was used for the GUI-Development \n in NetBeans 8.2 IDE \n from \n Daniyal Ibrahim \n Date: 10.13.2019");
        hb.getChildren().add(tf);
        
        Scene scene = new Scene (hb,400,200);
        
        stage.setScene(scene);
        stage.show();
    }

    
    /**
     * THIS IS THE BRAIN METHOD OF THE CALCULATOR 
     * @param event THE CALCULATE BUTTON PRESS EVENT
     * @throws javafxcalculator.InfixEvaluator.SyntaxErrorException 
     */
    
    @FXML
    void onClickCalculate(ActionEvent event) throws InfixEvaluator.SyntaxErrorException {
        //THE TEXT AREA IS PASSED TO A STRING THEN TO A METHOD IN THE CLASS INFIXEVALUATOR TO CLEAN THE STRING FROM SPACES
        String a = TEXTAREA.getText().toString();
        ArrayList test = new ArrayList();
        InfixEvaluator fixy = new InfixEvaluator();
        String g = a.toString();
        test = fixy.inputCleaner(g);
        // GETTING THE CLEAN STRING
        for (int z = 0; z < test.size(); z++) {
            System.out.println(test.get(z));
        }
        // CALCULATE THE ANSWER BY CALLING THE METHOD INFIX CALCULATOR
        String answer = fixy.infixCalculator(test);
        TEXTAREA.setText(""+answer);
        test.clear();
    }

    @FXML
    void onClickClear(ActionEvent event) {
        TEXTAREA.clear();
        TEXTAREA.getText();
    }

    @FXML
    void onClickDivide(ActionEvent event) {
        TEXTAREA.setText(TEXTAREA.getText() + "" + NONBRACES[2]);
    }

    @FXML
    void onClickFBracesClose(ActionEvent event) {
        TEXTAREA.setText(TEXTAREA.getText() + "" + BRACES[5]);
    }

    @FXML
    void onClickFBracesOpen(ActionEvent event) {
        TEXTAREA.setText(TEXTAREA.getText() + "" + BRACES[4]);
    }

    @FXML
    void onClickMultiply(ActionEvent event) {
        TEXTAREA.setText(TEXTAREA.getText() + "" + NONBRACES[3]);
    }

    @FXML
    void onClickNum0(ActionEvent event) {
        TEXTAREA.setText(TEXTAREA.getText() + "" + digits[0]);
    }

    @FXML
    void onClickNum1(ActionEvent event) {
        TEXTAREA.setText(TEXTAREA.getText() + "" + digits[1]);
    }

    @FXML
    void onClickNum2(ActionEvent event) {
        TEXTAREA.setText(TEXTAREA.getText() + "" + digits[2]);
    }

    @FXML
    void onClickNum3(ActionEvent event) {
        TEXTAREA.setText(TEXTAREA.getText() + "" + digits[3]);
    }

    @FXML
    void onClickNum4(ActionEvent event) {
        TEXTAREA.setText(TEXTAREA.getText() + "" + digits[4]);
    }

    @FXML
    void onClickNum6(ActionEvent event) {
        TEXTAREA.setText(TEXTAREA.getText() + "" + digits[6]);
    }

    @FXML
    void onClickNum7(ActionEvent event) {
        TEXTAREA.setText(TEXTAREA.getText() + "" + digits[7]);
    }

    @FXML
    void onClickNum8(ActionEvent event) {
        TEXTAREA.setText(TEXTAREA.getText() + "" + digits[8]);
    }

    @FXML
    void onClickNum9(ActionEvent event) {
        TEXTAREA.setText(TEXTAREA.getText() + "" + digits[9]);
    }

    @FXML
    void onClickPeriod(ActionEvent event) {
        TEXTAREA.setText(TEXTAREA.getText() + ".");
        
    }

    @FXML
    void onClickSBracesClose(ActionEvent event) {
        TEXTAREA.setText(TEXTAREA.getText() + "" + BRACES[3]);
    }

    @FXML
    void onClickSBracesOpen(ActionEvent event) {
        TEXTAREA.setText(TEXTAREA.getText() + "" + BRACES[2]);
    }

    @FXML
    void onClickSquare(ActionEvent event) {
        TEXTAREA.setText(TEXTAREA.getText() + "" + NONBRACES[5]);
    }

    @FXML
    void onClickSubtract(ActionEvent event) {
        TEXTAREA.setText(TEXTAREA.getText() + "" + NONBRACES[1]);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    @FXML
    void initialize() {
        
    }
}
