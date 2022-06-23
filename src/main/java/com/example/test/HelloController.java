package com.example.test;

import com.poly.controller.SocieteController;
import com.poly.models.Societe;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;

public class HelloController {

    @FXML
    private Button addSoc;

    @FXML
    private Label adminid;

    @FXML
    private ImageView adminimage;

    @FXML
    private Label adminname;

    @FXML
    private TableColumn<?, ?> cusaddress;

    @FXML
    private TableColumn<?, ?> cusbalance;

    @FXML
    private TableColumn<?, ?> cusid;

    @FXML
    private TableColumn<?, ?> cusname;

    @FXML
    private TableColumn<?, ?> cusphone;

    @FXML
    private TableView<?> customertable;

    @FXML
    private Button loadcusinfo;

    @FXML
    private Label welcome;

    @FXML
    void executeAddSoc(ActionEvent event) {
    Societe societe = new Societe()  ;
    SocieteController sc = new SocieteController();
    }

}
