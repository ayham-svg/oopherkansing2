package oop;

public class License {
    private static int uniqueIdCounter = 1; // Deze telt elke nieuwe license op

    private Car licenseHolder; // De auto waarvoor de licens is
    private int id;
    private int validGarageId; // De garage war deze license geldig is

    // Constructor (ja ik weet wat dat is) om een nieuwe license aan te maken
    public License(Car licenseHolder, int validInGarageId) {
        this.licenseHolder = licenseHolder;
        this.validGarageId = validInGarageId;
        this.setId(uniqueIdCounter++); // Elke license krijgt unieke id
    }

    public String getLicenseHolderPlate() {
        return licenseHolder.getLicensePlate();
    }

    public int getValidInGarageId() {
        return validGarageId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

