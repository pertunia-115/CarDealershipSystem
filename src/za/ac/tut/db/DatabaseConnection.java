/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pertu
 */
public class DatabaseConnection {
    public static Connection connect() throws SQLException{
        try {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
        String url="jdbc:derby://localhost:1527/Car; create=true";
        String user = "Car";
        String pass="car";
        return DriverManager.getConnection(url,user,pass);
    }
}
