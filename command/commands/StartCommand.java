package command.commands;

import command.interfaces.Vehicle;

public class StartCommand extends Command {
    public StartCommand(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void execute() {
        vehicle.start();
    }
}
