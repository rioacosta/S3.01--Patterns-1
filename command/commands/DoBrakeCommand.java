package command.commands;

import command.interfaces.Vehicle;

public class DoBrakeCommand extends Command {

    public DoBrakeCommand(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void execute() {
        vehicle.doBrake();
    }
}