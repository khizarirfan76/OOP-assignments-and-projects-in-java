class Car extends Vehicle {
    private int numDoors;

    public Car(String licensePlate, int numDoors) {
        this.licensePlate = licensePlate;
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }
}



class Truck extends Vehicle {
    private double cargoCapacity;

    public Truck(String licensePlate, double cargoCapacity) {
        this.licensePlate = licensePlate;
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
}


class Vehicle {

    protected String licensePlate = null;

    public void setLicensePlate(String license) {
        this.licensePlate = license;
    }
}


