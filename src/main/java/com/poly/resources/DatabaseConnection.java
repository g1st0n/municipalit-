package com.poly.resources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnection {

    public static void main(String[] args) {
        DatabaseConnection conn = new DatabaseConnection();
        conn.createConnection();

    }

    public static Connection createConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/municipalite?serverTimezone=UTC", "root", "root");
            System.out.print("Databse Connection Success");
        } catch (ClassNotFoundException e) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, e);
        }
        if (con != null) {
            return con;
        }
        return con;
    }
}