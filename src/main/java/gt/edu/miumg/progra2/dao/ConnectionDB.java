/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.miumg.progra2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author melgust
 */
public class ConnectionDB {

    String dbUrl = "jdbc:mysql://localhost:3306/demoumg";
    String username = "userdemo";
    String password = "SuperCl4ve";

    public Connection openDB() throws SQLException {
        Connection connection = DriverManager.getConnection(dbUrl, username, password);
        if (connection == null) {
            throw new SQLException("Can't connection to database");
        }
        return connection;
    }

}
