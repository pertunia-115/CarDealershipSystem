/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.main;

import java.util.List;
import tut.ac.za.CarDealership.Car;
import za.ac.tut.dao.CarDAOImpl;

/**
 *
 * @author pertu
 */
public class Main {

    public static void main(String[] args) {
        CarDAOImpl dao = new CarDAOImpl();
        Thread loadThread = new Thread(() -> {
            System.out.println("Loading cars...");
            List<Car> cars = dao.getAllCars();
            for (Car car : cars) {
                System.out.println(car);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }

            }
            System.out.println("Finished loading cars!");
        });
        loadThread.start();
    }
}
