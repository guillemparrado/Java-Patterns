package cat.barcelonactiva.itacademy.Ex1_3_Command;

import cat.barcelonactiva.itacademy.Ex1_3_Command.exceptions.VehicleDoesntExistException;
import cat.barcelonactiva.itacademy.Ex1_3_Command.models.Aeroplane;
import cat.barcelonactiva.itacademy.Ex1_3_Command.models.Bicicle;
import cat.barcelonactiva.itacademy.Ex1_3_Command.models.Boat;
import cat.barcelonactiva.itacademy.Ex1_3_Command.models.Car;
import cat.barcelonactiva.itacademy.Ex1_3_Command.services.Parking;

public class Main {

    public static void main(String[] args) {

        Car c = new Car("12345X");
        Car c2 = new Car("12345X");
        Aeroplane ap = new Aeroplane("12345X");
        Boat bo = new Boat("56789Q");
        Bicicle bi = new Bicicle("24680A");

        Parking p = new Parking();

        p.safeAdd(c);
        p.safeAdd(c2); // Should print error: "Vehicle already exists"
        p.safeAdd(ap);
        p.safeAdd(bo);

        System.out.println(p);

        try{
            p.turnOn(c);
            p.speedUp(c2);  // Should output correctly: it's the same by id
            p.slowDown(ap);
            p.speedUp(bo);
            p.slowDown(bi);  // Should throw error
        } catch (VehicleDoesntExistException e) {
            System.out.println("Error: " + e.getMessage() + " doesn't exist.");
        }
    }
}
