package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public TextField name;
    public TextField age;
    public TextField bdate;
    public TextField phn;
    public TextField sex;

    public Button btn;
    public TextArea otext;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

    public void print(ActionEvent actionEvent) {
        String nAME = name.textProperty().get();
        String aGE = age.textProperty().get();
        String bDATE = bdate.textProperty().get();
        String pHN = phn.textProperty().get();
        String sEX = sex.textProperty().get();

        otext.textProperty().set("My Basic Informations are :\n\nMy name is " + nAME + ".\nI am " + aGE + " years old.\nMy Birth Date is " + bDATE + ".\nMy Phone Number is " +pHN+".");

    }
}
