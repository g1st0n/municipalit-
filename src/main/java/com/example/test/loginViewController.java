package com.example.test;

import com.poly.controller.UserController;
import com.poly.models.User;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class loginViewController {
    UserController uc = new UserController();
    @FXML
    private Button loginBtn;

    @FXML
    private TextField loginCinTF;

    @FXML
    private TextField loginPasswordTF;

    @FXML
    void Login(ActionEvent event) throws IOException {
        User user = new User();
        //user = uc.findUser(Integer.parseInt(loginCinTF.getText()),loginPasswordTF.getText());
        Alert a = new Alert(Alert.AlertType.WARNING);
        if(user !=null && user.getEmail()!=null){
            a.setContentText("Login Succesful");
            a.show();
            }else {
            a.setAlertType(Alert.AlertType.ERROR);
            a.setContentText("Error");
            a.show();
        }

    }
    @FXML
    private void initialize() {
        loginBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Logging in");
                try {
                    Login(event);
                    Parent myNewScene ;
                    myNewScene = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
                    Scene scene = null;
                    scene = new Scene(myNewScene);
                    Stage stage = (Stage) loginBtn.getScene().getWindow();
                    stage.setScene(scene);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}