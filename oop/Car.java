package oop;

public class Car {
    private String licensePlate;
    private String brand;
    private String model;
    private String colour;

    // Constrctor voor een auto
    public Car(String licensePlate, String brand, String model, String colour) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
        this.colour = colour;
    }

    // Getters voor alle eigenschappen van de auto 
    public String getLicensePlate() {
        return licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }
}
