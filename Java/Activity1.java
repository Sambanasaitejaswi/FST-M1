package Activities;

import java.util.Arrays;

public class Activity1 {
    public static void main(String[] args) {
        Car Hyundai = new Car();
        Hyundai.color = "Black";
        Hyundai.make = 2014;
        Hyundai.transmission = "Manual";
        Hyundai.displayCharacteristics();
        Hyundai.accelarate();
        Hyundai.brake();
    }


    public static class Car {
        String color;
        String transmission;
        int make;
        int tyres;
        int doors;

        Car() {
            tyres = 4;
            doors = 4;
        }

        public void displayCharacteristics() {
            System.out.println("Colour of the car is " + color);
            System.out.println("Make of the car is " + make);
            System.out.println("Transmission of the car is " + transmission);
        }

        public void accelarate() {
            System.out.println("Car is moving forward.");
        }

        public void brake() {
            System.out.println("Car has stopped.");
        }
    }


}