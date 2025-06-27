package oop;

public class Main {
    public static void main(String[] args) {
        // Hier maak ik 2 auto's aan met kentekens, merken modellen en kleure
        Car car1 = new Car("XX-33-XX", "Opel", "Zafira", "Black");
        Car car2 = new Car("YY-44-YY", "Toyota", "Corolla", "Red");

        // Ik maak een garage aan met plek voor 2 auto's
        Garage garage = new Garage(2);

        // Elke auto krijgt een soort vergunning die zegt in welke garage ze geldig zijn
        License license1 = new License(car1, garage.getId());
        License license2 = new License(car2, garage.getId());

        // Hier probeer ik de auto's te parkeren in de garage en prin ik of dat gelukt is
        System.out.println("Car 1 parked: " + garage.parkCar(car1, license1));
        System.out.println("Car 2 parked: " + garage.parkCar(car2, license2));

        // Aantal auto's dat geparkeerd is in de garage
        System.out.println("Total cars in garage: " + garage.getCapacity());

        // Probere een auto op te zoeken in de garage via kenteken
        Car foundCar = garage.getCarByLicense("XX-33-XX");
        System.out.println("Found car brand: " + (foundCar != null ? foundCar.getBrand() : "niet gevonden"));
    }
}
