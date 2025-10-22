/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.tut.dao;

/**
 *
 * @author pertu
 */
import java.util.List;
import tut.ac.za.CarDealership.Car;

public interface CarDAO {
    void addCar(Car car);
    List<Car> getAllCars();
}
