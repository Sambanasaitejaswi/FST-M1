package activities;

public class Activity1 {
    public static void main(String[] args){
        Car tata = new Car();
        tata.color = "Black";
        tata.transmission = "Manual";
        tata.make = 2014;

        tata.displayCharacteristics();
        tata.accelarate();
        tata.brake();
    }
}

class Car{
    String color, transmission;
    int make, tyres, doors;
    Car(){
        this.tyres = 4;
        this.doors = 4;
    }

    public void displayCharacteristics(){
        System.out.println("Color of the Car is "+color);
        System.out.println("Make of the car is "+make);
        System.out.println("Transmission of the car is "+transmission);
        System.out.println("Tyres of car are "+tyres);
        System.out.println("Doors of Car are "+doors);
    }

    public void accelarate(){
        System.out.println("Car is moving forward");
    }

    public void brake(){
        System.out.println("Car has stopped");
    }
}
