package com.example.hotelmanagementsystem;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeController {

    @FXML
    private ToggleButton aloginbtn;

    @FXML
    private TextField anametxt;

    @FXML
    private TextField apasstxt;

    @FXML
    private ToggleButton signbtn;

    @FXML
    private ToggleButton uloginbtn;

    @FXML
    private TextField unametxt;

    @FXML
    private TextField upasstxt;

    @FXML
    void adminLog(ActionEvent event) {

    }

    @FXML
    void signup(ActionEvent event) throws IOException {
FXMLLoader fx = new FXMLLoader(Main.class.getResource("Signupass.fxml"));
Scene sc = new Scene(fx.load(),900,500);
Stage st = (Stage) ((Node)event.getSource()).getScene().getWindow();
st.setScene(sc);
st.show();
    }

    @FXML
    void userLogin(ActionEvent event) {

    }

}
