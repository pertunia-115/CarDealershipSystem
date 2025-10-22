/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tut.ac.za.CarDealership;

/**
 *
 * @author pertu
 */
public class Car {

    private int Id;
    private String make;
    private String model;
    private int manufatureYear;
    private double price;

    public Car(int Id, String make, String model, int manufatureYear, double price) {
        this.Id = Id;
        this.make = make;
        this.model = model;
        this.manufatureYear = manufatureYear;
        this.price = price;
    }

    public Car(String make, String model, int manufatureYear, double price) {
        this.make = make;
        this.model = model;
        this.manufatureYear = manufatureYear;
        this.price = price;
    }

    public int getId() {
        return Id;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getManufatureYear() {
        return manufatureYear;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" + "Id=" + Id + ", make=" + make + ", model=" + model + ", manufatureYear=" + manufatureYear + ", price=" + price + '}';
    }
    

}
