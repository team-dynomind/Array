/* Declare an abstract class Vehicle with an abstract method named
numWheels().provide subclasses Car and Truck that each implements this
method. Create instance of these subclasses and demonstrate the use of this
method */
abstract class Vehicle {

    abstract void numWheels();
}

class Car extends Vehicle {

    public void numWheels() {
        System.out.println("Car has 4 wheel.");
    }
}

class Truck extends Vehicle {

    public void numWheels() {
        System.out.println("Truck has 6 wheel.");
    }
}

class U2P7 {

    public static void main(String args[]) {
        Car car = new Car();
        Truck truck = new Truck();
        car.numWheels();
        truck.numWheels();
    }
}
