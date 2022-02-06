package com.example.hotelmanagementsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;

public class signupController {
DatabaseConn db = new DatabaseConn();
Connection con = db.connectionMethod();
    @FXML
    private PasswordField confirmpass;

    @FXML
    private Label signuptxt;

    @FXML
    private TextField unametxt;

    @FXML
    private PasswordField upasstxt;

    @FXML
    private Button usignupbtn;

    @FXML
    void signup(ActionEvent event) {
        if (upasstxt.getText().equals(confirmpass.getText())) {
            String q = "insert into USERS(NAME,PASSWORD) values('" + unametxt.getText() + "','" + upasstxt.getText() + "')";
            try {
                ResultSet rs = con.createStatement().executeQuery(q);
                while (rs.next())
                    JOptionPane.showMessageDialog(null, "registrationSucessfull");
            } catch (Exception e) {

            }
        }
    else
        {
            JOptionPane.showMessageDialog(null, "password does not meet...");
        }
    }

}
