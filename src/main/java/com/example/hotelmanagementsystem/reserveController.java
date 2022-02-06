package com.example.hotelmanagementsystem;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class reserveController implements Initializable {
    String[] s = {"Male","Female"};
    @FXML
    private TextField acctxt;

    @FXML
    private Button backbtn;

    @FXML
    private ComboBox<String> bedtypetxt;

    @FXML
    private TextField cidtxt;

    @FXML
    private Button clearbtn;

    @FXML
    private TextField codtxt;

    @FXML
    private TextField emailtxt;

    @FXML
    private TextField nametxt;

    @FXML
    private TextField phonenotxt;

    @FXML
    private Button reservebtn;

    @FXML
    private ComboBox<String> roomtypetxt;

    @FXML
    private ComboBox<String> sextxt;



    public void back(ActionEvent event) throws IOException {
        FXMLLoader fxml = new FXMLLoader(Main.class.getResource("login.fxml"));
        Scene sc = new Scene(fxml.load(), 700,400);
        Stage st = (Stage) ((Node)event.getSource()).getScene().getWindow();
        st.setScene(sc);
        st.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        sextxt.setItems(FXCollections.observableArrayList("Male","Female"));
        roomtypetxt.setItems(FXCollections.observableArrayList("A", "B","C", "D","E"));
        bedtypetxt.setItems(FXCollections.observableArrayList("t1", "t2","t3", "t4","t5"));
    }
}