package co.thebeat.ExerciseM;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();

        car.getNumberOfDoors();
        car.getLitres();
        car.getMaximumSpeed();

        Motor motor = new Car();
        motor.getLitres();
        ((Car) motor).getNumberOfDoors();
    }
}
