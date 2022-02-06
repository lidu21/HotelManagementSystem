package com.example.hotelmanagementsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
String user = "Lidu";
String pass = "1234";
    @FXML
    private Button forgetbtn;

    @FXML
    private Button loginbtn;

    @FXML
    private PasswordField passtxt;

    @FXML
    private Button signupbtn;

    @FXML
    private TextField usernametxt;

    @FXML
    void forgetMethod(ActionEvent event) {

    }

    @FXML
    void loginMethod(ActionEvent event) throws IOException {
if((usernametxt.getText().equals(user))&&(passtxt.getText().equals(pass))){
    FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("admin.fxml"));
    Scene sc = new Scene(fxmlLoader.load(), 700,400);
    Stage st = (Stage) ((Node) event.getSource()).getScene().getWindow();
    st.setScene(sc);
    st.show();
        }
        else{
            System.out.println("incorrect username or password");
        }
    }

    @FXML
    void signupMethod(ActionEvent event) throws IOException {
     try {
         FXMLLoader loader = new FXMLLoader(Main.class.getResource("reserve.fxml"));
         Scene resScene = new Scene(loader.load(),700,400);
         Stage resStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
         resStage.setScene(resScene);
         resStage.show();
     }
     catch (Exception e){
         e.printStackTrace();
     }
    }

}
