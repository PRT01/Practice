package OOPs_Basic;

class Vehicle {
    private String brand;
    private int year;

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    void start() {
        System.out.println("The vehicle is starting.");
    }

    void stop() {
        System.out.println("The vehicle is stopping.");
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    void honk() {
        System.out.println("Honk!");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setBrand("Toyota");
        myCar.setYear(2022);
        myCar.setNumberOfDoors(4);

        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Year: " + myCar.getYear());
        myCar.start();
        myCar.stop();

        System.out.println("Number of doors: " + myCar.getNumberOfDoors());
        myCar.honk();
    }
}
