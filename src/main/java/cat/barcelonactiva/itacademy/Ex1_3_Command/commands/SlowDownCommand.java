package cat.barcelonactiva.itacademy.Ex1_3_Command.commands;

import cat.barcelonactiva.itacademy.Ex1_3_Command.models.Vehicle;

public class SlowDownCommand implements SpeedCommand {

    private final Vehicle vehicle;

    public SlowDownCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        this.vehicle.slowDown();
    }
}
