package com.poly.controller;

import com.poly.models.Societe;
import com.poly.resources.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SocieteController {

    private DatabaseConnection conn = new DatabaseConnection();
    Connection connection = conn.createConnection();

    public Societe addSociete(String name) {
        try {
            PreparedStatement stm = connection.prepareStatement("insert into societe values(?)");
            stm.setString(1, name);
            int i = stm.executeUpdate();
            System.out.println(i + " records inserted");
            stm.close();
        } catch (SQLException e) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, e);
        }
        return null ;
    }
}
