package command.commands;

import command.interfaces.Vehicle;


public class AccelerateCommand extends Command {
    public AccelerateCommand(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void execute() {
        vehicle.accelerate();
    }
}

