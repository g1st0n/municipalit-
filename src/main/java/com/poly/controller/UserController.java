package com.poly.controller;

import com.poly.models.User;
import com.poly.resources.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserController {

    DatabaseConnection con = new DatabaseConnection();
    public Connection connection = con.createConnection();

    public void addUser(User user) {
        try {
            PreparedStatement stm = connection.prepareStatement("insert into user values(?,?,?,?,?)");
            stm.setInt(1, user.getIdUser());
            stm.setString(2, user.getNom());
            stm.setString(3, user.getEmail());
            stm.setString(4, user.getPassword());
            stm.setInt(5, user.getCin());
            int i = stm.executeUpdate();
            System.out.println(i + " records inserted");
            stm.close();
        } catch (SQLException e) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public User findUser(int cin, String password) {
        User user = new User();
        try {
            PreparedStatement stm = connection.prepareStatement("SELECT * FROM user WHERE cin= ? and password=? ");
            stm.setInt(1, cin);
            stm.setString(2,password);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                user.setIdUser(rs.getInt("id_user"));
                user.setNom(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setCin(rs.getInt("cin"));
            }
            stm.close();
        } catch (SQLException e) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, e);
        }
        if (user != null) {
            Logger.getLogger("Retreived user "+ user.toString());
            return user;
        }
        return null;
    }
}
