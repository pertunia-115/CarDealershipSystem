/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tut.ac.za.CarDealership.Car;
import za.ac.tut.db.DatabaseConnection;
import static za.ac.tut.db.DatabaseConnection.connect;

/**
 *
 * @author pertu
 */
public class CarDAOImpl implements CarDAO {

    @Override
    public void addCar(Car car) {
        String sql = "INSERT INTO Car ( make , model, manufacture_year, price VALUES ( ?,?,?,?)";
        try (Connection connect = DatabaseConnection.connect(); PreparedStatement stmt = connect.prepareStatement(sql)) {
            stmt.setString(1, car.getMake());
            stmt.setString(2, car.getModel());
            stmt.setInt(3, car.getManufatureYear());
            stmt.setDouble(4, car.getPrice());
            stmt.executeUpdate();
            System.out.println("Car added successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();
        String sql = "SELECT  *FROM Car  ";
        try (Connection conn = DatabaseConnection.connect(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                cars.add(new Car(
                        rs.getInt("id"),
                        rs.getString("make"),
                        rs.getString("model"),
                        rs.getInt("manufacture_year"),
                        rs.getDouble("price")
                ));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return cars;

    }
}
