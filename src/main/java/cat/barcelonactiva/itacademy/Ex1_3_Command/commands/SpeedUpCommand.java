package cat.barcelonactiva.itacademy.Ex1_3_Command.commands;

import cat.barcelonactiva.itacademy.Ex1_3_Command.models.Vehicle;

public class SpeedUpCommand implements SpeedCommand {
    private final Vehicle vehicle;

    public SpeedUpCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        this.vehicle.speedUp();
    }
}
