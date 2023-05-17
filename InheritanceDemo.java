// Base class
class Vehicle {
    protected String brand;
    public Vehicle(String brand) {
        this.brand = brand;
    }
    public void display() {
        System.out.println("Brand: " + brand);
    }
}
// Derived class inheriting from Vehicle (Single Inheritance)
class Car extends Vehicle {
    private String model;
    public Car(String brand, String model) {
        super(brand);
        this.model = model;
    }
    public void display() {
        super.display();
        System.out.println("Model: " + model);
    }
}
// Derived class inheriting from Car (Multilevel Inheritance)
class SportsCar extends Car {
    private int topSpeed;
    public SportsCar(String brand, String model, int topSpeed) {
        super(brand, model);
        this.topSpeed = topSpeed;
    }
    public void display() {
        super.display();
        System.out.println("Top Speed: " + topSpeed + " km/h");
    }
}
// Derived class inheriting from Vehicle and implementing an interface (Multiple Inheritance)
interface Flyable {
    void fly();
}
class Jet implements Flyable {
    private String name;
    public Jet(String name) {
        this.name = name;
    }
    public void fly() {
        System.out.println(name + " is flying.");
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        // Single Inheritance
        Car car = new Car("Toyota", "Corolla");
        car.display();
        System.out.println();
        // Multilevel Inheritance
        SportsCar sportsCar = new SportsCar("Ferrari", "488 GTB", 330);
        sportsCar.display();
        System.out.println();
        // Multiple Inheritance
        Jet jet = new Jet("Boeing 747");
        jet.fly();
    }
}
