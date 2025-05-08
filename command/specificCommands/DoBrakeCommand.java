package command.specificCommands;

import command.interfaces.Command;
import command.interfaces.Vehicle;

public class DoBrakeCommand implements Command {
    private Vehicle vehicle;

    public DoBrakeCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    @Override
    public void execute() {
        vehicle.doBrake();
    }
}