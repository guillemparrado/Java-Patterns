package cat.barcelonactiva.itacademy.Ex1_3_Command.services;

import cat.barcelonactiva.itacademy.Ex1_3_Command.commands.SlowDownCommand;
import cat.barcelonactiva.itacademy.Ex1_3_Command.commands.SpeedCommand;
import cat.barcelonactiva.itacademy.Ex1_3_Command.commands.SpeedUpCommand;
import cat.barcelonactiva.itacademy.Ex1_3_Command.commands.TurnOnCommand;
import cat.barcelonactiva.itacademy.Ex1_3_Command.exceptions.VehicleDoesntExistException;
import cat.barcelonactiva.itacademy.Ex1_3_Command.exceptions.VehicleExistsException;
import cat.barcelonactiva.itacademy.Ex1_3_Command.models.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class Parking {
    Map<Vehicle, SpeedCommand[]> vehicleCommands = new HashMap<>();

    /**
     * Add a Vehicle to the parking and instantiate and map its commands
     * @param v
     * @throws VehicleExistsException
     */
    public void addVehicle(Vehicle v) throws VehicleExistsException {
        // Error: vehicle already exists
        for (Vehicle v2 : vehicleCommands.keySet())
            if (v.getClass() == v2.getClass())
                throw new VehicleExistsException();

        // Success: save vehicle + its commands
        vehicleCommands.put(v, new SpeedCommand[]{
                new TurnOnCommand(v),
                new SpeedUpCommand(v),
                new SlowDownCommand(v)});
    }

    /**
     * This is the same method that `addVehicle` but prints an error instead of throwing an exception when the
     * vehicle already exists in the pool.
     * @param v
     */
    public void safeAdd(Vehicle v){
        try {
            addVehicle(v);
        } catch (VehicleExistsException e) {
            System.out.println("Error: Vehicle " + v + " already exists.");
        }
    }

    public void turnOn(Vehicle v) throws VehicleDoesntExistException {
        execute(v, 0);
    }

    public void speedUp(Vehicle v) throws VehicleDoesntExistException {
        execute(v, 1);
    }

    public void slowDown(Vehicle v) throws VehicleDoesntExistException {
        execute(v, 2);
    }

    private void execute(Vehicle v, int commandIndex) throws VehicleDoesntExistException {
        if(!vehicleCommands.containsKey(v))
            throw new VehicleDoesntExistException(v.toString());
        vehicleCommands.get(v)[commandIndex].execute();
    }


    @Override
    public String toString() {
        return "Parking{" +
                "vehicles=" + vehicleCommands.keySet() +
                '}';
    }
}
