package com.example.hotelmanagementsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class adminController {

        @FXML
        private Label adminspagetxt;

        @FXML
        private Button checkoutbtn;

        @FXML
        private Label checkoutroomtxt;

        @FXML
        private Button logoutbtn;

        @FXML
        private Button reservebtn;

        @FXML
        private Label reserveroomtxt;

        public void logout(ActionEvent event) throws IOException {
            FXMLLoader fxml = new FXMLLoader(Main.class.getResource("login.fxml"));
            Scene sc = new Scene(fxml.load(), 700,400);
            Stage st = (Stage) ((Node)event.getSource()).getScene().getWindow();
            st.setScene(sc);
            st.show();
        }

    }



