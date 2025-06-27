package oop;

import java.util.ArrayList;

public class Garage {
    private static int uniqueIdCounter = 1; // Tel elke garae uniek

    private int id;
    private int maxCapacity; // Max aantal auto's dat in deze garage mag
    private ArrayList<Car> parkedCars; // De auto's die nu geparkeerd staan

    public Garage(int maxCapacity) {
        this.id = uniqueIdCounter++; // Elke garage krijgt een eigen id
        this.maxCapacity = maxCapacity;
        this.parkedCars = new ArrayList<>();
    }

    // Kijken of auto geldig is om te parkeren
    public boolean checkIfValid(Car car, License license) {
        // As garage vol is, kan je niks meer parkeren
        if (parkedCars.size() >= maxCapacity) {
            return false;
        }

        // Check of de license wel bij de auto hoort (op kenteken)
        if (!car.getLicensePlate().equals(license.getLicenseHolderPlate())) {
            return false;
        }

        // Check of license wel geldig is voor deze garage
        if (license.getValidInGarageId() != this.id) {
            return false;
        }

        return true; // Alles klopt, auto mag geparkeerd worden
    }

    // Parkeer de auto als het mag
    public boolean parkCar(Car car, License license) {
        if (checkIfValid(car, license)) {
            parkedCars.add(car);
            return true;
        }
        return false; // Auto mocht er niet in
    }

    // Verwijder een auto uit de garage 
    public void unparkCar(Car car) {
        parkedCars.removeIf(c -> c.getLicensePlate().equals(car.getLicensePlate()));
    }

    public int getId() {
        return id;
    }

    public int getCapacity() {
        return parkedCars.size();
    }

    // Zoek een auto op kenteken
    public Car getCarByLicense(String license) {
        for (Car c : parkedCars) {
            if (c.getLicensePlate().equals(license)) {
                return c;
            }
        }
        return null; // Auto niet gevonden
    }

    // Haal een lijst met auto's die hetzefde model hebben
    public ArrayList<Car> getCarsByModel(String model) {
        ArrayList<Car> matchingCars = new ArrayList<>();
        for (Car c : parkedCars) {
            if (c.getModel().equals(model)) {
                matchingCars.add(c);
            }
        }
        return matchingCars;
    }
}

